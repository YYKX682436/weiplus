package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f94505d;

    public s1(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        this.f94505d = o4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f94505d.G("clear", true);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
