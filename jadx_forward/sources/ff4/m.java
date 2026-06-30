package ff4;

/* loaded from: classes4.dex */
public final class m extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.LinkedList f343236h = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f343237d;

    /* renamed from: e, reason: collision with root package name */
    public final ff4.l f343238e = new ff4.l(this);

    /* renamed from: f, reason: collision with root package name */
    public final int f343239f = 10;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f343240g;

    public m(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jf6();
        lVar.f152198b = new r45.kf6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmstorysync";
        lVar.f152200d = 513;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f343237d = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
        ((r45.jf6) fVar).f459320d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        byte[] a17 = w11.c2.f523524a.a();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(a17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f343237d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
        ((r45.jf6) fVar).f459321e = cu5Var;
        this.f343240g = callback;
        return mo9409x10f9447a(dispatcher, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 513;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f343240g;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f343237d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
        r45.kf6 kf6Var = (r45.kf6) fVar;
        r45.c50 c50Var = kf6Var.f460197d;
        java.util.LinkedList linkedList = c50Var != null ? c50Var.f452828e : null;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        if (linkedList.size() > 0) {
            ff4.l lVar = this.f343238e;
            lVar.getClass();
            lVar.f343234a = linkedList;
            lVar.f343235b.mo50305x3d8a09a2(0);
            return;
        }
        r45.cu5 cu5Var = kf6Var.f460199f;
        if (cu5Var != null && (gVar = cu5Var.f453374f) != null) {
            byte[] g17 = gVar.g();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
            byte[] c17 = o45.qi.c(((r45.jf6) fVar2).f459321e.f453374f.g(), g17);
            if (c17 != null) {
                if (!(c17.length == 0)) {
                    w11.c2.f523524a.d(c17, true);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f343240g;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return this.f343239f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
