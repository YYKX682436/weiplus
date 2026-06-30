package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class uo implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp f287251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f287255e;

    public uo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, boolean z17) {
        this.f287251a = lpVar;
        this.f287252b = dVar;
        this.f287253c = f9Var;
        this.f287254d = context;
        this.f287255e = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = this.f287251a;
        int length = lpVar.f286043h.m80028xc2a54588().a().length();
        sb5.k2 k2Var = (sb5.k2) this.f287252b.f542241c.a(sb5.k2.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287253c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var;
        if (xmVar.t0(f9Var.m124847x74d37ac6()) == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming) {
            g4Var.add(0, 121, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572407b45);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xmVar.s0(f9Var.m124847x74d37ac6(), f9Var.z0()))) {
            return;
        }
        g4Var.c(0, 0, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) lpVar.f286043h.m80028xc2a54588().getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= length) {
            g4Var.c(0, 1, 0, this.f287254d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        }
        g4Var.c(0, 2, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        j45.l.g("favorite");
        g4Var.c(0, 3, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (this.f287255e) {
            return;
        }
        g4Var.c(0, 4, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
    }
}
