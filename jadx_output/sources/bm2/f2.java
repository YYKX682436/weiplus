package bm2;

/* loaded from: classes3.dex */
public final class f2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f21882d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f21883e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21882d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.c2 holder = (bm2.c2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f21882d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        bm2.b2 b2Var = (bm2.b2) obj;
        java.lang.String str = b2Var.f21786b.f309598c;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = holder.f21808d;
        textView.setText(str);
        boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
        android.widget.TextView textView2 = holder.f21809e;
        if (isWifi && b2Var.f21786b.f309597b == 5) {
            holder.itemView.getLayoutParams().height = i65.a.f(holder.itemView.getContext(), com.tencent.mm.R.dimen.f479731dn);
            textView2.setVisibility(0);
        } else {
            holder.itemView.getLayoutParams().height = i65.a.f(holder.itemView.getContext(), com.tencent.mm.R.dimen.f479727dj);
            textView2.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof android.widget.RelativeLayout.LayoutParams)) {
                ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
            }
        }
        boolean z17 = b2Var.f21788d;
        android.widget.ImageView imageView = holder.f21810f;
        if (z17) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        holder.itemView.setOnClickListener(new bm2.e2(b2Var, holder, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b0c, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.c2(this, inflate);
    }
}
