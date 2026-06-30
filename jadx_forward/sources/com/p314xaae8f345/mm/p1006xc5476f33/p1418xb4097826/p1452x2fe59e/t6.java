package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f190573d;

    /* renamed from: e, reason: collision with root package name */
    public int f190574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f190576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f190575f = a7Var;
        this.f190576g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t6(this.f190575f, this.f190576g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Integer num;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82798x4905e9fa;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f190574e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190575f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yw2.a0 a0Var = a7Var.f187749o;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a0Var == null || (m82798x4905e9fa = a0Var.k().m82798x4905e9fa()) == null) ? null : m82798x4905e9fa.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            java.lang.Integer num2 = c1162x665295de != null ? new java.lang.Integer(c1162x665295de.y()) : null;
            if (num2 == null || num2.intValue() == -1) {
                return java.lang.Boolean.TRUE;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s6 s6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s6(a7Var, this.f190576g, null);
            this.f190573d = num2;
            this.f190574e = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, s6Var, this);
            if (obj == aVar) {
                return aVar;
            }
            num = num2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (java.lang.Integer) this.f190573d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0 && intValue < a7Var.f187743g.f190002d.size()) {
            return java.lang.Boolean.valueOf(num.intValue() < intValue);
        }
        return java.lang.Boolean.TRUE;
    }
}
