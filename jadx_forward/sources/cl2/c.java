package cl2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f124448d;

    /* renamed from: e, reason: collision with root package name */
    public int f124449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f124451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f124452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f124450f = str;
        this.f124451g = c22789xd23e9a9b;
        this.f124452h = c22628xfde5d61d;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cl2.c(this.f124450f, this.f124451g, this.f124452h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cl2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f124449e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            java.lang.String str2 = this.f124450f;
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            java.lang.String bj6 = ((c61.p2) ybVar).bj("banner_pag_dir", a17);
            wh2.l lVar = wh2.l.f527488a;
            this.f124448d = bj6;
            this.f124449e = 1;
            java.lang.Object a18 = lVar.a(str2, bj6, this);
            if (a18 == aVar) {
                return aVar;
            }
            str = bj6;
            obj = a18;
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            str = (java.lang.String) this.f124448d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean z17 = ((wh2.i) obj) instanceof wh2.h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f124452h;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f124451g;
        if (z17) {
            c22789xd23e9a9b.n();
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.H));
            c22789xd23e9a9b.mo82567x3e3ac3e8(str);
            c22789xd23e9a9b.d();
            c22789xd23e9a9b.m82583xcde73672(-1);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            cl2.a aVar2 = new cl2.a(c22789xd23e9a9b, c22628xfde5d61d, null);
            this.f124448d = null;
            this.f124449e = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            cl2.b bVar = new cl2.b(c22628xfde5d61d, c22789xd23e9a9b, null);
            this.f124448d = null;
            this.f124449e = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, bVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
