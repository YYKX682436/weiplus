package bm2;

/* loaded from: classes3.dex */
public final class p2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f22219d = new java.util.LinkedList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22219d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.n2 holder = (bm2.n2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f22219d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.uk6 uk6Var = (r45.uk6) obj;
        holder.f22125d.setText(uk6Var.getString(0));
        holder.f22126e.setText(uk6Var.getString(1));
        int integer = (uk6Var.getInteger(3) * uk6Var.getInteger(6)) / uk6Var.getInteger(4);
        int integer2 = uk6Var.getInteger(6);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(integer);
        sb6.append('/');
        sb6.append(integer2);
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(sb6.toString());
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        if (uk6Var.getInteger(3) == uk6Var.getInteger(4)) {
            f0Var.c(foregroundColorSpan, 0, f0Var.length(), 17);
        } else {
            f0Var.c(foregroundColorSpan, 0, java.lang.String.valueOf(integer).length(), 17);
        }
        holder.f22127f.setText(f0Var);
        holder.itemView.setOnClickListener(new bm2.o2(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aqn, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.n2(this, inflate);
    }
}
