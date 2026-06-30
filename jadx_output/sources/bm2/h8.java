package bm2;

/* loaded from: classes3.dex */
public final class h8 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f21951d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f21952e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f21953f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f21954g = 1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21955h;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21953f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((r45.of1) this.f21953f.get(i17)).getInteger(2);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof bm2.c8)) {
            if (holder instanceof bm2.b8) {
                bm2.b8 b8Var = (bm2.b8) holder;
                b8Var.itemView.setOnClickListener(new bm2.e8(this, i17, b8Var));
                return;
            }
            return;
        }
        bm2.c8 c8Var = (bm2.c8) holder;
        r45.of1 of1Var = i17 >= 0 && i17 < getItemCount() ? (r45.of1) this.f21953f.get(i17) : null;
        if (of1Var != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.l().c(new mn2.n(of1Var.getString(1), null, 2, null), c8Var.f21826d, g1Var.h(mn2.f1.f329961o));
            c8Var.f21827e.setText(of1Var.getString(0));
            java.lang.String g17 = zl2.r4.f473950a.g1(of1Var.getInteger(2));
            boolean z17 = g17.length() == 0;
            android.widget.TextView textView = c8Var.f21828f;
            if (z17) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(g17);
            }
            int integer = of1Var.getInteger(2);
            int i18 = this.f21954g;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = c8Var.f21829g;
            if (integer == i18) {
                weImageView.setVisibility(0);
            } else {
                weImageView.setVisibility(4);
            }
            c8Var.itemView.setTag(of1Var);
        }
        c8Var.itemView.setOnClickListener(new bm2.f8(this, c8Var));
        c8Var.itemView.setOnLongClickListener(new bm2.g8(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 10001) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.b1b, null);
            kotlin.jvm.internal.o.d(inflate);
            return new bm2.b8(this, inflate);
        }
        android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.b1d, null);
        kotlin.jvm.internal.o.d(inflate2);
        return new bm2.c8(this, inflate2);
    }

    public final void x(int i17, java.util.LinkedList linkedList, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAliasInfoList,ori size:");
        java.util.LinkedList linkedList2 = this.f21953f;
        sb6.append(linkedList2.size());
        sb6.append(",new size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(",curroleType:");
        sb6.append(this.f21954g);
        sb6.append(",roleType:");
        sb6.append(i17);
        sb6.append(",enableCreate:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorRoleAdapter", sb6.toString());
        this.f21954g = i17;
        this.f21955h = z17;
        if (linkedList != null) {
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            if (zl2.r4.f473950a.F(linkedList2)) {
                return;
            }
            r45.of1 of1Var = new r45.of1();
            of1Var.set(2, 10001);
            linkedList2.add(of1Var);
        }
    }
}
