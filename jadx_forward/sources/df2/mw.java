package df2;

/* loaded from: classes3.dex */
public final class mw extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f312346m;

    /* renamed from: n, reason: collision with root package name */
    public int f312347n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312346m = jz5.h.b(df2.lw.f312256d);
        this.f312347n = -1;
    }

    public final boolean Z6() {
        return ((java.lang.Boolean) ((jz5.n) this.f312346m).mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        hn0.r rVar;
        kn0.g gVar;
        java.lang.Object obj;
        kn0.g gVar2;
        kn0.g gVar3;
        r45.ka4 ka4Var;
        kn0.p pVar;
        super.mo14866x804e7f00();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, enableMiniWindowLowBitrate=" + Z6());
        if (Z6()) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (r4Var.y1(getStore().getLiveRoomData())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for is anchor or assistant, isAnchor=" + r4Var.w1());
                return;
            }
            tn0.w0 Q6 = Q6();
            if (((Q6 == null || (pVar = Q6.D) == null || !pVar.e()) ? false : true) == true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for audio mode");
                return;
            }
            if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f8()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for visitor only audio");
                return;
            }
            kn0.i iVar = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410523t;
            jz5.f0 f0Var = null;
            r7 = null;
            r7 = null;
            java.lang.Integer num = null;
            f0Var = null;
            java.util.LinkedList linkedList = (iVar == null || (gVar3 = iVar.f391091b) == null || (ka4Var = gVar3.f391081o) == null) ? null : ka4Var.f460093z1;
            if ((linkedList != null && linkedList.contains(1)) != true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSwitchToLowBitrateStream: source=onFloatMode, return for server switch close, svrSwitchList=");
                sb6.append(linkedList != null ? kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", sb6.toString());
                return;
            }
            if (((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).g7() || ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).b7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for voice room live");
                return;
            }
            if (!((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).E7()) {
                tn0.w0 Q62 = Q6();
                if ((Q62 != null && Q62.X()) == false) {
                    if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).P6() != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for audienceMode=" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).P6());
                        return;
                    }
                    if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for no network");
                        return;
                    }
                    xn0.i.f536957d.getClass();
                    xn0.e eVar = xn0.i.f536958e;
                    if (eVar.compareTo(xn0.e.f536948i) >= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for poor network, netQuality=" + eVar);
                        return;
                    }
                    tn0.w0 Q63 = Q6();
                    co0.s sVar = Q63 instanceof co0.s ? (co0.s) Q63 : null;
                    if (sVar != null && (rVar = sVar.R1) != null) {
                        if (!rVar.h()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for is not playing");
                            return;
                        }
                        int i17 = rVar.f363946e;
                        kn0.i iVar2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410523t;
                        int d17 = (iVar2 == null || (gVar2 = iVar2.f391091b) == null) ? 0 : gVar2.d(i17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, current qualityCfg=" + i17 + ", videoQualityLevel=" + d17 + ", netQuality=" + eVar);
                        if (d17 > 3) {
                            kn0.i iVar3 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410523t;
                            if (iVar3 != null && (gVar = iVar3.f391091b) != null) {
                                java.util.Set entrySet = gVar.f391077k.entrySet();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                                java.util.Iterator it = entrySet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it.next();
                                        if ((((kn0.r) ((java.util.Map.Entry) obj).getValue()).f391130b == 3) != false) {
                                            break;
                                        }
                                    }
                                }
                                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                                if (entry != null) {
                                    num = (java.lang.Integer) entry.getKey();
                                }
                            }
                            if (num == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, can not get HD quality url");
                                return;
                            }
                            boolean m17 = hn0.r.m(rVar, num.intValue(), null, false, ((je2.z) m56788xbba4bfc0(je2.z.class)).P6(), 6, null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, switchSuccess=" + m17);
                            if (m17) {
                                this.f312347n = i17;
                            }
                        }
                        f0Var = jz5.f0.f384359a;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: error, live core is null, source=onFloatMode");
                        return;
                    }
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "checkSwitchToLowBitrateStream: source=onFloatMode, return for link mic");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStartFromWindow */
    public void mo14864x95cdef51() {
        hn0.r rVar;
        super.mo14864x95cdef51();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "onLiveStartFromWindow: enableMiniWindowLowBitrate=" + Z6() + ", qualityCfgBeforeMiniWindow=" + this.f312347n);
        if (!Z6() || this.f312347n <= -1) {
            return;
        }
        tn0.w0 Q6 = Q6();
        java.lang.Boolean bool = null;
        co0.s sVar = Q6 instanceof co0.s ? (co0.s) Q6 : null;
        if (sVar != null && (rVar = sVar.R1) != null) {
            bool = java.lang.Boolean.valueOf(hn0.r.m(rVar, this.f312347n, null, false, ((je2.z) m56788xbba4bfc0(je2.z.class)).P6(), 6, null));
        }
        this.f312347n = -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorLowBitrateController", "onLiveStartFromWindow: switch back quality, switchSuccess=" + bool);
    }
}
