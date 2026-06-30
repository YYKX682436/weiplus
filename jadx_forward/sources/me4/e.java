package me4;

/* loaded from: classes12.dex */
public class e extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public int f407479d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f407480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96 f407481f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96 c18452xede01a96) {
        this.f407481f = c18452xede01a96;
        this.f407480e = 12000;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96.f253266i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        int i17 = c18452xede01a96.f253270f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpiredDuration", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        int i18 = 12000 - (i17 * 4000);
        i18 = i18 < 2000 ? 2000 : i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpiredDuration", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        this.f407480e = i18;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96 c18452xede01a96 = this.f407481f;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96.f253266i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        java.lang.Object obj = c18452xede01a96.f253271g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        synchronized (obj) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "break Wait, waitTime=" + this.f407479d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96 c18452xede01a962 = this.f407481f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                c18452xede01a962.f253272h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165.C18452xede01a96 c18452xede01a963 = this.f407481f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                java.lang.Object obj2 = c18452xede01a963.f253271g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                obj2.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "CheckThread run, thread.hash=" + hashCode());
        while (!me4.c.j()) {
            try {
                java.lang.Thread.sleep(200L);
                this.f407479d += 200;
            } catch (java.lang.Exception unused) {
            }
            int i17 = this.f407479d;
            int i18 = this.f407480e;
            if (i17 >= i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "wait expired, expiredDuration=" + i18);
                a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "init done");
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
    }
}
