package mx3;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414059d;

    public a0(java.lang.String str) {
        this.f414059d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        ot0.q qVar = new ot0.q();
        ux3.a aVar = new ux3.a();
        mx3.i0 i0Var = mx3.i0.f414110a;
        java.lang.String toUser = this.f414059d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        java.lang.String string = mx3.i0.f414115f.getString(toUser, null);
        vx3.k kVar = vx3.l.E;
        vx3.i b17 = string == null ? kVar.b() : kVar.f(string);
        aVar.f513407b = b17;
        qVar.f430199i = 1077936177;
        qVar.f(aVar);
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        f9Var.d1(ot0.q.u(qVar, null, null));
        f9Var.m124850x7650bebc(1077936177);
        f9Var.j1(0);
        f9Var.u1(toUser);
        f9Var.e1(c01.w9.o(toUser));
        long x17 = c01.w9.x(f9Var);
        wx3.a.f(3, 1, "", toUser, b17.d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickRingtoneHelper", "insert ringtone msg %d", java.lang.Long.valueOf(x17));
    }
}
