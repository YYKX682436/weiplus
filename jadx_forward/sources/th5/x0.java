package th5;

/* loaded from: classes4.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f501008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f501009e = str;
        this.f501010f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new th5.x0(this.f501009e, this.f501010f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        bs.b wi6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f501008d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
        if (wi7 == null || (wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission")) == null) {
            return null;
        }
        java.lang.String a17 = q75.c.a("jpg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoSaveComponent", "exportAsLivePhoto videoPath=" + this.f501009e + " coverPath=" + this.f501010f + " exportPath=" + a17);
        if (a17 == null || r26.n0.N(a17)) {
            return null;
        }
        qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
        wi6.b(wi7);
        aq.t0 t0Var = new aq.t0(this.f501009e, this.f501010f, a17, 0L, null, 24, null);
        this.f501008d = 1;
        ((hs.v) r7Var).getClass();
        java.lang.Object a18 = qp.b.f447207a.a(wi6, t0Var, this);
        return a18 == aVar ? aVar : a18;
    }
}
