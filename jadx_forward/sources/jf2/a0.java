package jf2;

/* loaded from: classes3.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f380887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f380888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f380889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str, jf2.k0 k0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f380887d = str;
        this.f380888e = k0Var;
        this.f380889f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jf2.a0(this.f380887d, this.f380888e, this.f380889f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jf2.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var;
        el2.u2 u2Var;
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var2;
        el2.u2 u2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var3;
        el2.u2 u2Var3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] enter");
        jf2.k0 k0Var = this.f380888e;
        java.lang.String str = this.f380887d;
        java.util.LinkedList linkedList = k0Var.f380914p;
        java.lang.String Z6 = k0Var.Z6(linkedList);
        linkedList.clear();
        java.util.LinkedList linkedList2 = k0Var.f380913o;
        java.util.ArrayList<jf2.o> arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            jf2.o oVar = (jf2.o) next;
            if ((oVar.i() || ((java.lang.Boolean) ae2.in.Y6.r()).booleanValue()) && re2.b.a(oVar.mo57989x368f3a())) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            for (jf2.o oVar2 : arrayList) {
                java.util.LinkedList linkedList5 = k0Var.f380911m;
                if (linkedList5 != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList5.indexOf(java.lang.Integer.valueOf(oVar2.mo57989x368f3a())));
                    if (!(valueOf.intValue() != -1)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        valueOf.intValue();
                        linkedList3.add(oVar2);
                    }
                }
                linkedList4.add(oVar2);
            }
            if (linkedList3.size() > 1) {
                kz5.g0.t(linkedList3, new jf2.d0(k0Var));
            }
            linkedList.addAll(linkedList3);
            if (linkedList4.size() > 1) {
                kz5.g0.t(linkedList4, new jf2.e0(k0Var));
            }
            linkedList.addAll(linkedList4);
        }
        java.lang.String Z62 = k0Var.Z6(linkedList);
        boolean z18 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Z6, Z62);
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[initBtnList-" + str + "] visibleEntranceBtnList oldMd5 = " + Z6 + ", newMd5 = " + Z62);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z18 && !this.f380889f) {
            return f0Var;
        }
        if (((mm2.e0) this.f380888e.m56788xbba4bfc0(mm2.e0.class)).P6() && ((mm2.g0) this.f380888e.m56788xbba4bfc0(mm2.g0.class)).U6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] in box now, return");
            return f0Var;
        }
        jf2.k0 k0Var2 = this.f380888e;
        java.util.LinkedList linkedList6 = k0Var2.f380913o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList6) {
            jf2.o oVar3 = (jf2.o) obj2;
            if ((oVar3.i() && re2.b.a(oVar3.mo57989x368f3a())) ? false : true) {
                arrayList2.add(obj2);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[checkUnableEntrances] unable list = ".concat(k0Var2.Z6(arrayList2)));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((jf2.o) it6.next()).g();
            }
        }
        mm2.n0 n0Var = (mm2.n0) this.f380888e.m56788xbba4bfc0(mm2.n0.class);
        boolean z19 = n0Var != null && n0Var.f410806r;
        boolean z27 = ((mm2.c1) this.f380888e.m56788xbba4bfc0(mm2.c1.class)).T;
        boolean z28 = z19 || z27;
        int size = this.f380888e.f380914p.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] visibleEntranceCnt = " + size + ", isCoLiveInvitee = " + z19 + ", isAssistant = " + z27);
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] visibleEntranceBtnList is 0, return");
            jf2.k0 k0Var3 = this.f380888e;
            k0Var3.f380917s.mo7808x76db6cb1(new java.lang.Integer(i65.a.f(k0Var3.O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561202c6)));
            if (z28) {
                this.f380888e.f380918t.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            }
            return f0Var;
        }
        jf2.k0 k0Var4 = this.f380888e;
        java.lang.String str2 = this.f380887d;
        java.util.LinkedList linkedList7 = k0Var4.f380914p;
        int size2 = linkedList7.size();
        int i27 = ((java.lang.Boolean) ae2.in.f85229a7.r()).booleanValue() ? 3 : ((java.lang.Boolean) ae2.in.f85269e7.r()).booleanValue() ? 2 : 0;
        if (i27 > 0) {
            int min = java.lang.Math.min(i27, size2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + str2 + "] switchExpectCount = " + i27 + ", outCnt = " + min);
            lVar = new jz5.l(java.lang.Integer.valueOf(java.lang.Math.max(0, size2 - min)), java.lang.Integer.valueOf(min));
        } else {
            java.util.Iterator it7 = linkedList7.iterator();
            int i28 = 0;
            while (it7.hasNext()) {
                i28 += k0Var4.e7((jf2.o) it7.next());
            }
            int b76 = i28 + (k0Var4.b7() * size2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + str2 + "] totalNeedMinWidth = " + b76);
            if (b76 <= k0Var4.c7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + str2 + "] totalNeedMinWidth <= MAX_ENTRANCE_AREA_WIDTH");
                i18 = size2;
                i19 = 0;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + str2 + "] totalNeedMinWidth > MAX_ENTRANCE_AREA_WIDTH");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar3 = k0Var4.f372632e;
                java.lang.Integer valueOf2 = (ubVar3 == null || (ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) ubVar3.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class)) == null || (u2Var = ag0Var.f193412J) == null) ? null : java.lang.Integer.valueOf(k0Var4.e7(u2Var));
                if (valueOf2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + str2 + "] foldEntranceWidth is null, why?");
                }
                int c76 = k0Var4.c7() - ((valueOf2 != null ? valueOf2.intValue() : 0) + k0Var4.b7());
                java.util.Iterator it8 = linkedList7.iterator();
                int i29 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    int e76 = k0Var4.e7((jf2.o) it8.next()) + k0Var4.b7();
                    if (e76 > c76) {
                        z17 = true;
                    } else {
                        c76 -= e76;
                        z17 = false;
                    }
                    if (z17) {
                        i17 = i29;
                        break;
                    }
                    i29++;
                }
                i18 = i17 + 1;
                i19 = size2 - i17;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        }
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] finalOutCnt = " + ((java.lang.Number) lVar.f384367e).intValue() + ", foldedCnt = " + intValue);
        this.f380888e.f380915q.clear();
        java.util.List<jf2.o> L0 = kz5.n0.L0(this.f380888e.f380914p, intValue);
        jf2.k0 k0Var5 = this.f380888e;
        for (jf2.o oVar4 : L0) {
            if (oVar4 instanceof jf2.k) {
                oVar4.g();
            } else {
                k0Var5.f380915q.add(oVar4);
            }
        }
        jf2.k0 k0Var6 = this.f380888e;
        java.util.LinkedList linkedList8 = k0Var6.f380915q;
        if (linkedList8.size() > 1) {
            kz5.g0.t(linkedList8, new jf2.z(k0Var6));
        }
        this.f380888e.f380916r.clear();
        jf2.k0 k0Var7 = this.f380888e;
        java.util.LinkedList linkedList9 = k0Var7.f380916r;
        java.util.LinkedList linkedList10 = k0Var7.f380914p;
        int i37 = size - intValue;
        if (i37 < 0) {
            i37 = 0;
        }
        linkedList9.addAll(kz5.n0.K0(linkedList10, i37));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[calculateFoldedState-");
        sb6.append(this.f380887d);
        sb6.append("] outer:[");
        jf2.k0 k0Var8 = this.f380888e;
        sb6.append(k0Var8.Z6(k0Var8.f380916r));
        sb6.append("], folded:[");
        jf2.k0 k0Var9 = this.f380888e;
        sb6.append(k0Var9.Z6(k0Var9.f380915q));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", sb6.toString());
        if (this.f380888e.f380915q.size() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] foldedEntranceBtnList.size = 1");
            jf2.o oVar5 = (jf2.o) kz5.n0.k0(this.f380888e.f380915q);
            if (oVar5 != null) {
                this.f380888e.f380916r.add(oVar5);
            }
            this.f380888e.f380915q.clear();
        }
        jf2.k0 k0Var10 = this.f380888e;
        boolean z29 = !k0Var10.f380915q.isEmpty();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int e77 = (!z29 || (ubVar2 = k0Var10.f372632e) == null || (ag0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) ubVar2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class)) == null || (u2Var3 = ag0Var3.f193412J) == null) ? 0 : k0Var10.e7(u2Var3) + k0Var10.b7();
        java.util.LinkedList<jf2.o> linkedList11 = k0Var10.f380916r;
        java.util.Iterator it9 = linkedList11.iterator();
        int i38 = 0;
        while (it9.hasNext()) {
            i38 += k0Var10.e7((jf2.o) it9.next());
        }
        int c77 = k0Var10.c7() - ((i38 + (linkedList11.size() * k0Var10.b7())) + e77);
        for (jf2.o oVar6 : linkedList11) {
            xt2.n6 n6Var = xt2.n6.f538446e;
            int x17 = oVar6.x(n6Var, k0Var10.O6()) - k0Var10.e7(oVar6);
            if (x17 <= 0) {
                linkedHashMap.put(java.lang.Integer.valueOf(oVar6.mo57989x368f3a()), xt2.n6.f538445d);
            } else if (c77 >= x17) {
                c77 -= x17;
                linkedHashMap.put(java.lang.Integer.valueOf(oVar6.mo57989x368f3a()), n6Var);
            } else {
                linkedHashMap.put(java.lang.Integer.valueOf(oVar6.mo57989x368f3a()), xt2.n6.f538445d);
            }
        }
        for (jf2.o oVar7 : this.f380888e.f380916r) {
            xt2.n6 n6Var2 = (xt2.n6) linkedHashMap.get(new java.lang.Integer(oVar7.mo57989x368f3a()));
            if (n6Var2 == null) {
                n6Var2 = xt2.n6.f538445d;
            }
            oVar7.b();
            oVar7.v(n6Var2);
        }
        jf2.k0 k0Var11 = this.f380888e;
        k0Var11.f380918t.mo7808x76db6cb1(java.lang.Boolean.valueOf(z28 || (k0Var11.f380915q.isEmpty() ^ true)));
        java.util.Iterator it10 = this.f380888e.f380915q.iterator();
        while (it10.hasNext()) {
            ((jf2.o) it10.next()).g();
        }
        if (!this.f380888e.U6()) {
            jf2.k0 k0Var12 = this.f380888e;
            int e78 = (!(k0Var12.f380915q.isEmpty() ^ true) || (ubVar = k0Var12.f372632e) == null || (ag0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class)) == null || (u2Var2 = ag0Var2.f193412J) == null) ? 0 : k0Var12.e7(u2Var2) + k0Var12.b7();
            int i39 = 0;
            for (jf2.o oVar8 : k0Var12.f380916r) {
                i39 += oVar8.x(oVar8.D(), k0Var12.O6()) + k0Var12.b7();
            }
            int i47 = i39 + e78;
            int d76 = (this.f380888e.d7() - ((java.lang.Number) ((jz5.n) this.f380888e.f380921w).mo141623x754a37bb()).intValue()) - i47;
            int f17 = i65.a.f(this.f380888e.O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561202c6);
            if (d76 <= f17) {
                f17 = d76;
            }
            int f18 = i65.a.f(this.f380888e.O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
            if (f17 < f18) {
                f17 = f18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + this.f380887d + "] outerEntranceTotalWidth = " + i47 + ", targetInputWidth = " + d76 + ", max = " + i65.a.f(this.f380888e.O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561202c6) + ", min = " + i65.a.f(this.f380888e.O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br) + ", final-inputWidth = " + f17);
            this.f380888e.f380917s.mo7808x76db6cb1(new java.lang.Integer(f17));
        }
        ((mm2.c1) this.f380888e.m56788xbba4bfc0(mm2.c1.class)).K2.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        return f0Var;
    }
}
