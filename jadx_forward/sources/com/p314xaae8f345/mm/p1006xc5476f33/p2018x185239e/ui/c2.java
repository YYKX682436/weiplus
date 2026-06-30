package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes11.dex */
public class c2 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e2 f239188a;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e2 e2Var) {
        this.f239188a = e2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e2 e2Var = this.f239188a;
        e2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d2(e2Var);
        d2Var.f239203a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut)).setVisibility(8);
        d2Var.f239204b = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        inflate.setEnabled(false);
        inflate.setTag(d2Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d2) bVar;
        d2Var.f239203a.setText("");
        d2Var.f239204b.setVisibility(8);
    }
}
