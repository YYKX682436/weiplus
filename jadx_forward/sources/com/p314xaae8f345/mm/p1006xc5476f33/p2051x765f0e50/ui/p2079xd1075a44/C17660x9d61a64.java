package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44;

/* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView */
/* loaded from: classes11.dex */
public class C17660x9d61a64 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f243583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243584e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f243585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f243586g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f243587h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f243588i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f243589m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f243590n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f243591o;

    /* renamed from: p, reason: collision with root package name */
    public w24.s f243592p;

    /* renamed from: q, reason: collision with root package name */
    public w24.t f243593q;

    public C17660x9d61a64(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f243589m = new java.util.ArrayList();
        this.f243590n = new java.util.ArrayList();
        this.f243591o = new java.util.ArrayList();
        getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561097g);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64.a(java.util.Map):void");
    }

    public void b() {
        java.util.List list;
        java.util.List list2;
        removeAllViews();
        java.util.List list3 = this.f243589m;
        int min = java.lang.Math.min(5, ((java.util.ArrayList) list3).size());
        int i17 = 0;
        while (true) {
            list = this.f243591o;
            list2 = this.f243590n;
            if (i17 >= min) {
                break;
            }
            if (!this.f243583d) {
                android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524172b.setVisibility(4);
            } else if (((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f243587h)) {
                android.view.View view2 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.5f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524172b.setVisibility(0);
            }
            android.view.View view3 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243587h) && ((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f243587h)) {
                if (this.f243584e) {
                    ((android.widget.ImageView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.cnz)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.afw);
                    ((android.widget.TextView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.f565535co1)).setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbe));
                } else {
                    ((android.widget.ImageView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.cnz)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.afs);
                    ((android.widget.TextView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.f565535co1)).setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyz));
                }
                android.view.View findViewById = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.f563932di);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.cnz);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243588i) && ((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f243588i)) {
                ((android.widget.TextView) ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.f565535co1)).setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic));
                android.view.View findViewById3 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.cnz);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d.findViewById(com.p314xaae8f345.mm.R.id.f563932di);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById4, arrayList8.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = ((w24.u) ((java.util.ArrayList) list2).get(i17)).f524174d;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view5, arrayList9.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f243584e) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243587h) || !((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f243587h)) {
                    android.view.View view6 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(java.lang.Float.valueOf(0.5f));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view6, arrayList10.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view6.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    android.view.View view7 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view7, arrayList11.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view7.setAlpha(((java.lang.Float) arrayList11.get(0)).floatValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243588i)) {
                if (((java.lang.String) ((java.util.ArrayList) list3).get(i17)).equals(this.f243588i)) {
                    android.view.View view8 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(view8, arrayList12.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view8.setAlpha(((java.lang.Float) arrayList12.get(0)).floatValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    android.view.View view9 = (android.view.View) ((java.util.ArrayList) list).get(i17);
                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                    arrayList13.add(java.lang.Float.valueOf(0.5f));
                    java.util.Collections.reverse(arrayList13);
                    yj0.a.d(view9, arrayList13.toArray(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view9.setAlpha(((java.lang.Float) arrayList13.get(0)).floatValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            addView((android.view.View) ((java.util.ArrayList) list).get(i17), layoutParams);
            i17++;
        }
        if (getChildCount() >= 5 || this.f243583d || this.f243584e || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243588i)) {
            return;
        }
        ((w24.u) ((java.util.ArrayList) list2).get(((java.util.ArrayList) list2).size() - 1)).f524172b.setVisibility(4);
        addView((android.view.View) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1), new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: getAccountCount */
    public int m69112xa073bd58() {
        return ((java.util.ArrayList) this.f243589m).size();
    }

    /* renamed from: setDeleteState */
    public void m69113x2cb4dbe4(boolean z17) {
        this.f243583d = z17;
    }

    /* renamed from: setLastLoginWxUsername */
    public void m69114x863869e8(java.lang.String str) {
        this.f243587h = str;
    }

    /* renamed from: setLoginState */
    public void m69115xb39124aa(boolean z17) {
        this.f243585f = z17;
    }

    /* renamed from: setLogoutState */
    public void m69116xd6ad5f65(boolean z17) {
        this.f243584e = z17;
    }

    /* renamed from: setOnAnimatorEndListener */
    public void m69117x3de7f9a7(w24.r rVar) {
    }

    /* renamed from: setOnClickAvatarListener */
    public void m69118x1092a134(w24.s sVar) {
        this.f243592p = sVar;
    }

    /* renamed from: setOnDeleteAvatarListener */
    public void m69119x540bb39(w24.t tVar) {
        this.f243593q = tVar;
    }

    /* renamed from: setSwitchToWxUsername */
    public void m69120x7fc79908(java.lang.String str) {
        this.f243588i = str;
    }

    /* renamed from: setUseSystemDecoder */
    public void m69121xe20ea950(boolean z17) {
        this.f243586g = z17;
    }
}
