package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class a1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f86390d;

    public a1(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f86390d = arrayList;
        arrayList.addAll(list);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f86390d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.page.z0 z0Var = (com.tencent.mm.plugin.appbrand.page.z0) k3Var;
        com.tencent.mm.plugin.appbrand.page.y0 y0Var = (com.tencent.mm.plugin.appbrand.page.y0) ((java.util.ArrayList) this.f86390d).get(i17);
        z0Var.f87305d.setText(y0Var.f87263a);
        z0Var.f87306e.setText(y0Var.f87264b);
        z0Var.itemView.setOnClickListener(y0Var.f87265c);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.appbrand.page.z0(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488052fj, (android.view.ViewGroup) null));
    }
}
