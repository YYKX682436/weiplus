package com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b;

/* renamed from: com.tencent.wechat.zrpc.ZIDL_uyjkXigiB */
/* loaded from: classes11.dex */
class C27720xd15518e2 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.f f301568a;

    /* renamed from: ZIDL_CX */
    private native void m119684x1964d1bd(long j17, long j18, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 c27695xd9fb0a86);

    public void Q1(long j17, com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.b bVar) {
        m119684x1964d1bd(this.f60633xf042a733, j17, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119594xe00b261d(bVar));
    }

    /* renamed from: ZIDL_B */
    public boolean m119685x9db8edfa(java.lang.String req) {
        ((iw5.a) this.f301568a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        java.lang.String msg = "initClientFactory: req ".concat(req);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (iw5.o.f376808a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtChannelClientFactory", msg);
        }
        jz5.l a17 = iw5.h.f376805a.a(req);
        if (a17 == null) {
            if (iw5.o.f376808a == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelClientFactory", "initClientFactory: parse req failed");
            return false;
        }
        java.util.Map map = iw5.a.f376797b;
        java.lang.Object obj = a17.f384366d;
        if (!map.containsKey(obj)) {
            if (iw5.o.f376808a == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelClientFactory", "initClientFactory: type not found");
            return false;
        }
        try {
            java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj2);
            throw null;
        } catch (java.lang.Exception e17) {
            java.lang.String msg2 = "initClientFactory: create instance failed " + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
            if (iw5.o.f376808a == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelClientFactory", msg2);
            return false;
        }
    }

    /* renamed from: ZIDL_CV */
    public void m119686x1964d1bb(long j17, long j18) {
        iw5.a aVar = (iw5.a) this.f301568a;
        aVar.getClass();
        java.lang.String msg = "connectAsync: " + j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (iw5.o.f376808a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtChannelClientFactory", msg);
        }
        com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.e eVar = aVar.f376798a;
        if (eVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.C27720xd15518e2) eVar).Q1(j17, new com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.b(new iw5.g()));
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.f) obj;
        this.f301568a = fVar;
        ((iw5.a) fVar).f376798a = this;
    }
}
