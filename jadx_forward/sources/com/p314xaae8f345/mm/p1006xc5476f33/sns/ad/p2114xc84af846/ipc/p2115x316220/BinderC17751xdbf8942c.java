package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220;

/* renamed from: com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy */
/* loaded from: classes4.dex */
public final class BinderC17751xdbf8942c extends k55.b {

    /* renamed from: f, reason: collision with root package name */
    public final r64.b f244720f;

    public BinderC17751xdbf8942c(k55.k kVar, r64.b bVar) {
        super(kVar);
        this.f244720f = bVar;
    }

    @Override // k55.b, k55.e
    /* renamed from: onCallback */
    public void mo66824x9ad64344(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        android.os.Bundle bundle2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
            try {
                java.lang.Object[] m142015xfb7d3953 = m142015xfb7d3953(bundle);
                r64.b bVar = this.f244720f;
                if (bVar != null) {
                    bVar.a((android.os.Bundle) m142015xfb7d3953[0]);
                }
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
            try {
                r64.b bVar2 = new r64.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                bVar2.f474599c = this;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                java.lang.Object[] m142015xfb7d39532 = m142015xfb7d3953(bundle);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findParams", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
                if (a84.b0.g(m142015xfb7d39532)) {
                    for (java.lang.Object obj : m142015xfb7d39532) {
                        if (obj instanceof android.os.Bundle) {
                            bundle2 = (android.os.Bundle) obj;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findParams", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
                            break;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findParams", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
                bundle2 = null;
                if (bundle2 != null) {
                    bundle2.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2114xc84af846.ipc.p2115x316220.BinderC17751xdbf8942c.class.getClassLoader());
                    android.os.Bundle b17 = bVar2.b(bVar2, bundle2);
                    if (b17 != null) {
                        bundle.putBundle("result_key", b17);
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
    }
}
