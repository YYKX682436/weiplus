package jf5;

/* loaded from: classes14.dex */
public final class f implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jf5.h f380984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 f380985b;

    public f(jf5.h hVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77) {
        this.f380984a = hVar;
        this.f380985b = c22095x76baed77;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (g4Var == null) {
            return;
        }
        g4Var.clear();
        jf5.h hVar = this.f380984a;
        jf5.m0 m0Var = hVar.f380991b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77 = this.f380985b;
        boolean z17 = (m0Var == null || m0Var.c(c22095x76baed77)) ? false : true;
        android.content.Context context = hVar.f380990a;
        if (!z17) {
            g4Var.c(0, 1, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
        }
        boolean p17 = c22095x76baed77.p();
        jf5.m0 m0Var2 = hVar.f380991b;
        if (!p17) {
            if (!((m0Var2 == null || m0Var2.b(c22095x76baed77)) ? false : true)) {
                g4Var.c(0, 2, 1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574065gv1), com.p314xaae8f345.mm.R.raw.f79631xb0a36dc5);
            }
        }
        if (!((m0Var2 == null || m0Var2.d(c22095x76baed77)) ? false : true)) {
            g4Var.c(0, 3, 2, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guy), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (!((m0Var2 == null || m0Var2.e(c22095x76baed77)) ? false : true)) {
            g4Var.c(0, 4, 3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        }
        if (m0Var2 != null) {
            return;
        }
        g4Var.c(0, 5, 4, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44), com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca);
    }
}
