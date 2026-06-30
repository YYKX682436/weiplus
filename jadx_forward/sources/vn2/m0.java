package vn2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f519857d;

    /* renamed from: e, reason: collision with root package name */
    public int f519858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca f519860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519861h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f519862i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519863m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f519864n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca, r45.qt2 qt2Var, boolean z17, android.content.Context context, ym5.q1 q1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519859f = abstractC14490x69736cb5;
        this.f519860g = c14438x701c8eca;
        this.f519861h = qt2Var;
        this.f519862i = z17;
        this.f519863m = context;
        this.f519864n = q1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.m0(this.f519859f, this.f519860g, this.f519861h, this.f519862i, this.f519863m, this.f519864n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.m0) mo148xaf65a0fc((r45.av2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519858e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca c14438x701c8eca = this.f519860g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ey2.g1 g1Var = (ey2.g1) pf5.u.f435469a.e(c61.l7.class).a(ey2.g1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f519859f;
            g1Var.P6(abstractC14490x69736cb5.mo2128x1ed62e84());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.g0 c17 = c14438x701c8eca.c();
            c17.getClass();
            java.util.List d17 = c17.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "<get-seeLaterDetailList>(...)");
            pm0.v.I(d17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.d0(abstractC14490x69736cb5));
            c17.e(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            java.util.List d18 = c14438x701c8eca.c().d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "<get-seeLaterDetailList>(...)");
            bo2.c cVar = (bo2.c) kz5.n0.Z(d18);
            h0Var3.f391656d = cVar;
            if (cVar != null) {
                h0Var = h0Var3;
                pm0.v.X(new vn2.l0(this.f519862i, this.f519863m, this.f519860g, this.f519864n, h0Var, this.f519859f));
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.g0 c18 = c14438x701c8eca.c();
            this.f519857d = h0Var3;
            this.f519858e = 1;
            if (c18.f(this.f519861h, 50L, this) == aVar) {
                return aVar;
            }
            h0Var2 = h0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var2 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f519857d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List d19 = c14438x701c8eca.c().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "<get-seeLaterDetailList>(...)");
        h0Var2.f391656d = (bo2.c) kz5.n0.Z(d19);
        h0Var = h0Var2;
        pm0.v.X(new vn2.l0(this.f519862i, this.f519863m, this.f519860g, this.f519864n, h0Var, this.f519859f));
        return jz5.f0.f384359a;
    }
}
