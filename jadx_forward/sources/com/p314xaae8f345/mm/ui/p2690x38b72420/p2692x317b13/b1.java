package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class b1 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d1 f288361a;

    public b1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d1 d1Var) {
        this.f288361a = d1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ckb, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c1 c1Var = this.f288361a.D;
        c1Var.f288363b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        c1Var.f288362a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        c1Var.f288364c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mk7);
        inflate.setTag(c1Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c1 c1Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c1) bVar;
        c1Var.f288363b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ifn);
        if (z18) {
            c1Var.f288364c.setVisibility(0);
        } else {
            c1Var.f288364c.setVisibility(8);
        }
        c1Var.f288362a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
    }
}
