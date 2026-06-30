package an2;

/* loaded from: classes14.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f8847d;

    /* renamed from: e, reason: collision with root package name */
    public an2.b f8848e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f8849f;

    public f(java.util.List items, an2.b selectedItem, yz5.l itemSelectionHandler) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(selectedItem, "selectedItem");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f8847d = items;
        this.f8848e = selectedItem;
        this.f8849f = itemSelectionHandler;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f8847d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        an2.e holder = (an2.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        an2.b bVar = (an2.b) this.f8847d.get(i17);
        if (!kotlin.jvm.internal.o.b(holder.f8846f, bVar)) {
            holder.f8846f = bVar;
            if (!(bVar == null)) {
                holder.f8845e.setText(bVar.b());
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, bVar.a());
            }
        }
        holder.i(kotlin.jvm.internal.o.b(bVar, this.f8848e));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new an2.e(context, this.f8849f);
    }
}
