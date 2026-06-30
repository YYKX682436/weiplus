package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout */
/* loaded from: classes.dex */
public class C17807xc2e01725 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f245199d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f245200e;

    public C17807xc2e01725(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        super.onFinishInflate();
        try {
            this.f245199d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564188kd);
            this.f245199d.setTextSize(0, ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_f));
            this.f245200e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564187kc);
            this.f245200e.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f81072x92ff1b9a, -1));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
    }

    /* renamed from: setLiveStatus */
    public void m69673x50451200(int i17) {
        java.lang.String str;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        int i19 = i17 & 127;
        if (i19 == 3) {
            str = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7r);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else if (i19 == 1) {
            str = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7s);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else if (i19 == 2) {
            str = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7q);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            str = "";
        }
        this.f245199d.setText(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivingStatusLayout", "setLiveStatus, status=" + i17 + ", text=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        if (i19 == 2 || i19 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562273bf;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562274bg;
        }
        setBackgroundResource(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
    }

    public C17807xc2e01725(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
