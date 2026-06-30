package vp4;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f520609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vp4.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520609d = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp4.u(this.f520609d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vp4.b0 b0Var = this.f520609d;
        yz5.p pVar = b0Var.f520543j;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (pVar == null && (context = b0Var.f520539f) != null) {
            ru3.f fVar = b0Var.f520540g;
            if (fVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                fVar.b(context, false, com.p314xaae8f345.mm.R.C30867xcad56011.i1q, vp4.t.f520608d);
                return f0Var;
            }
        } else if (pVar != null) {
            pVar.mo149xb9724478(new java.lang.Integer(0), b0Var.f520544k);
            return f0Var;
        }
        return null;
    }
}
