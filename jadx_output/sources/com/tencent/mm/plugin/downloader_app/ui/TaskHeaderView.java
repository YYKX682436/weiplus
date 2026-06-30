package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes4.dex */
public class TaskHeaderView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f97394d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f97395e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f97396f;

    public TaskHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(com.tencent.mm.plugin.downloader_app.model.r0 r0Var, boolean z17) {
        int i17 = r0Var.f97314c;
        if (i17 == 1) {
            this.f97394d.setText(getResources().getString(com.tencent.mm.R.string.bs7));
            this.f97395e.setVisibility(8);
        } else if (i17 == 3) {
            this.f97394d.setText(getResources().getString(com.tencent.mm.R.string.k3i));
            this.f97395e.setText(getResources().getString(com.tencent.mm.R.string.k3h, java.lang.Integer.valueOf(r0Var.f97323l)));
            this.f97395e.setVisibility(0);
        } else if (i17 == 5) {
            this.f97394d.setText(getResources().getString(com.tencent.mm.R.string.brl));
            this.f97395e.setVisibility(8);
        }
        if (z17) {
            android.view.View view = this.f97396f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f97396f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (r0Var.f97312a) {
            this.f97394d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478896k5));
            this.f97395e.setVisibility(8);
        } else {
            this.f97394d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479286v2));
            this.f97395e.setVisibility(0);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f97396f = findViewById(com.tencent.mm.R.id.d0u);
        this.f97394d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i0j);
        this.f97395e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m4j);
    }
}
