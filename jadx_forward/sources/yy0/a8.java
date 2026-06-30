package yy0;

/* loaded from: classes4.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f549546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f549547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f549548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n55.e f549549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(int i17, int i18, yy0.g8 g8Var, n55.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549546e = i17;
        this.f549547f = i18;
        this.f549548g = g8Var;
        this.f549549h = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.a8(this.f549546e, this.f549547f, this.f549548g, this.f549549h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.a8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549545d;
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
        iz0.d dVar = iz0.d.f377577a;
        int i18 = this.f549546e;
        int i19 = this.f549547f;
        dm.ib c17 = dVar.c(i18, i19);
        n55.e eVar = this.f549549h;
        yy0.g8 g8Var = this.f549548g;
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(g8Var.f549645d, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i18 + ", createTime: " + i19 + ", is not find");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            yy0.z7 z7Var = new yy0.z7(eVar, null);
            this.f549545d = 2;
            return p3325xe03a0797.p3326xc267989b.l.g(g3Var, z7Var, this) == aVar ? aVar : f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g8Var.f549645d, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i18 + ", createTime: " + i19 + ", workType: " + c17.f67037xdb9e6ea3 + ", is find");
        int i27 = c17.f67037xdb9e6ea3;
        java.lang.String field_work_id = c17.f67036xcf7ab2c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
        long j17 = c17.f67023xca7c3d7;
        java.lang.String field_output_video_path = c17.f67027xae81df62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = c17.f67026xa8a162e7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_output_thumb_path, "field_output_thumb_path");
        o55.a aVar2 = new o55.a(i27, field_work_id, j17, field_output_video_path, field_output_thumb_path, c17.f67035xdb968d56, c17.f67029xfc6b13f4, 0, c17.f67031xd0c18a18, 128, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        yy0.y7 y7Var = new yy0.y7(eVar, aVar2, null);
        this.f549545d = 1;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var2, y7Var, this) == aVar ? aVar : f0Var;
    }
}
