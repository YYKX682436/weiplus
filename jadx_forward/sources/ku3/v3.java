package ku3;

/* loaded from: classes3.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f393970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(ku3.y3 y3Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393969d = y3Var;
        this.f393970e = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.v3(this.f393969d, this.f393970e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ku3.v3 v3Var = (ku3.v3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ku3.y3 y3Var = this.f393969d;
        android.widget.TextView g17 = y3Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f393970e;
        g17.setText(java.lang.String.valueOf(f0Var.f391649d));
        if (f0Var.f391649d == 0) {
            ju3.d0.k(y3Var.f394004f, ju3.c0.Q2, null, 2, null);
            y3Var.g().setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
