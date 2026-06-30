package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f90898a = kz5.c1.k(new jz5.l("User-Agent", "user_agent"), new jz5.l("Cookie", "cookies"), new jz5.l("Referer", "referer"));

    public static final java.lang.String a() {
        int i17;
        java.lang.String a17 = bm5.f1.a();
        if (!(a17 == null || a17.length() == 0)) {
            kotlin.jvm.internal.o.d(a17);
            int K = r26.n0.K(a17, ':', 0, false, 6, null);
            if (K >= 0 && (i17 = K + 1) <= a17.length()) {
                java.lang.String substring = a17.substring(i17);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                return substring;
            }
        }
        return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
    }

    public static final int b(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        kotlin.jvm.internal.o.g(iTPPlayer, "<this>");
        long durationMs = iTPPlayer.getDurationMs();
        if (0 < durationMs) {
            return (int) ((iTPPlayer.getPlayableDurationMs() * 100) / durationMs);
        }
        return 0;
    }

    public static final void c(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, java.lang.String url, java.util.Map headers) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(iTPPlayer, "<this>");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(headers, "headers");
        headers.toString();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : headers.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Iterator it = f90898a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (r26.i0.p(str, (java.lang.String) ((java.util.Map.Entry) obj).getKey(), true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
            if (entry2 != null) {
                if (((java.lang.String) linkedHashMap.put(entry2.getValue(), entry.getValue())) == null) {
                }
            }
        }
        linkedHashMap.toString();
        iTPPlayer.setDataSource(url, linkedHashMap);
    }
}
