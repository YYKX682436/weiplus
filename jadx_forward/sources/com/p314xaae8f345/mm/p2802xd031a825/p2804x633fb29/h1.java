package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class h1 extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public boolean f295437m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f295438n = true;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f295439o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Dialog f295440p;

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void k(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.Dialog dialog = this.f295440p;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f295440p.dismiss();
        this.f295440p = null;
        this.f295439o = null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public synchronized pq5.g l() {
        android.content.Context context;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        if (oVar != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.b0.g(oVar.f152246d);
        }
        if (this.f295437m && (context = this.f295439o) != null && this.f295440p == null) {
            this.f295440p = db5.e1.O(context, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, this.f295438n, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g1(this));
        }
        return super.l();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void p(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        if (oVar.mo47976x1de73f19() == 0) {
            oVar.mo47987xb512c125(2);
        }
        super.p(oVar);
    }
}
