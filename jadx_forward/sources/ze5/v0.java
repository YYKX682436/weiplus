package ze5;

/* loaded from: classes9.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f553772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ue0 f553773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ze5.n8 n8Var, bw5.ue0 ue0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553772d = n8Var;
        this.f553773e = ue0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ze5.v0(this.f553772d, this.f553773e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c00.z2 z2Var = (c00.z2) c17;
        android.view.ViewParent viewParent = this.f553772d.f553644c;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (viewParent == null) {
            return f0Var;
        }
        bw5.ue0 shopCard = this.f553773e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopCard, "shopCard");
        ((b00.r) z2Var).f98290d.getClass();
        f00.t tVar = viewParent instanceof f00.t ? (f00.t) viewParent : null;
        if (tVar != null) {
            tVar.a(shopCard);
        }
        return f0Var;
    }
}
