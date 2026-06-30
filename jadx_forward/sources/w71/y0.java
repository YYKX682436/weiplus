package w71;

/* loaded from: classes11.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f525003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f525004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f525005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yz5.l lVar, long j17, java.lang.Exception exc, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f525003d = lVar;
        this.f525004e = j17;
        this.f525005f = exc;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new w71.y0(this.f525003d, this.f525004e, this.f525005f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        w71.y0 y0Var = (w71.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bw5.a0 a0Var = new bw5.a0();
        a0Var.c(this.f525004e);
        a0Var.b(-1);
        a0Var.f106487f = this.f525005f.getMessage();
        a0Var.f106490i[3] = true;
        this.f525003d.mo146xb9724478(a0Var);
        return jz5.f0.f384359a;
    }
}
