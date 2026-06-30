package wr3;

/* loaded from: classes11.dex */
public final class z1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f530457d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f530458e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f530459f;

    /* renamed from: g, reason: collision with root package name */
    public final int f530460g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f530461h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f530462i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f530463m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f530464n;

    public z1(java.util.List dataList, java.lang.String bizUsername, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        this.f530457d = dataList;
        this.f530458e = bizUsername;
        this.f530459f = z17;
        this.f530460g = i17;
        this.f530461h = jz5.h.b(wr3.w1.f530444d);
        this.f530463m = "";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f530457d.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 < this.f530457d.size()) {
            return 0;
        }
        return this.f530462i ? 1 : 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof wr3.v1)) {
            if (holder instanceof wr3.s1) {
                yz5.a aVar = this.f530464n;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                    return;
                }
                return;
            }
            if (holder instanceof wr3.t1) {
                if (r26.n0.N(this.f530463m)) {
                    wr3.t1 t1Var = (wr3.t1) holder;
                    t1Var.f530426d.setVisibility(8);
                    android.view.View view = t1Var.f530427e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                wr3.t1 t1Var2 = (wr3.t1) holder;
                android.widget.TextView textView = t1Var2.f530426d;
                textView.setVisibility(0);
                android.view.View view2 = t1Var2.f530427e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(this.f530463m);
                return;
            }
            return;
        }
        wr3.v1 v1Var = (wr3.v1) holder;
        r45.s5 s5Var = (r45.s5) this.f530457d.get(i17);
        r45.o5 o5Var = (r45.o5) s5Var.f467047i.f464287e.get(0);
        r45.l5 l5Var = s5Var.f467047i.f464286d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.d8.a(v1Var.f3639x46306858);
        v1Var.f3639x46306858.setOnClickListener(new wr3.x1(v1Var, this, l5Var, i17, o5Var));
        if (s5Var.f467042d.f472324e == 49) {
            ((yq1.z) ((zq1.a0) ((jz5.n) this.f530461h).mo141623x754a37bb())).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(16)) {
                zq1.a0 a0Var = (zq1.a0) ((jz5.n) this.f530461h).mo141623x754a37bb();
                java.util.LinkedList<r45.o5> DetailInfo = s5Var.f467047i.f464287e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DetailInfo, "DetailInfo");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(DetailInfo, 10));
                for (r45.o5 o5Var2 : DetailInfo) {
                    arrayList3.add(kz5.c0.i(o5Var2.f463450h, java.lang.String.valueOf(o5Var2.f463456p), this.f530458e));
                }
                ((yq1.z) a0Var).v(arrayList3, 126);
            }
        }
        java.lang.String str2 = o5Var.A;
        boolean z17 = true;
        boolean z18 = str2 == null || r26.n0.N(str2);
        android.widget.TextView textView2 = v1Var.f530437f;
        if (z18) {
            textView2.setVisibility(8);
            android.view.View view3 = v1Var.f530438g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView2.setVisibility(0);
            android.view.View view4 = v1Var.f530438g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setText(o5Var.A);
        }
        v1Var.f530436e.setText(ot0.g0.d(o5Var.f463472z));
        int intValue = ((java.lang.Number) ((jz5.n) v1Var.f530441m).mo141623x754a37bb()).intValue();
        java.lang.String str3 = o5Var.A;
        int i18 = str3 == null || r26.n0.N(str3) ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563571av0 : com.p314xaae8f345.mm.R.C30861xcebc809e.f563572av1;
        android.widget.ImageView imageView = v1Var.f530435d;
        imageView.setBackgroundResource(i18);
        java.lang.String str4 = o5Var.f463446d;
        wr3.g2 g2Var = str4 == null || str4.length() == 0 ? new wr3.g2((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().density * 8.0f) + 0.5f, true, true) : new wr3.g2((com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().density * 8.0f) + 0.5f, true, false);
        java.lang.String[] strArr = {o5Var.L, o5Var.f463453m, o5Var.f463455o};
        int i19 = 0;
        while (true) {
            if (i19 >= 3) {
                str = null;
                break;
            }
            str = strArr[i19];
            if (!(str == null || r26.n0.N(str))) {
                break;
            } else {
                i19++;
            }
        }
        if (str == null) {
            str = "";
        }
        java.lang.String b17 = qk.c.b(str, 2, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getUrl(...)");
        wr3.y1 y1Var = new wr3.y1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175984a.e(o5Var.f463450h, 5);
        imageView.setImageBitmap(null);
        imageView.setImageDrawable(null);
        imageView.setImageResource(i18);
        imageView.setTag(b17);
        int B = i65.a.B(imageView.getContext()) - ((int) (i65.a.g(imageView.getContext()) * 24));
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("radius:");
        float f17 = g2Var.f530343a;
        sb6.append(f17);
        sb6.append("-topRound:true-bottomRound:");
        boolean z19 = g2Var.f530344b;
        sb6.append(z19);
        fVar.D = java.lang.String.valueOf(sb6.toString());
        fVar.f423626q = i18;
        fVar.f423619j = B;
        fVar.f423620k = intValue;
        fVar.f423631v = true;
        fVar.A = new r35.n0(3);
        fVar.B = new r35.w(3);
        fVar.f423615f = tv.a.b(b17);
        o11.g a17 = fVar.a();
        r35.m0 m0Var = new r35.m0(3, -1, -1, null, y1Var);
        fq1.e.f347040a.g(imageView, f17, true, z19);
        n11.a.b().i(b17, imageView, a17, m0Var);
        java.lang.String str5 = o5Var.f463446d;
        if (str5 != null && str5.length() != 0) {
            z17 = false;
        }
        android.view.ViewGroup viewGroup = v1Var.f530439h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = v1Var.f530440i;
        if (z17) {
            viewGroup.setVisibility(8);
            c22624x85d69039.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        c22624x85d69039.setVisibility(0);
        java.lang.String Title = o5Var.f463446d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Title, "Title");
        java.lang.String str6 = o5Var.f463450h;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = c22624x85d69039.getContext();
        ((ke0.e) xVar).getClass();
        lr1.f.f402190a.f(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, Title), c22624x85d69039, false, str6, 4);
        c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(c22624x85d69039.getContext())));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a1o, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new wr3.v1(inflate);
        }
        if (i17 != 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570220a25, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new wr3.t1(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a19, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
        return new wr3.s1(inflate3);
    }

    public final void x(boolean z17) {
        if (this.f530462i == z17) {
            return;
        }
        this.f530462i = z17;
        m8147xed6e4d18(this.f530457d.size());
    }
}
