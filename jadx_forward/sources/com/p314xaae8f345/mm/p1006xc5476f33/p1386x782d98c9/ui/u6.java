package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 f181226d;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25) {
        this.f181226d = c13478xcdc36e25;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25 = this.f181226d;
        if (c13478xcdc36e25.f180892m) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(c13478xcdc36e25.f180891i);
            if (c13478xcdc36e25.f180887e.getVisibility() == 4) {
                c13478xcdc36e25.f180889g.reset();
                c13478xcdc36e25.f180887e.startAnimation(c13478xcdc36e25.f180889g);
            } else {
                c13478xcdc36e25.f180890h.reset();
                c13478xcdc36e25.f180887e.startAnimation(c13478xcdc36e25.f180890h);
            }
        }
        android.view.View.OnClickListener onClickListener = c13478xcdc36e25.f180888f;
        if (onClickListener != null) {
            onClickListener.onClick(c13478xcdc36e25);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
