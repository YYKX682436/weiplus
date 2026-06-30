package i12;

/* loaded from: classes15.dex */
public class g extends j12.b {
    @Override // j12.b
    public int c() {
        return 0;
    }

    @Override // j12.b
    public int f() {
        return 0;
    }

    @Override // j12.b
    public boolean g(int i17) {
        return false;
    }

    @Override // j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.f fVar = (i12.f) view.getTag();
        j12.i item = getItem(i17);
        if (fVar != null && item != null) {
            item.f378706h = false;
            item.f378707i = false;
            r45.zj0 zj0Var = item.f378700b;
            if (zj0Var != null) {
                fVar.f368709h.setText(zj0Var.f473663f);
                int i18 = zj0Var.f473667m;
                if (fVar.f368711j != null) {
                    if (!(j12.g.b(i18, 4) || j12.g.b(i18, 8))) {
                        fVar.f368711j.setText(fVar.f368727z.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5e));
                        n11.a b17 = n11.a.b();
                        java.lang.String str = zj0Var.f473662e;
                        b17.h(str, fVar.f368707f, y12.f.b(zj0Var.f473661d, str));
                        fVar.f368712k.setText(k35.m1.g("yyyy-MM-dd", zj0Var.f473672r * 1000));
                    }
                }
                android.widget.TextView textView = fVar.f368711j;
                if (textView != null) {
                    textView.setText("");
                }
                n11.a b172 = n11.a.b();
                java.lang.String str2 = zj0Var.f473662e;
                b172.h(str2, fVar.f368707f, y12.f.b(zj0Var.f473661d, str2));
                fVar.f368712k.setText(k35.m1.g("yyyy-MM-dd", zj0Var.f473672r * 1000));
            }
        }
        return view;
    }

    @Override // j12.b
    public int k() {
        return 0;
    }

    @Override // j12.b
    public i12.c l(android.content.Context context, android.view.View view) {
        i12.f fVar = new i12.f(this, context, view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0 h0Var = this.f378686f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = fVar.f368716o;
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.setOnClickListener(new i12.a(fVar, h0Var));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = fVar.f368718q;
        if (c22661xa3a2b3c02 != null) {
            c22661xa3a2b3c02.setOnClickListener(new i12.b(fVar, h0Var));
        }
        return fVar;
    }

    @Override // j12.b
    public void o(int i17) {
    }

    @Override // j12.b
    public void p(int i17) {
    }

    @Override // j12.b
    public void q(int i17) {
    }
}
