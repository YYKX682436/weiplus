package qm3;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm3.a f446301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f446302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f446303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f446304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qm3.i f446305h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qm3.a aVar, long j17, kp4.a aVar2, android.graphics.Bitmap bitmap, qm3.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446301d = aVar;
        this.f446302e = j17;
        this.f446303f = aVar2;
        this.f446304g = bitmap;
        this.f446305h = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qm3.d(this.f446301d, this.f446302e, this.f446303f, this.f446304g, this.f446305h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qm3.d dVar = (qm3.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qm3.a aVar2 = this.f446301d;
        java.util.Set set = aVar2.f446294c;
        long j17 = this.f446302e;
        set.remove(new java.lang.Long(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kp4.a aVar3 = this.f446303f;
        sb6.append(aVar3);
        sb6.append(" receives ");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbCachedLoader", sb6.toString());
        android.graphics.Bitmap bitmap = this.f446304g;
        if (bitmap != null) {
            this.f446305h.f446320d.put(new qm3.b(aVar3, j17), bitmap);
            aVar2.f446295d.add(new java.lang.Long(j17));
            aVar2.f446296e.e(new java.lang.Long(j17));
        }
        return jz5.f0.f384359a;
    }
}
