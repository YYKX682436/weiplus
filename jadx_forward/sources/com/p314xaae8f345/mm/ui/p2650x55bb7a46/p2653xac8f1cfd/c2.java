package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class c2 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d2 f280402b;

    public c2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d2 d2Var, java.lang.String str) {
        this.f280402b = d2Var;
        this.f280401a = str;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d2 d2Var = this.f280402b;
        d2Var.f280453d.f280113d.f542245g.b();
        if (!android.text.TextUtils.equals(this.f280401a, r2.x())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionCallbackFunc", "talker has changed, return");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = d2Var.f280453d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(q2Var.f280113d.g())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionCallbackFunc", "cpan[refresh top btn]");
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String x17 = q2Var.f280113d.x();
            ((py.a) iVar).getClass();
            q2Var.f281276o = c01.v1.x(x17, false);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) q2Var.f280113d.f542241c.a(sb5.z0.class))).E0();
        }
    }
}
