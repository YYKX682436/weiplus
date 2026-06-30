package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f166061d;

    public bb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f166061d = runtime;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb a17;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb> list;
        java.lang.String str2 = this.f166061d.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n) this.f166061d.f167705i2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nVar, "getCgiPrefetch(...)");
        java.lang.String str3 = this.f166061d.u0().f128810w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getWxaLaunchInstanceId(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45 a18 = nVar.a(2, str3, -1L);
        if (a18 == null || (str = a18.f165869d) == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb.f166145b.a(str)) == null || (list = a17.f166146a) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb cbVar : list) {
            if (cbVar.f166087c == 1) {
                java.lang.String str4 = cbVar.f166085a;
                ui1.p pVar = ui1.t.f509615d;
                if (!u46.l.e(str2) && !u46.l.e(str4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "presetUserAuthorized for appId:%s api:%s", str2, str4);
                    ui1.t.f509615d.e(str2, str4);
                }
            }
        }
    }
}
