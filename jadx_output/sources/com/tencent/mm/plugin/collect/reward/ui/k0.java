package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes3.dex */
public class k0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI f96312d;

    public k0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI, com.tencent.mm.plugin.collect.reward.ui.e0 e0Var) {
        this.f96312d = qrRewardSelectMoneyUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f96312d.f96248d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f96312d.f96248d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI = this.f96312d;
        if (view == null) {
            view = android.view.LayoutInflater.from(qrRewardSelectMoneyUI.getContext()).inflate(com.tencent.mm.R.layout.cbn, viewGroup, false);
        }
        int intValue = ((java.lang.Integer) getItem(i17)).intValue();
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lgf);
        int i18 = intValue / 100;
        double d17 = intValue / 100.0d;
        if (d17 > i18) {
            textView.setText(java.lang.String.format("%.2f", java.lang.Double.valueOf(d17)) + qrRewardSelectMoneyUI.getString(com.tencent.mm.R.string.hpk));
        } else {
            textView.setText(java.lang.String.format("%d", java.lang.Integer.valueOf(i18)) + qrRewardSelectMoneyUI.getString(com.tencent.mm.R.string.hpk));
        }
        return view;
    }
}
