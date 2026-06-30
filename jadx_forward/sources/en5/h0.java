package en5;

/* loaded from: classes8.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f336959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f336961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str, java.lang.Long l17, java.lang.String str2, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f336958e = str;
        this.f336959f = l17;
        this.f336960g = str2;
        this.f336961h = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new en5.h0(this.f336958e, this.f336959f, this.f336960g, this.f336961h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((en5.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f336957d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f336957d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new bm5.u0(this.f336958e, this.f336959f, this.f336960g, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f336961h.mo148714x53d8522f(e1.e.b(bitmap));
        }
        return jz5.f0.f384359a;
    }
}
