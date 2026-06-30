package rb2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.d1 f475379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f475381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(rb2.d1 d1Var, java.lang.String str, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f475379d = d1Var;
        this.f475380e = str;
        this.f475381f = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rb2.z0(this.f475379d, this.f475380e, this.f475381f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rb2.z0 z0Var = (rb2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = rb2.d1.f475137i;
        rb2.d1 d1Var = this.f475379d;
        d1Var.a(this.f475380e);
        d1Var.f475140f = this.f475381f;
        d1Var.notifyDataSetChanged();
        return jz5.f0.f384359a;
    }
}
