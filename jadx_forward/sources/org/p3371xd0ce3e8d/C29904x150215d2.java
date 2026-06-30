package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoFrame */
/* loaded from: classes16.dex */
public class C29904x150215d2 implements org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb {

    /* renamed from: buffer */
    private final org.p3371xd0ce3e8d.C29904x150215d2.Buffer f76108xaddb9440;

    /* renamed from: rotation */
    private final int f76109xfd990f7e;

    /* renamed from: timestampNs */
    private final long f76110x55a3457b;

    /* renamed from: org.webrtc.VideoFrame$Buffer */
    /* loaded from: classes16.dex */
    public interface Buffer extends org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb {
        /* renamed from: cropAndScale */
        org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63(int i17, int i18, int i19, int i27, int i28, int i29);

        /* renamed from: getBufferType */
        default int mo156549x5fe02f90() {
            return 0;
        }

        /* renamed from: getHeight */
        int mo155641x1c4fb41d();

        /* renamed from: getWidth */
        int mo155645x755bd410();

        @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
        /* renamed from: release */
        void mo155513x41012807();

        @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
        /* renamed from: retain */
        void mo155514xc84df105();

        /* renamed from: toI420 */
        org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184();
    }

    /* renamed from: org.webrtc.VideoFrame$I420Buffer */
    /* loaded from: classes16.dex */
    public interface I420Buffer extends org.p3371xd0ce3e8d.C29904x150215d2.Buffer {
        @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
        /* renamed from: getBufferType */
        default int mo156549x5fe02f90() {
            return 1;
        }

        /* renamed from: getDataU */
        java.nio.ByteBuffer mo155638x744cac35();

        /* renamed from: getDataV */
        java.nio.ByteBuffer mo155639x744cac36();

        /* renamed from: getDataY */
        java.nio.ByteBuffer mo155640x744cac39();

        /* renamed from: getStrideU */
        int mo155642xcda3b866();

        /* renamed from: getStrideV */
        int mo155643xcda3b867();

        /* renamed from: getStrideY */
        int mo155644xcda3b86a();
    }

    /* renamed from: org.webrtc.VideoFrame$TextureBuffer */
    /* loaded from: classes16.dex */
    public interface TextureBuffer extends org.p3371xd0ce3e8d.C29904x150215d2.Buffer {

        /* renamed from: org.webrtc.VideoFrame$TextureBuffer$Type */
        /* loaded from: classes16.dex */
        public enum Type {
            OES(36197),
            RGB(3553);


            /* renamed from: glTarget */
            private final int f76112xb19d6ad6;

            Type(int i17) {
                this.f76112xb19d6ad6 = i17;
            }

            /* renamed from: getGlTarget */
            public int m156553x2d77a84c() {
                return this.f76112xb19d6ad6;
            }
        }

        /* renamed from: getTextureId */
        int mo156445xc2ca74e0();

        /* renamed from: getTransformMatrix */
        android.graphics.Matrix mo156447xb1778017();

        /* renamed from: getType */
        org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type mo156448xfb85f7b0();
    }

    public C29904x150215d2(org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer, int i17, long j17) {
        if (buffer == null) {
            throw new java.lang.IllegalArgumentException("buffer not allowed to be null");
        }
        if (i17 % 90 != 0) {
            throw new java.lang.IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.f76108xaddb9440 = buffer;
        this.f76109xfd990f7e = i17;
        this.f76110x55a3457b = j17;
    }

    /* renamed from: getBuffer */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer m156544x12f2b736() {
        return this.f76108xaddb9440;
    }

    /* renamed from: getRotatedHeight */
    public int m156545xa699d53a() {
        return this.f76109xfd990f7e % 180 == 0 ? this.f76108xaddb9440.mo155641x1c4fb41d() : this.f76108xaddb9440.mo155645x755bd410();
    }

    /* renamed from: getRotatedWidth */
    public int m156546xdcea9b53() {
        return this.f76109xfd990f7e % 180 == 0 ? this.f76108xaddb9440.mo155645x755bd410() : this.f76108xaddb9440.mo155641x1c4fb41d();
    }

    /* renamed from: getRotation */
    public int m156547x79734cf4() {
        return this.f76109xfd990f7e;
    }

    /* renamed from: getTimestampNs */
    public long m156548x2f798c45() {
        return this.f76110x55a3457b;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        this.f76108xaddb9440.mo155513x41012807();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        this.f76108xaddb9440.mo155514xc84df105();
    }
}
