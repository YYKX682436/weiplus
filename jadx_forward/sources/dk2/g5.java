package dk2;

/* loaded from: classes14.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315033d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f315034e;

    /* renamed from: f, reason: collision with root package name */
    public int f315035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.i5 f315036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f315037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(dk2.i5 i5Var, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315036g = i5Var;
        this.f315037h = intent;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.g5(this.f315036g, this.f315037h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.g5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f315035f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.i5 i5Var = this.f315036g;
            this.f315033d = i5Var;
            android.content.Intent intent = this.f315037h;
            this.f315034e = intent;
            this.f315035f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            dk2.e5 e5Var = new dk2.e5(nVar, i5Var, h0Var);
            h0Var.f391656d = e5Var;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = i5Var.f315142a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = i5Var.f315142a;
            abstractActivityC21394xb3d2c0cf.m78747x6b661de(e5Var);
            rVar.m(new dk2.f5(i5Var, h0Var));
            try {
                abstractActivityC21394xb3d2c0cf2.startActivityForResult(intent, 18193);
            } catch (java.lang.Exception e17) {
                abstractActivityC21394xb3d2c0cf2.m78768x58bd8a37((com.p314xaae8f345.mm.ui.xc) h0Var.f391656d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveCTIDAuthHelper", e17, "[launchCtidAuth] startActivityForResult failed", new java.lang.Object[0]);
                nVar.a(new dk2.d5("C0412002", "国家网络身份认证App尚未安装", null, null));
            }
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
