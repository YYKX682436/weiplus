package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView f99693d;

    public u6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView) {
        this.f99693d = exdeviceRankListHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView = this.f99693d;
        if (exdeviceRankListHeaderView.f99359m) {
            com.tencent.mm.sdk.platformtools.u3.l(exdeviceRankListHeaderView.f99358i);
            if (exdeviceRankListHeaderView.f99354e.getVisibility() == 4) {
                exdeviceRankListHeaderView.f99356g.reset();
                exdeviceRankListHeaderView.f99354e.startAnimation(exdeviceRankListHeaderView.f99356g);
            } else {
                exdeviceRankListHeaderView.f99357h.reset();
                exdeviceRankListHeaderView.f99354e.startAnimation(exdeviceRankListHeaderView.f99357h);
            }
        }
        android.view.View.OnClickListener onClickListener = exdeviceRankListHeaderView.f99355f;
        if (onClickListener != null) {
            onClickListener.onClick(exdeviceRankListHeaderView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
