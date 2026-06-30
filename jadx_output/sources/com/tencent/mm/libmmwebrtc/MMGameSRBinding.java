package com.tencent.mm.libmmwebrtc;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0004H\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/libmmwebrtc/MMGameSRBinding;", "", "", "cachePath", "", "createFromJNI", "libSr", "", "inputGlTex", "inWidth", "inHeight", "outputGlTex", "outWidth", "outHeight", "", "executeSRFromJNI", "Ljz5/f0;", "destroyFromJNI", "libmmwebrtc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class MMGameSRBinding {

    /* renamed from: a, reason: collision with root package name */
    public final long f68531a;

    public MMGameSRBinding(java.lang.String cachePath) {
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        this.f68531a = createFromJNI(cachePath);
    }

    private final native long createFromJNI(java.lang.String cachePath);

    private final native void destroyFromJNI(long j17);

    private final native boolean executeSRFromJNI(long libSr, int inputGlTex, int inWidth, int inHeight, int outputGlTex, int outWidth, int outHeight);

    public final boolean a(int i17, int i18, int i19, int i27, int i28, int i29) {
        long j17 = this.f68531a;
        if (j17 == 0) {
            return false;
        }
        return executeSRFromJNI(j17, i17, i18, i19, i27, i28, i29);
    }
}
