package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes15.dex */
public final class f9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f210659d;

    /* renamed from: e, reason: collision with root package name */
    public int f210660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f210661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f210662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f210661f = activityC15041xa4ea2f4;
        this.f210662g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f9(this.f210661f, this.f210662g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yl2.g1 g1Var;
        int i17;
        r45.j01 j01Var;
        r45.j01 j01Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f210660e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yl2.g1 g1Var2 = new yl2.g1(this.f210661f, 0, 0L, 6, null);
            this.f210659d = g1Var2;
            this.f210660e = 1;
            java.lang.Object n17 = g1Var2.n(this);
            if (n17 == aVar) {
                return aVar;
            }
            g1Var = g1Var2;
            obj = n17;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (yl2.g1) this.f210659d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        boolean c17 = g1Var.c(kVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4 = this.f210661f;
        if (c17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh2 user_flag:");
            sb6.append((kVar == null || (j01Var2 = kVar.f544569c) == null) ? null : new java.lang.Integer(j01Var2.f458972f));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pr prVar = activityC15041xa4ea2f4.f210140w;
            if (prVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("precheck");
                throw null;
            }
            if (kVar != null && (j01Var = kVar.f544569c) != null) {
                i17 = j01Var.f458972f;
            } else {
                if (prVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("precheck");
                    throw null;
                }
                i17 = prVar.f200941f;
            }
            prVar.f200941f = i17;
            if (prVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("precheck");
                throw null;
            }
            prVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pr prVar2 = activityC15041xa4ea2f4.f210140w;
            if (prVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("precheck");
                throw null;
            }
            prVar2.b();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "refreshResp2 failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pr prVar3 = activityC15041xa4ea2f4.f210140w;
            if (prVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("precheck");
                throw null;
            }
            prVar3.h(true, this.f210662g);
        }
        return jz5.f0.f384359a;
    }
}
