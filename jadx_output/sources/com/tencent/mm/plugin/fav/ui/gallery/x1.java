package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class x1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f101101d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.gallery.z1 f101102e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f101103f;

    /* renamed from: g, reason: collision with root package name */
    public o11.g f101104g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f101105h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f101106i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.m1 f101107m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.l1 f101108n;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f101110p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.ra f101111q;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.p1 f101114t;

    /* renamed from: o, reason: collision with root package name */
    public r45.dq0 f101109o = new r45.dq0();

    /* renamed from: r, reason: collision with root package name */
    public final o72.x3 f101112r = new com.tencent.mm.plugin.fav.ui.gallery.h1(this);

    /* renamed from: s, reason: collision with root package name */
    public boolean f101113s = false;

    public x1(android.content.Context context, java.util.List list, int i17, com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var, com.tencent.mm.plugin.fav.ui.ra raVar, java.lang.Runnable runnable) {
        this.f101103f = null;
        this.f101104g = null;
        this.f101105h = true;
        this.f101103f = list;
        this.f101105h = gm0.j1.u().l();
        this.f101101d = context;
        this.f101102e = z1Var;
        this.f101111q = raVar;
        this.f101110p = runnable;
        o11.f fVar = new o11.f();
        fVar.f342085i = 1;
        fVar.f342098v = true;
        fVar.f342087k = i65.a.B(context) / i17;
        fVar.f342086j = i65.a.B(context) / i17;
        fVar.f342093q = com.tencent.mm.R.color.a0y;
        this.f101104g = fVar.a();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f101103f.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == getItemCount() - 1) {
            return 52445;
        }
        return x(i17).f101037c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        if (list != null && list.size() > 0 && (k3Var instanceof com.tencent.mm.plugin.fav.ui.gallery.w1)) {
            if (((java.lang.Integer) list.get(0)).intValue() == 0) {
                com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var = (com.tencent.mm.plugin.fav.ui.gallery.w1) k3Var;
                w1Var.f101097i.setChecked(false);
                w1Var.f101097i.setVisibility(0);
                android.view.View view = w1Var.f101098m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var2 = (com.tencent.mm.plugin.fav.ui.gallery.w1) k3Var;
            w1Var2.f101097i.setChecked(false);
            w1Var2.f101097i.setVisibility(8);
            android.view.View view2 = w1Var2.f101098m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        super.onBindViewHolder(k3Var, i17, list);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return i17 == Integer.MAX_VALUE ? new com.tencent.mm.plugin.fav.ui.gallery.j1(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ab6, viewGroup, false)) : i17 == 52445 ? new com.tencent.mm.plugin.fav.ui.gallery.k1(android.view.LayoutInflater.from(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.f488758ab4, (android.view.ViewGroup) null)) : new com.tencent.mm.plugin.fav.ui.gallery.w1(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ab7, viewGroup, false));
    }

    public com.tencent.mm.plugin.fav.ui.gallery.o1 x(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.List list = this.f101103f;
        if (i17 > list.size() - 1) {
            return null;
        }
        return (com.tencent.mm.plugin.fav.ui.gallery.o1) list.get(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String a17;
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var;
        o72.r2 r2Var;
        boolean z17 = this.f101105h;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", java.lang.Boolean.valueOf(z17));
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.o1 x17 = x(i17);
        if (k3Var.getItemViewType() == Integer.MAX_VALUE) {
            com.tencent.mm.plugin.fav.ui.gallery.j1 j1Var = (com.tencent.mm.plugin.fav.ui.gallery.j1) k3Var;
            int itemCount = getItemCount() - 1;
            android.widget.TextView textView = j1Var.f100983d;
            if (i17 != itemCount) {
                if (com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(x(i17 + 1).f101038d)) == com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(x17.f101038d))) {
                    textView.setVisibility(0);
                    j1Var.f100983d.setText(com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(x17.f101038d), this.f101101d));
                    boolean z18 = this.f101106i;
                    android.widget.ProgressBar progressBar = j1Var.f100984e;
                    if (z18) {
                        progressBar.setVisibility(0);
                        return;
                    } else {
                        progressBar.setVisibility(8);
                        return;
                    }
                }
            }
            textView.setVisibility(8);
            return;
        }
        if (k3Var.getItemViewType() == 52445) {
            if (getItemCount() > 1) {
                android.view.View view = k3Var.itemView;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = k3Var.itemView;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] show view type ending view");
            return;
        }
        com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var = (com.tencent.mm.plugin.fav.ui.gallery.w1) k3Var;
        w1Var.f101092d.setTag(com.tencent.mm.R.id.dug, java.lang.Integer.valueOf(i17));
        android.widget.ImageView imageView = w1Var.f101092d;
        if (x17 != null && (b1Var = x17.f101036b) != null && (r2Var = b1Var.f100897a) != null) {
            imageView.setTag(com.tencent.mm.R.id.t_7, java.lang.Integer.valueOf(r2Var.field_type));
        }
        w1Var.f101098m.setTag(java.lang.Integer.valueOf(i17));
        boolean z19 = x17.f101040f;
        boolean z27 = x17.f101039e;
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var2 = x17.f101036b;
        if (z19) {
            if (com.tencent.mm.vfs.w6.j(b1Var2.a())) {
                n11.a b17 = n11.a.b();
                java.lang.String str = x17.f101035a;
                o11.f fVar = new o11.f();
                fVar.f342098v = true;
                fVar.f342093q = com.tencent.mm.R.color.a0y;
                b17.h(str, imageView, fVar.a());
            } else {
                com.tencent.mm.plugin.fav.ui.ra raVar = this.f101111q;
                android.widget.ImageView imageView2 = w1Var.f101092d;
                r45.gp0 gp0Var = b1Var2.f100898b;
                o72.r2 r2Var2 = b1Var2.f100897a;
                o11.g gVar = this.f101104g;
                raVar.e(imageView2, gp0Var, r2Var2, com.tencent.mm.R.color.a0y, gVar.f342111i, gVar.f342112j);
            }
        } else {
            if (b1Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
                a17 = "";
            } else {
                a17 = b1Var2.a();
            }
            x17.f101035a = a17;
            if (com.tencent.mm.vfs.w6.j(a17)) {
                n11.a.b().h(x17.f101035a, imageView, this.f101104g);
            } else if (z27) {
                com.tencent.mm.plugin.fav.ui.ra raVar2 = this.f101111q;
                android.widget.ImageView imageView3 = w1Var.f101092d;
                r45.gp0 gp0Var2 = b1Var2.f100898b;
                o72.r2 r2Var3 = b1Var2.f100897a;
                o11.g gVar2 = this.f101104g;
                raVar2.e(imageView3, gp0Var2, r2Var3, com.tencent.mm.R.color.a0y, gVar2.f342111i, gVar2.f342112j);
            } else {
                android.widget.ImageView imageView4 = w1Var.f101092d;
                r45.gp0 gp0Var3 = b1Var2.f100898b;
                o72.r2 r2Var4 = b1Var2.f100897a;
                o11.g gVar3 = this.f101104g;
                com.tencent.mm.plugin.fav.ui.ra.d(imageView4, com.tencent.mm.R.color.a0y, gp0Var3, r2Var4, false, gVar3.f342111i, gVar3.f342112j);
            }
        }
        android.widget.TextView textView2 = w1Var.f101094f;
        if (z27) {
            android.view.View view3 = w1Var.f101093e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            java.lang.String str2 = x17.f101041g.f101018a;
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            textView2.setText(str2 != null ? str2 : "");
        } else {
            textView2.setVisibility(8);
            android.view.View view4 = w1Var.f101093e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.fav.ui.gallery.i1(this, w1Var));
        boolean z29 = this.f101113s;
        android.widget.ImageView imageView5 = w1Var.f101095g;
        android.widget.CheckBox checkBox = w1Var.f101097i;
        if (z29) {
            android.view.View view5 = w1Var.f101098m;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(0);
            if (com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.d(b1Var2)) {
                imageView5.setVisibility(0);
                checkBox.setChecked(true);
                return;
            } else {
                imageView5.setVisibility(8);
                checkBox.setChecked(false);
                return;
            }
        }
        imageView5.setVisibility(8);
        android.view.View view6 = w1Var.f101098m;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        checkBox.setVisibility(8);
    }
}
