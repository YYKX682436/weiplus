package u03;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u03.h f504997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f504998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u03.h hVar, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504997d = hVar;
        this.f504998e = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u03.g(this.f504997d, this.f504998e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u03.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String g17;
        java.lang.String d17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.q0 q0Var = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.q0();
            q0Var.mo11468x92b714fd(this.f504998e);
            java.lang.String str = q0Var.f149602i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
            r45.jj4 jj4Var = (r45.jj4) k17.m70371x485d7().f39014x86965dde.f451373h.getFirst();
            boolean u17 = com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.n(jj4Var.f459388d));
            java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.p(jj4Var);
            t21.v2 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.k(str, jj4Var.f459388d, jj4Var.Y);
            if (k18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.u(str, jj4Var.f459388d, 30, jj4Var.Y);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.y(k18, jj4Var.f459388d, 30);
            }
            this.f504997d.getClass();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = p17;
            objArr[1] = java.lang.Boolean.valueOf(u17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCdnTaskFactory", "prepare stream download sns video %s mkDir %b", objArr);
            if (k18 != null && (d17 = k18.d()) != null) {
                g17 = d17;
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 c17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.c();
                c17.f276846b = k17.m70357x3fdd41df();
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                return t21.o2.Di().k(c17, jj4Var.f459391g, p17, g17, 1, false, jj4Var.f459388d, jj4Var.D, jj4Var.E, jj4Var.U, jj4Var);
            }
            g17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.g(str, jj4Var);
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 c172 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.c();
            c172.f276846b = k17.m70357x3fdd41df();
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            return t21.o2.Di().k(c172, jj4Var.f459391g, p17, g17, 1, false, jj4Var.f459388d, jj4Var.D, jj4Var.E, jj4Var.U, jj4Var);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
