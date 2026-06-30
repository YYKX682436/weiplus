package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f197034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f197035e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f197036f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f197037g;

    /* renamed from: h, reason: collision with root package name */
    public int f197038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 f197039i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f197040m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197041n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f197039i = j1Var;
        this.f197040m = h0Var;
        this.f197041n = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.f1(this.f197039i, this.f197040m, this.f197041n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.f1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1 j1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f197038h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j1Var = this.f197039i;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = j1Var.f197110j;
            this.f197034d = dVar2;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f197040m;
            this.f197035e = h0Var2;
            this.f197036f = j1Var;
            java.lang.String str2 = this.f197041n;
            this.f197037g = str2;
            this.f197038h = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            str = str2;
            dVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f197037g;
            j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) this.f197036f;
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f197035e;
            dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f197034d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        try {
            h0Var.f391656d = ((java.util.LinkedHashMap) j1Var.f197109i).getOrDefault(str, null);
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            throw th6;
        }
    }
}
