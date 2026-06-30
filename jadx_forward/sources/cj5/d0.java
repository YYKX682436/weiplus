package cj5;

/* loaded from: classes.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f123623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f123624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123623d = h0Var;
        this.f123624e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cj5.d0(this.f123623d, this.f123624e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cj5.d0 d0Var = (cj5.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f123623d;
        android.view.View view = (android.view.View) h0Var.f391656d;
        if (view != null) {
            this.f123624e.f527864b.mo146xb9724478(view);
        }
        h0Var.f391656d = null;
        return jz5.f0.f384359a;
    }
}
