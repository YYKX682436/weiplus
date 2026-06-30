package e80;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f331540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r70.g f331541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p70.b f331542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f331543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f331544h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r70.g gVar, p70.b bVar, long j17, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f331541e = gVar;
        this.f331542f = bVar;
        this.f331543g = j17;
        this.f331544h = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e80.d(this.f331541e, this.f331542f, this.f331543g, this.f331544h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e80.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f331540d;
        r70.g gVar = this.f331541e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e80.r a17 = e80.r.f331608f.a();
            this.f331540d = 1;
            obj = a17.b7(gVar, this.f331542f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r70.h hVar = (r70.h) obj;
        ((java.util.HashMap) gVar.f474640i).put("send_result_type", hVar.f474642a.toString());
        ((java.util.HashMap) gVar.f474640i).put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - this.f331543g));
        if (hVar.f474642a != r70.i.f474647e) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(gVar.f474641j, gVar.f474640i, 32785);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgAsyncSendFSC", "report " + gVar.f474641j + ' ' + gVar.f474640i);
        }
        this.f331540d = 2;
        if (this.f331544h.mo771x2f8fd3(hVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
