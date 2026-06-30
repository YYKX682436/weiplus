package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f87070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f87071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f87072f;

    public s0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, java.util.List list, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f87072f = appBrandMenuHeader;
        this.f87070d = list;
        this.f87071e = o6Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f87070d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.page.x0 x0Var = (com.tencent.mm.plugin.appbrand.page.x0) this.f87070d.get(i17);
        ((com.tencent.mm.plugin.appbrand.page.v0) k3Var).f87155d.setText(x0Var.f87241b.f373063d);
        k3Var.itemView.setOnClickListener(new com.tencent.mm.plugin.appbrand.page.r0(this, x0Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = this.f87072f;
        return new com.tencent.mm.plugin.appbrand.page.v0(appBrandMenuHeader, android.view.LayoutInflater.from(appBrandMenuHeader.f86348e.getContext()).inflate(com.tencent.mm.R.layout.dyr, viewGroup, false));
    }
}
