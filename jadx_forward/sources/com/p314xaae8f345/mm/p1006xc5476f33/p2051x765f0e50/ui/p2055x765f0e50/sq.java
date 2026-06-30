package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class sq implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xj.m f243084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f243085b;

    public sq(xj.m mVar, android.content.Context context) {
        this.f243084a = mVar;
        this.f243085b = context;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            y14.m mVar = y14.m.f540451a;
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            long currentTimeMillis = java.lang.System.currentTimeMillis() + 3600000;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = mVar.a();
            if (a17 != null) {
                a17.D("token", uuid);
                a17.B("expire_time", currentTimeMillis);
                a17.G("is_used", false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("YuanBaoAvatarTokenManager", "generateToken: token=" + uuid + ", expireTime=" + currentTimeMillis);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = mVar.a();
            long q17 = a18 != null ? a18.q("expire_time", 0L) : 0L;
            java.util.Map k17 = kz5.c1.k(new jz5.l("extInfo", "{\"route\": \"/creations?tabId=3429b9fb-8cf1-4d78-9320-89c86761838c&hideTop=true&gVer=2.61.0&gAlert=default\"}"), new jz5.l("token", uuid), new jz5.l("wxSource", "wx_avatar"), new jz5.l("expired", java.lang.String.valueOf(q17)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdClick: aid=");
            xj.m mVar2 = this.f243084a;
            sb6.append(mVar2.f536286a);
            sb6.append(", token=");
            sb6.append(uuid);
            sb6.append(", expired=");
            sb6.append(q17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", sb6.toString());
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).bj(mVar2.f536286a, new xj.n(null, null, this.f243085b, k17, 3, null), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rq(mVar2));
        }
    }
}
