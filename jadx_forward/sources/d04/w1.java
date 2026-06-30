package d04;

/* loaded from: classes8.dex */
public final class w1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f307067d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f307068e;

    /* renamed from: f, reason: collision with root package name */
    public final int f307069f;

    /* renamed from: g, reason: collision with root package name */
    public final int f307070g;

    /* renamed from: h, reason: collision with root package name */
    public final int f307071h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f307072i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f307073m;

    /* renamed from: n, reason: collision with root package name */
    public d04.i f307074n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f307075o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f307076p;

    public w1(android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f307067d = context;
        this.f307068e = recyclerView;
        this.f307069f = 1;
        this.f307070g = 2;
        this.f307071h = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        this.f307072i = new java.util.ArrayList();
        this.f307073m = new java.util.HashMap();
        this.f307075o = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f307072i.size() + 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.ArrayList arrayList = this.f307072i;
        int i18 = (i17 == 0 || i17 > arrayList.size()) ? this.f307069f : this.f307070g;
        arrayList.size();
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 == 0) {
            if (holder instanceof d04.s1) {
                this.f307076p = ((d04.s1) holder).f307034d;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder  header EmptyViewHolder  recyclerViewHeight:");
            sb6.append(this.f307068e.getHeight());
            sb6.append("  mHeaderEmptyView:");
            android.view.View view = this.f307076p;
            sb6.append(view != null ? java.lang.Integer.valueOf(view.getHeight()) : null);
            sb6.append("  topMargin:");
            android.view.ViewGroup.LayoutParams layoutParams = this.f307068e.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            sb6.append(((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin);
            sb6.append("  pos:");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductMaskDecorView", sb6.toString());
            return;
        }
        if (i17 > this.f307072i.size()) {
            if (holder instanceof d04.s1) {
                android.view.View view2 = ((d04.s1) holder).f307034d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductMaskDecorView", "onBindViewHolder  footer EmptyViewHolder pos:" + i17);
            return;
        }
        java.lang.Object obj2 = this.f307072i.get(i17 - 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        synchronized (this.f307073m) {
            obj = this.f307073m.get(java.lang.Integer.valueOf(intValue));
            h0Var.f391656d = obj;
        }
        if (((sz3.w0) obj) != null && (holder instanceof d04.x1)) {
            if (((sz3.w0) obj).f495670h == 1 || ((sz3.w0) obj).f495670h == 2 || ((sz3.w0) obj).f495670h == 6) {
                d04.x1 x1Var = (d04.x1) holder;
                x1Var.f307084g.setVisibility(0);
                x1Var.f307083f.setVisibility(8);
                if (((sz3.w0) h0Var.f391656d).f495670h == 1) {
                    android.view.View view3 = x1Var.f307085h;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                d04.x1 x1Var2 = (d04.x1) holder;
                x1Var2.f307083f.setVisibility(0);
                x1Var2.f307084g.setVisibility(8);
                java.lang.Object obj3 = h0Var.f391656d;
                if (((sz3.w0) obj3).f495670h == 4) {
                    android.view.View view4 = x1Var2.f307085h;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    e04.f2 f2Var = e04.f2.f327458a;
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    if (((sz3.w0) h0Var.f391656d).f495674l.length() > 0) {
                        x1Var2.f307083f.setText("" + ((sz3.w0) h0Var.f391656d).f495674l);
                    } else {
                        x1Var2.f307083f.setText("" + this.f307067d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iac));
                    }
                } else if (((sz3.w0) obj3).f495670h == 3 || ((sz3.w0) obj3).f495670h == 5) {
                    x1Var2.f307083f.setText(this.f307067d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iac));
                    if (((sz3.w0) h0Var.f391656d).f495672j.length() == 0) {
                        android.view.View view5 = x1Var2.f307085h;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(4);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view6 = x1Var2.f307085h;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            if (((sz3.w0) h0Var.f391656d).f495672j.length() > 0) {
                ((d04.x1) holder).f307081d.setOnClickListener(new d04.v1(h0Var, this, intValue));
            } else {
                ((d04.x1) holder).f307081d.setOnClickListener(null);
            }
            d04.x1 x1Var3 = (d04.x1) holder;
            x1Var3.f307082e.setImageBitmap(null);
            x1Var3.f307082e.setTag(java.lang.Integer.valueOf(((sz3.w0) h0Var.f391656d).f495671i));
            int i18 = ((sz3.w0) h0Var.f391656d).f495671i;
            android.widget.ImageView imageView = x1Var3.f307082e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-productInfoIconIv>(...)");
            java.lang.Object obj4 = h0Var.f391656d;
            byte[] bArr = ((sz3.w0) obj4).f495668f;
            int i19 = ((sz3.w0) obj4).f495669g;
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17333xea344dac.f241292n;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17333xea344dac.f241292n.get(java.lang.String.valueOf(i18));
            if (bitmap == null || bitmap.isRecycled()) {
                ((ku5.t0) ku5.t0.f394148d).g(new d04.u1(i19, bArr, this, i18, imageView));
            } else {
                imageView.setImageBitmap(bitmap);
            }
            java.util.Objects.toString(h0Var.f391656d);
            android.view.View view7 = this.f307076p;
            if (view7 != null) {
                view7.getHeight();
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f307068e.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == this.f307069f) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.chx, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new d04.s1(inflate);
        }
        android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.chy, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new d04.x1(inflate2);
    }
}
