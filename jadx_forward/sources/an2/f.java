package an2;

/* loaded from: classes14.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f90380d;

    /* renamed from: e, reason: collision with root package name */
    public an2.b f90381e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f90382f;

    public f(java.util.List items, an2.b selectedItem, yz5.l itemSelectionHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedItem, "selectedItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f90380d = items;
        this.f90381e = selectedItem;
        this.f90382f = itemSelectionHandler;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f90380d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        an2.e holder = (an2.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        an2.b bVar = (an2.b) this.f90380d.get(i17);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder.f90379f, bVar)) {
            holder.f90379f = bVar;
            if (!(bVar == null)) {
                holder.f90378e.setText(bVar.b());
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, bVar.a());
            }
        }
        holder.i(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, this.f90381e));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new an2.e(context, this.f90382f);
    }
}
