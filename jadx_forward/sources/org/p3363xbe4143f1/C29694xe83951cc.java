package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGImageLayer */
/* loaded from: classes13.dex */
public class C29694xe83951cc extends org.p3363xbe4143f1.C29697x62580a7b {
    static {
        b56.a.a("pag");
        m154782xb90145c7();
    }

    public C29694xe83951cc(long j17) {
        super(j17);
    }

    /* renamed from: Make */
    public static org.p3363xbe4143f1.C29694xe83951cc m154781x247a0e(int i17, int i18, long j17) {
        long m154783xb902e6a5 = m154783xb902e6a5(i17, i18, j17);
        if (m154783xb902e6a5 == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29694xe83951cc(m154783xb902e6a5);
    }

    /* renamed from: nativeInit */
    private static native void m154782xb90145c7();

    /* renamed from: nativeMake */
    private static native long m154783xb902e6a5(int i17, int i18, long j17);

    /* renamed from: replaceImage */
    private native void m154784x1a429707(long j17);

    /* renamed from: setImage */
    private native void m154785x53266a19(long j17);

    /* renamed from: contentDuration */
    public native long m154786x19ba5d2d();

    /* renamed from: getVideoRanges */
    public native org.p3363xbe4143f1.C29707xde1e3e98[] m154787x153dadfb();

    /* renamed from: imageBytes */
    public native java.nio.ByteBuffer m154788xa86ac7d0();

    /* renamed from: replaceImage */
    public void m154789x1a429707(org.p3363xbe4143f1.C29693x6232de85 c29693x6232de85) {
        m154784x1a429707(c29693x6232de85 == null ? 0L : c29693x6232de85.f75015xffae8598);
    }

    /* renamed from: setImage */
    public void m154790x53266a19(org.p3363xbe4143f1.C29693x6232de85 c29693x6232de85) {
        m154785x53266a19(c29693x6232de85 == null ? 0L : c29693x6232de85.f75015xffae8598);
    }
}
