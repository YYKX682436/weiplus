package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 f287093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 f287094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w05.d f287095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287096g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var2, w05.d dVar, yb5.d dVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f287093d = w5Var;
        this.f287094e = w5Var2;
        this.f287095f = dVar;
        this.f287096g = dVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t5(this.f287093d, this.f287094e, this.f287095f, this.f287096g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t5 t5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var = this.f287093d;
        android.widget.TextView textView = w5Var.f287431b;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = w5Var.f287431b;
        if (textView2 != null) {
            textView2.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s5(this.f287094e, w5Var, this.f287095f, this.f287096g));
        }
        return jz5.f0.f384359a;
    }
}
