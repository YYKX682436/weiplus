package ap1;

/* loaded from: classes5.dex */
public final class l0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.o0 f12697d;

    public l0(ap1.o0 o0Var) {
        this.f12697d = o0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f12697d.f12711e;
        if (list != null) {
            return list.size();
        }
        kotlin.jvm.internal.o.o("selectedList");
        throw null;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ap1.j0 holder = (ap1.j0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        ap1.o0 o0Var = this.f12697d;
        java.util.List list = o0Var.f12711e;
        if (list == null) {
            kotlin.jvm.internal.o.o("selectedList");
            throw null;
        }
        java.lang.String str = (java.lang.String) list.get(i17);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        ((com.tencent.mm.feature.avatar.w) zVar).Ai((android.widget.ImageView) view, str, null);
        holder.itemView.setOnClickListener(new ap1.k0(o0Var, str));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        int dimension = (int) parent.getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        int dimension2 = (int) parent.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(dimension, dimension);
        layoutParams.setMarginStart(dimension2);
        imageView.setLayoutParams(layoutParams);
        ap1.j0 j0Var = new ap1.j0(imageView);
        imageView.setTag(j0Var);
        return j0Var;
    }
}
