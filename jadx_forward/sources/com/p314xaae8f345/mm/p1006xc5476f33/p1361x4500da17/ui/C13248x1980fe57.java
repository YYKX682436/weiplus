package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView */
/* loaded from: classes4.dex */
public class C13248x1980fe57 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f178927d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178928e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f178929f;

    public C13248x1980fe57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var, boolean z17) {
        int i17 = r0Var.f178847c;
        if (i17 == 1) {
            this.f178927d.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bs7));
            this.f178928e.setVisibility(8);
        } else if (i17 == 3) {
            this.f178927d.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3i));
            this.f178928e.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3h, java.lang.Integer.valueOf(r0Var.f178856l)));
            this.f178928e.setVisibility(0);
        } else if (i17 == 5) {
            this.f178927d.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.brl));
            this.f178928e.setVisibility(8);
        }
        if (z17) {
            android.view.View view = this.f178929f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f178929f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (r0Var.f178845a) {
            this.f178927d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560429k5));
            this.f178928e.setVisibility(8);
        } else {
            this.f178927d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560819v2));
            this.f178928e.setVisibility(0);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f178929f = findViewById(com.p314xaae8f345.mm.R.id.d0u);
        this.f178927d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i0j);
        this.f178928e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m4j);
    }
}
