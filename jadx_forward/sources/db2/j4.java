package db2;

/* loaded from: classes2.dex */
public final class j4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final long f309558t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f309559u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f309560v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f309561w;

    /* renamed from: x, reason: collision with root package name */
    public final r45.vg7 f309562x;

    /* renamed from: y, reason: collision with root package name */
    public cz2.f f309563y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(long j17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String feedUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, long j18, boolean z17, r45.qt2 qt2Var, int i19, int i27, r45.vg7 vg7Var, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var, null, 2, null);
        int i37;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i29 & 64) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = (i29 & 128) != 0 ? null : yj0Var;
        long j19 = (i29 & 256) != 0 ? 0L : j18;
        boolean z18 = (i29 & 512) != 0 ? true : z17;
        int i38 = (i29 & 4096) != 0 ? 0 : i27;
        r45.vg7 sortType = (i29 & 8192) != 0 ? r45.vg7.emFinderGetCommentListSortType_Default : vg7Var;
        int i39 = (i29 & 16384) != 0 ? 0 : i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sortType, "sortType");
        this.f309558t = j17;
        this.f309559u = gVar2;
        this.f309560v = yj0Var2;
        this.f309561w = z18;
        this.f309562x = sortType;
        long t07 = yj0Var2 != null ? yj0Var2.t0() : 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.i51 i51Var = new r45.i51();
        i51Var.set(3, java.lang.Long.valueOf(j17));
        i51Var.set(4, str2);
        db2.t4 t4Var = db2.t4.f309704a;
        i51Var.set(1, t4Var.b(11842, qt2Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var3 = yj0Var2;
        t4Var.h((r45.kv0) i51Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        i51Var.set(8, gVar2);
        if (j19 != 0) {
            i51Var.set(7, java.lang.Long.valueOf(j19));
        }
        i51Var.set(6, java.lang.Long.valueOf(t07));
        i51Var.set(5, java.lang.Integer.valueOf(z18 ? 2 : 1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderGetCommentList", "getIdScene scene:" + i18 + ", commentScene:" + i17);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j().r()).intValue() == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M != 1) {
            if (i17 != 7 && (i17 != 8 || i18 != 1)) {
                i37 = 2;
            }
            i37 = 1;
        } else {
            if (!hc2.l.g(feedUsername)) {
                i37 = 3;
            }
            i37 = 1;
        }
        i51Var.set(2, java.lang.Integer.valueOf(i37));
        i51Var.set(9, java.lang.Integer.valueOf(i19));
        i51Var.set(11, java.lang.Integer.valueOf(i38));
        int i47 = sortType.f469761d;
        i51Var.set(10, java.lang.Integer.valueOf(i47));
        i51Var.set(12, java.lang.Integer.valueOf(i39));
        lVar.f152197a = i51Var;
        r45.j51 j51Var = new r45.j51();
        j51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = j51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcommentlist";
        lVar.f152200d = 11842;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init pullScene:");
        sb6.append(i19);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" lastBuffer=");
        sb6.append(gVar2 != null);
        sb6.append(" isSecondCommentFetch=");
        sb6.append(yj0Var3 != null);
        sb6.append(" scene ");
        sb6.append(i51Var.m75939xb282bd08(9));
        sb6.append(",selectType=");
        sb6.append(i38);
        sb6.append(", sortType=");
        sb6.append(i47);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderGetCommentList", sb6.toString());
        this.f309563y = cz2.f.f306537f;
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object obj;
        bu2.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        r45.j51 resp = (r45.j51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" emoji_desc_comment size=");
        sb6.append(resp.m75941xfb821914(11).size());
        sb6.append(" desc_comments size=");
        sb6.append(resp.m75941xfb821914(12).size());
        sb6.append(" resp=");
        sb6.append(resp);
        sb6.append(",half_sheet_info=");
        r45.xq2 xq2Var = (r45.xq2) resp.m75936x14adae67(10);
        sb6.append(xq2Var != null ? xq2Var.toString() : null);
        sb6.append("  thread=");
        sb6.append(java.lang.Thread.currentThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderGetCommentList", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        int i19 = oVar.f152246d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentListRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.i51) fVar2).m75936x14adae67(1);
        bu2.h hVar = new bu2.h(i19, kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L);
        r45.pm2 pm2Var = (r45.pm2) resp.m75936x14adae67(7);
        long j17 = this.f309558t;
        if (pm2Var != null && (h17 = (jVar = bu2.j.f106067a).h(j17)) != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                c19792x256d2725.mo11468x92b714fd(h17.getFeedObject().mo14344x5f01b1f6());
                r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
                if (m76806xdef68064 != null) {
                    m76806xdef68064.set(12, pm2Var);
                }
                jVar.n(h90Var.a(c19792x256d2725, 0), hVar);
            } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderCache", e17, "", new java.lang.Object[0]);
            }
        }
        if (i17 >= 4) {
            this.f309563y = cz2.f.f306535d;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb821914 = resp.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCommentInfo(...)");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m75941xfb821914) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj).m76058xa6514d24() == c19781xd1c47b87.m76058xa6514d24()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    linkedList.add(c19781xd1c47b87);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CgiGetFinderGetCommentList", "filterDuplicate " + c19781xd1c47b87.m76058xa6514d24() + " content " + c19781xd1c47b87.m76060x76847043() + " username " + c19781xd1c47b87.m76102x6c03c64c());
                }
            }
            resp.set(1, linkedList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f309560v;
            if (yj0Var != null) {
                yj0Var.u0().m76129x73095078(resp.m75934xbce7f2f(3));
                if (this.f309561w) {
                    yj0Var.u0().m76114x6a498235(resp.m75939xb282bd08(5));
                } else {
                    yj0Var.u0().m76152x27177bf0(resp.m75939xb282bd08(4));
                }
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209192db).mo141623x754a37bb()).r()).intValue() == 1 && this.f309559u == null && resp.m75941xfb821914(1).size() > 5) {
                java.util.LinkedList m75941xfb8219142 = resp.m75941xfb821914(1);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87();
                c19781xd1c47b872.m76109x2a50d98(1111111111L);
                c19781xd1c47b872.m76110xc6a80a9c(1);
                c19781xd1c47b872.m76111xe9f5bdb7("新年打开百事，把乐带回家！");
                c19781xd1c47b872.m76125xe0a5bcad("https://p2.itc.cn/q_70/images03/20210602/aba4da2697d3456caeba09726f7b2861.png");
                c19781xd1c47b872.m76153x66bc2758("");
                c19781xd1c47b872.m76135x7ac946f0("百事可乐");
                r45.ky0 ky0Var = new r45.ky0();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                c19786x6a1e2862.m76550x2592a27b(2);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 c19799x6a7e198 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198();
                c19799x6a7e198.m77171xca029dad("https://www.baidu.com");
                c19799x6a7e198.m77169x53b6de6f(1);
                c19786x6a1e2862.m76541x751b57e5(c19799x6a7e198);
                java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
                r45.wf6 wf6Var = new r45.wf6();
                wf6Var.set(1, 12);
                wf6Var.set(2, 2);
                r45.c74 c74Var = new r45.c74();
                c74Var.set(1, "打开百事可乐官方小程序");
                c74Var.set(0, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png");
                wf6Var.set(5, c74Var);
                m76521x7528c3fb.add(wf6Var);
                ky0Var.set(0, c19786x6a1e2862);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                r45.jy0 jy0Var = new r45.jy0();
                jy0Var.set(0, 21);
                jy0Var.set(1, "内容重复");
                linkedList2.add(jy0Var);
                r45.jy0 jy0Var2 = new r45.jy0();
                jy0Var2.set(0, 22);
                jy0Var2.set(1, "不喜欢该广告");
                linkedList2.add(jy0Var2);
                r45.jy0 jy0Var3 = new r45.jy0();
                jy0Var3.set(0, 23);
                jy0Var3.set(1, "对此内容不感兴趣");
                linkedList2.add(jy0Var3);
                ky0Var.set(6, linkedList2);
                c19781xd1c47b872.m76103xcbf1aaaa(ky0Var);
                c19781xd1c47b872.m76113xc8d084c2(3);
                r45.e60 e60Var = new r45.e60();
                java.util.LinkedList m75941xfb8219143 = e60Var.m75941xfb821914(2);
                r45.s60 s60Var = new r45.s60();
                s60Var.set(0, "http://playertest-75538.gzc.vod.tencent-cloud.com/mp4/h264_definition_source/h264_864_486.mp4");
                s60Var.set(4, 1920);
                s60Var.set(5, 1080);
                m75941xfb8219143.add(s60Var);
                java.util.LinkedList m75941xfb8219144 = e60Var.m75941xfb821914(1);
                r45.j60 j60Var = new r45.j60();
                j60Var.set(0, "https://www.smartm.com.tw/data/Images/31/3d/a4/7e/4142152402dc1f8d3d667d5.jpg");
                j60Var.set(2, 1920);
                j60Var.set(3, 1080);
                m75941xfb8219144.add(j60Var);
                c19781xd1c47b872.m76112xc8cb5a36(e60Var);
                m75941xfb8219142.add(5, c19781xd1c47b872);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderGetCommentList", "[onCgiBack] feedId=" + j17 + "  size=" + resp.m75941xfb821914(1).size() + ' ');
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return this.f309563y;
    }
}
