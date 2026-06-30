package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.GlTextureFrameBuffer */
/* loaded from: classes14.dex */
public class C29783x806035d7 {

    /* renamed from: frameBufferId */
    private int f75418xb5ede08;

    /* renamed from: height */
    private int f75419xb7389127;

    /* renamed from: pixelFormat */
    private final int f75420xa0fe3a1d;

    /* renamed from: textureId */
    private int f75421xc35d0396;

    /* renamed from: width */
    private int f75422x6be2dc6;

    public C29783x806035d7(int i17) {
        switch (i17) {
            case com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53 /* 6407 */:
            case com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e /* 6408 */:
            case 6409:
                this.f75420xa0fe3a1d = i17;
                this.f75422x6be2dc6 = 0;
                this.f75419xb7389127 = 0;
                return;
            default:
                throw new java.lang.IllegalArgumentException("Invalid pixel format: " + i17);
        }
    }

    /* renamed from: getFrameBufferId */
    public int m155555xc8be9a52() {
        return this.f75418xb5ede08;
    }

    /* renamed from: getHeight */
    public int m155556x1c4fb41d() {
        return this.f75419xb7389127;
    }

    /* renamed from: getTextureId */
    public int m155557xc2ca74e0() {
        return this.f75421xc35d0396;
    }

    /* renamed from: getWidth */
    public int m155558x755bd410() {
        return this.f75422x6be2dc6;
    }

    /* renamed from: release */
    public void m155559x41012807() {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f75421xc35d0396}, 0);
        this.f75421xc35d0396 = 0;
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{this.f75418xb5ede08}, 0);
        this.f75418xb5ede08 = 0;
        this.f75422x6be2dc6 = 0;
        this.f75419xb7389127 = 0;
    }

    /* renamed from: setSize */
    public void m155560x76500f83(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            throw new java.lang.IllegalArgumentException("Invalid size: " + i17 + "x" + i18);
        }
        if (i17 == this.f75422x6be2dc6 && i18 == this.f75419xb7389127) {
            return;
        }
        this.f75422x6be2dc6 = i17;
        this.f75419xb7389127 = i18;
        if (this.f75421xc35d0396 == 0) {
            this.f75421xc35d0396 = org.p3371xd0ce3e8d.C29784x7f4262a7.m155563xe06639e6(3553);
        }
        if (this.f75418xb5ede08 == 0) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
            this.f75418xb5ede08 = iArr[0];
        }
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.f75421xc35d0396);
        int i19 = this.f75420xa0fe3a1d;
        android.opengl.GLES20.glTexImage2D(3553, 0, i19, i17, i18, 0, i19, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
        org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("GlTextureFrameBuffer setSize");
        android.opengl.GLES20.glBindFramebuffer(36160, this.f75418xb5ede08);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f75421xc35d0396, 0);
        int glCheckFramebufferStatus = android.opengl.GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
        } else {
            throw new java.lang.IllegalStateException("Framebuffer not complete, status: " + glCheckFramebufferStatus);
        }
    }
}
