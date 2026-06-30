package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 f215518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215520i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc f215521m;

    public c9(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var, android.view.View view2, android.view.View view3, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc) {
        this.f215515d = view;
        this.f215516e = textView;
        this.f215517f = textView2;
        this.f215518g = e9Var;
        this.f215519h = view2;
        this.f215520i = view3;
        this.f215521m = c23001x9d3a0bdc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f215515d;
        int measuredWidth = view.getMeasuredWidth();
        android.widget.TextView textView = this.f215516e;
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        android.widget.TextView textView2 = this.f215517f;
        float measureText2 = textView2.getPaint().measureText(textView2.getText().toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var = this.f215518g;
        int dimensionPixelSize = e9Var.m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = this.f215519h.getVisibility() == 0 ? e9Var.m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) : 0;
        float f17 = ((measuredWidth - measureText) - measureText2) - dimensionPixelSize2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", "updatePrefixSize content " + measuredWidth + " prefix " + measureText + " postfix " + measureText2 + " icon " + dimensionPixelSize2);
        if (f17 <= dimensionPixelSize) {
            android.view.View view2 = this.f215520i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f215520i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC$updatePrefixSize$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f215521m.m84176x8e6ff544(view.getMeasuredWidth());
    }
}
