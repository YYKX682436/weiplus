package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class sn implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f287064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f287065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f287066d;

    public sn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nn nnVar, android.content.Context context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, boolean z17, boolean z18) {
        this.f287063a = context;
        this.f287064b = aoVar;
        this.f287065c = z17;
        this.f287066d = z18;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f287063a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f287064b;
        java.lang.CharSequence a17 = aoVar.f284912b.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) aoVar.f284912b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.guy), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        g4Var.c(0, 3, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        if (!this.f287065c) {
            g4Var.c(0, 4, 0, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
        }
        if (this.f287066d) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3v), com.p314xaae8f345.mm.R.raw.f79874x420fae64);
        }
        aoVar.f284918h.Y = null;
    }
}
