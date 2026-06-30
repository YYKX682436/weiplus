package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class g3 implements wt1.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f95011d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f95012e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f95013f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f95014g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f95015h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f95016i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f95017m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f95018n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95019o = false;

    public g3(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view) {
        this.f95012e = mMActivity;
        this.f95011d = view;
    }

    @Override // wt1.e0
    public void L1(xt1.k kVar) {
        a();
    }

    public final void a() {
        int i17 = xt1.t0.Ui().f449268c;
        if (i17 <= 0 || !this.f95019o) {
            android.view.View view = this.f95013f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f95016i;
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
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_MSG_TIPS_TITLE_STRING_SYNC, "");
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_MSG_TIPS_ICON_URL_STRING_SYNC, "");
        com.tencent.mm.ui.MMActivity mMActivity = this.f95012e;
        int dimensionPixelOffset = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480176qi);
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f95015h.setImageResource(com.tencent.mm.R.drawable.byw);
        } else {
            lu1.g0.b(this.f95015h, str2, dimensionPixelOffset, com.tencent.mm.R.drawable.byw, true);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            this.f95014g.setText(mMActivity.getString(com.tencent.mm.R.string.at9, java.lang.Integer.valueOf(i17)));
        } else {
            this.f95014g.setText(str);
        }
        android.view.View view3 = this.f95013f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f95016i != null) {
            if (android.text.TextUtils.isEmpty(str2)) {
                this.f95018n.setImageResource(com.tencent.mm.R.drawable.byw);
            } else {
                lu1.g0.b(this.f95018n, str2, dimensionPixelOffset, com.tencent.mm.R.drawable.byw, true);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                this.f95017m.setText(mMActivity.getString(com.tencent.mm.R.string.at9, java.lang.Integer.valueOf(i17)));
            } else {
                this.f95017m.setText(str);
            }
            android.view.View view4 = this.f95016i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "updateMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // wt1.e0
    public void onChange() {
    }
}
