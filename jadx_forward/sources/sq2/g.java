package sq2;

@j95.b
/* loaded from: classes2.dex */
public final class g extends i95.w implements ys5.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f492882d;

    /* renamed from: e, reason: collision with root package name */
    public long f492883e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f492884f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f492885g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f492886h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f492887i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f492888m;

    /* renamed from: n, reason: collision with root package name */
    public long f492889n;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ai(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq2.g.Ai(java.lang.String):boolean");
    }

    public boolean Bi() {
        r45.wo1 wo1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
        java.lang.Long l17 = null;
        r45.xs2 xs2Var = L0 != null ? L0.N : null;
        cq2.q qVar = cq2.q.f302961a;
        if (xs2Var != null && (wo1Var = (r45.wo1) xs2Var.m75936x14adae67(30)) != null) {
            l17 = java.lang.Long.valueOf(wo1Var.m75942xfb822ef2(1));
        }
        boolean z17 = l17 != null && pm0.v.A(l17.longValue(), (long) 1) && pm0.v.A(l17.longValue(), (long) 128);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", "isEnablePredict: isEnableRedDotPredict=" + z17 + " preloadControlFlag=" + l17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreloadImmediately enablePreloadImmediately=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", sb6.toString());
        return z17;
    }

    public void Di() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa2;
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f83117l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "notifyDataChange " + this.f492882d + " objectId: " + this.f492883e + " scene: " + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
        if (this.f492885g && this.f492882d == null) {
            nq2.d dVar = nq2.d.f420513a;
            r45.dd2 dd2Var = new r45.dd2();
            dd2Var.set(0, 88890);
            pq2.e c17 = dVar.c(dd2Var);
            if (c17 != null) {
                if (c17.f439126t == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c17.f439111d, "appendRelatedRecommendList relatedRecommendResponse = null");
                } else {
                    az2.w wVar = c17.f439114g;
                    java.util.List m56409x97891cf7 = (wVar == null || (c13924x37151faa2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) wVar.f97693d) == null) ? null : c13924x37151faa2.m56409x97891cf7();
                    java.util.ArrayList arrayList = m56409x97891cf7 instanceof java.util.ArrayList ? (java.util.ArrayList) m56409x97891cf7 : null;
                    cp2.m mVar = c17.f439126t;
                    java.util.List<so2.j5> m56409x97891cf72 = mVar != null ? mVar.m56409x97891cf7() : null;
                    if (arrayList == null || m56409x97891cf72 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c17.f439111d, "appendRelatedRecommendList list = null");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17.f439111d, "dataList:\n " + hc2.o0.p(arrayList) + " \n newList: \n " + hc2.o0.p(m56409x97891cf72));
                        java.util.Iterator it = arrayList.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            so2.j5 j5Var = (so2.j5) it.next();
                            if ((j5Var instanceof so2.h4) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.h4) j5Var).f491933d.m75945x2fec8307(1), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6n))) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                        if (!(valueOf.intValue() != -1)) {
                            valueOf = null;
                        }
                        int intValue = valueOf != null ? valueOf.intValue() : 0;
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        for (so2.j5 j5Var2 : m56409x97891cf72) {
                            java.util.Iterator it6 = arrayList.iterator();
                            int i18 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i18 = -1;
                                    break;
                                } else if (((so2.j5) it6.next()).d(j5Var2) == 0) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                            if (!(valueOf2.intValue() == -1)) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                valueOf2.intValue();
                                linkedList.add(j5Var2);
                            }
                        }
                        az2.w wVar2 = c17.f439114g;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa3 = wVar2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) wVar2.f97693d : null;
                        if (c13924x37151faa3 != null) {
                            cp2.m mVar2 = c17.f439126t;
                            c13924x37151faa3.m56421x73095078(mVar2 != null ? mVar2.getLastBuffer() : null);
                        }
                        java.lang.String str2 = c17.f439111d;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeInsertData startIndex = ");
                        sb6.append(intValue);
                        sb6.append(", incrementSize: ");
                        sb6.append(linkedList.size());
                        sb6.append(" lastBuffer = ");
                        az2.w wVar3 = c17.f439114g;
                        if (wVar3 != null && (c13924x37151faa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) wVar3.f97693d) != null) {
                            gVar = c13924x37151faa.getLastBuffer();
                        }
                        sb6.append(gVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                        arrayList.addAll(intValue + 1, linkedList);
                    }
                }
            }
        } else if (this.f492882d != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5511xb88a5c22 c5511xb88a5c22 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5511xb88a5c22();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa4 = this.f492882d;
            am.oc ocVar = c5511xb88a5c22.f135842g;
            ocVar.f89055c = c13924x37151faa4;
            ocVar.f89053a = this.f492883e;
            ocVar.f89054b = this.f492885g;
            c5511xb88a5c22.e();
            this.f492882d = null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "135") || this.f492885g) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5514x96186b10 c5514x96186b10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5514x96186b10();
            long j17 = this.f492883e;
            am.rc rcVar = c5514x96186b10.f135845g;
            rcVar.f89338a = j17;
            rcVar.f89339b = this.f492885g;
            c5514x96186b10.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01a3, code lost:
    
        if (r14 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01b6, code lost:
    
        if (r6.i() != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0321 A[EDGE_INSN: B:375:0x0321->B:376:0x0321 BREAK  A[LOOP:1: B:366:0x0301->B:393:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:? A[LOOP:1: B:366:0x0301->B:393:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0911  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(ys5.e r50, float r51, ws5.h r52) {
        /*
            Method dump skipped, instructions count: 2798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq2.g.wi(ys5.e, float, ws5.h):void");
    }
}
