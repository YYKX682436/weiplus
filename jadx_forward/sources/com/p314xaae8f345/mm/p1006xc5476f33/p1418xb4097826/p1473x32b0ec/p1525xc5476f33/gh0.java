package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gh0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f194233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 f194234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 f194235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 eh0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194234e = th0Var;
        this.f194235f = eh0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gh0(this.f194234e, this.f194235f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gh0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f194233d;
        java.lang.Object obj2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.th0 th0Var = this.f194234e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fh0 fh0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fh0(th0Var, null);
            this.f194233d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, fh0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) lVar.f384367e).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", "haveJoinFansClub success:" + booleanValue + ", needPurcase:" + booleanValue2);
        if (booleanValue) {
            mm2.n2 n2Var = (mm2.n2) th0Var.P0(mm2.n2.class);
            dm.o4 o4Var = ((mm2.n2) th0Var.P0(mm2.n2.class)).f410815m;
            if (o4Var == null) {
                dk2.u7 u7Var = dk2.u7.f315714a;
                java.util.Iterator it = dk2.u7.f315718e.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (pm0.v.z(((ce2.i) next).f67799x225ba391, 4)) {
                        obj2 = next;
                        break;
                    }
                }
                o4Var = (dm.o4) obj2;
            }
            n2Var.P6(o4Var);
            boolean x07 = th0Var.x0();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showInvitePanel isLand:");
            sb6.append(x07);
            sb6.append(",needPurcase:");
            sb6.append(booleanValue2);
            sb6.append(",fromScene:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 eh0Var = this.f194235f;
            sb6.append(eh0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorFansClubPanelPlugin", sb6.toString());
            if (x07) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("JOIN_FANS_CLUB_NEED_PURCHASE", booleanValue2);
                bundle.putInt("JOIN_FANS_CLUB_FROM_SCENE", eh0Var.f193956d);
                th0Var.p1("PORTRAIT_ACTION_JOIN_FANS_CLUB", bundle);
            } else {
                th0Var.w1();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 h1Var = th0Var.f195936q;
                if (h1Var != null) {
                    h1Var.e(th0Var.S0(), booleanValue2, eh0Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
