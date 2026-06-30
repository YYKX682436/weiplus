package yy0;

/* loaded from: classes4.dex */
public final class u7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f549897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(java.lang.String str, yy0.g8 g8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549896e = str;
        this.f549897f = g8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.u7(this.f549896e, this.f549897f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.u7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549895d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            iz0.d dVar = iz0.d.f377577a;
            java.lang.String str = this.f549896e;
            dm.ib d17 = dVar.d(str);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f549897f.f549645d, "deleteWork get info is null " + str);
                return f0Var;
            }
            b5.w.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).b(str);
            hz0.m.f367816a.a(d17.f67036xcf7ab2c4);
            dVar.e(str, 4002);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            yy0.t7 t7Var = new yy0.t7(d17, null);
            this.f549895d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, t7Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
