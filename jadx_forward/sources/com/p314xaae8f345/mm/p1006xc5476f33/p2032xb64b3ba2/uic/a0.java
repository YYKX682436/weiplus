package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f239869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 f239870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f239870e = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a0(this.f239870e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var;
        px3.j jVar;
        java.lang.Object a17;
        px3.j jVar2;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f239869d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0 b0Var2 = this.f239870e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                if (!b0Var2.f239877e) {
                    px3.j jVar3 = b0Var2.f239879g;
                    if (jVar3 != null) {
                        jVar3.N6(b0Var2.f239878f);
                    }
                    return f0Var;
                }
                ux3.d dVar = new ux3.d(b0Var2.f239876d);
                this.f239869d = 1;
                b0Var = b0Var2;
                b0Var2 = null;
                try {
                    a17 = rm0.h.a(dVar, 0L, null, this, 3, null);
                    if (a17 == aVar) {
                        return aVar;
                    }
                } catch (rm0.j e17) {
                    e = e17;
                    b0Var.f239877e = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneExclusiveDataUIC", "GetAllFriendRingBackCgi failed: " + e.f478959g);
                    if (b0Var.f239876d == -1 && (jVar = b0Var.f239879g) != null) {
                        jVar.f440487i = p3325xe03a0797.p3326xc267989b.l.d(jVar.f440483e, null, null, new px3.g(jVar, null), 3, null);
                    }
                    px3.j jVar4 = b0Var.f239879g;
                    if (jVar4 != null) {
                        jVar4.N6(b0Var.f239878f);
                    }
                    return f0Var;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                a17 = obj;
                b0Var = b0Var2;
            }
            t45.k kVar = (t45.k) a17;
            b0Var.f239876d = -1L;
            b0Var.f239877e = kVar.f497128d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList<t45.i> Infos = kVar.f497129e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Infos, "Infos");
            for (t45.i iVar : Infos) {
                long j17 = b0Var.f239876d;
                if (j17 == -1 || j17 > iVar.f497124g) {
                    b0Var.f239876d = iVar.f497124g;
                }
                java.lang.String str = iVar.f497121d;
                if (str != null) {
                    vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
                    if ((x3Var == null || (Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi()) == null || (n17 = Bi.n(str, true)) == null) ? false : n17.r2()) {
                        java.util.ArrayList arrayList2 = b0Var.f239878f;
                        if (!arrayList2.contains(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneExclusiveDataUIC", "ringtone username is ".concat(str));
                            arrayList2.add(str);
                            arrayList.add(new ox3.a(iVar));
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneExclusiveDataUIC", str.concat(" is not you friend"));
                }
            }
            px3.j jVar5 = b0Var.f239879g;
            if (jVar5 != null) {
                jVar5.f440487i = p3325xe03a0797.p3326xc267989b.l.d(jVar5.f440483e, null, null, new px3.d(jVar5, arrayList, null), 3, null);
            }
            if (!b0Var.f239877e && (jVar2 = b0Var.f239879g) != null) {
                jVar2.N6(b0Var.f239878f);
            }
            return f0Var;
        } catch (rm0.j e18) {
            e = e18;
            b0Var = b0Var2;
        }
    }
}
