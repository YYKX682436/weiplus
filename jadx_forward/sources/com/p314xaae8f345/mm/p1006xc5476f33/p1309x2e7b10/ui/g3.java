package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class g3 implements wt1.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f176544d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f176545e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f176546f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f176547g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f176548h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f176549i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f176550m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f176551n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f176552o = false;

    public g3(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view) {
        this.f176545e = abstractActivityC21394xb3d2c0cf;
        this.f176544d = view;
    }

    @Override // wt1.e0
    public void L1(xt1.k kVar) {
        a();
    }

    public final void a() {
        int i17 = xt1.t0.Ui().f530801c;
        if (i17 <= 0 || !this.f176552o) {
            android.view.View view = this.f176546f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f176549i;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_MSG_TIPS_TITLE_STRING_SYNC, "");
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_MSG_TIPS_ICON_URL_STRING_SYNC, "");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f176545e;
        int dimensionPixelOffset = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561709qi);
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f176548h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.byw);
        } else {
            lu1.g0.b(this.f176548h, str2, dimensionPixelOffset, com.p314xaae8f345.mm.R.C30861xcebc809e.byw, true);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            this.f176547g.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.at9, java.lang.Integer.valueOf(i17)));
        } else {
            this.f176547g.setText(str);
        }
        android.view.View view3 = this.f176546f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f176549i != null) {
            if (android.text.TextUtils.isEmpty(str2)) {
                this.f176551n.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.byw);
            } else {
                lu1.g0.b(this.f176551n, str2, dimensionPixelOffset, com.p314xaae8f345.mm.R.C30861xcebc809e.byw, true);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                this.f176550m.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.at9, java.lang.Integer.valueOf(i17)));
            } else {
                this.f176550m.setText(str);
            }
            android.view.View view4 = this.f176549i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // wt1.e0
    /* renamed from: onChange */
    public void mo54452x3dcbea6f() {
    }
}
