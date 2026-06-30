package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class fm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat f110024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f110025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f110026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f110027g;

    public fm(com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat finderTestNumFormat, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3) {
        this.f110024d = finderTestNumFormat;
        this.f110025e = f0Var;
        this.f110026f = f0Var2;
        this.f110027g = f0Var3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initCommentConfig$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat.G;
        com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat finderTestNumFormat = this.f110024d;
        android.text.Editable text = ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderTestNumFormat.f109565y).getValue()).getText();
        kotlin.jvm.internal.f0 f0Var = this.f110025e;
        if (text != null) {
            if (!(text.length() > 0)) {
                text = null;
            }
            if (text != null && (obj3 = text.toString()) != null) {
                f0Var.f310116d = java.lang.Integer.parseInt(obj3);
            }
        }
        android.text.Editable text2 = ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderTestNumFormat.f109566z).getValue()).getText();
        kotlin.jvm.internal.f0 f0Var2 = this.f110026f;
        if (text2 != null) {
            if (!(text2.length() > 0)) {
                text2 = null;
            }
            if (text2 != null && (obj2 = text2.toString()) != null) {
                f0Var2.f310116d = java.lang.Integer.parseInt(obj2);
            }
        }
        android.text.Editable text3 = ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderTestNumFormat.A).getValue()).getText();
        kotlin.jvm.internal.f0 f0Var3 = this.f110027g;
        if (text3 != null) {
            android.text.Editable editable = text3.length() > 0 ? text3 : null;
            if (editable != null && (obj = editable.toString()) != null) {
                f0Var3.f310116d = java.lang.Integer.parseInt(obj);
            }
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, java.lang.Integer.valueOf(f0Var.f310116d));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, java.lang.Integer.valueOf(f0Var2.f310116d));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, java.lang.Integer.valueOf(f0Var3.f310116d));
        db5.t7.makeText(finderTestNumFormat, "设置成功", 0).show();
        finderTestNumFormat.c7();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initCommentConfig$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
