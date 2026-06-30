package dq1;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final dq1.p f323886a = new dq1.p();

    public final boolean a(dq1.c type, dq1.b oldContext, dq1.b newContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldContext, "oldContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newContext, "newContext");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check context, type:");
        sb6.append(type);
        sb6.append(", oldContext: ");
        sb6.append("loginUin:" + oldContext.f323878a);
        sb6.append(", newContext:");
        sb6.append("loginUin:" + newContext.f323878a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeUtil", sb6.toString());
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            return oldContext.a() && newContext.a() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oldContext.f323878a, newContext.f323878a);
        }
        if (ordinal != 1) {
            return ordinal == 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeUtil", "oldContext.loginUin:" + oldContext.f323878a + ", newContext.loginUin:" + newContext.f323878a);
        return (oldContext.a() || newContext.a()) ? false : true;
    }

    public final dq1.b b() {
        java.lang.String str;
        dq1.b bVar = new dq1.b();
        if (gm0.j1.b().n()) {
            str = gm0.j1.b().j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUinString(...)");
        } else {
            str = "";
        }
        bVar.f323878a = str;
        return bVar;
    }
}
