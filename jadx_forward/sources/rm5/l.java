package rm5;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static int f479054b = 1080;

    /* renamed from: c, reason: collision with root package name */
    public static long f479055c = 10000;

    /* renamed from: a, reason: collision with root package name */
    public static final rm5.l f479053a = new rm5.l();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f479056d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f479057e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f479058f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f479059g = new java.util.HashMap();

    public final void a() {
        synchronized (this) {
            f479057e.clear();
            f479056d.clear();
            f479058f.clear();
            java.util.Iterator it = f479059g.entrySet().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25647xf4fd2ae1) ((java.util.Map.Entry) it.next()).getValue()).m96139x41012807();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rm5.l.b(java.lang.String):android.graphics.Bitmap");
    }

    public final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 c(rm5.j track) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        synchronized (this) {
            java.util.HashMap hashMap = f479057e;
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 abstractC25907xa033d2b7 = (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7) hashMap.get(track.f479032a);
            if (abstractC25907xa033d2b7 == null) {
                int i17 = track.f479033b;
                if (i17 == 1) {
                    android.graphics.Bitmap b17 = f479053a.b(track.f479032a);
                    if (b17 == null) {
                        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f).mo98716x5a5dd5d();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo98716x5a5dd5d, "clone(...)");
                        return mo98716x5a5dd5d;
                    }
                    f479056d.put(track.f479032a, b17);
                    abstractC25907xa033d2b7 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25905x21cef980(new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095(b17), new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(f479055c, 1000), true);
                } else if (i17 == 2 || i17 == 3) {
                    com.p314xaae8f345.tav.p2945x58ceaf0.C25647xf4fd2ae1 c25647xf4fd2ae1 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25647xf4fd2ae1(track.f479032a);
                    com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2 c25903xcabdb8d2 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2(c25647xf4fd2ae1);
                    f479059g.put(track.f479032a, c25647xf4fd2ae1);
                    abstractC25907xa033d2b7 = c25903xcabdb8d2;
                } else {
                    abstractC25907xa033d2b7 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                }
                hashMap.put(track.f479032a, abstractC25907xa033d2b7);
            }
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d2 = abstractC25907xa033d2b7.mo98716x5a5dd5d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo98716x5a5dd5d2, "clone(...)");
            return mo98716x5a5dd5d2;
        }
    }

    public final rm5.p d(java.lang.String path) {
        rm5.p pVar;
        rm5.p pVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        synchronized (this) {
            java.util.HashMap hashMap = f479058f;
            pVar = (rm5.p) hashMap.get(path);
            if (pVar == null) {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                rm5.p pVar3 = null;
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(path);
                        java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        int parseInt = extractMetadata != null ? java.lang.Integer.parseInt(extractMetadata) : 0;
                        java.lang.String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        int parseInt2 = extractMetadata2 != null ? java.lang.Integer.parseInt(extractMetadata2) : 0;
                        java.lang.String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        int parseInt3 = extractMetadata3 != null ? java.lang.Integer.parseInt(extractMetadata3) : 0;
                        if (parseInt3 != 90 && parseInt3 != 270) {
                            int i17 = parseInt2;
                            parseInt2 = parseInt;
                            parseInt = i17;
                        }
                        java.lang.String extractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                        pVar2 = new rm5.p(parseInt2, parseInt, parseInt3, extractMetadata4 != null ? java.lang.Integer.parseInt(extractMetadata4) : 0);
                    } catch (java.lang.Exception unused) {
                    }
                    try {
                        hashMap.put(path, pVar2);
                        mediaMetadataRetriever.release();
                        pVar = pVar2;
                    } catch (java.lang.Exception unused2) {
                        pVar3 = pVar2;
                        pVar = pVar3;
                        return pVar;
                    }
                } finally {
                    mediaMetadataRetriever.release();
                }
            }
        }
        return pVar;
    }
}
