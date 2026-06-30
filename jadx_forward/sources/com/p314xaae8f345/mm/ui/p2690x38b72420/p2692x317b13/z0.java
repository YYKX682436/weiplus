package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class z0 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1 f288483a;

    public z0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1 a1Var) {
        this.f288483a = a1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cka, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.y0 y0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.y0) this.f288483a.F;
        y0Var.f288480a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jrw);
        y0Var.f288481b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jqn);
        inflate.setTag(y0Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.y0 y0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.y0) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1 a1Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1) dVar;
        android.content.res.Resources resources = context.getResources();
        if (this.f288483a.D) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idk, resources.getString(a1Var.C)), y0Var.f288480a);
            y0Var.f288481b.setRotation(0.0f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idl), y0Var.f288480a);
            y0Var.f288481b.setRotation(180.0f);
        }
    }
}
