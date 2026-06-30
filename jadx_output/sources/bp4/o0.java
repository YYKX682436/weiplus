package bp4;

/* loaded from: classes8.dex */
public final class o0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f23305d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f23306e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f23305d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((ro4.e) this.f23305d.get(i17)).f398126a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bp4.p0 viewHolder = (bp4.p0) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f23305d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ro4.e eVar = (ro4.e) obj;
        viewHolder.i(eVar);
        viewHolder.itemView.setOnClickListener(new bp4.n0(this, i17, eVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bma, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new bp4.c1(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bm9, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new bp4.m0(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bm_, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new bp4.l0(inflate3);
    }

    public final void x(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        java.util.LinkedList linkedList = this.f23305d;
        linkedList.clear();
        linkedList.addAll(items);
        notifyDataSetChanged();
    }
}
