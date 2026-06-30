package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class q0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI f96327d;

    public q0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI, com.tencent.mm.plugin.collect.reward.ui.l0 l0Var) {
        this.f96327d = qrRewardSetMoneyUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f96327d.f96279q).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f96327d.f96279q).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return view == null ? (android.view.View) this.f96327d.f96277o.get(i17) : view;
    }
}
