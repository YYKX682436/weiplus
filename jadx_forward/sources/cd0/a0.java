package cd0;

/* loaded from: classes5.dex */
public final class a0 implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f122053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122057h;

    public a0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, java.lang.ref.WeakReference weakReference) {
        this.f122054e = f9Var;
        this.f122055f = str;
        this.f122056g = str2;
        this.f122057h = weakReference;
    }

    public final void a() {
        this.f122053d = true;
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2;
        if (m0Var == null || l0Var == null || this.f122053d) {
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> msgList = l0Var.f535945c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : msgList) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f122054e;
            if (f9Var2 != null && f9Var.m124847x74d37ac6() == f9Var2.m124847x74d37ac6()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(f9Var.Q0(), f9Var.m124847x74d37ac6());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqRevoke() onNotifyChange msgId=");
                sb6.append(n17 != null ? java.lang.Long.valueOf(n17.m124847x74d37ac6()) : null);
                sb6.append(" status:");
                sb6.append(n17 != null ? java.lang.Integer.valueOf(n17.P0()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
                if (n17 != null && n17.P0() == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "reqRevoke() STATE_SENT msgId=" + f9Var2.m124847x74d37ac6());
                    a();
                    cd0.b0.f122058a.b(n17, this.f122055f, this.f122056g);
                    return;
                }
                if (n17 != null && n17.P0() == 5) {
                    java.lang.ref.WeakReference weakReference = cd0.b0.f122059b;
                    if (weakReference != null && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) != null) {
                        u3Var.dismiss();
                    }
                    yb5.d dVar = (yb5.d) this.f122057h.get();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reqRevoke() STATE_FAILED msgId=");
                    sb7.append(f9Var2.m124847x74d37ac6());
                    sb7.append(" chattingContext is null:");
                    sb7.append(dVar == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", sb7.toString());
                    if (dVar != null) {
                        db5.t7.i(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5r), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                    }
                    a();
                    cd0.c0.f122061a.a(n17, 3);
                    return;
                }
                if ((n17 != null && n17.P0() == 0) && f9Var2.m124847x74d37ac6() <= 0) {
                    java.lang.ref.WeakReference weakReference2 = cd0.b0.f122059b;
                    if (weakReference2 != null && (u3Var2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference2.get()) != null) {
                        u3Var2.dismiss();
                    }
                    a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RevokeMsgHandler", "reqRevoke() STATE_UNKNOWN msgId=" + f9Var2.m124847x74d37ac6());
                    return;
                }
            }
        }
    }
}
