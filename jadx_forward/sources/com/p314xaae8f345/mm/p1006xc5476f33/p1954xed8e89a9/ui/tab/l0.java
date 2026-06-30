package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f235920a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wl f235921b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f235922c;

    /* renamed from: d, reason: collision with root package name */
    public final long f235923d;

    /* renamed from: e, reason: collision with root package name */
    public final sr3.g f235924e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f235925f;

    /* renamed from: g, reason: collision with root package name */
    public zy2.yb f235926g;

    /* renamed from: h, reason: collision with root package name */
    public zy2.ic f235927h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f235928i;

    /* renamed from: j, reason: collision with root package name */
    public r45.j32 f235929j;

    /* renamed from: k, reason: collision with root package name */
    public r45.c32 f235930k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f235931l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235932m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f235933n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f235934o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f235935p;

    public l0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, r45.wl profileInfo, android.view.View rootView, long j17, sr3.g config) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profileInfo, "profileInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f235920a = activity;
        this.f235921b = profileInfo;
        this.f235922c = rootView;
        this.f235923d = j17;
        this.f235924e = config;
        this.f235925f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.d0(this));
        this.f235928i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.e0.f235829d);
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f235933n = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init with LiveInfoV2: noticeCount=");
        r45.j32 j32Var = this.f235929j;
        int i17 = 0;
        if (j32Var != null && (m75941xfb821914 = j32Var.m75941xfb821914(0)) != null) {
            i17 = m75941xfb821914.size();
        }
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb6.toString());
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var, java.lang.String finderUserName, yz5.p pVar) {
        if (l0Var.f() != null) {
            r45.qt2 qt2Var = new r45.qt2();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f0(pVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "requestLiveNoticeList: username=" + finderUserName + ", lastNoticeStartTime=0");
            new db2.b1("", "", finderUserName, 0, null, null, new c61.h8(f0Var), qt2Var, 0, null, new java.util.LinkedList()).l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if ((r0 != null && r0.m75933x41a8a7f2(0)) != false) goto L40;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r5 = this;
            r45.wl r0 = r5.f235921b
            r45.i32 r1 = r0.F
            java.lang.String r2 = "ContactBizHeaderLiveNoticeLogicV2"
            r3 = 0
            if (r1 != 0) goto Lf
            java.lang.String r0 = "LiveInfoV2 is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        Lf:
            r45.an r0 = r0.f470778s
            r1 = 1
            if (r0 == 0) goto L1f
            com.tencent.mm.protobuf.g r0 = r0.f451659d
            if (r0 == 0) goto L1f
            byte[] r0 = r0.f273689a
            int r0 = r0.length
            if (r0 != 0) goto L1f
            r0 = r1
            goto L20
        L1f:
            r0 = r3
        L20:
            if (r0 == 0) goto L28
            java.lang.String r0 = "finder username is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        L28:
            r45.j32 r0 = r5.f235929j
            if (r0 == 0) goto L4e
            java.util.LinkedList r0 = r0.m75941xfb821914(r3)
            if (r0 == 0) goto L4e
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.h32 r0 = (r45.h32) r0
            if (r0 == 0) goto L4e
            r4 = 25
            java.lang.String r4 = r0.m75945x2fec8307(r4)
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 != 0) goto L4e
            int r0 = r0.m75939xb282bd08(r3)
            if (r0 == 0) goto L4e
            r0 = r1
            goto L4f
        L4e:
            r0 = r3
        L4f:
            r5.f235931l = r0
            r45.c32 r0 = r5.f235930k
            if (r0 == 0) goto L70
            int r4 = r0.m75939xb282bd08(r3)
            if (r4 > 0) goto L6e
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.fw4 r0 = (r45.fw4) r0
            if (r0 == 0) goto L6b
            boolean r0 = r0.m75933x41a8a7f2(r3)
            if (r0 != r1) goto L6b
            r0 = r1
            goto L6c
        L6b:
            r0 = r3
        L6c:
            if (r0 == 0) goto L70
        L6e:
            r0 = r1
            goto L71
        L70:
            r0 = r3
        L71:
            r5.f235932m = r0
            boolean r4 = r5.f235931l
            if (r4 != 0) goto L7f
            if (r0 != 0) goto L7f
            java.lang.String r0 = "Both LiveNoticeListInfo and NextLiveNotificationInfo are invalid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "checkLiveInfoLegal: hasValidLiveNoticeList="
            r0.<init>(r3)
            boolean r3 = r5.f235931l
            r0.append(r3)
            java.lang.String r3 = ", hasValidNextLiveNotice="
            r0.append(r3)
            boolean r3 = r5.f235932m
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0.a():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.a
    public void b(r45.wl wlVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (wlVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update: profileInfo empty!");
            return;
        }
        this.f235921b = wlVar;
        h();
        r45.j32 j32Var = this.f235929j;
        if (j32Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j32Var);
            if (!j32Var.m75941xfb821914(0).isEmpty()) {
                r45.an anVar = wlVar.f470778s;
                if (anVar == null || (gVar = anVar.f451659d) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update: VideoFinderInfo or user_name is null!");
                    return;
                }
                java.lang.String b17 = x51.j1.b(gVar);
                r45.j32 j32Var2 = this.f235929j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j32Var2);
                java.util.LinkedList<r45.h32> m75941xfb821914 = j32Var2.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getNotice_info(...)");
                for (r45.h32 h32Var : m75941xfb821914) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                    java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                    java.lang.String str = "";
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.h32 e17 = i1Var.e(b17, m75945x2fec8307);
                    if (e17 == null) {
                        e17 = new r45.h32();
                    }
                    e17.set(0, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(0)));
                    e17.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
                    e17.set(3, h32Var.m75945x2fec8307(3));
                    e17.set(4, h32Var.m75945x2fec8307(4));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update FinderFeedLiveNoticeCache: noticeId=" + h32Var.m75945x2fec8307(4) + ", status=" + e17.m75939xb282bd08(1));
                    java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                    if (m75945x2fec83072 != null) {
                        str = m75945x2fec83072;
                    }
                    i1Var.a(b17, str, e17);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                j(b17);
                i();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update: liveNoticeInfo empty!");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.a
    public void c() {
        boolean z17 = this.f235931l;
        boolean z18 = this.f235930k != null;
        if (!z17 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "no live info, hide UI");
            android.view.View e17 = e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView: hasLiveNoticeList=" + z17 + ", hasNextLiveNotice=" + z18);
        if (z17) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f235934o;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f235934o = p3325xe03a0797.p3326xc267989b.l.d(this.f235933n, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.h0(this, z18, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "show live notify view with nextLiveNotice only");
        android.view.View e18 = e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(e18, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(e18, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogicV2", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g();
    }

    public final android.view.View e() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f235925f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final vd2.i5 f() {
        return (vd2.i5) ((jz5.n) this.f235928i).mo141623x754a37bb();
    }

    public final void g() {
        if (f() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "liveUtilsService is null!");
            return;
        }
        r45.an anVar = this.f235921b.f470778s;
        if (anVar == null || anVar.f451659d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "initHeaderWidget: VideoFinderInfo or user_name is null!");
            return;
        }
        if (this.f235926g == null) {
            r45.qt2 qt2Var = new r45.qt2();
            java.lang.String b17 = x51.j1.b(this.f235921b.f470778s.f451659d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            j(b17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f());
            android.view.View e17 = e();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f235920a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "newHeaderLiveWidget: create HeaderLiveWidget with previewOnly=false");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1(e17, activity, qt2Var, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r, b17, "");
            this.f235926g = s1Var;
            s1Var.k(b17);
            zy2.yb ybVar = this.f235926g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ybVar);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1) ybVar).f206257h = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.c0(this);
        }
        i();
    }

    public final void h() {
        java.util.LinkedList m75941xfb821914;
        r45.i32 i32Var = this.f235921b.F;
        if (i32Var == null) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = i32Var.f458230d;
            if (gVar != null && gVar.f273689a.length > 0) {
                r45.j32 j32Var = new r45.j32();
                j32Var.mo11468x92b714fd(i32Var.f458230d.g());
                this.f235929j = j32Var;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parsed LiveNoticeListInfo: noticeCount=");
                r45.j32 j32Var2 = this.f235929j;
                sb6.append((j32Var2 == null || (m75941xfb821914 = j32Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb6.toString());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = i32Var.f458231e;
            if (gVar2 == null || gVar2.f273689a.length <= 0) {
                return;
            }
            r45.c32 c32Var = new r45.c32();
            c32Var.mo11468x92b714fd(i32Var.f458231e.g());
            this.f235930k = c32Var;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("parsed NextLiveNotificationInfo: hasData=");
            sb7.append(this.f235930k != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb7.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "parse LiveInfoV2 failed: " + e17.getMessage());
        }
    }

    public final void i() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.util.LinkedList m75941xfb821914;
        r45.an anVar = this.f235921b.f470778s;
        if (anVar == null || (gVar = anVar.f451659d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "refreshHeaderWidget: VideoFinderInfo is null!");
            return;
        }
        java.lang.String b17 = x51.j1.b(gVar);
        r45.j32 j32Var = this.f235929j;
        r45.h32 h32Var = (j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? null : (r45.h32) kz5.n0.Z(m75941xfb821914);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        j(b17);
        if (h32Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            r45.h32 e17 = i1Var.e(b17, m75945x2fec8307);
            if (e17 != null) {
                h32Var.set(1, java.lang.Integer.valueOf(e17.m75939xb282bd08(1)));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "refresh header: noticeId=" + h32Var.m75945x2fec8307(4) + ", status=" + h32Var.m75939xb282bd08(1));
        }
        boolean z17 = h32Var != null;
        boolean z18 = this.f235930k != null;
        if (!z17 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "refresh header: no data to show");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "refresh header: hasLiveNoticeList=" + z17 + ", hasNextLiveNotice=" + z18);
        zy2.yb ybVar = this.f235926g;
        if (ybVar != null) {
            sr3.g gVar2 = this.f235924e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1) ybVar).f("ContactBizProfile", b17, false, gVar2.a(), gVar2.a(), null, "", "");
        }
    }

    public final void j(java.lang.String finderUserName) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        java.lang.Integer num = null;
        if (f() != null) {
            r45.j32 j32Var = this.f235929j;
            r45.c32 c32Var = this.f235930k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateUserExtInfoCache: username=");
            sb6.append(finderUserName);
            sb6.append(", noticeCount=");
            sb6.append((j32Var == null || (m75941xfb8219143 = j32Var.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219143.size()));
            sb6.append(", hasNextLiveInfo=");
            sb6.append(c32Var != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", sb6.toString());
            kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(finderUserName);
            if (l2Var == null) {
                l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            }
            l2Var.f205456l = j32Var;
            l2Var.f205449e = (j32Var == null || (m75941xfb8219142 = j32Var.m75941xfb821914(0)) == null) ? null : (r45.h32) kz5.n0.Z(m75941xfb8219142);
            l2Var.B = c32Var;
            lVar.j(finderUserName, l2Var);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update userExtInfoCache via service: username=");
        sb7.append(finderUserName);
        sb7.append(", noticeCount=");
        r45.j32 j32Var2 = this.f235929j;
        if (j32Var2 != null && (m75941xfb821914 = j32Var2.m75941xfb821914(0)) != null) {
            num = java.lang.Integer.valueOf(m75941xfb821914.size());
        }
        sb7.append(num);
        sb7.append(", hasNextLiveInfo=");
        sb7.append(this.f235930k != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", sb7.toString());
    }
}
