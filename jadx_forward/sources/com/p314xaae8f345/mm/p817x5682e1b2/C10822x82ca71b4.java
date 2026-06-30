package com.p314xaae8f345.mm.p817x5682e1b2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0004H\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/libmmwebrtc/MMGameSRBinding;", "", "", "cachePath", "", "createFromJNI", "libSr", "", "inputGlTex", "inWidth", "inHeight", "outputGlTex", "outWidth", "outHeight", "", "executeSRFromJNI", "Ljz5/f0;", "destroyFromJNI", "libmmwebrtc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.mm.libmmwebrtc.MMGameSRBinding */
/* loaded from: classes7.dex */
public final class C10822x82ca71b4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f150064a;

    public C10822x82ca71b4(java.lang.String cachePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cachePath, "cachePath");
        this.f150064a = m46394x627a12ff(cachePath);
    }

    /* renamed from: createFromJNI */
    private final native long m46394x627a12ff(java.lang.String cachePath);

    /* renamed from: destroyFromJNI */
    private final native void m46395xac5cda41(long j17);

    /* renamed from: executeSRFromJNI */
    private final native boolean m46396x6b798067(long libSr, int inputGlTex, int inWidth, int inHeight, int outputGlTex, int outWidth, int outHeight);

    public final boolean a(int i17, int i18, int i19, int i27, int i28, int i29) {
        long j17 = this.f150064a;
        if (j17 == 0) {
            return false;
        }
        return m46396x6b798067(j17, i17, i18, i19, i27, i28, i29);
    }
}
