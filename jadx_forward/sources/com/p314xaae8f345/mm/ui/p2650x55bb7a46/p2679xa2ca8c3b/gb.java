package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class gb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f285559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f285560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab f285563f;

    public gb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar, android.content.Context context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, boolean z17, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285563f = abVar;
        this.f285558a = context;
        this.f285559b = yaVar;
        this.f285560c = z17;
        this.f285561d = dVar;
        this.f285562e = f9Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f285558a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f285559b;
        java.lang.CharSequence a17 = yaVar.f287584b.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) yaVar.f287584b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.guy), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        g4Var.c(0, 3, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        g4Var.c(0, 4, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
        if (this.f285560c) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
        }
        rq1.l0 l0Var = (rq1.l0) i95.n0.c(rq1.l0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = this.f285563f;
        java.lang.String Ai = ((rq1.m0) l0Var).Ai(abVar.f284826t.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            yaVar.f287591i.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b0(abVar, this.f285561d, Ai);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            yaVar.f287591i.Y = null;
        }
        this.f285563f.D(this.f285561d, this.f285562e, 1, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai), abVar.f284826t.toString(), true, "65_" + c01.id.c(), 3);
    }
}
