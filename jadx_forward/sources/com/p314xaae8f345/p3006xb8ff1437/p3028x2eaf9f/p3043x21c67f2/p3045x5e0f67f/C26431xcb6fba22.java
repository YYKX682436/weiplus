package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.group.Hdr2SdrFilterGroup */
/* loaded from: classes14.dex */
public class C26431xcb6fba22 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de {

    /* renamed from: isTransform */
    public boolean f53669x84fbad62 = true;

    /* renamed from: mHdr2SdrFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26427xcc87be5d f53670xf7f69710 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26427xcc87be5d();

    /* renamed from: mOES2TextureFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26428x1a905fde f53671xccada711;

    /* renamed from: mTexture2OESFilter */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26429x34521e3e f53672xe8325591;

    public C26431xcb6fba22(java.lang.String str) {
        this.f53671xccada711 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26428x1a905fde(str);
        this.f53672xe8325591 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26429x34521e3e(str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: destroyBuffers */
    public void mo102809xdd60ded9() {
        this.f53671xccada711.m102790xdd60ded9();
        this.f53670xf7f69710.m102781xdd60ded9();
        this.f53672xe8325591.m102799xdd60ded9();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: genOESTexture */
    public void mo102810xfe6786e() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26428x1a905fde c26428x1a905fde = this.f53671xccada711;
        if (c26428x1a905fde == null) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter(null) generate texture failed");
        }
        c26428x1a905fde.m102791xfe6786e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: getOESTextureid */
    public int mo102811x473c490f() {
        return this.f53671xccada711.m102792x473c490f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de
    /* renamed from: process */
    public void mo102812xed8d1e6f(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, int i27, boolean z17, int i28) {
        if (z17) {
            this.f53672xe8325591.m102800xed8d1e6f(this.f53670xf7f69710.m102785xed8d1e6f(i28, this.f53671xccada711.m102793xed8d1e6f(surfaceTexture, i19, i27, false, false), i17, i18), i19, i27, false);
        } else {
            this.f53671xccada711.m102793xed8d1e6f(surfaceTexture, i19, i27, false, true);
        }
        android.opengl.GLES20.glFlush();
    }
}
