package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f f229878d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f abstractActivityC16475xe6d27f7f) {
        this.f229878d = abstractActivityC16475xe6d27f7f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f abstractActivityC16475xe6d27f7f = this.f229878d;
        if (abstractActivityC16475xe6d27f7f.getIntent().getBooleanExtra("key_not_goto_launcher_ui_when_back", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "onBack, do not goto launcher ui, expected by Intent");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 3);
            j45.l.u(abstractActivityC16475xe6d27f7f, "com.tencent.mm.ui.LauncherUI", intent, null);
        }
        abstractActivityC16475xe6d27f7f.finish();
        if (!h45.y.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "open_wcpay_specific_view:ok");
            h45.y.f360501a = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14419, abstractActivityC16475xe6d27f7f.f229792i, 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "set BackBtn");
        return true;
    }
}
