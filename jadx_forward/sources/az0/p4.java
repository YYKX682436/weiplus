package az0;

/* loaded from: classes5.dex */
public final class p4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f97335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(boolean z17, boolean z18, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97335d = z17;
        this.f97336e = z18;
        this.f97337f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.p4(this.f97335d, this.f97336e, this.f97337f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        az0.p4 p4Var = (az0.p4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int size;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "initSdk - state: " + az0.i5.f97093d);
        ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
        if (ez0.o.f339368a.c() && this.f97335d && (az0.i5.f97093d == az0.x2.f97571e || az0.i5.f97093d == az0.x2.f97572f)) {
            synchronized (hz0.m.f367816a) {
                size = hz0.m.f367817b.size();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "initSdk: background export task size:" + size + ", coreUsageCount:" + az0.i5.f97109t + ", state:" + az0.i5.f97093d);
            az0.i5 i5Var = az0.i5.f97090a;
            if (i5Var.t() && size > 0 && size == az0.i5.f97109t) {
                i5Var.v();
            }
        }
        int ordinal = az0.i5.f97093d.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "initSdk - start init");
            az0.i5.f97090a.l(this.f97336e, this.f97337f, this.f97335d);
        } else if (ordinal == 1) {
            az0.i5.d(az0.i5.f97090a);
            yz5.a aVar2 = this.f97337f;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        } else if (ordinal == 2) {
            boolean z17 = az0.i5.f97096g;
            boolean z18 = this.f97336e;
            if (z17 != z18) {
                az0.i5 i5Var2 = az0.i5.f97090a;
                if (z18) {
                    oz0.c.f431735h.b();
                } else {
                    oz0.c.f431734g.b();
                }
            }
            yz5.a aVar3 = this.f97337f;
            if (aVar3 != null) {
                aVar3.mo152xb9724478();
            }
        } else if (ordinal == 3) {
            az0.i5 i5Var3 = az0.i5.f97090a;
            az0.i5.d(i5Var3);
            if (az0.i5.f97093d == az0.x2.f97570d) {
                i5Var3.l(this.f97336e, this.f97337f, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasManager", "Unexpected state: " + az0.i5.f97093d + " after TEARDOWNING");
                yz5.a aVar4 = this.f97337f;
                if (aVar4 != null) {
                    aVar4.mo152xb9724478();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
