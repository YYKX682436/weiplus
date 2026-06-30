package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class j0 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k0 f288418a;

    public j0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k0 k0Var) {
        this.f288418a = k0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        this.f288418a.getClass();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0 a0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0(0));
        a0Var.f288353a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        a0Var.f288354b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        a0Var.f288355c = textView;
        textView.setVisibility(8);
        a0Var.f288356d = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        inflate.setEnabled(false);
        inflate.setTag(a0Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0 a0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0) bVar;
        a0Var.f288354b.setText("");
        a0Var.f288356d.setVisibility(8);
    }
}
