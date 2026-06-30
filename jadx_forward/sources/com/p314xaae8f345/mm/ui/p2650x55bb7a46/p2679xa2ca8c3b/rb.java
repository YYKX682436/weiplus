package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class rb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f286948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f286949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f286950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb f286953f;

    public rb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar, android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286953f = lbVar;
        this.f286948a = context;
        this.f286949b = z17;
        this.f286950c = yaVar;
        this.f286951d = dVar;
        this.f286952e = f9Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f286948a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        g4Var.c(0, 1, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        g4Var.c(0, 2, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.guy), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        g4Var.c(0, 3, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        g4Var.c(0, 4, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
        if (this.f286949b) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
        }
        rq1.l0 l0Var = (rq1.l0) i95.n0.c(rq1.l0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar = this.f286953f;
        java.lang.String Ai = ((rq1.m0) l0Var).Ai(lbVar.f285946t.toString());
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f286950c;
        if (!K0) {
            yaVar.f287591i.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b0(lbVar, this.f286951d, Ai);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            yaVar.f287591i.Y = null;
        }
        this.f286953f.D(this.f286951d, this.f286952e, 1, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai), lbVar.f285946t.toString(), true, "65_" + c01.id.c(), 3);
    }
}
