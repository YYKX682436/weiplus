package sf2;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f488861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f488863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f488864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f488865h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f488866i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f488867m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(sf2.e1 e1Var, r45.z22 z22Var, boolean z17, boolean z18, yz5.l lVar, boolean z19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488862e = e1Var;
        this.f488863f = z22Var;
        this.f488864g = z17;
        this.f488865h = z18;
        this.f488866i = lVar;
        this.f488867m = z19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.w0(this.f488862e, this.f488863f, this.f488864g, this.f488865h, this.f488866i, this.f488867m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488861d;
        r45.z22 z22Var = this.f488863f;
        sf2.e1 e1Var = this.f488862e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f488861d = 1;
            obj = sf2.e1.a7(e1Var, z22Var, this.f488864g, this.f488865h, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (booleanValue) {
            yz5.l lVar = this.f488866i;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            return f0Var;
        }
        if (z22Var == null) {
            java.lang.String string = e1Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oro);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, 0).show();
            return f0Var;
        }
        java.lang.String string2 = e1Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string2, 0).show();
        if (!this.f488867m) {
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "performSingJob: will skip to next song");
        r45.z22 P6 = e1Var.g7().P6(z22Var);
        if (P6 != null) {
            sf2.e1.m7(this.f488862e, P6, false, true, true, null, 18, null);
        }
        return f0Var;
    }
}
