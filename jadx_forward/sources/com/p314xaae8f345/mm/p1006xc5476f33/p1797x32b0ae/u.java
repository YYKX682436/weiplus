package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f225820d;

    /* renamed from: e, reason: collision with root package name */
    public int f225821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f225822f = str;
        this.f225823g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.u(this.f225822f, this.f225823g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f225821e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "lite_app", ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).nj(), false, null, 24, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("appId", this.f225822f);
            this.f225820d = l1Var;
            this.f225821e = 1;
            if (l1Var.o("/", linkedHashMap, this) == aVar) {
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
            l1Var = (pi0.l1) this.f225820d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f225823g;
        this.f225820d = null;
        this.f225821e = 2;
        s17 = l1Var.s(context, c10716x931597c6, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
