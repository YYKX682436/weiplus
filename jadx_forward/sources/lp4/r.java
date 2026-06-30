package lp4;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lp4.u f401948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f401949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f401950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, lp4.u uVar, long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401947e = i17;
        this.f401948f = uVar;
        this.f401949g = j17;
        this.f401950h = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lp4.r(this.f401947e, this.f401948f, this.f401949g, this.f401950h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lp4.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f401946d;
        lp4.u uVar = this.f401948f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rm5.v vVar = uVar.f401962h;
            int size = (vVar == null || (arrayList = vVar.f479117l) == null) ? 0 : arrayList.size();
            int i18 = this.f401947e;
            if (i18 < size) {
                rm5.v vVar2 = uVar.f401962h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar2);
                java.lang.Long l17 = new java.lang.Long(((rm5.j) vVar2.f479117l.get(i18)).f479034c);
                long j17 = this.f401949g;
                long j18 = this.f401950h;
                this.f401946d = 1;
                uVar.getClass();
                if (p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new lp4.t(j17, j18, l17, uVar, null), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return uVar.f401962h;
    }
}
