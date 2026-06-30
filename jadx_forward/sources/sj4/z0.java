package sj4;

/* loaded from: classes11.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.z0 f490441a = new sj4.z0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f490442b = new java.util.HashMap();

    public final bi4.r0 a(java.lang.String str) {
        bi4.r0 r0Var = (bi4.r0) f490442b.get(str);
        if (r0Var == null && str != null) {
            java.lang.Iterable<fs.q> all = ((fs.c) fs.g.f(bi4.r0.class)).all();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(all, "all(...)");
            for (fs.q qVar : all) {
                if (qVar.mo210xb7045565(str)) {
                    return (bi4.r0) qVar.get();
                }
            }
        }
        return r0Var;
    }

    public final bi4.o0 b(java.lang.String str) {
        try {
            bi4.r0 a17 = a(str);
            if (a17 != null) {
                return a17.w7(str);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.StatusThirdShareManager", th6, "customps err", new java.lang.Object[0]);
            return null;
        }
    }
}
