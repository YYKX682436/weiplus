package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class e1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219575a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219575a = abstractActivityC15595x3a75f78;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219575a;
            abstractActivityC15595x3a75f78.X.mo50303x856b99f0(1);
            z21.e eVar = abstractActivityC15595x3a75f78.S;
            if (eVar != null) {
                eVar.mo48278xae7a2e7a(true);
            }
            if (message.arg1 == 99 && com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n1.MODE_TRANS == abstractActivityC15595x3a75f78.Z && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC15595x3a75f78.f219470y0.g())) {
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(abstractActivityC15595x3a75f78.mo55332x76847179())) {
                    db5.t7.i(abstractActivityC15595x3a75f78.mo55332x76847179(), abstractActivityC15595x3a75f78.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.azu), com.p314xaae8f345.mm.R.raw.f81332x54357625);
                    abstractActivityC15595x3a75f78.f219455o.setVisibility(8);
                } else {
                    db5.t7.i(abstractActivityC15595x3a75f78.mo55332x76847179(), abstractActivityC15595x3a75f78.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h8t), com.p314xaae8f345.mm.R.raw.f81332x54357625);
                    abstractActivityC15595x3a75f78.f219455o.setVisibility(8);
                }
            }
        }
    }
}
