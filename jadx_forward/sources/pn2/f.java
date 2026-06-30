package pn2;

/* loaded from: classes3.dex */
public final class f extends ie2.b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f438524q;

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f438525r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f438526s;

    /* renamed from: t, reason: collision with root package name */
    public final pn2.c0 f438527t;

    /* renamed from: u, reason: collision with root package name */
    public pn2.a f438528u;

    /* renamed from: v, reason: collision with root package name */
    public pn2.c0 f438529v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f438530w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f438524q = statusMonitor;
        this.f438525r = p3325xe03a0797.p3326xc267989b.z0.b();
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f438528u = new pn2.s(context, S0(), statusMonitor);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372515p;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        pn2.c0 c0Var = new pn2.c0(false, root, c14179xd6e3454a, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, this.f438528u);
        this.f438527t = c0Var;
        this.f438529v = c0Var;
        pn2.a aVar = this.f438528u;
        if (aVar != null) {
            ((pn2.s) aVar).mo56536x3b13c504(c0Var);
        }
        if (statusMonitor.mo11219xd0598cf8() == 0) {
            android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566243f84);
            if (findViewById != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "finder_live_lottery_bubble");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 40, 25561);
            }
            android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.cjn);
            if (findViewById2 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById2, "finder_live_lottery_bubble");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById2, 8, 25561);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "enable :" + ((on2.z2) P0(on2.z2.class)).f428629q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3 != null ? r3.u() : null, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0 != null ? r0.u() : null, r22.f446856d) == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r23) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.f.C0(java.util.LinkedHashMap):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (k()) {
            if (x1()) {
                pn2.c0 c0Var = this.f438529v;
                android.view.View u17 = c0Var != null ? c0Var.u() : null;
                if (u17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(u17, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f194860i = i17;
                return;
            }
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                this.f446856d.setVisibility(8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveLotteryBubblePlugin", "setVisible return for isTeenMode");
                return;
            }
            android.view.View t17 = t1();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubblePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        super.K0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 7) {
            if (ordinal == 27) {
                pn2.a aVar = this.f438528u;
                if (aVar != null) {
                    ((pn2.s) aVar).mo979x3f5eee52();
                    return;
                }
                return;
            }
            if (ordinal == 147) {
                y1("FINDER_LIVE_LOTTERY_UPDATE");
                z1();
                return;
            }
            if (ordinal == 149) {
                w1();
                return;
            }
            if (ordinal != 187) {
                switch (ordinal) {
                    case 141:
                        y1("FINDER_LIVE_CREATE_LOTTERY_SUCCESS");
                        z1();
                        return;
                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                        y1("FINDER_LIVE_CANCEL_LOTTERY_SUCCESS");
                        z1();
                        return;
                    case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f428625m;
                        boolean z17 = zVar != null && zVar.f390762a == 4;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "FINDER_LIVE_LOTTERY_BUBBLE_SHOW  isCancel: " + z17 + " getVisible: " + w0() + " cacheVisibility:false,screenclear:" + ((mm2.c1) P0(mm2.c1.class)).N1);
                        y1("FINDER_LIVE_LOTTERY_BUBBLE_SHOW cacheVisibility:false");
                        if (w0() != 0 && !z17) {
                            K0(0);
                            pn2.c0 c0Var = this.f438529v;
                            if (c0Var != null) {
                                c0Var.z();
                            }
                        }
                        if (this.f438524q.mo11219xd0598cf8() == 0) {
                            km2.z zVar2 = ((on2.z2) P0(on2.z2.class)).f428625m;
                            r45.cz1 cz1Var = zVar2 != null ? zVar2.f390765d : null;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            if (cz1Var == null || (str = cz1Var.m75945x2fec8307(0)) == null) {
                                str = "";
                            }
                            jSONObject.put("lotteryid", str);
                            pn2.a aVar2 = this.f438528u;
                            jSONObject.put("is_flash_pic", (aVar2 == null || !((pn2.s) aVar2).i()) ? 0 : 1);
                            i95.m c17 = i95.n0.c(ml2.r0.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            ml2.r0.ek((ml2.r0) c17, ml2.p4.f409327e, "", null, 0, jSONObject, 12, null);
                            return;
                        }
                        return;
                    case 144:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "FINDER_LIVE_LOTTERY_BUBBLE_HIDE cacheVisibility:false,screenclear:" + ((mm2.c1) P0(mm2.c1.class)).N1);
                        y1("FINDER_LIVE_LOTTERY_BUBBLE_HIDE cacheVisibility:false");
                        K0(8);
                        pn2.c0 c0Var2 = this.f438529v;
                        if (c0Var2 != null) {
                            c0Var2.y();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
        if (((mm2.c1) P0(mm2.c1.class)).a8() && this.f438530w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "auto show lottery");
            pn2.a aVar3 = this.f438528u;
            if (aVar3 != null) {
                pn2.s sVar = (pn2.s) aVar3;
                zl2.r4 r4Var = zl2.r4.f555483a;
                gk2.e eVar = sVar.f438546e;
                android.content.Context context = sVar.f438545d;
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573359ec5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573357ec3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                if (r4Var.B(context, eVar, string, string2, new pn2.l(sVar))) {
                    return;
                }
                sVar.f();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        android.content.Intent intent;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unMount ");
        sb6.append(hashCode());
        sb6.append(" presenter is empty:");
        sb6.append(this.f438528u == null);
        sb6.append(",viewCallback is empty:");
        sb6.append(this.f438529v == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
        super.O0();
        pn2.a aVar = this.f438528u;
        if (aVar != null) {
            ((pn2.s) aVar).mo979x3f5eee52();
        }
        pn2.c0 c0Var = this.f438529v;
        if (c0Var != null) {
            c0Var.y();
        }
        K0(8);
        this.f438529v = null;
        gm0.j1.d().q(30, this);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f438526s;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (this.f438530w) {
            android.content.Context context = this.f446856d.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            this.f438530w = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void h1(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "#onSceneEnd MMFunc_FinderFollow,isFollow:" + z17);
        if (zl2.r4.f555483a.w1() || ((mm2.d) P0(mm2.d.class)).f410475f || !((mm2.d) P0(mm2.d.class)).N6()) {
            return;
        }
        w1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        if (valueOf != null && valueOf.intValue() == 30 && i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "#onSceneEnd MMFunc_VerifyUser");
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
            java.lang.Object obj = oVar != null ? oVar.f152244b.f152233a : null;
            r45.my6 my6Var = obj instanceof r45.my6 ? (r45.my6) obj : null;
            if (my6Var != null && ((mm2.d) P0(mm2.d.class)).f410475f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(my6Var.f462463d, ((mm2.d) P0(mm2.d.class)).f410476g)) {
                w1();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        if (zl2.r4.f555483a.w1() || !((mm2.c1) P0(mm2.c1.class)).a8()) {
            return;
        }
        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f428631s;
        boolean z17 = false;
        java.lang.String m75945x2fec8307 = (zVar == null || (cz1Var2 = zVar.f390765d) == null) ? null : cz1Var2.m75945x2fec8307(0);
        km2.z zVar2 = ((on2.z2) P0(on2.z2.class)).f428625m;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, (zVar2 == null || (cz1Var = zVar2.f390765d) == null) ? null : cz1Var.m75945x2fec8307(0))) {
            if (zVar2 != null && zVar2.f390762a == 1) {
                z17 = true;
            }
            if (z17) {
                v1();
                on2.z2 z2Var = (on2.z2) P0(on2.z2.class);
                z2Var.f428631s = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "resetCacheLotteryInfo:" + z2Var.f428631s);
            }
        }
    }

    public final void v1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = R0();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dot);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        R0.m57767xec04d9f6(string, com.p314xaae8f345.mm.R.raw.f80084xebd378da);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ek((ml2.r0) c17, ml2.p4.f409338s, null, null, 0, null, 28, null);
    }

    @Override // qo0.a
    public int w0() {
        android.view.View t17;
        if (!x1()) {
            return t1().getVisibility();
        }
        pn2.c0 c0Var = this.f438529v;
        if (c0Var == null || (t17 = c0Var.u()) == null) {
            t17 = t1();
        }
        return t17.getVisibility();
    }

    public final void w1() {
        r45.cz1 cz1Var;
        r45.xy1 xy1Var;
        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f428625m;
        java.lang.Integer valueOf = (zVar == null || (cz1Var = zVar.f390765d) == null || (xy1Var = (r45.xy1) cz1Var.m75936x14adae67(5)) == null) ? null : java.lang.Integer.valueOf(xy1Var.m75939xb282bd08(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition begin , lotteryAttendType: " + valueOf);
        if ((valueOf == null || valueOf.intValue() != 4) && ((valueOf == null || valueOf.intValue() != 5) && (valueOf == null || valueOf.intValue() != 6))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", "#finallyRequestAttendLotteryWithFollowOrReserveCondition Condition not invalid ");
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f438526s;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f438526s = p3325xe03a0797.p3326xc267989b.l.d(this.f438525r, null, null, new pn2.c(valueOf, this, null), 3, null);
    }

    public final boolean x1() {
        boolean z17;
        java.lang.Object obj;
        xh2.i iVar;
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null && cVar.f536066c == 1) {
            java.util.Iterator it = cVar.f536064a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj).b(), ((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n)) {
                    break;
                }
            }
            xh2.a aVar = (xh2.a) obj;
            if (aVar != null && (iVar = aVar.f536054b) != null && iVar.f536088g == 2) {
                z17 = true;
                return !z17 ? true : true;
            }
        }
        z17 = false;
        return !z17 ? true : true;
    }

    public final void y1(java.lang.String str) {
        km2.z zVar = ((on2.z2) P0(on2.z2.class)).f428625m;
        if ((zVar != null ? zVar.f390765d : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", str + " lotteryInfo is empty!");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        android.content.Intent intent;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mount ");
        sb6.append(hashCode());
        sb6.append(" presenter is empty:");
        sb6.append(this.f438528u == null);
        sb6.append(",viewCallback is empty:");
        sb6.append(this.f438529v == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
        super.z0();
        pn2.a aVar = this.f438528u;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (aVar == null || this.f438529v == null) {
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f438528u = new pn2.s(context, S0(), this.f438524q);
            android.view.ViewGroup viewGroup2 = this.f446856d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372515p;
            android.content.Context context2 = viewGroup2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f438529v = new pn2.c0(false, viewGroup2, c14179xd6e3454a, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, this.f438528u);
        }
        pn2.a aVar2 = this.f438528u;
        if (aVar2 != null) {
            pn2.c0 c0Var = this.f438529v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            ((pn2.s) aVar2).mo56536x3b13c504(c0Var);
        }
        gm0.j1.d().a(30, this);
        android.content.Context context3 = viewGroup.getContext();
        java.lang.Integer num = null;
        android.app.Activity activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            num = java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0));
        }
        if (num != null && num.intValue() == 12) {
            this.f438530w = true;
        }
    }

    public final void z1() {
        pm0.v.X(new pn2.e(this));
    }
}
