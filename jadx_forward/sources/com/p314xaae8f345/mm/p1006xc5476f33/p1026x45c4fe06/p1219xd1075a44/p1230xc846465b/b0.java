package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class b0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb f173473d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb c12799x63f4f4eb) {
        this.f173473d = c12799x63f4f4eb;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f173473d.f173410g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d0) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb c12799x63f4f4eb = this.f173473d;
        java.util.ArrayList arrayList = c12799x63f4f4eb.f173410g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0 z0Var = i17 >= arrayList.size() ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0) arrayList.get(i17);
        if (z0Var == null) {
            return;
        }
        d0Var.f173496d = z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 m53610x59d4c014 = c12799x63f4f4eb.m53610x59d4c014();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g1 m53609xcd852395 = c12799x63f4f4eb.m53609xcd852395();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d1.f173502a;
        int f17 = (int) (i65.a.f(r7, com.p314xaae8f345.mm.R.C30860x5b28f31.f561624ao2) * cl1.k.a(d0Var.f3639x46306858.getContext()));
        d0Var.f3639x46306858.getLayoutParams().width = (int) c1Var.b(d0Var.f3639x46306858.getContext());
        android.widget.RelativeLayout relativeLayout = d0Var.f173497e;
        relativeLayout.getLayoutParams().width = f17;
        relativeLayout.getLayoutParams().height = f17;
        android.widget.ImageView imageView = d0Var.f173498f;
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        android.view.View view = d0Var.f3639x46306858;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentIconItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandRecentTaskView$AppBrandRecentIconItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = d0Var.f173499g;
        textView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = d0Var.f173496d.f173625a;
        android.widget.TextView textView2 = d0Var.f173500h;
        if (c11714x918fd2e4 == null) {
            l01.d0.f396294a.b(imageView, "", l01.a.h(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb.f173409o);
            textView2.setVisibility(8);
            textView.setText("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "item info is null!");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157900m)) {
            textView.setText(d0Var.f173496d.f173625a.f157900m);
            textView.setVisibility(0);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f173496d.f173625a.f157898h)) {
            textView.setText(d0Var.f173496d.f173625a.f157898h);
            textView.setVisibility(0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f173496d.f173625a.f157894d)) {
            textView.setVisibility(0);
            textView.setText("");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = d0Var.f173496d.f173625a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", c11714x918fd2e42.f157894d, c11714x918fd2e42.f157895e);
            textView.setVisibility(0);
            textView.setText(d0Var.f173496d.f173625a.f157894d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e43 = d0Var.f173496d.f173625a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "[onBindViewHolder] name=%s iconUrl=%s", c11714x918fd2e43.f157898h, c11714x918fd2e43.f157901n);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f173496d.f173625a.f157901n)) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f396294a.b(imageView, d0Var.f173496d.f173625a.f157901n, l01.a.h(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb.f173409o);
        }
        ft.k kVar = (ft.k) i95.n0.c(ft.k.class);
        textView2.setVisibility(8);
        android.widget.ImageView imageView2 = d0Var.f173501i;
        imageView2.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f173496d.f173625a.f157907t)) {
            int i18 = d0Var.f173496d.f173625a.f157896f;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.e0) kVar).getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(i18))) {
                textView2.setVisibility(0);
                textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(d0Var.f173496d.f173625a.f157896f));
            } else if (d0Var.f173496d.f173625a.f157905r) {
                imageView2.setVisibility(0);
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    shapeDrawable.getPaint().setColor(-14935012);
                } else {
                    shapeDrawable.getPaint().setColor(-15263959);
                }
                imageView2.setBackground(shapeDrawable);
                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78448xc99fb831);
            }
        } else {
            textView2.setVisibility(0);
            textView2.setText(d0Var.f173496d.f173625a.f157907t);
        }
        android.view.View view2 = d0Var.f3639x46306858;
        view2.setTag(com.p314xaae8f345.mm.R.id.cvq, new rl5.r(view2.getContext(), d0Var.f3639x46306858));
        d0Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c0(d0Var, m53610x59d4c014, m53609xcd852395, i17));
        d0Var.f3639x46306858.setHapticFeedbackEnabled(false);
        android.view.View view3 = d0Var.f3639x46306858;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = textView.getText().toString();
        objArr[1] = textView2.getVisibility() == 0 ? textView2.getText().toString() : "";
        view3.setContentDescription(java.lang.String.format("%s,%s", objArr));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d0(com.p314xaae8f345.mm.ui.id.b(this.f173473d.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dyy, viewGroup, false));
    }
}
