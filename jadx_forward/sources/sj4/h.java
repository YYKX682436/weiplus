package sj4;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.h f490377a = new sj4.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f490378b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("5", sj4.b.f490357a);
        hashMap.put("7", sj4.e.f490367a);
        f490378b = hashMap;
    }

    public final void a(java.util.List reqInfos, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfos, "reqInfos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (reqInfos.isEmpty()) {
            callback.mo152xb9724478();
            return;
        }
        try {
            pj4.j0 j0Var = (pj4.j0) reqInfos.remove(0);
            sj4.c cVar = (sj4.c) f490378b.get(j0Var.f436672d);
            if (cVar != null) {
                cVar.a(j0Var, new sj4.f(reqInfos, callback));
            } else {
                a(reqInfos, callback);
            }
        } catch (java.lang.Throwable unused) {
            a(reqInfos, callback);
        }
    }
}
