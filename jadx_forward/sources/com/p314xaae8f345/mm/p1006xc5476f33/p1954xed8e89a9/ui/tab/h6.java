package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f235883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g f235884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 f235885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f235886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f235887h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g gVar, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 v1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f235884e = gVar;
        this.f235885f = v1Var;
        this.f235886g = m0Var;
        this.f235887h = c16892x4a36dc90;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.h6(this.f235884e, this.f235885f, this.f235886g, this.f235887h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.h6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f235883d;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactWidgetTabBizInfo", e17, "[PhotoAccountGuide] refresh failed", new java.lang.Object[0]);
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f6(this.f235884e, this.f235885f, null);
            this.f235883d = 1;
            obj = p3325xe03a0797.p3326xc267989b.z0.f(f6Var, this);
            if (obj == aVar) {
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u4 u4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u4) obj;
        int i18 = u4Var.f236142a;
        boolean z17 = u4Var.f236143b;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.w1 w1Var = u4Var.f236144c;
        boolean z18 = u4Var.f236145d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.g6 g6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.g6(i18, this.f235886g, z17, w1Var, z18, this.f235887h, null);
        this.f235883d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, g6Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
