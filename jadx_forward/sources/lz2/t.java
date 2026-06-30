package lz2;

/* loaded from: classes14.dex */
public class t implements pz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lz2.w f403886a;

    public t(lz2.w wVar) {
        this.f403886a = wVar;
    }

    @Override // pz2.c
    public void a(int i17, int i18, int i19, int i27) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        lz2.w wVar = this.f403886a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "auth result: %s, retry: %s", valueOf, java.lang.Integer.valueOf(wVar.f403894h));
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79 = wVar.f403890d;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "identify success");
            wVar.f403894h++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "auth success");
            if (wVar.f403894h == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.f34350x366c91de, 3);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.f34350x366c91de, 4);
            }
            re4.n.d(0);
            dialogC15522xdfb03a79.f218519d.a(com.p314xaae8f345.mm.R.C30861xcebc809e.f562989tf, new lz2.u(wVar, i18));
            return;
        }
        if (i17 != 2005 && i17 != 2007 && i17 != 2009 && i17 != 10308) {
            switch (i17) {
                case 2000:
                case 2001:
                case 2002:
                    break;
                default:
                    return;
            }
        }
        int i28 = wVar.f403894h + 1;
        wVar.f403894h = i28;
        if (i28 < 2) {
            dialogC15522xdfb03a79.getWindow().setDimAmount(0.5f);
            dialogC15522xdfb03a79.f218524i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aun);
            dialogC15522xdfb03a79.f218525m.setBackground(null);
            dialogC15522xdfb03a79.e(null);
            dialogC15522xdfb03a79.f218523h.setVisibility(0);
            dialogC15522xdfb03a79.f218521f.setVisibility(0);
            dialogC15522xdfb03a79.f218520e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572711c90);
            dialogC15522xdfb03a79.f218521f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c8z);
            dialogC15522xdfb03a79.f218520e.post(new lz2.q(dialogC15522xdfb03a79));
            re4.n.d(2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFaceIdDialog", "face id failed: %s", java.lang.Integer.valueOf(wVar.f403893g));
        dialogC15522xdfb03a79.getWindow().setDimAmount(0.5f);
        dialogC15522xdfb03a79.f218524i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aun);
        dialogC15522xdfb03a79.f218525m.setBackground(null);
        re4.n.d(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.f34350x366c91de, 5);
        wVar.f403895i = true;
        if (wVar.f403893g != 0) {
            dialogC15522xdfb03a79.e(new lz2.v(wVar));
            return;
        }
        dialogC15522xdfb03a79.e(null);
        dialogC15522xdfb03a79.f218520e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c8t);
        dialogC15522xdfb03a79.f218521f.setVisibility(8);
        if (i17 == 10308) {
            re4.n.e(6, -1000223, i17, "too many trial");
        } else {
            re4.n.e(1000, -1000223, i17, "fingerprint error");
        }
    }
}
