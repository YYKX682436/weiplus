package ol4;

/* loaded from: classes.dex */
public final class s extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 {

    /* renamed from: d, reason: collision with root package name */
    public static final ol4.s f427739d = new ol4.s();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f427740e = jz5.h.b(ol4.r.f427738d);

    static {
        new java.util.LinkedList();
        new java.util.concurrent.ConcurrentHashMap();
        p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public final java.lang.String a(java.lang.String listenId, int i17, java.lang.String audioUrl, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioUrl, "audioUrl");
        boolean z17 = false;
        if (str != null && (!r26.n0.N(str))) {
            z17 = true;
        }
        if (z17) {
            return "ting_" + i17 + '_' + listenId + "_cacheKey_" + str;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        return "ting_" + i17 + '_' + listenId + '_' + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(audioUrl.getBytes());
    }

    public final java.lang.String d(java.lang.String taskKeyId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskKeyId, "taskKeyId");
        return ((java.lang.String) ((jz5.n) f427740e).mo141623x754a37bb()) + '/' + taskKeyId + ".player";
    }
}
