package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class m5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l5 f281013d;

    public m5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l5 l5Var) {
        this.f281013d = l5Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        g4Var.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.h0q);
        g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.h0r);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l5 l5Var = this.f281013d;
        android.app.Activity g17 = l5Var.f280931d.f280113d.g();
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType = com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork;
        boolean h17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.h(g17, wWAppType);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = l5Var.f280931d;
        if (h17 && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.k()) {
            android.app.Activity g18 = b5Var.f280113d.g();
            android.app.Activity g19 = b5Var.f280113d.g();
            com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71 a17 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(g19);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            g4Var.f(2, g18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0s, !yp5.a.f545942a.a() ? g19.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_7) : a17.d(wWAppType)));
        }
        android.app.Activity g27 = b5Var.f280113d.g();
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType2 = com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.h(g27, wWAppType2) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.j()) {
            android.app.Activity g28 = b5Var.f280113d.g();
            android.app.Activity g29 = b5Var.f280113d.g();
            com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71 a18 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(g29);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            g4Var.f(3, g28.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0s, !yp5.a.f545942a.a() ? g29.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_7) : a18.d(wWAppType2)));
        }
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        boolean z18 = b5Var.f280231i;
        qg5.z2 z2Var = (qg5.z2) j3Var;
        z2Var.getClass();
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.C20838x6140fd22()) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "YuanBao Analyze is replaced by Copy to YuanBao");
            z17 = false;
        } else {
            boolean z19 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20074x5945e7f()) == 1;
            boolean bj6 = z2Var.bj();
            boolean z27 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20075x5ff1a0b5()) == 1;
            z17 = z19 && bj6 && (z18 || z27);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "isShowAnalyzeButton: " + z17 + ", analyzeChatRecordsConfigEnabled: " + z19 + ", isMainlandHkMoUser: " + bj6 + ", isGroupChat: " + z18 + ", analyzeSupportPrivateChatEnabled: " + z27);
            }
        }
        if (z17) {
            android.app.Activity g37 = b5Var.f280113d.g();
            db5.h4 h4Var = new db5.h4(g37, 4, 0);
            h4Var.f309901i = g37.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4t);
            h4Var.f309906q = g37.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4u);
            db5.h4 h4Var2 = new db5.h4(g4Var.f309879f, 0, 0);
            h4Var2.H = true;
            ((java.util.ArrayList) g4Var.f309877d).add(h4Var2);
            g4Var.v(h4Var);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        }
    }
}
