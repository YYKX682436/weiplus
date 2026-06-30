package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class l2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f103882d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.k2 f103883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.m2 f103884f;

    public l2(com.tencent.mm.plugin.finder.convert.m2 m2Var) {
        this.f103884f = m2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f103882d = sb6.toString();
        this.f103883e = new com.tencent.mm.plugin.finder.convert.k2(m2Var);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f103884f.f103965g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.i(this.f103883e);
        com.tencent.mm.plugin.finder.convert.m2 m2Var = this.f103884f;
        recyclerView.post(new com.tencent.mm.plugin.finder.convert.i2(m2Var));
        m2Var.f103967i = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.convert.e2 holder = (com.tencent.mm.plugin.finder.convert.e2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.convert.m2 m2Var = this.f103884f;
        java.lang.Object obj = m2Var.f103965g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.vd0 vd0Var = (r45.vd0) obj;
        holder.f103217d.setText(vd0Var.f388136f);
        n11.a b17 = n11.a.b();
        java.lang.String str = vd0Var.f388135e;
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        b17.h(str, holder.f103218e, fVar.a());
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.j2(vd0Var, this, m2Var, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488795dc0, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.convert.e2(inflate);
    }
}
