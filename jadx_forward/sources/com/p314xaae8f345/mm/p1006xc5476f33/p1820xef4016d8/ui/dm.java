package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class dm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228383e;

    public dm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, java.lang.String str) {
        this.f228383e = activityC16390x60cac25d;
        this.f228382d = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[dealOpenExchangeUrl] click exchange tv");
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(this.f228382d).buildUpon();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228383e;
        buildUpon.appendQueryParameter(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, activityC16390x60cac25d.f228048J);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", buildUpon.build().toString());
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(activityC16390x60cac25d.mo55332x76847179(), intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18892, 22, java.lang.Integer.valueOf(activityC16390x60cac25d.f228068w + 1), java.lang.Integer.valueOf(activityC16390x60cac25d.f228067v + 1), activityC16390x60cac25d.K, activityC16390x60cac25d.b7(), activityC16390x60cac25d.f228048J, java.lang.Integer.valueOf(activityC16390x60cac25d.f228057n.mo1894x7e414b06() - 1), java.lang.Integer.valueOf(activityC16390x60cac25d.a7()), java.lang.Integer.valueOf(activityC16390x60cac25d.k7()), activityC16390x60cac25d.j7());
        return false;
    }
}
