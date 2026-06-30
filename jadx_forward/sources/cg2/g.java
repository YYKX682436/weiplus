package cg2;

/* loaded from: classes3.dex */
public final class g implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f122636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122637b;

    public g(dk2.zf zfVar, android.content.Context context) {
        this.f122636a = zfVar;
        this.f122637b = context;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q().r()).booleanValue()) {
            dk2.zf zfVar = this.f122636a;
            dk2.cg cgVar = zfVar instanceof dk2.cg ? (dk2.cg) zfVar : null;
            if (cgVar != null) {
                int s17 = cgVar.s();
                android.content.Context context = this.f122637b;
                g4Var.h(5, s17 > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(cgVar.s(), false) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci6), !cgVar.o() ? com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b : com.p314xaae8f345.mm.R.raw.f79758xc84e73d5, !((dk2.cg) zfVar).o() ? -1 : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            }
        }
        g4Var.h(2, "", com.p314xaae8f345.mm.R.raw.f79813xc8512e6d, -1);
    }
}
