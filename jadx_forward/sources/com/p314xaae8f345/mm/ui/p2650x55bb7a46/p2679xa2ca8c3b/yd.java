package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class yd implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od f287607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f287608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f287609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ae f287611f;

    public yd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ae aeVar, android.content.Context context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar, boolean z17, boolean z18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f287611f = aeVar;
        this.f287606a = context;
        this.f287607b = odVar;
        this.f287608c = z17;
        this.f287609d = z18;
        this.f287610e = f9Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f287606a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar = this.f287607b;
        java.lang.CharSequence a17 = odVar.f286712b.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) odVar.f286712b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 == 0) {
            i17 = a17.length();
        }
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.guy), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        g4Var.c(0, 3, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (!this.f287608c) {
            g4Var.c(0, 4, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
        }
        if (this.f287609d) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
        }
        rq1.l0 l0Var = (rq1.l0) i95.n0.c(rq1.l0.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ae aeVar = this.f287611f;
        java.lang.String Ai = ((rq1.m0) l0Var).Ai(aeVar.f284882t.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            odVar.f286716f.Y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b0(aeVar, aeVar.f284881s, Ai);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai)) {
            odVar.f286716f.Y = null;
        }
        aeVar.D(aeVar.f284881s, this.f287610e, 1, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai), aeVar.f284882t.toString(), true, "65_" + c01.id.c(), 3);
    }
}
