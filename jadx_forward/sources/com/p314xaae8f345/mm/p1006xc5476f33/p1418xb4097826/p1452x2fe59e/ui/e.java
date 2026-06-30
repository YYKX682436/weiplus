package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f191493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f191494e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.e(this.f191494e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f191493d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g92.b bVar = g92.b.f351302e;
            this.f191493d = 1;
            x17 = bVar.x1(2, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(x17)) {
            g92.b bVar2 = g92.b.f351302e;
            java.lang.String str = this.f191494e;
            m92.b j37 = g92.a.j3(bVar2, str, false, 2, null);
            r45.d1 d1Var = j37 != null ? (r45.d1) j37.u0().m75936x14adae67(9) : null;
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            if (b6Var != null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d(((c61.l7) b6Var).ll(), str, d1Var));
            }
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(x17) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountManagementUI", "openFromJsApi awaitCgiFinderUsersPrepare failed");
        }
        return jz5.f0.f384359a;
    }
}
