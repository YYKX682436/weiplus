package ao;

/* loaded from: classes10.dex */
public final class b extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public q31.n f12505e;

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (this.f12505e == null) {
            ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
            io.g gVar = new io.g();
            gVar.f293402g = null;
            this.f12505e = gVar;
        }
        q31.n nVar = this.f12505e;
        if (nVar == null) {
            return null;
        }
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return ((io.g) nVar).a(context);
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new ao.a(convertView, this.f12505e);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        q31.n nVar;
        ao.c item = (ao.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if ((holder instanceof ao.a) && (nVar = ((ao.a) holder).f12504o) != null) {
            nVar.b(null);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
