package s72;

/* loaded from: classes12.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f485624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.p0 f485625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s72.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485625e = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.m0(this.f485625e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Integer num;
        o72.r2 F;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f485624d;
        s72.p0 p0Var = this.f485625e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f485624d = 1;
            obj = p0Var.W6(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            p0Var.f485662o = false;
            p0Var.f485661n = false;
            return f0Var;
        }
        if (p0Var.f485661n) {
            if (p0Var.f485656f) {
                s72.l0 l0Var = p0Var.f485659i;
                if (l0Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[onPinOnTopItemNotExists]");
                    s72.p0 p0Var2 = l0Var.f485620a;
                    if (p0Var2.f485663p != null) {
                        iz4.r b17 = mz4.b0.c().b();
                        num = java.lang.Integer.valueOf((b17 == null || (F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(b17.f377673e)) == null || !((s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).T6(F)) ? -1 : F.f67643xc8a07680);
                    } else {
                        num = null;
                    }
                    if (num == null || num.intValue() == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "no local on top item found, banner is empty.");
                        p0Var2.Z6();
                        p0Var2.f485657g = -1;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "try to sync local on top item to the server, favId = " + num + '.');
                        int intValue = num.intValue();
                        p0Var2.f485657g = intValue;
                        p0Var2.Y6(intValue, true, null);
                    }
                    p0Var2.f485661n = false;
                }
            } else {
                s72.l0 l0Var2 = p0Var.f485659i;
                if (l0Var2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[onGetPinOnTopItemSuccess]");
                    o72.k4 oj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
                    s72.p0 p0Var3 = l0Var2.f485620a;
                    o72.r2 re6 = oj6.re(p0Var3.f485657g);
                    if (re6 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "set current on top item favId = " + p0Var3.f485657g);
                        if (!p0Var3.U6()) {
                            p0Var3.a7();
                        } else if (p0Var3.T6(re6)) {
                            p0Var3.a7();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "detect an invalid favid, remove local top item.");
                            p0Var3.Z6();
                            p0Var3.f485657g = -1;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "favorites note does not show up in local storage, try pulling...");
                        ((s72.j0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(1, 9, new s72.k0(p0Var3));
                    }
                    p0Var3.f485661n = false;
                }
            }
        } else if (p0Var.f485662o) {
            if (p0Var.f485656f) {
                p0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[processCancelOnTopRequestAndReset]");
                o72.o5 o5Var = p0Var.f485665r;
                if (o5Var != null) {
                    o5Var.mo74990xb9724478();
                    p0Var.f485665r = null;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetPinOnTopService", "cancelPinCallback is null");
                }
            } else {
                p0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[processOnTopRequestAndReset]");
                o72.o5 o5Var2 = p0Var.f485664q;
                if (o5Var2 != null) {
                    o5Var2.mo74990xb9724478();
                    p0Var.f485664q = null;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetPinOnTopService", "pinCallback is null");
                }
            }
        } else if (p0Var.f485656f) {
            p0Var.Z6();
        } else {
            p0Var.a7();
        }
        p0Var.f485662o = false;
        return f0Var;
    }
}
