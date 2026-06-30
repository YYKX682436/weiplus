package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Metrics */
/* loaded from: classes.dex */
public class C29817x9c3158a3 {
    private static final java.lang.String TAG = "Metrics";
    public final java.util.Map<java.lang.String, org.p3371xd0ce3e8d.C29817x9c3158a3.HistogramInfo> map = new java.util.HashMap();

    /* renamed from: org.webrtc.Metrics$HistogramInfo */
    /* loaded from: classes.dex */
    public static class HistogramInfo {

        /* renamed from: bucketCount */
        public final int f75573xf5db945;
        public final int max;
        public final int min;

        /* renamed from: samples */
        public final java.util.Map<java.lang.Integer, java.lang.Integer> f75574x6f274009 = new java.util.HashMap();

        public HistogramInfo(int i17, int i18, int i19) {
            this.min = i17;
            this.max = i18;
            this.f75573xf5db945 = i19;
        }

        /* renamed from: addSample */
        public void m155784xfeff1dab(int i17, int i18) {
            this.f75574x6f274009.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    private void add(java.lang.String str, org.p3371xd0ce3e8d.C29817x9c3158a3.HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    /* renamed from: enable */
    public static void m155780xb2952583() {
        m155782x76efb47a();
    }

    /* renamed from: getAndReset */
    public static org.p3371xd0ce3e8d.C29817x9c3158a3 m155781x42717f2e() {
        return m155783x1bfcb297();
    }

    /* renamed from: nativeEnable */
    private static native void m155782x76efb47a();

    /* renamed from: nativeGetAndReset */
    private static native org.p3371xd0ce3e8d.C29817x9c3158a3 m155783x1bfcb297();
}
