package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y9 f86594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86596f;

    public f0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, r45.y9 y9Var, java.lang.String str) {
        this.f86596f = appBrandMenuHeader;
        this.f86594d = y9Var;
        this.f86595e = str;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f86594d.f390876g.f387994d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.y9 y9Var = this.f86594d;
        r45.w9 w9Var = (r45.w9) y9Var.f390876g.f387994d.get(i17);
        com.tencent.mm.plugin.appbrand.page.w0 w0Var = (com.tencent.mm.plugin.appbrand.page.w0) k3Var;
        em.d dVar = w0Var.f87189d;
        if (dVar.f254191d == null) {
            dVar.f254191d = (android.widget.TextView) dVar.f254188a.findViewById(com.tencent.mm.R.id.vgv);
        }
        dVar.f254191d.setText(w9Var.f388975d);
        em.d dVar2 = w0Var.f87189d;
        android.widget.ImageView a17 = dVar2.a();
        if (!w9Var.f388976e.equals(a17.getTag())) {
            a17.setTag(w9Var.f388976e);
            if (com.tencent.mm.ui.bk.C()) {
                l01.d0.f314761a.b(dVar2.a(), w9Var.f388977f, l01.a.h(), com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G);
            } else {
                l01.d0.f314761a.b(dVar2.a(), w9Var.f388976e, l01.a.h(), com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G);
            }
        }
        if (i17 != y9Var.f390876g.f387994d.size() - 1) {
            dVar2.b().setVisibility(8);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(y9Var.f390876g.f387995e) || com.tencent.mm.sdk.platformtools.t8.K0(y9Var.f390876g.f387996f)) {
            dVar2.b().setVisibility(8);
            return;
        }
        dVar2.b().setVisibility(0);
        dVar2.b().setText(y9Var.f390876g.f387995e);
        dVar2.b().setOnClickListener(new com.tencent.mm.plugin.appbrand.page.e0(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f86596f;
        return new com.tencent.mm.plugin.appbrand.page.w0(appBrandMenuHeader, android.view.LayoutInflater.from(appBrandMenuHeader.f86348e.getContext()).inflate(com.tencent.mm.R.layout.f488103dz3, viewGroup, false));
    }
}
