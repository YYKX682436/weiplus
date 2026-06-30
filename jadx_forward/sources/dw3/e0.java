package dw3;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.e0 f325735a = new dw3.e0();

    public final dw3.d0 a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(path, true);
        if (d17 == null) {
            return null;
        }
        if (d17.f243918d <= 0 || d17.f243917c <= 0) {
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(path);
                d17.f243917c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(18), 0);
                d17.f243918d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(19), 0);
                d17.f243916b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(20), 0);
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused) {
            }
        }
        int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(path);
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        boolean z17 = m69179x9787f6ed == 270 || m69179x9787f6ed == 90;
        return new dw3.d0(d17.f243917c, d17.f243918d, d17.f243915a, m69179x9787f6ed, d17.f243916b, d17.f243919e, ((double) java.lang.Math.abs((((float) (z17 ? d17.f243918d : d17.f243917c)) / ((float) (z17 ? d17.f243917c : d17.f243918d))) - (((float) h17.x) / ((float) h17.y)))) <= 0.01d, d17.f243923i, d17.f243925k, d17.f243924j);
    }
}
