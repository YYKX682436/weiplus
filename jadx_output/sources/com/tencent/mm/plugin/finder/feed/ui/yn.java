package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class yn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI f110781d;

    public yn(com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI finderWxSettingUI) {
        this.f110781d = finderWxSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        i0Var.getClass();
        com.tencent.mm.plugin.finder.feed.ui.FinderWxSettingUI context = this.f110781d;
        kotlin.jvm.internal.o.g(context, "context");
        i0Var.mj(context, null, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderWxSettingUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
