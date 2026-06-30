package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent */
/* loaded from: classes.dex */
public class C16732x5a1f3ad5 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f233818d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f233819e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f233820f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f233821g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f233822h;

    public C16732x5a1f3ad5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f233818d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f233818d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c5w, this);
        this.f233819e = inflate;
        this.f233820f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k5b);
        this.f233821g = this.f233819e.findViewById(com.p314xaae8f345.mm.R.id.f567632k61);
    }

    public void b(int i17) {
        if (i17 == 0) {
            this.f233820f.setVisibility(8);
            android.view.View view = this.f233821g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f233822h.setVisibility(0);
            return;
        }
        if (i17 == 1) {
            this.f233820f.setVisibility(0);
            android.view.View view2 = this.f233821g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f233822h.setVisibility(8);
            return;
        }
        if (i17 != 2) {
            return;
        }
        this.f233820f.setVisibility(8);
        android.view.View view3 = this.f233821g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/nearlife/ui/NearLifeErrorContent", "processError", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f233822h.setVisibility(8);
    }

    /* renamed from: setListView */
    public void m67451xc6c87ee5(android.widget.ListView listView) {
        this.f233822h = listView;
    }

    public C16732x5a1f3ad5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f233818d = context;
        a();
    }
}
