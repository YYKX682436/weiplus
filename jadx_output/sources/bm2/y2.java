package bm2;

/* loaded from: classes3.dex */
public final class y2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f22446d = new java.util.LinkedList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22446d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.x2 holder = (bm2.x2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.LinkedList linkedList = this.f22446d;
        java.lang.Object obj = linkedList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.x22 x22Var = (r45.x22) obj;
        java.lang.String string = holder.itemView.getContext().getString(com.tencent.mm.R.string.lub, java.lang.Integer.valueOf(x22Var.getInteger(3)));
        android.widget.TextView textView = holder.f22426d;
        textView.setText(string);
        textView.setVisibility((i17 < 1 || ((r45.x22) linkedList.get(i17 - 1)).getInteger(3) != x22Var.getInteger(3)) ? 0 : 4);
        holder.f22428f.setText(x22Var.getString(1));
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(x22Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        android.widget.ImageView imageView = holder.f22427e;
        kotlin.jvm.internal.o.f(imageView, "<get-rightIv>(...)");
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329965s));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aqm, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.x2(this, inflate);
    }
}
