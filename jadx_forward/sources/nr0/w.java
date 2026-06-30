package nr0;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i17, int i18, nr0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420645d = i17;
        this.f420646e = i18;
        this.f420647f = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.w(this.f420645d, this.f420646e, this.f420647f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nr0.w wVar = (nr0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        wVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPreviewSize:[");
        int i17 = this.f420645d;
        sb6.append(i17);
        sb6.append(' ');
        int i18 = this.f420646e;
        sb6.append(i18);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        nr0.x xVar = this.f420647f;
        xVar.f420654m.b(i17, i18);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = xVar.f420658q;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (interfaceC29045xdcb5ca57 != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        }
        xVar.f420658q = null;
        return f0Var;
    }
}
