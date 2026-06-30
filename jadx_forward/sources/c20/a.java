package c20;

/* loaded from: classes11.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f119509d;

    /* renamed from: e, reason: collision with root package name */
    public int f119510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f119511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq.a f119512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bw5.x7 x7Var, pq.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f119511f = x7Var;
        this.f119512g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c20.a(this.f119511f, this.f119512g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c20.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f119510e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = this.f119511f.g().b();
            if (b17 == null) {
                return f0Var;
            }
            pi0.l1 l1Var2 = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "live_multiplatform", null, false, null, 28, null);
            l1Var2.f436182h = true;
            jz5.l[] lVarArr = new jz5.l[1];
            java.lang.String encodeToString = android.util.Base64.encodeToString(b17.g(), 2);
            if (encodeToString == null) {
                encodeToString = "";
            }
            lVarArr[0] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, encodeToString);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            this.f119509d = l1Var2;
            this.f119510e = 1;
            if (l1Var2.o("display_pending_product_half_page_shower", l17, this) == aVar) {
                return aVar;
            }
            l1Var = l1Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l1Var = (pi0.l1) this.f119509d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.content.Context c17 = this.f119512g.c();
        if (c17 == null) {
            c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(1, 1, null, false, false, false, null, 0, false, false, false, null, 4092, null);
        this.f119509d = null;
        this.f119510e = 2;
        s17 = l1Var.s(c17, c10716x931597c6, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        return s17 == aVar ? aVar : f0Var;
    }
}
