package ht2;

/* loaded from: classes2.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tl2 f366417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f366419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f366421i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f366422m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f366423n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f366424o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r45.tl2 tl2Var, ht2.y0 y0Var, android.widget.LinearLayout linearLayout, java.lang.String str, android.view.ViewGroup viewGroup, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, zy2.r6 r6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366417e = tl2Var;
        this.f366418f = y0Var;
        this.f366419g = linearLayout;
        this.f366420h = str;
        this.f366421i = viewGroup;
        this.f366422m = c0Var;
        this.f366423n = c0Var2;
        this.f366424o = r6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ht2.p0(this.f366417e, this.f366418f, this.f366419g, this.f366420h, this.f366421i, this.f366422m, this.f366423n, this.f366424o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ht2.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Lc;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366416d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            r45.tl2 tl2Var = this.f366417e;
            java.lang.String m75945x2fec8307 = tl2Var.m75945x2fec8307(1);
            java.lang.String m75945x2fec83072 = tl2Var.m75945x2fec8307(2);
            this.f366416d = 1;
            Lc = zy.w.Lc(p37, m75945x2fec8307, false, m75945x2fec83072, 0, 0, null, null, this, 120, null);
            if (Lc == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Lc = obj;
        }
        jz5.o oVar = (jz5.o) Lc;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        ht2.o0 o0Var = new ht2.o0(oVar, this.f366418f, this.f366419g, this.f366420h, this.f366421i, this.f366422m, this.f366423n, this.f366424o, null);
        this.f366416d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, o0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
