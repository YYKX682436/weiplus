package ko2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ko2.e f391459a = new ko2.e();

    public final void a(android.content.Context context, java.lang.String authorFinderUsername, long j17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        ko2.d dVar = new ko2.d(context, authorFinderUsername, j17, username);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.r(string, 17, i65.a.b(context, 14), null);
        k0Var.f293405n = new ko2.a(1, context, string2);
        k0Var.f293414s = new ko2.b(1, dVar);
        k0Var.v();
    }
}
