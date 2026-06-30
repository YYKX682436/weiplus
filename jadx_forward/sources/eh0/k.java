package eh0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final eh0.k f334421a = new eh0.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f334422b = new java.util.concurrent.ConcurrentHashMap();

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f334422b;
        java.lang.String str2 = str + c();
        java.lang.Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("weclaw_thinking_" + f334421a.c() + str);
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(str2, M);
            obj = putIfAbsent == null ? M : putIfAbsent;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getOrPut(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) obj;
    }

    public final java.lang.String b(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if ((talker.length() == 0) || j17 == 0) {
            return null;
        }
        return a(talker).getString(java.lang.String.valueOf(j17), null);
    }

    public final java.lang.String c() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(gm0.j1.b().j());
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = "";
        }
        return (java.lang.String) m143895xf1229813;
    }

    public final void d(java.lang.String talker, long j17, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if ((talker.length() == 0) || j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThinkingDataMMKVHelper", "saveThinkingText error: talker:%s, msgSvrId:%d", talker, java.lang.Long.valueOf(j17));
        } else {
            a(talker).putString(java.lang.String.valueOf(j17), text);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThinkingDataMMKVHelper", "saveThinkingText talker:%s, msgSvrId:%d, textLen:%d", talker, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(text.length()));
        }
    }
}
