package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class il extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI) {
        super(0);
        this.f110160d = finderSharePostUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110160d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = finderSharePostUI.f109546u;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        android.view.View view = finderSharePostUI.f109549x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI$showTipsDialog$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI$showTipsDialog$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
