package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class an implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f284907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f284908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f284910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f284911e;

    public an(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, boolean z17) {
        this.f284907a = aoVar;
        this.f284908b = dVar;
        this.f284909c = f9Var;
        this.f284910d = context;
        this.f284911e = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f284907a;
        int length = aoVar.f284915e.m80028xc2a54588().a().length();
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) this.f284908b.f542241c.a(sb5.k2.class))).t0(this.f284909c.m124847x74d37ac6()) == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming) {
            g4Var.add(0, 121, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f572407b45);
            return;
        }
        g4Var.c(0, 0, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) aoVar.f284915e.m80028xc2a54588().getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= length) {
            g4Var.c(0, 1, 0, this.f284910d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        }
        g4Var.c(0, 2, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        j45.l.g("favorite");
        g4Var.c(0, 3, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (this.f284911e) {
            return;
        }
        g4Var.c(0, 4, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
    }
}
