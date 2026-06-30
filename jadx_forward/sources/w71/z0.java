package w71;

/* loaded from: classes11.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f525006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f525007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.z f525008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f525009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(long j17, bw5.z zVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f525007e = j17;
        this.f525008f = zVar;
        this.f525009g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new w71.z0(this.f525007e, this.f525008f, this.f525009g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((w71.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f525006d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        long j17 = this.f525007e;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NativeCgi", "error " + j17 + ", " + e17.getMessage());
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            w71.y0 y0Var = new w71.y0(this.f525009g, this.f525007e, e17, null);
            this.f525006d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, y0Var, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request ");
            sb6.append(j17);
            sb6.append(", cmdid ");
            bw5.z zVar = this.f525008f;
            sb6.append(zVar.b().f116415d);
            sb6.append(", data ");
            sb6.append(zVar.m13447x744cac3f().f273689a.length);
            sb6.append(", baseRequest ");
            sb6.append(zVar.f117284o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgi", sb6.toString());
            w71.k kVar = new w71.k(zVar);
            this.f525006d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            pq5.g l17 = kVar.l();
            l17.K(new w71.j(kVar, rVar));
            rVar.m(new w71.i(l17));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    return f0Var;
                }
                if (i17 == 3) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bw5.a0 a0Var = (bw5.a0) obj;
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        w71.x0 x0Var = new w71.x0(this.f525007e, a0Var, this.f525009g, null);
        this.f525006d = 3;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, x0Var, this) == aVar ? aVar : f0Var;
    }
}
