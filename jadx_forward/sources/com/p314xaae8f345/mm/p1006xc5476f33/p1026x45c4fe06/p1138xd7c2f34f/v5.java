package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f166789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f166791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 f166792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f166793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f166794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(java.lang.String str, yz5.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var, int i17, r45.y50 y50Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f166790e = str;
        this.f166791f = qVar;
        this.f166792g = z6Var;
        this.f166793h = i17;
        this.f166794i = y50Var;
        this.f166795m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v5(this.f166790e, this.f166791f, this.f166792g, this.f166793h, this.f166794i, this.f166795m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f166789d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = this.f166792g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.jf jfVar = new r45.jf();
                int i18 = this.f166793h;
                r45.y50 y50Var = this.f166794i;
                jfVar.f459308d.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a.b(z6Var));
                jfVar.f459309e = i18;
                jfVar.f459310f = y50Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t(jfVar, this.f166790e);
                this.f166789d = 1;
                obj = rm0.h.a(tVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            yz5.l lVar = this.f166795m;
            r45.me3[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r4.a((r45.kf) obj, z6Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            lVar.mo146xb9724478(a17);
        } catch (rm0.j e17) {
            this.f166791f.mo147xb9724478(new java.lang.Integer(e17.f478957e), new java.lang.Integer(e17.f478958f), e17.f478959g);
        }
        return jz5.f0.f384359a;
    }
}
