package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class qm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f251881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rm f251882e;

    public qm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rm rmVar, int i17) {
        this.f251882e = rmVar;
        this.f251881d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance$1");
        try {
            this.f251882e.D.mo56582xbf7c1df6(this.f251881d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMsgUIWithRelevance", "setMMTitle error: " + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance$1");
    }
}
