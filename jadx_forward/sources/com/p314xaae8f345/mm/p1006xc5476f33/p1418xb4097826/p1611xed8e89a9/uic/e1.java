package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f205182d;

    /* renamed from: e, reason: collision with root package name */
    public int f205183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 f205184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ob1 f205185g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 c14881xed239a47, r45.ob1 ob1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f205184f = c14881xed239a47;
        this.f205185g = ob1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.e1(this.f205184f, this.f205185g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int size;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f205183e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 c14881xed239a47 = this.f205184f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            size = c14881xed239a47.T6().size();
            java.lang.Integer num = (java.lang.Integer) ((jz5.n) c14881xed239a47.f204956p).mo141623x754a37bb();
            int intValue = num != null ? num.intValue() : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar = c14881xed239a47.f204949f;
            sVar.c(intValue);
            sVar.f298197b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14881xed239a47.m58635x6c03c64c(), (java.lang.String) ((jz5.n) c14881xed239a47.f204955o).mo141623x754a37bb()) || bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2528x5c28046.C20136x4a0ec496()) == 1;
            this.f205182d = size;
            this.f205183e = 1;
            if (sVar.e(this) == aVar) {
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
            size = this.f205182d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d1(c14881xed239a47, this.f205185g, size, null);
        this.f205183e = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, d1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
