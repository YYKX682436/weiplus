package qi2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f445136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f445137e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qi2.w0 w0Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f445136d = w0Var;
        this.f445137e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi2.q0(this.f445136d, this.f445137e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qi2.q0 q0Var = (qi2.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qi2.w0 w0Var = this.f445136d;
        w0Var.f445183n.clear();
        w0Var.f445183n.addAll(this.f445137e);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = w0Var.f445185p;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf.m8146xced61ae5();
        fg2.w0 w0Var2 = w0Var.f445182m;
        if (w0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        w0Var2.f343920c.setVisibility(8);
        fg2.w0 w0Var3 = w0Var.f445182m;
        if (w0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        w0Var3.f343921d.setVisibility(0);
        fg2.w0 w0Var4 = w0Var.f445182m;
        if (w0Var4 != null) {
            w0Var4.f343919b.setVisibility(8);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
        throw null;
    }
}
