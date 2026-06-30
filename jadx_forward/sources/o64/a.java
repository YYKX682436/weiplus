package o64;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public p64.a f424740a;

    /* renamed from: b, reason: collision with root package name */
    public p64.b f424741b;

    /* renamed from: c, reason: collision with root package name */
    public k55.k f424742c;

    public q64.a a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        try {
            q64.a b17 = b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.IPCRequestBuilder", "there is something invalid in build!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
            return null;
        }
    }

    public final q64.a b() {
        p64.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        if (this.f424742c == null) {
            k55.k m69869x1347215 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69869x1347215();
            this.f424742c = m69869x1347215;
            if (m69869x1347215 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.IPCRequestBuilder", "the remote service proxy is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
                return null;
            }
        }
        p64.a aVar = this.f424740a;
        if (aVar == null || this.f424741b != null) {
            if (aVar == null && (bVar = this.f424741b) != null && (bVar instanceof p64.a)) {
                this.f424740a = (p64.a) bVar;
            }
        } else if (aVar instanceof p64.b) {
            this.f424741b = (p64.b) aVar;
        }
        r64.b bVar2 = new r64.b();
        p64.a aVar2 = this.f424740a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClientCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        bVar2.f474598b = aVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClientCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        p64.b bVar3 = this.f424741b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        bVar2.f474597a = bVar3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c binderC17751xdbf8942c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c(this.f424742c, bVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        bVar2.f474599c = binderC17751xdbf8942c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return bVar2;
    }

    public o64.a c(p64.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clientCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        this.f424740a = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clientCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return this;
    }

    public o64.a d(p64.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("serverCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        this.f424741b = bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("serverCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return this;
    }
}
