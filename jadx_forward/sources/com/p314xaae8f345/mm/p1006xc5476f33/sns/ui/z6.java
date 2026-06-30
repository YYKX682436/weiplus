package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d f253211e;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d, java.lang.String str) {
        this.f253211e = c17982x5116533d;
        this.f253210d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17982x5116533d c17982x5116533d = this.f253211e;
        if (c17982x5116533d.f247945g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVideoView", "%d fresh thumb image", java.lang.Integer.valueOf(hashCode()));
            c17982x5116533d.f247945g.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(this.f253210d, 1.0f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$1");
    }
}
