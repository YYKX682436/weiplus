package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class x1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f182634d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z1 f182635e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f182636f;

    /* renamed from: g, reason: collision with root package name */
    public o11.g f182637g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f182638h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f182639i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.m1 f182640m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l1 f182641n;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f182643p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f182644q;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.p1 f182647t;

    /* renamed from: o, reason: collision with root package name */
    public r45.dq0 f182642o = new r45.dq0();

    /* renamed from: r, reason: collision with root package name */
    public final o72.x3 f182645r = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h1(this);

    /* renamed from: s, reason: collision with root package name */
    public boolean f182646s = false;

    public x1(android.content.Context context, java.util.List list, int i17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z1 z1Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar, java.lang.Runnable runnable) {
        this.f182636f = null;
        this.f182637g = null;
        this.f182638h = true;
        this.f182636f = list;
        this.f182638h = gm0.j1.u().l();
        this.f182634d = context;
        this.f182635e = z1Var;
        this.f182644q = raVar;
        this.f182643p = runnable;
        o11.f fVar = new o11.f();
        fVar.f423618i = 1;
        fVar.f423631v = true;
        fVar.f423620k = i65.a.B(context) / i17;
        fVar.f423619j = i65.a.B(context) / i17;
        fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.a0y;
        this.f182637g = fVar.a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f182636f.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == mo1894x7e414b06() - 1) {
            return 52445;
        }
        return x(i17).f182570c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        if (list != null && list.size() > 0 && (k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1)) {
            if (((java.lang.Integer) list.get(0)).intValue() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1) k3Var;
                w1Var.f182630i.setChecked(false);
                w1Var.f182630i.setVisibility(0);
                android.view.View view = w1Var.f182631m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1) k3Var;
            w1Var2.f182630i.setChecked(false);
            w1Var2.f182630i.setVisibility(8);
            android.view.View view2 = w1Var2.f182631m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        super.mo8157xe5e2e48d(k3Var, i17, list);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return i17 == Integer.MAX_VALUE ? new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.j1(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ab6, viewGroup, false)) : i17 == 52445 ? new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.k1(android.view.LayoutInflater.from(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570291ab4, (android.view.ViewGroup) null)) : new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ab7, viewGroup, false));
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 x(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.List list = this.f182636f;
        if (i17 > list.size() - 1) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1) list.get(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var;
        o72.r2 r2Var;
        boolean z17 = this.f182638h;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", java.lang.Boolean.valueOf(z17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 x17 = x(i17);
        if (k3Var.m8185xcdaf1228() == Integer.MAX_VALUE) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.j1) k3Var;
            int mo1894x7e414b06 = mo1894x7e414b06() - 1;
            android.widget.TextView textView = j1Var.f182516d;
            if (i17 != mo1894x7e414b06) {
                if (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(x(i17 + 1).f182571d)) == com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(x17.f182571d))) {
                    textView.setVisibility(0);
                    j1Var.f182516d.setText(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().c(new java.util.Date(x17.f182571d), this.f182634d));
                    boolean z18 = this.f182639i;
                    android.widget.ProgressBar progressBar = j1Var.f182517e;
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
        if (k3Var.m8185xcdaf1228() == 52445) {
            if (mo1894x7e414b06() > 1) {
                android.view.View view = k3Var.f3639x46306858;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = k3Var.f3639x46306858;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] show view type ending view");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1) k3Var;
        w1Var.f182625d.setTag(com.p314xaae8f345.mm.R.id.dug, java.lang.Integer.valueOf(i17));
        android.widget.ImageView imageView = w1Var.f182625d;
        if (x17 != null && (b1Var = x17.f182569b) != null && (r2Var = b1Var.f182430a) != null) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.t_7, java.lang.Integer.valueOf(r2Var.f67657x2262335f));
        }
        w1Var.f182631m.setTag(java.lang.Integer.valueOf(i17));
        boolean z19 = x17.f182573f;
        boolean z27 = x17.f182572e;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var2 = x17.f182569b;
        if (z19) {
            if (com.p314xaae8f345.mm.vfs.w6.j(b1Var2.a())) {
                n11.a b17 = n11.a.b();
                java.lang.String str = x17.f182568a;
                o11.f fVar = new o11.f();
                fVar.f423631v = true;
                fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.a0y;
                b17.h(str, imageView, fVar.a());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f182644q;
                android.widget.ImageView imageView2 = w1Var.f182625d;
                r45.gp0 gp0Var = b1Var2.f182431b;
                o72.r2 r2Var2 = b1Var2.f182430a;
                o11.g gVar = this.f182637g;
                raVar.e(imageView2, gp0Var, r2Var2, com.p314xaae8f345.mm.R.C30859x5a72f63.a0y, gVar.f423644i, gVar.f423645j);
            }
        } else {
            if (b1Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
                a17 = "";
            } else {
                a17 = b1Var2.a();
            }
            x17.f182568a = a17;
            if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
                n11.a.b().h(x17.f182568a, imageView, this.f182637g);
            } else if (z27) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar2 = this.f182644q;
                android.widget.ImageView imageView3 = w1Var.f182625d;
                r45.gp0 gp0Var2 = b1Var2.f182431b;
                o72.r2 r2Var3 = b1Var2.f182430a;
                o11.g gVar2 = this.f182637g;
                raVar2.e(imageView3, gp0Var2, r2Var3, com.p314xaae8f345.mm.R.C30859x5a72f63.a0y, gVar2.f423644i, gVar2.f423645j);
            } else {
                android.widget.ImageView imageView4 = w1Var.f182625d;
                r45.gp0 gp0Var3 = b1Var2.f182431b;
                o72.r2 r2Var4 = b1Var2.f182430a;
                o11.g gVar3 = this.f182637g;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.d(imageView4, com.p314xaae8f345.mm.R.C30859x5a72f63.a0y, gp0Var3, r2Var4, false, gVar3.f423644i, gVar3.f423645j);
            }
        }
        android.widget.TextView textView2 = w1Var.f182627f;
        if (z27) {
            android.view.View view3 = w1Var.f182626e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            java.lang.String str2 = x17.f182574g.f182551a;
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            textView2.setText(str2 != null ? str2 : "");
        } else {
            textView2.setVisibility(8);
            android.view.View view4 = w1Var.f182626e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.i1(this, w1Var));
        boolean z29 = this.f182646s;
        android.widget.ImageView imageView5 = w1Var.f182628g;
        android.widget.CheckBox checkBox = w1Var.f182630i;
        if (z29) {
            android.view.View view5 = w1Var.f182631m;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(0);
            if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.d(b1Var2)) {
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
        android.view.View view6 = w1Var.f182631m;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        checkBox.setVisibility(8);
    }
}
