package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class md extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI f110306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110306d = finderLiveVisitorRoleUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.md(this.f110306d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.md) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.ProgressBar progressBar = this.f110306d.f109421w;
        if (progressBar == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(progressBar, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(progressBar, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI$onCreate$2$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        progressBar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(progressBar, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorRoleUI$onCreate$2$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(progressBar, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return progressBar;
    }
}
