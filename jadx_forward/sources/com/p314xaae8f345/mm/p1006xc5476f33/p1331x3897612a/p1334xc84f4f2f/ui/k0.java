package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes3.dex */
public class k0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 f177845d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 activityC13136x6a993bc8, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.e0 e0Var) {
        this.f177845d = activityC13136x6a993bc8;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f177845d.f177781d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f177845d.f177781d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 activityC13136x6a993bc8 = this.f177845d;
        if (view == null) {
            view = android.view.LayoutInflater.from(activityC13136x6a993bc8.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cbn, viewGroup, false);
        }
        int intValue = ((java.lang.Integer) getItem(i17)).intValue();
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lgf);
        int i18 = intValue / 100;
        double d17 = intValue / 100.0d;
        if (d17 > i18) {
            textView.setText(java.lang.String.format("%.2f", java.lang.Double.valueOf(d17)) + activityC13136x6a993bc8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hpk));
        } else {
            textView.setText(java.lang.String.format("%d", java.lang.Integer.valueOf(i18)) + activityC13136x6a993bc8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hpk));
        }
        return view;
    }
}
