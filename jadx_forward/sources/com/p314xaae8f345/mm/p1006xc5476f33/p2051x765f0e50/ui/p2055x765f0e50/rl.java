package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class rl extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f243047d;

    /* renamed from: e, reason: collision with root package name */
    public final int f243048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f243049f;

    /* renamed from: g, reason: collision with root package name */
    public final int f243050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 f243051h;

    public rl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7) {
        this.f243051h = activityC17458xf546b9e7;
        this.f243048e = 0;
        this.f243049f = 0;
        this.f243050g = 0;
        int B = i65.a.B(activityC17458xf546b9e7.mo55332x76847179());
        android.content.res.Resources resources = activityC17458xf546b9e7.mo55332x76847179().getResources();
        int dimensionPixelSize = (B - (resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2)) - resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f243048e = dimensionPixelSize;
        int i17 = dimensionPixelSize / 2;
        this.f243049f = i17;
        int i18 = dimensionPixelSize / 2;
        this.f243050g = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(dimensionPixelSize));
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.ov6 getItem(int i17) {
        if (i17 < 0 || i17 >= getCount()) {
            return null;
        }
        return (r45.ov6) this.f243047d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f243047d;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f243047d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ql qlVar;
        if (view == null) {
            view = this.f243051h.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpc, (android.view.ViewGroup) null);
            qlVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ql(this, null);
            view.setTag(qlVar);
        } else {
            qlVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ql) view.getTag();
        }
        qlVar.f243014b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.f568399mp2);
        qlVar.f243015c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568402mp5);
        qlVar.f243013a = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f568398mp1);
        r45.ov6 item = getItem(i17);
        if (item != null) {
            qlVar.f243014b.b(item.f464094e);
            qlVar.f243015c.setText(item.f464098i);
            android.widget.RelativeLayout relativeLayout = qlVar.f243013a;
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.String str = item.f464094e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String str2 = item.f464098i;
            objArr[1] = str2 != null ? str2 : "";
            relativeLayout.setContentDescription(java.lang.String.format("%s,%s", objArr));
        }
        k14.k0.a(qlVar.f243014b, qlVar.f243015c, this.f243048e, this.f243049f, this.f243050g, true);
        return view;
    }
}
