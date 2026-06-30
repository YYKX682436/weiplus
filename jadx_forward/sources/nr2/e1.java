package nr2;

/* loaded from: classes2.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f420715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f420717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(nr2.i1 i1Var, int i17, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420715d = i1Var;
        this.f420716e = i17;
        this.f420717f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr2.e1(this.f420715d, this.f420716e, this.f420717f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nr2.e1 e1Var = (nr2.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f420715d.f420746d;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf.m8153xd399a4d9(this.f420716e, this.f420717f.size());
        nr2.i1 i1Var = this.f420715d;
        nr2.l1 l1Var = i1Var.f420745c;
        if (l1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l1Var.d().e(true);
        if (!i1Var.f420750h) {
            nr2.l1 l1Var2 = i1Var.f420745c;
            if (l1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            l1Var2.d().E(true);
        }
        return jz5.f0.f384359a;
    }
}
