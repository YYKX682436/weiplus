package k50;

/* loaded from: classes9.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f385710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f385711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wf0.x1 f385713g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385714h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385715i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f385716m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f385717n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(t21.v2 v2Var, java.lang.String str, wf0.x1 x1Var, java.lang.String str2, java.lang.String str3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f385711e = v2Var;
        this.f385712f = str;
        this.f385713g = x1Var;
        this.f385714h = str2;
        this.f385715i = str3;
        this.f385716m = h0Var;
        this.f385717n = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new k50.a1(this.f385711e, this.f385712f, this.f385713g, this.f385714h, this.f385715i, this.f385716m, this.f385717n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((k50.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f385710d;
        java.lang.String str = this.f385714h;
        wf0.x1 x1Var = this.f385713g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            t21.v2 v2Var = this.f385711e;
            java.lang.String f17 = v2Var.f();
            y15.d dVar = new y15.d();
            java.lang.String g17 = v2Var.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getRecvXml(...)");
            dVar.m126728xdc93280d(g17);
            r15.b j17 = dVar.j();
            r15.d j18 = j17 != null ? j17.j() : null;
            if (j18 != null) {
                j18.k(this.f385712f);
            }
            java.lang.String m126747x696739c = dVar.m126747x696739c();
            int i18 = v2Var.f496555t;
            int i19 = v2Var.f496548m;
            ((vf0.y1) x1Var).Bi(this.f385714h, null, i19, this.f385715i, f17, i18, m126747x696739c, 43, v2Var.E, "", v2Var.f496549n, v2Var.f496553r, null, v2Var.N, false, -1L, v2Var.Q, v2Var.R);
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f385716m;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var.f391656d) && h17 != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(this.f385715i, h17.f496549n);
                i95.m c17 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, null, bm5.f0.f104095g, (java.lang.String) h0Var.f391656d, false, 8, null);
                if (com.p314xaae8f345.mm.vfs.w6.j(e86)) {
                    i95.m c18 = i95.n0.c(c35.m.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    java.lang.String p86 = c35.m.p8((c35.m) c18, n17, false, 2, null);
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e86, p86)) {
                        com.p314xaae8f345.mm.vfs.w6.c(e86, p86);
                        com.p314xaae8f345.mm.vfs.w6.h(e86);
                    }
                }
                ((vf0.y1) x1Var).Bi(this.f385714h, (java.lang.String) h0Var.f391656d, i19, this.f385715i, f17, i18, m126747x696739c, 43, v2Var.E, "", v2Var.f496549n, v2Var.f496553r, null, v2Var.N, true, h17.f496549n, v2Var.Q, v2Var.R);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f385717n;
                if (f9Var != null) {
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
                    k50.z0 z0Var = new k50.z0(f9Var, n17, null);
                    this.f385710d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, z0Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ((vf0.y1) x1Var).getClass();
        t21.d3.M(str);
        return jz5.f0.f384359a;
    }
}
