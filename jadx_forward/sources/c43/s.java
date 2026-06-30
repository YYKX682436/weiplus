package c43;

/* loaded from: classes8.dex */
public class s extends c43.x {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 Z;

    public s(android.view.View view, int i17) {
        super(view, i17);
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || c15791x7c5dbdd8.f36771x39267db9 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.Z;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = c15731x94356d67.f36571x8f2d71bb.f36771x39267db9.f36590x38b73479;
        ((ke0.e) xVar).getClass();
        c22624x85d69039.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f120025g, str));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570672bf0, (android.view.ViewGroup) null);
        this.Z = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566633gj3);
        return inflate;
    }

    @Override // c43.x
    public void v(db5.g4 g4Var) {
        int y17 = g4Var.y(9531);
        int y18 = g4Var.y(9532);
        if (g4Var.findItem(1001) == null) {
            android.content.Context context = this.f120025g;
            if (y17 >= 0) {
                g4Var.e(1001, y17 + 1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d, 0, false);
            } else if (y18 >= 0) {
                g4Var.e(1001, y18 + 1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d, 0, false);
            } else {
                g4Var.e(1001, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d, 0, false);
            }
        }
    }

    @Override // c43.x
    public void x(int i17) {
        if (i17 == 1001) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(this.Z.a());
            android.content.Context context = this.f120025g;
            db5.e1.W(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
    }
}
