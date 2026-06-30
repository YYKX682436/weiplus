package vr1;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b f521091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ip3 f521092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f521093g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f521094h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b, r45.ip3 ip3Var, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521091e = activityC12994x7e10022b;
        this.f521092f = ip3Var;
        this.f521093g = z17;
        this.f521094h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vr1.e0(this.f521091e, this.f521092f, this.f521093g, this.f521094h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr1.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521090d;
        boolean z17 = this.f521093g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b activityC12994x7e10022b = this.f521091e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xr1.m mVar = activityC12994x7e10022b.f175599g;
            this.f521090d = 1;
            mVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            new xr1.j(this.f521092f, z17).l().K(new xr1.l(mVar, nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((r45.y26) obj) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12994x7e10022b.f175596d, "resp == null");
            db5.t7.g(activityC12994x7e10022b.mo55332x76847179(), activityC12994x7e10022b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572281am4));
        } else {
            java.lang.String string = z17 ? activityC12994x7e10022b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572280am3) : activityC12994x7e10022b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572282am5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.i(activityC12994x7e10022b.mo55332x76847179(), string, com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            yz5.a aVar2 = this.f521094h;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
