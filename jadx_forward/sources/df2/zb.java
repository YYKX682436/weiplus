package df2;

/* loaded from: classes10.dex */
public final class zb extends if2.b implements if2.e, tn0.x0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public final jz5.g D;
    public p3325xe03a0797.p3326xc267989b.r2 E;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313472m;

    /* renamed from: n, reason: collision with root package name */
    public final yd2.j f313473n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f313474o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f313475p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Float f313476q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ff1 f313477r;

    /* renamed from: s, reason: collision with root package name */
    public long f313478s;

    /* renamed from: t, reason: collision with root package name */
    public int f313479t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f313480u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f313481v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f313482w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f313483x;

    /* renamed from: y, reason: collision with root package name */
    public r45.ff1 f313484y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Set f313485z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313472m = "LiveAnchorAiAssistantBannerController";
        this.f313473n = new yd2.j();
        this.f313474o = new java.util.LinkedHashSet();
        this.f313475p = new java.util.ArrayList();
        this.f313483x = "";
        this.f313485z = new java.util.LinkedHashSet();
        this.D = jz5.h.b(new df2.sa(this));
    }

    public static final void Z6(df2.zb zbVar, java.lang.String str) {
        r45.w6 w6Var;
        r45.ff1 ff1Var = zbVar.f313477r;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((ff1Var == null || (w6Var = (r45.w6) ff1Var.m75936x14adae67(9)) == null) ? null : w6Var.m75945x2fec8307(0), str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar.f313472m, "[aiAssistant] revertFakeDialogOnFailure: sessionId=" + str + ", closing banner");
            zbVar.f313477r = null;
            zbVar.f313484y = null;
            zbVar.v7(false, null);
            zbVar.y7();
        }
    }

    public static final void a7(df2.zb zbVar, boolean z17) {
        zbVar.getClass();
        int i17 = z17 ? 0 : 8;
        android.view.View S6 = zbVar.S6(com.p314xaae8f345.mm.R.id.f564878sh3);
        if (S6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View S62 = zbVar.S6(com.p314xaae8f345.mm.R.id.ugh);
        if (S62 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(S62, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(S62, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View S63 = zbVar.S6(com.p314xaae8f345.mm.R.id.u4p);
        if (S63 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(S63, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S63.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(S63, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View S64 = zbVar.S6(com.p314xaae8f345.mm.R.id.uuv);
        if (S64 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(S64, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S64.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(S64, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View S65 = zbVar.S6(com.p314xaae8f345.mm.R.id.uv9);
        if (S65 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(S65, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S65.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(S65, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View S66 = zbVar.S6(com.p314xaae8f345.mm.R.id.vgd);
        if (S66 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(S66, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S66.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(S66, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View S67 = zbVar.S6(com.p314xaae8f345.mm.R.id.vgb);
        if (S67 == null) {
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
        arrayList7.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(S67, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S67.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(S67, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController", "updateTopAreaVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static /* synthetic */ void w7(df2.zb zbVar, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        zbVar.v7(z17, aVar);
    }

    public final int b7() {
        return java.lang.Math.min(com.p314xaae8f345.mm.ui.bl.b(O6()).x, com.p314xaae8f345.mm.ui.bl.b(O6()).y) - (i65.a.h(O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2);
    }

    public final yd2.b c7() {
        return new yd2.b(k7(), ((mm2.e1) getStore().getLiveRoomData().a(mm2.e1.class)).f410516m, "mock_session_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis(), "", ((mm2.c1) getStore().getLiveRoomData().a(mm2.c1.class)).f410385o);
    }

    public final boolean d7(r45.ff1 ff1Var, r45.ff1 ff1Var2) {
        if (ff1Var == null && ff1Var2 == null) {
            return true;
        }
        if (ff1Var == null || ff1Var2 == null) {
            return false;
        }
        java.lang.String m75945x2fec8307 = ff1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = ff1Var2.m75945x2fec8307(0);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, m75945x2fec83072 != null ? m75945x2fec83072 : "") && ff1Var.m75942xfb822ef2(1) == ff1Var2.m75942xfb822ef2(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0354, code lost:
    
        if (r6.C() > 0) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zb.e7():void");
    }

    public final void f7() {
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).N7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.ha(this, null), 2, null);
        }
    }

    public final android.widget.TextView g7() {
        return (android.widget.TextView) S6(com.p314xaae8f345.mm.R.id.f567106ua2);
    }

    @Override // tn0.x0
    public void h3(java.util.ArrayList userList) {
        java.lang.Integer num;
        java.lang.Object obj;
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userList, "userList");
        if (userList.isEmpty()) {
            return;
        }
        java.lang.String m86 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).m8();
        java.util.Iterator it = userList.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533) obj).f150090d, m86)) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533 c10829x94b03533 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533) obj;
        if (c10829x94b03533 != null) {
            intValue = c10829x94b03533.f150091e;
        } else {
            java.util.Iterator it6 = userList.iterator();
            if (it6.hasNext()) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533) it6.next()).f150091e);
                loop1: while (true) {
                    num = valueOf;
                    while (it6.hasNext()) {
                        valueOf = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p824x633fb29.C10829x94b03533) it6.next()).f150091e);
                        if (num.compareTo(valueOf) < 0) {
                            break;
                        }
                    }
                }
            }
            java.lang.Integer num2 = num;
            intValue = num2 != null ? num2.intValue() : 0;
        }
        float e17 = e06.p.e(intValue / 100.0f, 0.0f, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e h76 = h7();
        if (h76 != null) {
            h76.m57557x7189412a(e17);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e h7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e) S6(com.p314xaae8f345.mm.R.id.u_z);
    }

    public final android.view.View i7() {
        return S6(com.p314xaae8f345.mm.R.id.ubk);
    }

    public final long k7() {
        return ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x028e  */
    /* JADX WARN: Type inference failed for: r11v3, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [yd2.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l7(r45.ff1 r25, int r26) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zb.l7(r45.ff1, int):void");
    }

    public final boolean m7() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.u_y);
        return (S6 == null || (layoutParams = S6.getLayoutParams()) == null || layoutParams.width != b7()) ? false : true;
    }

    public final boolean n7() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85270e8).mo141623x754a37bb()).r()).intValue() == 1 || pm0.v.z(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410351i, 32);
    }

    public final void o7(java.lang.String source) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String concat = "[aiAssistant] onKWSWakeup: triggered, source=".concat(source);
        java.lang.String str3 = this.f313472m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, concat);
        if (!zl2.r4.f555483a.t1(getStore().getLiveRoomData())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[aiAssistant] onKWSWakeup: master switch OFF, ignore");
            return;
        }
        r45.ff1 ff1Var = this.f313477r;
        if (ff1Var != null && ff1Var.m75939xb282bd08(7) == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[aiAssistant] onKWSWakeup: already in voice dialog, skip client action");
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f313475p;
        r45.pa7 pa7Var = arrayList.isEmpty() ? null : (r45.pa7) arrayList.get(e06.p.j(e06.p.m(0, arrayList.size()), c06.e.f119249d));
        if (pa7Var == null || (str = pa7Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (pa7Var == null || (str2 = pa7Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.lang.String uuid = randomUUID != null ? randomUUID.toString() : null;
        java.lang.String str4 = uuid != null ? uuid : "";
        java.util.Set set = this.f313474o;
        set.add(str4);
        if (pa7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[aiAssistant] onKWSWakeup: no cached welcome, using fallback UI, empty welcomeId in request");
            r45.w6 w6Var = new r45.w6();
            w6Var.set(0, str4);
            w6Var.set(1, 1);
            w6Var.set(3, "正在听...");
            r45.ff1 ff1Var2 = new r45.ff1();
            ff1Var2.set(0, "mock_wakeup_" + java.lang.System.currentTimeMillis());
            ff1Var2.set(1, 0L);
            ff1Var2.set(2, "你好！我是你的AI助手麦麦，有什么可以帮你的？");
            ff1Var2.set(6, java.lang.Boolean.TRUE);
            ff1Var2.set(5, 12);
            ff1Var2.set(7, 5);
            ff1Var2.set(9, w6Var);
            l7(ff1Var2, 0);
            f7();
        } else {
            r45.w6 w6Var2 = new r45.w6();
            w6Var2.set(0, str4);
            w6Var2.set(3, "正在听...");
            r45.ff1 ff1Var3 = new r45.ff1();
            ff1Var3.set(0, str4);
            ff1Var3.set(1, 0L);
            ff1Var3.set(2, str);
            ff1Var3.set(6, java.lang.Boolean.TRUE);
            ff1Var3.set(5, 12);
            ff1Var3.set(7, 5);
            ff1Var3.set(9, w6Var2);
            l7(ff1Var3, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[aiAssistant] onKWSWakeup: welcome=" + str + ", welcome_id=" + str2 + ", sessionId=" + str4);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.we1 we1Var = new r45.we1();
        we1Var.set(0, 5);
        r45.jf1 jf1Var = new r45.jf1();
        jf1Var.set(0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        jf1Var.set(1, str2);
        jf1Var.set(2, str4);
        try {
            we1Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(jf1Var.mo14344x5f01b1f6()));
            linkedList.add(we1Var);
            r45.xe1 xe1Var = new r45.xe1();
            xe1Var.set(1, db2.t4.f309704a.a(12627));
            xe1Var.set(2, linkedList);
            xe1Var.set(3, java.lang.Long.valueOf(k7()));
            xe1Var.set(4, java.lang.Long.valueOf(((mm2.e1) getStore().getLiveRoomData().a(mm2.e1.class)).f410516m));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[aiAssistant] doStartDialog: live_id=" + xe1Var.m75942xfb822ef2(3) + ", object_id=" + xe1Var.m75942xfb822ef2(4) + ", welcome_id=" + str2 + ", session_id=" + str4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.ca(xe1Var, this, str4, null), 3, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "[aiAssistant] doStartDialog: serialize failed: " + e17.getMessage());
            set.remove(str4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.up1 up1Var;
        super.mo14867x5aa1c816(r71Var);
        p7((r71Var == null || (up1Var = (r45.up1) r71Var.m75936x14adae67(32)) == null) ? null : java.lang.Long.valueOf(up1Var.m75942xfb822ef2(5)), "onLiveMsg");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.up1 up1Var;
        super.mo14863x39a513b7(hc1Var);
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(44);
        tbVar.e(44, new r45.kb2(), new df2.yb(this, r45.lb2.class), false);
        p7((hc1Var == null || (up1Var = (r45.up1) hc1Var.m75936x14adae67(68)) == null) ? null : java.lang.Long.valueOf(up1Var.m75942xfb822ef2(5)), "onLiveStart");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.cb(this, null), 3, null);
        if (zl2.r4.f555483a.t1(getStore().getLiveRoomData())) {
            e7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (((mm2.c1) getStore().getLiveRoomData().a(mm2.c1.class)).a8()) {
            dk2.tb tbVar = dk2.ef.f314925k;
            tbVar.f(44);
            tbVar.e(44, new r45.kb2(), new df2.yb(this, r45.lb2.class), false);
        }
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.ua8);
        if (S6 != null) {
            S6.setOnClickListener(new df2.db(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) S6(com.p314xaae8f345.mm.R.id.f567109ua5);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new df2.fb(this));
        }
        android.widget.TextView textView = (android.widget.TextView) S6(com.p314xaae8f345.mm.R.id.f567105ua1);
        if (textView != null) {
            textView.setOnClickListener(new df2.gb(this));
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        dk2.ef.f314925k.f(44);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e h76 = h7();
        if (h76 != null) {
            h76.e();
        }
        this.f313485z.clear();
        if (this.B) {
            java.lang.String str = this.f313472m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[KWS] releaseKWS: removing audio listener and destroying engine");
            try {
                tn0.w0 w0Var = dk2.ef.f314911d;
                if (w0Var != null) {
                    df2.ra listener = (df2.ra) ((jz5.n) this.D).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
                    w0Var.f502312x1.remove(listener);
                }
                this.C = false;
                rh2.e.f477174a.a();
                this.B = false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[KWS] releaseKWS error: " + e17.getMessage());
            }
        }
        this.f313473n.f542607b = null;
    }

    public final void p7(java.lang.Long l17, java.lang.String str) {
        if (l17 != null) {
            long longValue = l17.longValue();
            boolean z17 = this.f313482w;
            qs5.h[] hVarArr = qs5.h.f447966d;
            boolean A = pm0.v.A(longValue, 64);
            boolean z18 = this.f313482w;
            java.lang.String str2 = this.f313472m;
            if (z18 != A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "canShowAiAssistantSwitch set to " + A);
            }
            this.f313482w = A;
            if (z17 != A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[refreshFlag-" + str + "] canShowAiAssistantSwitch = " + this.f313482w);
            }
        }
        y7();
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.fj9);
        if (S6 != null) {
            android.view.View S62 = S6(com.p314xaae8f345.mm.R.id.u_y);
            android.view.ViewGroup.LayoutParams layoutParams = S62 != null ? S62.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = S6.getVisibility() == 0 ? 0 : O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            }
            S6.requestLayout();
            android.view.View i76 = i7();
            if (i76 != null) {
                i76.requestLayout();
            }
        }
    }

    public final void q7(int i17) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("channel_type", this.f313479t);
        r45.ff1 ff1Var = this.f313477r;
        if (ff1Var != null) {
            gVar.h("ai_msg_id", ff1Var.m75945x2fec8307(0));
            gVar.p(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, ff1Var.m75942xfb822ef2(1));
            gVar.o("notification_type", ff1Var.m75939xb282bd08(7));
            r45.w6 w6Var = (r45.w6) ff1Var.m75936x14adae67(9);
            if (w6Var != null) {
                gVar.h("ai_session_id", w6Var.m75945x2fec8307(0));
                gVar.p("ai_request_id", w6Var.m75942xfb822ef2(2));
            }
        }
        long j17 = this.f313478s;
        if (j17 > 0) {
            gVar.p("push_time", j17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313472m, "[reportAction] js = " + gVar);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409891j2, gVar.toString(), null, 4, null);
    }

    public final void r7(int i17, yz5.l lVar) {
        cl0.g gVar = new cl0.g();
        r45.ff1 ff1Var = this.f313477r;
        if (ff1Var != null) {
            gVar.h("ai_msg_id", ff1Var.m75945x2fec8307(0));
            r45.w6 w6Var = (r45.w6) ff1Var.m75936x14adae67(9);
            if (w6Var != null) {
                gVar.h("ai_session_id", w6Var.m75945x2fec8307(0));
            }
        }
        gVar.o("type", i17);
        lVar.mo146xb9724478(gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313472m, "[reportAiAssistantOp] js = " + gVar);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.J2, gVar.toString(), null, 4, null);
    }

    public final void s7(r45.n72 action, int i17, java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.String str = ((mm2.c1) getStore().getLiveRoomData().a(mm2.c1.class)).f410385o;
        long j17 = ((mm2.e1) getStore().getLiveRoomData().a(mm2.e1.class)).f410516m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313472m, "[aiAssistant reportAnchorAction] action:" + action.f462662d + ", anchorUsername:" + str + ", objectId:" + j17 + ", subActionType:" + i17 + ", params:" + params);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.jb(str, j17, action, i17, params, this, null), 2, null);
    }

    public final void t7() {
        if (!this.B || this.C) {
            return;
        }
        rh2.e eVar = rh2.e.f477174a;
        if (rh2.e.f477177d && rh2.e.f477176c != -1) {
            try {
                com.qq.wx.p309x6b2e132.vad.C2884xdf3c62d3 c2884xdf3c62d3 = rh2.e.f477175b;
                c2884xdf3c62d3.End(rh2.e.f477176c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSEngine", "resetSession: End + Begin, ret=" + c2884xdf3c62d3.m21482x3d18889(rh2.e.f477176c));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KWSEngine", "resetSession error: " + e17.getMessage());
            }
        }
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            w0Var.x((df2.ra) ((jz5.n) this.D).mo141623x754a37bb());
        }
        this.C = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313472m, "[KWS] resumed: session reset + listener added");
    }

    public final void u7() {
        r45.w6 w6Var;
        r45.ff1 ff1Var = this.f313477r;
        if (ff1Var != null && ff1Var.m75939xb282bd08(7) == 5) {
            long k76 = k7();
            long j17 = ((mm2.e1) getStore().getLiveRoomData().a(mm2.e1.class)).f410516m;
            r45.ff1 ff1Var2 = this.f313477r;
            java.lang.String m75945x2fec8307 = (ff1Var2 == null || (w6Var = (r45.w6) ff1Var2.m75936x14adae67(9)) == null) ? null : w6Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                this.f313485z.add(m75945x2fec8307);
            }
            this.f313477r = this.f313484y;
            this.f313484y = null;
            t7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313472m, "[aiAssistant sendAiAssistantCloseDialogAction] anchorUsername:" + ((mm2.c1) getStore().getLiveRoomData().a(mm2.c1.class)).f410385o + ", objectId:" + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.qb(k76, j17, m75945x2fec8307, this, null), 2, null);
        }
    }

    public final void v7(boolean z17, yz5.a aVar) {
        if (m7() == z17) {
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        if (z17) {
            q7(3);
        }
        int f17 = z17 ? i65.a.f(O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw) : b7();
        int b76 = z17 ? b7() : i65.a.f(O6(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.u_y);
        if (S6 != null) {
            android.view.View S62 = S6(com.p314xaae8f345.mm.R.id.u_y);
            android.view.ViewGroup.LayoutParams layoutParams = S62 != null ? S62.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = f17;
            }
            S6.setLayoutParams(layoutParams);
        }
        android.view.View S63 = S6(com.p314xaae8f345.mm.R.id.u_y);
        if (S63 != null) {
            S63.post(new df2.wb(f17, b76, this, z17, aVar));
        }
    }

    public final void x7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14371xe1e185e h76 = h7();
        if (h76 == null || h76.B) {
            return;
        }
        h76.B = true;
        h76.C = 0.0f;
        h76.D = 0.0f;
        h76.E = 0L;
        h76.F.f198397b = 0.0f;
        h76.G.f198397b = 0.0f;
        h76.H.f198397b = 0.0f;
        h76.I.f198397b = 0.0f;
        h76.K.f198397b = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y7() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zb.y7():void");
    }
}
