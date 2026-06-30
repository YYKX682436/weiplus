package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 f287804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f287805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot0.q f287807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f f287809i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f287810m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, java.lang.String str, ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6254x6dec987f c6254x6dec987f, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f287804d = a4Var;
        this.f287805e = y0Var;
        this.f287806f = str;
        this.f287807g = qVar;
        this.f287808h = dVar;
        this.f287809i = c6254x6dec987f;
        this.f287810m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z1(this.f287804d, this.f287805e, this.f287806f, this.f287807g, this.f287808h, this.f287809i, this.f287810m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.z1 z1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var = this.f287804d;
        android.widget.TextView textView = a4Var.f284792c;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = a4Var.f284793d;
        if (textView2 != null) {
            textView2.setText("");
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var2 = this.f287804d;
        android.widget.TextView textView3 = a4Var2.f284792c;
        if (textView3 != null) {
            textView3.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.y1(this.f287805e, this.f287806f, this.f287807g, this.f287808h, a4Var2, this.f287809i, this.f287810m));
        }
        return jz5.f0.f384359a;
    }
}
