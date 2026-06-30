package qk;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f445621a = new java.util.LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public static final java.util.List a(java.lang.String str) {
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionSafeStrategyManager", "getEmotionList() called with: path = null");
        } else {
            ?? r27 = (java.util.List) ((java.util.LinkedHashMap) f445621a).get(str);
            if (r27 != 0) {
                p0Var = r27;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionSafeStrategyManager", "getEmotionList() called with: path = " + str + ", list.size = " + p0Var.size());
        }
        return p0Var;
    }

    public static final void b(java.lang.String str, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmotionSafeStrategyManager", "putEmotionList() called with: path = " + str + ", list.size = " + list.size());
        if (str == null) {
            return;
        }
        f445621a.put(str, list);
    }
}
