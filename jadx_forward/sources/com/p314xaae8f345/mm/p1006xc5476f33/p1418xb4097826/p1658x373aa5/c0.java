package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c f213276d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c c15213xbf81077c) {
        this.f213276d = c15213xbf81077c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/CollapsibleTextView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c c15213xbf81077c = this.f213276d;
        yz5.a onExpandBtnClickListener = c15213xbf81077c.getOnExpandBtnClickListener();
        if (onExpandBtnClickListener != null) {
            onExpandBtnClickListener.mo152xb9724478();
        }
        c15213xbf81077c.m61602xb75359c(!c15213xbf81077c.f212355r);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/CollapsibleTextView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
