package vm1;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f519555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519556h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f519557i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f519558m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f519559n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17, long j18, vm1.x0 x0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519553e = str;
        this.f519554f = str2;
        this.f519555g = j17;
        this.f519556h = str3;
        this.f519557i = z17;
        this.f519558m = j18;
        this.f519559n = x0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vm1.k0(this.f519553e, this.f519554f, this.f519555g, this.f519556h, this.f519557i, this.f519558m, this.f519559n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519552d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            um1.a aVar2 = mm1.b0.f410168i;
            um1.a aVar3 = mm1.b0.f410168i;
            if (aVar3 != null) {
                this.f519552d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) aVar3).a7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openWeApp appId: ");
        java.lang.String str = this.f519553e;
        sb6.append(str);
        sb6.append(", path: ");
        java.lang.String str2 = this.f519554f;
        sb6.append(str2);
        sb6.append(", scene: ");
        long j17 = this.f519555g;
        sb6.append(j17);
        sb6.append(", sceneNote: ");
        java.lang.String str3 = this.f519556h;
        sb6.append(str3);
        sb6.append(", noReLaunch: ");
        boolean z18 = this.f519557i;
        sb6.append(z18);
        sb6.append(", debugMode: ");
        long j18 = this.f519558m;
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = str;
        if (!(str2 == null || r26.n0.N(str2))) {
            b1Var.f398555f = str2;
        }
        b1Var.f398565k = (int) j17;
        b1Var.f398549c = (int) j18;
        if (str3 != null && !r26.n0.N(str3)) {
            z17 = false;
        }
        if (!z17) {
            b1Var.f398567l = str3;
        }
        b1Var.f398557g = z18;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f519559n.a(), b1Var);
        return f0Var;
    }
}
