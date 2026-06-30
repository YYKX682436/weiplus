package vp4;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.p f520587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vp4.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520587d = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp4.n(this.f520587d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vp4.n nVar = (vp4.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ru3.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vp4.p pVar = this.f520587d;
        ru3.f fVar2 = pVar.f520599g;
        if (fVar2 != null) {
            fVar2.a();
        }
        android.content.Context context = pVar.f520598f;
        if (context != null && (fVar = pVar.f520599g) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            fVar.b(context, false, com.p314xaae8f345.mm.R.C30867xcad56011.i1q, vp4.m.f520586d);
        }
        return jz5.f0.f384359a;
    }
}
