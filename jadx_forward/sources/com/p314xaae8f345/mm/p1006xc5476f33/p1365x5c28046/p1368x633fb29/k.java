package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f179101d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f179102e;

    /* renamed from: f, reason: collision with root package name */
    public int f179103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l f179104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f179104g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.k(this.f179104g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f179103f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l lVar2 = this.f179104g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                android.content.Context context = lVar2.f179105a;
                lVar2.f179109e = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), lVar2.f179105a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572116z4), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.j(lVar2));
                it = lVar2.f179106b.iterator();
                lVar = lVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.f179102e;
                lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.l) this.f179101d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                this.f179101d = lVar;
                this.f179102e = it;
                this.f179103f = 1;
                if (lVar.a(str, this) == aVar) {
                    return aVar;
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = lVar2.f179109e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = lVar2.f179109e;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        return jz5.f0.f384359a;
    }
}
