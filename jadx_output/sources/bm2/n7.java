package bm2;

/* loaded from: classes5.dex */
public final class n7 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f22164d;

    /* renamed from: e, reason: collision with root package name */
    public final mm2.k5 f22165e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f22166f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22167g;

    public n7(android.content.Context context, sf2.d3 controller, kotlinx.coroutines.y0 y0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f22164d = new java.util.ArrayList();
        this.f22165e = (mm2.k5) controller.business(mm2.k5.class);
        this.f22166f = "";
        this.f22167g = context.getResources().getColor(com.tencent.mm.R.color.f479206su);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f22164d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.l7 holder = (bm2.l7) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.hy1 hy1Var = (r45.hy1) ((java.util.ArrayList) this.f22164d).get(i17);
        java.lang.String name = hy1Var.f376553f;
        kotlin.jvm.internal.o.f(name, "name");
        holder.f22071d.setText(bm2.p6.a(name, this.f22166f, this.f22167g));
        holder.itemView.setOnClickListener(new bm2.m7(hy1Var, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.dso, null);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.l7(this, inflate);
    }
}
