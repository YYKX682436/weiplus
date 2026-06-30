package bm2;

/* loaded from: classes3.dex */
public final class c6 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f21817d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f21818e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f21819f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f21820g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f21821h;

    public c6(yz5.l onItemAddClick, yz5.p onItemLongClick, yz5.l isItemAdded) {
        kotlin.jvm.internal.o.g(onItemAddClick, "onItemAddClick");
        kotlin.jvm.internal.o.g(onItemLongClick, "onItemLongClick");
        kotlin.jvm.internal.o.g(isItemAdded, "isItemAdded");
        this.f21817d = onItemAddClick;
        this.f21818e = onItemLongClick;
        this.f21819f = isItemAdded;
        this.f21820g = "FinderLivePromoteSubListAdapter";
        this.f21821h = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21821h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.y5 holder = (bm2.y5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f21821h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        el2.v2 v2Var = (el2.v2) obj;
        boolean z17 = v2Var instanceof el2.a3;
        mn2.g1 g1Var = mn2.g1.f329975a;
        yo0.i h17 = z17 ? g1Var.h(mn2.f1.f329952J) : g1Var.h(mn2.f1.f329972z);
        java.lang.String d17 = v2Var.d();
        boolean z18 = true;
        boolean z19 = d17 == null || d17.length() == 0;
        android.widget.ImageView imageView = holder.f22454g;
        android.widget.ImageView imageView2 = holder.f22453f;
        if (z19) {
            imageView2.setVisibility(4);
            imageView.setVisibility(0);
            jz5.l f17 = v2Var.f();
            if (f17 != null) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(holder.itemView.getContext(), ((java.lang.Number) f17.f302833d).intValue(), ((java.lang.Number) f17.f302834e).intValue()));
            }
        } else {
            imageView2.setVisibility(0);
            imageView.setVisibility(4);
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).c(new mn2.q3(v2Var.d(), com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView2, h17);
        }
        holder.f22451d.setText(v2Var.getTitle());
        holder.f22452e.setText(v2Var.b());
        bm2.z5 z5Var = new bm2.z5(this, v2Var);
        android.view.View view = holder.f22455h;
        view.setOnClickListener(z5Var);
        java.lang.String c17 = v2Var.c();
        if (c17 != null && c17.length() != 0) {
            z18 = false;
        }
        android.widget.TextView textView = holder.f22456i;
        if (z18) {
            textView.setVisibility(8);
        } else {
            textView.setText(v2Var.c());
            textView.setVisibility(0);
        }
        if (v2Var.getType() == 7) {
            holder.itemView.setOnLongClickListener(new bm2.a6(this, v2Var));
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        } else {
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        holder.itemView.setOnClickListener(new bm2.b6(this, v2Var));
        boolean booleanValue = ((java.lang.Boolean) this.f21819f.invoke(v2Var)).booleanValue();
        android.widget.TextView textView2 = holder.f22457m;
        if (!booleanValue) {
            textView2.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.f491784e85));
            textView2.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            view.setOnClickListener(null);
            textView2.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.e88));
            textView2.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_4));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.axu, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.y5(this, inflate);
    }
}
