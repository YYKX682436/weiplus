package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 f230036d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 abstractActivityC16473xfb0d5c3) {
        this.f230036d = abstractActivityC16473xfb0d5c3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 abstractActivityC16473xfb0d5c3 = this.f230036d;
        j45.l.u(abstractActivityC16473xfb0d5c3, "com.tencent.mm.ui.LauncherUI", intent, null);
        abstractActivityC16473xfb0d5c3.finish();
        if (!h45.y.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "open_wcpay_specific_view:ok");
            h45.y.f360501a = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14419, abstractActivityC16473xfb0d5c3.f229776h, 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "set BackBtn");
        return true;
    }
}
