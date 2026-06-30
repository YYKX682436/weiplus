package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f391964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.k f391965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f391966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f391965e = kVar;
        this.f391966f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.w(this.f391965e, this.f391966f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((p3325xe03a0797.p3326xc267989b.p3328x30012e.w) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391964d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f391966f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = v26.k0.f514553a;
            java.lang.Object obj2 = h0Var.f391656d;
            if (obj2 == l0Var) {
                obj2 = null;
            }
            this.f391964d = 1;
            if (this.f391965e.mo771x2f8fd3(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        h0Var.f391656d = null;
        return jz5.f0.f384359a;
    }
}
