package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15957x58990b88 f222953d;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15957x58990b88 viewOnClickListenerC15957x58990b88) {
        this.f222953d = viewOnClickListenerC15957x58990b88;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15957x58990b88 viewOnClickListenerC15957x58990b88 = this.f222953d;
        if (viewOnClickListenerC15957x58990b88.f222301e.getContentView() == null || !(viewOnClickListenerC15957x58990b88.f222301e.getContentView() instanceof android.view.ViewGroup)) {
            viewOnClickListenerC15957x58990b88.f222301e.dismiss();
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            viewOnClickListenerC15957x58990b88.m64741x296ee895(((android.view.ViewGroup) viewOnClickListenerC15957x58990b88.f222301e.getContentView()).indexOfChild(view));
            viewOnClickListenerC15957x58990b88.f222301e.dismiss();
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDropdownView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
