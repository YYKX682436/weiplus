package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class rn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.sn f228925d;

    public rn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.sn snVar) {
        this.f228925d = snVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.wv3 wv3Var = this.f228925d.f228965a;
        if (wv3Var.f471036i == 1 || wv3Var.f471040p == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
        }
    }
}
