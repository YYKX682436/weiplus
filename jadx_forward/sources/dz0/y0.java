package dz0;

/* loaded from: classes5.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326598e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f326599f;

    /* renamed from: g, reason: collision with root package name */
    public long f326600g;

    /* renamed from: h, reason: collision with root package name */
    public int f326601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326602i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f326603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326604n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f326605o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326602i = c11015x5b190a3b;
        this.f326603m = qVar;
        this.f326604n = str;
        this.f326605o = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.y0(this.f326602i, this.f326603m, this.f326604n, this.f326605o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        az0.n7 n7Var;
        p3325xe03a0797.p3326xc267989b.q qVar;
        java.lang.String str;
        long j17;
        java.lang.String str2;
        long j18;
        az0.n7 n7Var2;
        long j19;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326601h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n7Var = this.f326602i.f151316d;
            if (n7Var != null) {
                boolean i18 = n7Var.i();
                qVar = this.f326603m;
                str = this.f326604n;
                j17 = this.f326605o;
                if (!i18) {
                    if (n7Var.f97275a.m33393xb7d72d0e() == com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece.Initial) {
                        str2 = str;
                        j18 = j17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "callSessionSnapshotAndExportClipBundle: failed, session state, now:" + n7Var.f97275a.m33393xb7d72d0e());
                        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(-1, "movieSession state not match, " + n7Var.f97275a.m33393xb7d72d0e());
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(c4093x6b88526b))));
                        az0.rc.i(str2, j18, c4093x6b88526b, false, 0, 24, null);
                    } else {
                        this.f326597d = qVar;
                        this.f326598e = str;
                        this.f326599f = n7Var;
                        this.f326600g = j17;
                        this.f326601h = 1;
                        java.lang.Object q17 = n7Var.q(this);
                        if (q17 == aVar) {
                            return aVar;
                        }
                        n7Var2 = n7Var;
                        obj = q17;
                        j19 = j17;
                    }
                }
                n7Var.f97275a.m33449x6f231a39(new dz0.x0(qVar, str, j17));
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j19 = this.f326600g;
        n7Var2 = (az0.n7) this.f326599f;
        str = (java.lang.String) this.f326598e;
        qVar = (p3325xe03a0797.p3326xc267989b.q) this.f326597d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
            j17 = j19;
            n7Var = n7Var2;
            n7Var.f97275a.m33449x6f231a39(new dz0.x0(qVar, str, j17));
            return jz5.f0.f384359a;
        }
        n7Var = n7Var2;
        j18 = j19;
        str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "callSessionSnapshotAndExportClipBundle: failed, session state, now:" + n7Var.f97275a.m33393xb7d72d0e());
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b2 = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(-1, "movieSession state not match, " + n7Var.f97275a.m33393xb7d72d0e());
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(c4093x6b88526b2))));
        az0.rc.i(str2, j18, c4093x6b88526b2, false, 0, 24, null);
        return jz5.f0.f384359a;
    }
}
