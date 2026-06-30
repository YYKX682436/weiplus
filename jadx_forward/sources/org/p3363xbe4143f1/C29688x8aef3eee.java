package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGDecoder */
/* loaded from: classes13.dex */
public class C29688x8aef3eee {

    /* renamed from: nativeContext */
    private long f75011xffae8598;

    static {
        b56.a.a("pag");
        m154695xb90145c7();
    }

    private C29688x8aef3eee(long j17) {
        this.f75011xffae8598 = j17;
    }

    /* renamed from: Make */
    public static org.p3363xbe4143f1.C29688x8aef3eee m154691x247a0e(org.p3363xbe4143f1.C29687x78413754 c29687x78413754) {
        return m154692x247a0e(c29687x78413754, c29687x78413754.m154842x207cebed(), 1.0f);
    }

    /* renamed from: MakeFrom */
    private static native long m154693x63e4ed8(org.p3363xbe4143f1.C29687x78413754 c29687x78413754, float f17, float f18);

    /* renamed from: nativeFinalize */
    private native void m154694xef578955();

    /* renamed from: nativeInit */
    private static native void m154695xb90145c7();

    /* renamed from: nativeRelease */
    private native void m154696x7f877f0();

    /* renamed from: checkFrameChanged */
    public native boolean m154697xf68939af(int i17);

    /* renamed from: copyFrameTo */
    public native boolean m154698xb6ae9793(android.graphics.Bitmap bitmap, int i17);

    /* renamed from: finalize */
    public void m154699xd764dc1e() {
        m154694xef578955();
    }

    /* renamed from: frameAtIndex */
    public android.graphics.Bitmap m154700x440cbe32(int i17) {
        boolean m154698xb6ae9793;
        android.util.Pair a17 = org.p3363xbe4143f1.a.a(m154706x6be2dc6(), m154702xb7389127(), false);
        java.lang.Object obj = a17.first;
        if (obj == null) {
            return null;
        }
        java.lang.Object obj2 = a17.second;
        if (obj2 == null || android.os.Build.VERSION.SDK_INT < 26) {
            m154698xb6ae9793 = m154698xb6ae9793((android.graphics.Bitmap) obj, i17);
        } else {
            m154698xb6ae9793 = m154704xbc40ed77(i17, (android.hardware.HardwareBuffer) obj2);
            ((android.hardware.HardwareBuffer) a17.second).close();
        }
        if (m154698xb6ae9793) {
            return (android.graphics.Bitmap) a17.first;
        }
        return null;
    }

    /* renamed from: frameRate */
    public native float m154701x207cebed();

    /* renamed from: height */
    public native int m154702xb7389127();

    /* renamed from: numFrames */
    public native int m154703x333fdfcc();

    /* renamed from: readFrame */
    public native boolean m154704xbc40ed77(int i17, android.hardware.HardwareBuffer hardwareBuffer);

    /* renamed from: release */
    public void m154705x41012807() {
        m154696x7f877f0();
    }

    /* renamed from: width */
    public native int m154706x6be2dc6();

    /* renamed from: Make */
    public static org.p3363xbe4143f1.C29688x8aef3eee m154692x247a0e(org.p3363xbe4143f1.C29687x78413754 c29687x78413754, float f17, float f18) {
        long m154693x63e4ed8 = m154693x63e4ed8(c29687x78413754, f17, f18);
        if (m154693x63e4ed8 == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29688x8aef3eee(m154693x63e4ed8);
    }
}
