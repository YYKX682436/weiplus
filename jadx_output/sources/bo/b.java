package bo;

/* loaded from: classes12.dex */
public final class b extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public q31.n f22967e;

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (this.f22967e == null) {
            ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
            io.h hVar = new io.h();
            hVar.f293408b = null;
            this.f22967e = hVar;
        }
        q31.n nVar = this.f22967e;
        if (nVar == null) {
            return null;
        }
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return ((io.h) nVar).a(context);
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new bo.a(convertView, this.f22967e);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        q31.n nVar;
        bo.c item = (bo.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if ((holder instanceof bo.a) && (nVar = ((bo.a) holder).f22966o) != null) {
            nVar.b(null);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
