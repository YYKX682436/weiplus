package aq;

/* loaded from: classes4.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4988x89c61bdd f94426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f94427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f94428g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd, java.nio.Buffer buffer, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94426e = c4988x89c61bdd;
        this.f94427f = buffer;
        this.f94428g = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        aq.k0 k0Var = new aq.k0(this.f94426e, this.f94427f, this.f94428g, interfaceC29045xdcb5ca57);
        k0Var.f94425d = obj;
        return k0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        aq.k0 k0Var = (aq.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f94425d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new aq.h0(null), 2, null);
        com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = this.f94426e;
        java.nio.Buffer buffer = this.f94427f;
        android.graphics.Bitmap bitmap = this.f94428g;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new aq.i0(c4988x89c61bdd, buffer, bitmap, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new aq.j0(c4988x89c61bdd, buffer, bitmap, null), 3, null);
        return jz5.f0.f384359a;
    }
}
