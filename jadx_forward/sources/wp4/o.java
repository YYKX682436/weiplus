package wp4;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f529958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp4.x f529960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n55.e f529961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, wp4.x xVar, n55.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529959e = str;
        this.f529960f = xVar;
        this.f529961g = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wp4.o(this.f529959e, this.f529960f, this.f529961g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f529958d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            if (i17 == 2) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zp4.e eVar = zp4.e.f556487a;
        java.lang.String str = this.f529959e;
        dm.q0 d17 = eVar.d(str);
        n55.e eVar2 = this.f529961g;
        wp4.x xVar = this.f529960f;
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(xVar.f529986d, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", is not find");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            wp4.n nVar = new wp4.n(eVar2, null);
            this.f529958d = 2;
            return p3325xe03a0797.p3326xc267989b.l.g(g3Var, nVar, this) == aVar ? aVar : f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", is find");
        int i18 = d17.f68035xdb9e6ea3;
        java.lang.String field_work_id = d17.f68034xcf7ab2c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
        long j17 = d17.f68003xca7c3d7;
        java.lang.String field_output_video_path = d17.f68019xae81df62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = d17.f68017xa8a162e7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_thumb_path, "field_output_thumb_path");
        o55.a aVar2 = new o55.a(i18, field_work_id, j17, field_output_video_path, field_output_thumb_path, 0, 0L, 0, null, 480, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        wp4.m mVar = new wp4.m(eVar2, aVar2, null);
        this.f529958d = 1;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, mVar, this) == aVar ? aVar : f0Var;
    }
}
