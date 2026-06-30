package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class p0 implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f266114b;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74, java.lang.String str) {
        this.f266114b = abstractActivityC19367xd1ae8c74;
        this.f266113a = str;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        android.graphics.Bitmap a07;
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = this.f266114b;
        sb6.append(abstractActivityC19367xd1ae8c74.Z3);
        sb6.append(";");
        sb6.append(abstractActivityC19367xd1ae8c74.B3);
        sb6.append(";");
        sb6.append(this.f266113a);
        abstractActivityC19367xd1ae8c74.X3.mo42940x1cc70c21(sb6.toString());
        java.lang.String z96 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74.z9(abstractActivityC19367xd1ae8c74, interfaceC4987x84e327cb);
        int i18 = 2;
        if (interfaceC4987x84e327cb.k() || interfaceC4987x84e327cb.mo42929x747e9cc9() == 18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "emoji is system emoji %s", java.lang.Integer.valueOf(interfaceC4987x84e327cb.mo42929x747e9cc9()));
            if (!com.p314xaae8f345.mm.vfs.w6.j(z96) && (a07 = interfaceC4987x84e327cb.a0(abstractActivityC19367xd1ae8c74, 480)) != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(a07, 80, android.graphics.Bitmap.CompressFormat.PNG, z96, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "save emoji bitmap %d %s", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(z96)), z96);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseSearchWebViewUI", e17, "SaveEmojiBitmap", new java.lang.Object[0]);
                }
            }
        }
        java.lang.String str = "weixin://fts/emoji?path=" + z96;
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
        java.lang.String mo42927x1061ea06 = interfaceC4987x84e327cb.mo42927x1061ea06();
        java.lang.String J1 = interfaceC4987x84e327cb.J1();
        boolean E0 = interfaceC4987x84e327cb.E0();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        if (n22.m.k(interfaceC4987x84e327cb)) {
            i17 = 1;
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            if (!n22.m.j(interfaceC4987x84e327cb)) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
                if (n22.m.p(interfaceC4987x84e327cb)) {
                    i18 = 3;
                } else {
                    i17 = 0;
                }
            }
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onSelectedEmoji %s %s %b", mo42933xb5885648, str, java.lang.Boolean.valueOf(E0));
        abstractActivityC19367xd1ae8c74.s9().G(mo42933xb5885648, str, i17, !E0 ? 1 : 0, J1, mo42927x1061ea06);
        if (!E0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).wi(interfaceC4987x84e327cb, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o0(this, interfaceC4987x84e327cb, mo42933xb5885648, str, i17, J1, mo42927x1061ea06));
        }
        abstractActivityC19367xd1ae8c74.W3.setVisibility(8);
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
    }
}
