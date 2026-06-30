package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class t9 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 f287103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f287104c;

    public t9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 y9Var, android.content.Context context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var, boolean z17) {
        this.f287102a = context;
        this.f287103b = q9Var;
        this.f287104c = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f287102a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var = this.f287103b;
        java.lang.CharSequence a17 = q9Var.f286862b.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) q9Var.f286862b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.guy), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        g4Var.c(0, 3, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (this.f287104c) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
        }
    }
}
