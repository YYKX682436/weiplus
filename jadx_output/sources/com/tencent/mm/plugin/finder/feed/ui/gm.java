package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class gm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat f110093d;

    public gm(com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat finderTestNumFormat) {
        this.f110093d = finderTestNumFormat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initGetA8Key$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat finderTestNumFormat = this.f110093d;
        java.lang.String obj = ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderTestNumFormat.C).getValue()).getText().toString();
        int parseInt = java.lang.Integer.parseInt(((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderTestNumFormat.F).getValue()).getText().toString());
        gm0.j1.n().f273288b.a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, finderTestNumFormat);
        gm0.j1.n().f273288b.g((com.tencent.mm.modelbase.m1) ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).Ai(obj, null, parseInt, 0, 0, new byte[0]));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initGetA8Key$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
