package wp4;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f529946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f529947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f529948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp4.x f529949g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, int i18, wp4.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529947e = i17;
        this.f529948f = i18;
        this.f529949g = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wp4.j(this.f529947e, this.f529948f, this.f529949g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f529946d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zp4.e eVar = zp4.e.f556487a;
            int i18 = this.f529948f;
            int i19 = this.f529947e;
            dm.q0 c17 = eVar.c(i19, i18);
            wp4.x xVar = this.f529949g;
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(xVar.f529986d, "deleteTimeLineFeedFakeVideo get info is null " + i19);
                return f0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "deleteTimeLineFeedFakeVideo >> workType: " + c17.f68035xdb9e6ea3);
            if (c17.f68035xdb9e6ea3 != 4007) {
                java.lang.String field_work_id = c17.f68034xcf7ab2c4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
                eVar.f(field_work_id, 4010);
            }
            aq4.a.f94734a.a(c17.f68034xcf7ab2c4);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            wp4.i iVar = new wp4.i(c17, null);
            this.f529946d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, iVar, this) == aVar) {
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
