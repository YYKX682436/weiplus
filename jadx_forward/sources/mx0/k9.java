package mx0;

/* loaded from: classes5.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413637e = z17;
        this.f413638f = c10977x8e40eced;
        this.f413639g = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.k9(this.f413637e, this.f413638f, this.f413639g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.k9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.g3 m47316xc93d195a;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413636d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!this.f413637e && this.f413638f.f151090v.B1 == 1) {
                return f0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "changeNormalRecord");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            mx0.j9 j9Var = new mx0.j9(this.f413638f, null);
            this.f413636d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, j9Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                mx0.z.i(this.f413638f, false, false, 2, null);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        m47316xc93d195a = this.f413638f.m47316xc93d195a();
        m47316xc93d195a.c(9999000);
        this.f413638f.f151090v.B1 = 1;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413638f;
        yx0.b8 b8Var = c10977x8e40eced.f151090v;
        bs0.j jVar = c10977x8e40eced.f151085q;
        bs0.h hVar = jVar instanceof bs0.h ? (bs0.h) jVar : null;
        java.util.List list = this.f413639g;
        this.f413636d = 2;
        b8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchEmptyTemplate");
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.k6(b8Var, hVar, list, null), 3, null);
        if (f0Var == aVar) {
            return aVar;
        }
        mx0.z.i(this.f413638f, false, false, 2, null);
        return f0Var;
    }
}
