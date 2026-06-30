package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes5.dex */
public class i2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19005x4edeb3b8 f259437d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19005x4edeb3b8 activityC19005x4edeb3b8) {
        this.f259437d = activityC19005x4edeb3b8;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f259437d.f259390h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2) this.f259437d.f259390h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19005x4edeb3b8 activityC19005x4edeb3b8 = this.f259437d;
        android.view.View inflate = android.view.View.inflate(activityC19005x4edeb3b8, com.p314xaae8f345.mm.R.C30864xbddafb2a.d89, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h2) activityC19005x4edeb3b8.f259390h.get(i17);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aev);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aeu);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mki);
        textView.setText(h2Var.f259432a);
        if (android.text.TextUtils.isEmpty(h2Var.f259433b)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(h2Var.f259433b);
        }
        if (activityC19005x4edeb3b8.f259391i == i17) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        }
        return inflate;
    }
}
