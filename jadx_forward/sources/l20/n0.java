package l20;

/* loaded from: classes9.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.p736xd2ae381c.C10551xa9bbe48b f396715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f396716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10550x38bae92c f396717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.p736xd2ae381c.C10551xa9bbe48b c10551xa9bbe48b, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10550x38bae92c c10550x38bae92c, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f396715e = c10551xa9bbe48b;
        this.f396716f = activityC0065xcd7aa112;
        this.f396717g = c10550x38bae92c;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l20.n0(this.f396715e, this.f396716f, this.f396717g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l20.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10550x38bae92c c10550x38bae92c = this.f396717g;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f396716f;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f396714d;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.p736xd2ae381c.C10551xa9bbe48b c10551xa9bbe48b = this.f396715e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
                this.f396714d = 1;
                if (c10551xa9bbe48b.d(mo273xed6858b4, activityC0065xcd7aa112, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsProductContainerView", "Flutter View initialized successfully");
            if (c10550x38bae92c.get_naviHeight() > 0) {
                c10551xa9bbe48b.mo44337x56b82a6f(c10550x38bae92c.get_naviHeight());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsProductContainerView", "Flutter View initialization failed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
