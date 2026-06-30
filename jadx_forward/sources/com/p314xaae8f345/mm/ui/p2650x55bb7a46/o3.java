package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class o3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.f3 f283587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f283588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f283589g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283590h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f283591i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f283592m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f283593n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f283594o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f283595p;

    public o3(java.util.List list, ot0.f3 f3Var, android.content.Context context, boolean z17, java.lang.String str, int i17, int i18, int i19, int i27, boolean z18) {
        this.f283586d = list;
        this.f283587e = f3Var;
        this.f283588f = context;
        this.f283589g = z17;
        this.f283590h = str;
        this.f283591i = i17;
        this.f283592m = i18;
        this.f283593n = i19;
        this.f283594o = i27;
        this.f283595p = z18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.List list = this.f283586d;
        boolean z17 = true;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(f9Var)) {
                    if (!f9Var.g3() && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.C(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.y(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.o(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.B(f9Var) && f9Var.mo78013xfb85f7b0() != -1879048186 && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.r(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.m(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.l(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.j(f9Var) && f9Var.mo78013xfb85f7b0() != 977272881 && f9Var.mo78013xfb85f7b0() != 318767153 && f9Var.mo78013xfb85f7b0() != 788529201 && f9Var.mo78013xfb85f7b0() != 1076887601 && f9Var.mo78013xfb85f7b0() != 889192497 && f9Var.mo78013xfb85f7b0() != -2130706383 && f9Var.mo78013xfb85f7b0() != -2113929167 && f9Var.mo78013xfb85f7b0() != 922746929) {
                        z17 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to friend msg error, select item empty");
        }
        ot0.f3 f3Var = this.f283587e;
        if (!z17) {
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.b(this.f283588f, this.f283586d, this.f283589g, this.f283590h, this.f283591i, this.f283587e, this.f283592m, this.f283593n, this.f283594o, this.f283595p) || f3Var == null || !f3Var.u1()) {
                return;
            }
            a14.g.a().b();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "only contain invalid msg, exit long click mode");
        if (f3Var != null) {
            f3Var.f2(ot0.e3.trans);
            if (f3Var.u1()) {
                a14.g.a().b();
            }
        }
    }
}
