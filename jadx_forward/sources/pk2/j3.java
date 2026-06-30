package pk2;

/* loaded from: classes3.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437398d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437399e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f437400f;

    /* renamed from: g, reason: collision with root package name */
    public int f437401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437402h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437403i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437405n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(pk2.o9 o9Var, pk2.q3 q3Var, r45.t62 t62Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437402h = o9Var;
        this.f437403i = q3Var;
        this.f437404m = t62Var;
        this.f437405n = e3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.j3(this.f437402h, this.f437403i, this.f437404m, this.f437405n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.j3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        az2.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437401g;
        r45.t62 config = this.f437404m;
        pk2.q3 q3Var = this.f437403i;
        pk2.o9 o9Var = this.f437402h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = o9Var.f437611d;
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y);
            pk2.h3 h3Var = pk2.h3.f437345d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            az2.f fVar2 = new az2.f();
            fVar2.f97661c = 500L;
            new java.lang.ref.WeakReference(context);
            az2.q qVar = new az2.q();
            if (string != null) {
                qVar.f97682c = string;
            }
            qVar.f97683d = h3Var;
            qVar.f97685a = new java.lang.ref.WeakReference(context);
            fVar2.f97660b = qVar;
            fVar2.a();
            this.f437398d = fVar2;
            this.f437399e = q3Var;
            this.f437400f = config;
            this.f437401g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            q3Var.f437722j = new pk2.i3(new v65.n(rVar));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.gc gcVar = q3Var.f437722j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            hb2.i.f361587e.n(config, gcVar);
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (az2.f) this.f437398d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fVar.b();
        q3Var.f437722j = null;
        if (booleanValue) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_CONFIG_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(config.mo14344x5f01b1f6()));
            this.f437405n.h();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AnchorRecommendOption", "modifyLiveUserRecommendSetting: cgi fail");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(abstractActivityC21394xb3d2c0cf);
            e4Var.f293309c = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.luw);
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
