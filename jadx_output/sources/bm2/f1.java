package bm2;

/* loaded from: classes10.dex */
public final class f1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f21881d = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21881d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.e1 holder = (bm2.e1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.o5 article = (r45.o5) this.f21881d.get(i17);
        kotlin.jvm.internal.o.g(article, "article");
        holder.f21856e.setText(article.f381913d);
        ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(article.f381920m, com.tencent.mm.plugin.finder.storage.y90.f128355e))).c(holder.f21857f);
        holder.f21858g.setText(k35.m1.d("yyyy/MM/dd HH:mm", article.S));
        holder.f21855d.setOnClickListener(new bm2.d1(article));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aon, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.e1(this, inflate);
    }
}
