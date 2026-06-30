package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 f173574d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8) {
        this.f173574d = c12795x70ccad8;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f173574d.f173393g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.t) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8 = this.f173574d;
        java.util.ArrayList arrayList = c12795x70ccad8.f173393g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0 z0Var = i17 >= arrayList.size() ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0) arrayList.get(i17);
        if (z0Var == null) {
            return;
        }
        tVar.f173588d = z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 m53610x59d4c014 = c12795x70ccad8.m53610x59d4c014();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g1 m53609xcd852395 = c12795x70ccad8.m53609xcd852395();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d1.f173502a;
        int f17 = (int) (i65.a.f(r7, com.p314xaae8f345.mm.R.C30860x5b28f31.f561624ao2) * cl1.k.a(tVar.f3639x46306858.getContext()));
        tVar.f3639x46306858.getLayoutParams().width = (int) c1Var.b(tVar.f3639x46306858.getContext());
        android.widget.RelativeLayout relativeLayout = tVar.f173589e;
        relativeLayout.getLayoutParams().width = f17;
        relativeLayout.getLayoutParams().height = f17;
        android.widget.ImageView imageView = tVar.f173590f;
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        android.view.View view = tVar.f3639x46306858;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCommonUsedTaskView$AppBrandCommonUsedItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCommonUsedTaskView$AppBrandCommonUsedItemViewHolder", "onBind", "(Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskViewListener;Lcom/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskView$IAppBrandTaskReport;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = tVar.f173591g;
        textView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = tVar.f173588d.f173625a;
        android.widget.TextView textView2 = tVar.f173592h;
        if (c11714x918fd2e4 == null) {
            l01.d0.f396294a.b(imageView, "", l01.a.h(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.f173392v);
            textView2.setVisibility(8);
            textView.setText("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "item info is null!");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11714x918fd2e4.f157900m)) {
            textView.setText(tVar.f173588d.f173625a.f157900m);
            textView.setVisibility(0);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f173588d.f173625a.f157898h)) {
            textView.setText(tVar.f173588d.f173625a.f157898h);
            textView.setVisibility(0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f173588d.f173625a.f157894d)) {
            textView.setVisibility(0);
            textView.setText("");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = tVar.f173588d.f173625a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", c11714x918fd2e42.f157894d, c11714x918fd2e42.f157895e);
            textView.setVisibility(0);
            textView.setText(tVar.f173588d.f173625a.f157894d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e43 = tVar.f173588d.f173625a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "[onBindViewHolder] name=%s iconUrl=%s", c11714x918fd2e43.f157898h, c11714x918fd2e43.f157901n);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f173588d.f173625a.f157901n)) {
            imageView.setImageDrawable(l01.a.h());
        } else {
            l01.d0.f396294a.b(imageView, tVar.f173588d.f173625a.f157901n, l01.a.h(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.f173392v);
        }
        ft.k kVar = (ft.k) i95.n0.c(ft.k.class);
        textView2.setVisibility(8);
        android.widget.ImageView imageView2 = tVar.f173593i;
        imageView2.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f173588d.f173625a.f157907t)) {
            int i18 = tVar.f173588d.f173625a.f157896f;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.e0) kVar).getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(i18))) {
                textView2.setVisibility(0);
                textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(tVar.f173588d.f173625a.f157896f));
            } else if (tVar.f173588d.f173625a.f157905r) {
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
            textView2.setText(tVar.f173588d.f173625a.f157907t);
        }
        android.view.View view2 = tVar.f3639x46306858;
        view2.setTag(com.p314xaae8f345.mm.R.id.cvq, new rl5.r(view2.getContext(), tVar.f3639x46306858));
        tVar.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.s(tVar, m53610x59d4c014, m53609xcd852395, i17));
        tVar.f3639x46306858.setHapticFeedbackEnabled(false);
        android.view.View view3 = tVar.f3639x46306858;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = textView.getText().toString();
        objArr[1] = textView2.getVisibility() == 0 ? textView2.getText().toString() : "";
        view3.setContentDescription(java.lang.String.format("%s,%s", objArr));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.t(com.p314xaae8f345.mm.ui.id.b(this.f173574d.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dyy, viewGroup, false));
    }
}
