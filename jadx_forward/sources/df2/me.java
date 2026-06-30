package df2;

/* loaded from: classes3.dex */
public final class me extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f312307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f312308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xm1 f312309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, r45.xm1 xm1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312307d = bitmap;
        this.f312308e = bitmap2;
        this.f312309f = xm1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.me(this.f312307d, this.f312308e, this.f312309f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.me) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.xm1 xm1Var = this.f312309f;
        android.graphics.Bitmap bitmap = this.f312307d;
        if (bitmap != null) {
            dk2.ef efVar = dk2.ef.f314905a;
            dk2.ef.f314944z.put(xm1Var.m75939xb282bd08(0) + "_white", bitmap);
        }
        android.graphics.Bitmap bitmap2 = this.f312308e;
        if (bitmap2 == null) {
            return null;
        }
        dk2.ef efVar2 = dk2.ef.f314905a;
        dk2.ef.f314944z.put(xm1Var.m75939xb282bd08(0) + "_#FFDA98", bitmap2);
        return jz5.f0.f384359a;
    }
}
