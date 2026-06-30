package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverFriendUI */
/* loaded from: classes9.dex */
public class ActivityC11380x2f608b16 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 f154706d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_session_id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_old_username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 c11374x5be6abc6 = this.f154706d;
        c11374x5be6abc6.f154644h = stringExtra;
        c11374x5be6abc6.f154643g = stringExtra2;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g0s);
        c11374x5be6abc6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "onUICreate");
        c11374x5be6abc6.f154641e = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1012xd1075a44.C11381x88d3a085) c11374x5be6abc6.f154640d.findViewById(com.p314xaae8f345.mm.R.id.gev);
        gm0.j1.d().a(3513, c11374x5be6abc6);
        android.database.Cursor m145256x1d3f4980 = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().m145256x1d3f4980("SELECT seq FROM OldAccountFriend WHERE oldUsername = " + d95.b0.O(c11374x5be6abc6.f154643g) + "ORDER BY seq DESC", new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                r2 = m145256x1d3f4980.moveToFirst() ? m145256x1d3f4980.getInt(0) : 0;
            } finally {
                m145256x1d3f4980.close();
            }
        }
        c11374x5be6abc6.c(r2);
        c11374x5be6abc6.f154641e.mo48658x1853ff50().setVisibility(8);
        c11374x5be6abc6.f154641e.mo48656xcc101dd9().setOnScrollListener(new r61.a2(c11374x5be6abc6));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1012xd1075a44.C11381x88d3a085 c11381x88d3a085 = c11374x5be6abc6.f154641e;
        c11381x88d3a085.f154707s = c11374x5be6abc6.f154643g;
        c11381x88d3a085.m79360xa1aeda28(new r61.b2(c11374x5be6abc6));
        c11374x5be6abc6.mo48813x58998cd();
        mo54448x9c8c0d33(new s61.w0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 c11374x5be6abc6 = this.f154706d;
        c11374x5be6abc6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoverFriendPresenter", "onUIDestroy");
        gm0.j1.d().q(3513, c11374x5be6abc6);
        c11374x5be6abc6.mo48814x2efc64();
    }
}
