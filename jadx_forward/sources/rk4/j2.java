package rk4;

/* loaded from: classes.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f478277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f478279i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f478280m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478281n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17, long j18, rk4.l3 l3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478275e = str;
        this.f478276f = str2;
        this.f478277g = j17;
        this.f478278h = str3;
        this.f478279i = z17;
        this.f478280m = j18;
        this.f478281n = l3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.j2(this.f478275e, this.f478276f, this.f478277g, this.f478278h, this.f478279i, this.f478280m, this.f478281n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.j2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478274d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478274d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) aVar2).c7(this);
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
        java.lang.String str = this.f478275e;
        sb6.append(str);
        sb6.append(", path: ");
        java.lang.String str2 = this.f478276f;
        sb6.append(str2);
        sb6.append(", scene: ");
        long j17 = this.f478277g;
        sb6.append(j17);
        sb6.append(", sceneNote: ");
        java.lang.String str3 = this.f478278h;
        sb6.append(str3);
        sb6.append(", noReLaunch: ");
        boolean z18 = this.f478279i;
        sb6.append(z18);
        sb6.append(", debugMode: ");
        long j18 = this.f478280m;
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", sb6.toString());
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
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f478281n.a(), b1Var);
        return f0Var;
    }
}
