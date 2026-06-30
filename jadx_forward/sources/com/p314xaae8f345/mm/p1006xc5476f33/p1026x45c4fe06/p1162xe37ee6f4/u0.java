package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes2.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f167669d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f167670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f167671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f167671f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.u0(this.f167671f, interfaceC29045xdcb5ca57);
        u0Var.f167670e = obj;
        return u0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f167669d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f167670e;
            java.util.List list = this.f167671f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.t0((java.lang.String) it6.next(), null), 2, null));
            }
            it = arrayList.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f167670e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.f1 f1Var = (p3325xe03a0797.p3326xc267989b.f1) it.next();
            this.f167670e = it;
            this.f167669d = 1;
            if (f1Var.k(this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
