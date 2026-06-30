package wv2;

/* loaded from: classes10.dex */
public final class c extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f531533h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f531534i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1650x55edd6f5.C15164xfc9a4164 f531535m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage$feedDeleteListener$1] */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 mainFinderObj) {
        super(java.lang.String.valueOf(mainFinderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainFinderObj, "mainFinderObj");
        this.f531533h = mainFinderObj;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f531535m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.da daVar = event.f135780g;
                long j17 = daVar.f87971b;
                if (j17 == 0) {
                    return false;
                }
                wv2.c cVar = wv2.c.this;
                if (j17 != cVar.f531533h.m59260x51f8f5b0()) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "feedDeleteListener localId:" + daVar.f87971b);
                cu2.t tVar = cu2.u.f303974a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = cVar.f531533h;
                if (tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
                    return false;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76447x75f6f6ad(200);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var = cVar.f531534i;
                if (f0Var == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.b(f0Var, null, 1, null);
                return false;
            }
        };
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f531533h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f531533h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [pc0.g2] */
    /* JADX WARN: Type inference failed for: r3v34, types: [r45.mb4, com.tencent.mm.protobuf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.tencent.mm.protobuf.e, r45.jf2] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.tencent.mm.protocal.protobuf.FinderMedia] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dm.i4, com.tencent.mm.plugin.finder.storage.FinderItem] */
    @Override // ov2.e
    public pv2.g j() {
        java.util.LinkedList m75941xfb821914;
        int i17;
        wv2.c cVar;
        pv2.g mVar;
        java.lang.Object obj;
        int i18;
        wv2.c cVar2;
        boolean z17;
        int i19;
        android.graphics.BitmapFactory.Options options;
        wv2.c cVar3;
        boolean z18;
        int i27;
        int i28;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1;
        r45.g70 g70Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x30959487;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj2;
        wv2.c cVar4 = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "start localId:" + cVar4.f531533h.m59260x51f8f5b0());
        cVar4.f531535m.mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "start localId:" + cVar4.f531533h.m59260x51f8f5b0());
        cVar4.f531535m.mo48813x58998cd();
        cVar4.f531533h.m59433x2b7e608b("mediaProcess");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = cVar4.f531533h.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76425xd27acffc(2);
        }
        ?? r152 = 1;
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 1) {
            mVar = new wv2.n(cVar4.f531533h, 2);
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = cVar4.f531533h.getFeedObject().m76802x2dd01666();
            android.graphics.BitmapFactory.Options options2 = null;
            r45.ef2 m76971x25b90ced = m76802x2dd01666 != null ? m76802x2dd01666.m76971x25b90ced() : null;
            if (m76971x25b90ced != null) {
                int i29 = 5;
                ?? r102 = 0;
                if (m76971x25b90ced.m75939xb282bd08(6) == 1) {
                    m75941xfb821914 = m76971x25b90ced.m75941xfb821914(5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getOrdered_track_list_flex_clip(...)");
                } else {
                    m75941xfb821914 = m76971x25b90ced.m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getOrderedTrackList(...)");
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : m75941xfb821914) {
                    if (((r45.jf2) obj3).m75942xfb822ef2(2) == 0) {
                        arrayList.add(obj3);
                    }
                }
                linkedList2.addAll(arrayList);
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    i17 = 3;
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.jf2 jf2Var = (r45.jf2) it.next();
                    java.util.Iterator it6 = cVar4.f531533h.m59214x2de915fd().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj2).m59276x6c285d75(), jf2Var.m75945x2fec8307(3))) {
                            break;
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "processTracks size:" + linkedList2.size());
                int size = linkedList2.size();
                int i37 = 0;
                cVar = cVar4;
                wv2.c cVar5 = cVar;
                for (java.lang.Object obj4 : linkedList2) {
                    int i38 = i37 + 1;
                    if (i37 < 0) {
                        ?? r112 = options2;
                        kz5.c0.p();
                        throw r112;
                    }
                    ?? r37 = (r45.jf2) obj4;
                    java.util.Iterator it7 = cVar5.f531533h.m59214x2de915fd().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj = options2;
                            break;
                        }
                        obj = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj).m59276x6c285d75(), r37.m75945x2fec8307(i17))) {
                            break;
                        }
                    }
                    ?? r76 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
                    if (r76 != 0) {
                        if (!((r37 == 0 || (m75941xfb8219142 = r37.m75941xfb821914(11)) == null || m75941xfb8219142.contains(java.lang.Integer.valueOf((int) r152)) != r152) ? r102 : r152)) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = r76.m59240x7c94657b().m76802x2dd01666();
                            ?? first = (m76802x2dd016662 == null || (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) == null) ? options2 : m76962x74cd162e.getFirst();
                            r45.mb4 m59222xfa2c08d4 = r76.m59222xfa2c08d4(r102);
                            if (m59222xfa2c08d4 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "cannot get local finder media");
                                mVar = new wv2.n(cVar5.f531533h, 2);
                            } else {
                                r45.dd4 dd4Var = (r45.dd4) m59222xfa2c08d4.m75936x14adae67(14);
                                int m75939xb282bd08 = dd4Var != null ? dd4Var.m75939xb282bd08(7) : 0;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                                if (m75939xb282bd08 > t70Var.O2()) {
                                    mVar = new wv2.n(cVar5.f531533h, 2);
                                } else {
                                    if (r37 == 0 || first == 0) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "error cannot get mvTrack and mvMedia");
                                        mVar = new wv2.n(cVar5.f531533h, 2);
                                        break;
                                    }
                                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                    r45.dd4 dd4Var2 = (r45.dd4) m59222xfa2c08d4.m75936x14adae67(14);
                                    if (dd4Var2 != null) {
                                        r45.dd4 dd4Var3 = (r45.dd4) m59222xfa2c08d4.m75936x14adae67(14);
                                        dd4Var2.set(7, java.lang.Integer.valueOf((dd4Var3 != null ? dd4Var3.m75939xb282bd08(7) : 0) + r152));
                                    }
                                    cu2.t tVar = cu2.u.f303974a;
                                    tVar.n(cVar4.f531533h);
                                    java.lang.String m76625xb5887639 = first.m76625xb5887639();
                                    if (m76625xb5887639 == null) {
                                        m76625xb5887639 = "";
                                    }
                                    if (com.p314xaae8f345.mm.vfs.w6.j(m76625xb5887639)) {
                                        float m76632x755bd410 = first.m76632x755bd410();
                                        float m76605x1c4fb41d = first.m76605x1c4fb41d();
                                        int m76629x36bbd779 = first.m76629x36bbd779();
                                        long m75942xfb822ef2 = r37.m75942xfb822ef2(4);
                                        java.lang.String str = m76625xb5887639;
                                        long m75939xb282bd082 = r37.m75939xb282bd08(r152) + m75942xfb822ef2;
                                        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(str, r152);
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start process mv, size:[");
                                        sb6.append(m76632x755bd410);
                                        sb6.append(',');
                                        sb6.append(m76605x1c4fb41d);
                                        int i39 = size;
                                        sb6.append("], videoDuration:");
                                        sb6.append(m76629x36bbd779);
                                        sb6.append(", clipRange:[");
                                        sb6.append(m75942xfb822ef2);
                                        sb6.append(',');
                                        sb6.append(m75939xb282bd082);
                                        sb6.append("], path:");
                                        sb6.append(str);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", sb6.toString());
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "start process mv, videoInfo:" + Ai);
                                        if (Ai == null) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "start process mv, fail to get origin video info");
                                            mVar = new wv2.n(cVar.f531533h, 2);
                                        } else {
                                            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d K2 = t70Var.K2();
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "process mv videoParams " + K2);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf12 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1();
                                            c19791x8d6e6bf12.m76736xdb5612fc(m59222xfa2c08d4.m75939xb282bd08(2));
                                            c19791x8d6e6bf12.m76738x1c2e0628(new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0());
                                            c19791x8d6e6bf12.m76737xc393067b(new java.util.LinkedList<>());
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 c19790xac7db1e0 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0();
                                            int i47 = i37;
                                            c19790xac7db1e0.m76706x4abaca1f((int) com.p314xaae8f345.mm.vfs.w6.k(str));
                                            c19790xac7db1e0.m76711x53e9ee84((int) m76632x755bd410);
                                            c19790xac7db1e0.m76708xf84e829((int) m76605x1c4fb41d);
                                            c19790xac7db1e0.m76709x885d9bf4(Ai.f442900e);
                                            c19790xac7db1e0.m76710xc9923ded(m76629x36bbd779);
                                            c19790xac7db1e0.m76705x32952839(Ai.f442903h);
                                            c19790xac7db1e0.m76707xca026527((int) Ai.f442898c);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "put multiMediaInfo:" + c19790xac7db1e0);
                                            c19791x8d6e6bf12.m76721xfb9c9e6f().add(c19790xac7db1e0);
                                            java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.h(new mn2.g4(m59222xfa2c08d4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.R, "xV99", 0, 0, null, false, null, 248, null), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                                            i95.m c17 = i95.n0.c(bg0.v.class);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 Z2 = bg0.v.Z2((bg0.v) c17, str, false, 2, null);
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k0 Bi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Bi(kz5.b0.c(Z2));
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1) Bi;
                                            h1Var.s(m75942xfb822ef2, m75939xb282bd082);
                                            android.graphics.Rect rect = new android.graphics.Rect();
                                            int i48 = Ai.f442896a;
                                            int i49 = Ai.f442897b;
                                            int i57 = Ai.f442901f;
                                            if (i57 == 90 || i57 == 270) {
                                                i49 = i48;
                                                i48 = i49;
                                            }
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) Z2).f257157i.f257320d.set(0, 0, i48, i49);
                                            h1Var.u(i48, i49);
                                            rect.set(0, 0, i48, i49);
                                            h1Var.t(rect);
                                            h1Var.d(false);
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p) ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).wi(Bi);
                                            pVar.e(h17, K2, new android.util.Size(i48, i49), rect, true, true);
                                            r45.h70 f17 = pVar.f();
                                            r45.i70 i70Var = f17.f457435i;
                                            i70Var.f458308d = h17;
                                            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n();
                                            ((bg0.a0) i95.n0.c(bg0.a0.class)).getClass();
                                            nVar.f257217c = 3;
                                            r45.dd4 dd4Var4 = (r45.dd4) m59222xfa2c08d4.m75936x14adae67(14);
                                            nVar.f257215a = dd4Var4 != null ? dd4Var4.m75939xb282bd08(7) : 0;
                                            if (t70Var.t2()) {
                                                nVar.i(true, K2);
                                            }
                                            nVar.f257226l = new wv2.a(new p3321xbce91901.jvm.p3324x21ffc6bd.e0(), cVar4, i47, i39);
                                            cVar4.f531534i = nVar;
                                            java.lang.Object obj5 = new java.lang.Object();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                                            f0Var.f391649d = -1;
                                            float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.a(nVar, f17, false, new wv2.b(f0Var, this, elapsedRealtime, c19791x8d6e6bf12, h17, i70Var, K2, f17, obj5, c0Var), 2, null);
                                            synchronized (obj5) {
                                                if (!c0Var.f391645d) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "wait");
                                                    obj5.wait();
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "notify " + f0Var.f391649d);
                                                }
                                            }
                                            qc0.d1 Ai2 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(h17, true);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "remux finished, ret:" + f0Var.f391649d + ", videoQuality:" + a17 + ", outputVideoInfo:" + Ai2);
                                            cVar3 = this;
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = cVar3.f531533h.f66946x284ddcb8;
                                            if (c19783xd9a946b72 != null) {
                                                c19783xd9a946b72.m76411xfa666b63(f0Var.f391649d);
                                            }
                                            tVar.n(cVar3.f531533h);
                                            if (f0Var.f391649d < 0 || Ai2 == null || Ai2.f442896a < 0 || Ai2.f442897b < 0 || Ai2.f442899d < 0) {
                                                mVar = new wv2.n(cVar3.f531533h, 2);
                                                cVar = cVar3;
                                                break;
                                            }
                                            i18 = i39;
                                            cVar3.k(1.0f, i47, i18);
                                            m59222xfa2c08d4.set(4, java.lang.Float.valueOf(Ai2.f442896a));
                                            i19 = 5;
                                            m59222xfa2c08d4.set(5, java.lang.Float.valueOf(Ai2.f442897b));
                                            int i58 = K2.f152737t;
                                            int m75938x746dc8a6 = (int) ((m59222xfa2c08d4.m75938x746dc8a6(5) / m59222xfa2c08d4.m75938x746dc8a6(4)) * i58);
                                            options = null;
                                            java.lang.String g17 = mv2.q.f413151a.g(h17, i58, m75938x746dc8a6, null);
                                            if (t70Var.v2()) {
                                                z17 = false;
                                                i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.e(40, 0, i58, m75938x746dc8a6, 0.8f);
                                            } else {
                                                z17 = false;
                                                i28 = 0;
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "qipengfeng, audio quality level: " + (t70Var.v2() ? com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.a(h17, K2.f152731n, K2.f152732o, K2.f152733p, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_quality_analysis_switch, z17 ? 1 : 0) == 1 ? true : z17 ? 1 : 0, true) : 0.0f));
                                            m59222xfa2c08d4.set(69, c19791x8d6e6bf12);
                                            m59222xfa2c08d4.set(z17 ? 1 : 0, h17);
                                            m59222xfa2c08d4.set(1, g17);
                                            m59222xfa2c08d4.set(13, java.lang.Boolean.FALSE);
                                            m59222xfa2c08d4.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m59222xfa2c08d4.m75945x2fec8307(z17 ? 1 : 0)));
                                            m59222xfa2c08d4.set(46, hc2.l.k(m59222xfa2c08d4.m75945x2fec8307(1)));
                                            m59222xfa2c08d4.set(7, java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.vfs.w6.k(h17)));
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf13 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            if (c19791x8d6e6bf13 != null) {
                                                c19791x8d6e6bf13.m76742x23cac893(new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0());
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf14 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594872 = c19791x8d6e6bf14 != null ? c19791x8d6e6bf14.m76726x30959487() : null;
                                            if (m76726x309594872 != null) {
                                                m76726x309594872.m76706x4abaca1f(m59222xfa2c08d4.m75939xb282bd08(7));
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf15 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            if (c19791x8d6e6bf15 != null) {
                                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf16 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                                c19791x8d6e6bf15.m76743xde9c855e((c19791x8d6e6bf16 == null || (m76726x30959487 = c19791x8d6e6bf16.m76726x30959487()) == null) ? z17 ? 1 : 0 : m76726x30959487.m76699x50026913());
                                            }
                                            r45.h70 h70Var = (r45.h70) m59222xfa2c08d4.m75936x14adae67(21);
                                            if (h70Var != null) {
                                                h70Var.f457436m = z17;
                                            }
                                            if (((r45.uf2) m59222xfa2c08d4.m75936x14adae67(22)) == null) {
                                                m59222xfa2c08d4.set(22, new r45.uf2());
                                            }
                                            r45.uf2 uf2Var = (r45.uf2) m59222xfa2c08d4.m75936x14adae67(22);
                                            if (uf2Var != null) {
                                                uf2Var.set(z17 ? 1 : 0, java.lang.Float.valueOf(a17));
                                                uf2Var.set(2, java.lang.Float.valueOf(0.0f));
                                                java.lang.Float valueOf = java.lang.Float.valueOf(i28);
                                                i27 = 3;
                                                uf2Var.set(3, valueOf);
                                                r45.h70 h70Var2 = (r45.h70) m59222xfa2c08d4.m75936x14adae67(21);
                                                uf2Var.set(5, java.lang.Boolean.valueOf(((h70Var2 == null || (g70Var = h70Var2.f457437n) == null || (linkedList = g70Var.f456472e) == null) ? z17 ? 1 : 0 : linkedList.size()) > 0 ? true : z17 ? 1 : 0));
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "codec_info video_score:" + uf2Var.m75938x746dc8a6(z17 ? 1 : 0) + ",video_cover_score:" + uf2Var.m75938x746dc8a6(1) + ",video_audio_score:" + uf2Var.m75938x746dc8a6(2) + ",thumb_score:" + uf2Var.m75938x746dc8a6(3) + ",hdimg_score:" + uf2Var.m75938x746dc8a6(4) + ",has_stickers:" + uf2Var.m75933x41a8a7f2(5));
                                            } else {
                                                i27 = 3;
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf17 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            if ((c19791x8d6e6bf17 != null ? c19791x8d6e6bf17.m76717xbc655f2e() : null) == null && (c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69)) != null) {
                                                c19791x8d6e6bf1.m76733x18b91fa2((r45.uf2) m59222xfa2c08d4.m75936x14adae67(22));
                                            }
                                            m59222xfa2c08d4.set(i27, java.lang.Integer.valueOf(a06.d.b(((float) Ai2.f442899d) / 1000.0f)));
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf18 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594873 = c19791x8d6e6bf18 != null ? c19791x8d6e6bf18.m76726x30959487() : null;
                                            if (m76726x309594873 != null) {
                                                m76726x309594873.m76710xc9923ded((int) Ai2.f442899d);
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf19 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594874 = c19791x8d6e6bf19 != null ? c19791x8d6e6bf19.m76726x30959487() : null;
                                            if (m76726x309594874 != null) {
                                                m76726x309594874.m76711x53e9ee84(Ai2.f442896a);
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf110 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594875 = c19791x8d6e6bf110 != null ? c19791x8d6e6bf110.m76726x30959487() : null;
                                            if (m76726x309594875 != null) {
                                                m76726x309594875.m76708xf84e829(Ai2.f442897b);
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf111 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594876 = c19791x8d6e6bf111 != null ? c19791x8d6e6bf111.m76726x30959487() : null;
                                            if (m76726x309594876 != null) {
                                                m76726x309594876.m76709x885d9bf4(Ai2.f442900e);
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf112 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594877 = c19791x8d6e6bf112 != null ? c19791x8d6e6bf112.m76726x30959487() : null;
                                            if (m76726x309594877 != null) {
                                                m76726x309594877.m76705x32952839(Ai2.f442903h);
                                            }
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf113 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) m59222xfa2c08d4.m75936x14adae67(69);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76726x309594878 = c19791x8d6e6bf113 != null ? c19791x8d6e6bf113.m76726x30959487() : null;
                                            if (m76726x309594878 != null) {
                                                m76726x309594878.m76707xca026527((int) Ai2.f442898c);
                                            }
                                            java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                            linkedList3.add(m59222xfa2c08d4);
                                            r76.m59395xdb523460(linkedList3);
                                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b73 = r76.f66946x284ddcb8;
                                            if (c19783xd9a946b73 != null) {
                                                c19783xd9a946b73.m76428x3e16a84d(c01.id.c());
                                                c19783xd9a946b73.m76429xb2829755(2);
                                            }
                                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("processList url ");
                                            sb7.append(m59222xfa2c08d4.m75945x2fec8307(z17 ? 1 : 0));
                                            sb7.append(" thumbUrl: ");
                                            z18 = true;
                                            sb7.append(m59222xfa2c08d4.m75945x2fec8307(1));
                                            sb7.append(" newMd5: ");
                                            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m59222xfa2c08d4.m75945x2fec8307(z17 ? 1 : 0)));
                                            sb7.append(" size:");
                                            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(com.p314xaae8f345.mm.vfs.w6.k(m59222xfa2c08d4.m75945x2fec8307(z17 ? 1 : 0))));
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", sb7.toString());
                                            tVar.n(cVar3.f531533h);
                                            cVar2 = cVar3;
                                            cVar = cVar2;
                                            r152 = z18;
                                            cVar4 = cVar3;
                                            i17 = i27;
                                            options2 = options;
                                            r102 = z17;
                                            cVar5 = cVar2;
                                            size = i18;
                                            i29 = i19;
                                            i37 = i38;
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", "start process mv, file not exist:".concat(m76625xb5887639));
                                        mVar = new wv2.n(cVar5.f531533h, 2);
                                    }
                                }
                            }
                            break;
                        }
                        ?? m59222xfa2c08d42 = r76.m59222xfa2c08d4(r102);
                        if (m59222xfa2c08d42 != 0) {
                            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.d(new mn2.c1(m59222xfa2c08d42, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, null, 12, null), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                            float m75938x746dc8a62 = m59222xfa2c08d42.m75938x746dc8a6(4);
                            float m75938x746dc8a63 = m59222xfa2c08d42.m75938x746dc8a6(i29);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                            float min = java.lang.Math.min((t70Var2.l2() * 1.0f) / m75938x746dc8a62, (t70Var2.k2() * 1.0f) / m75938x746dc8a63);
                            if (min > 1.0f) {
                                com.p314xaae8f345.mm.vfs.w6.c(m59222xfa2c08d42.m75945x2fec8307(r102), d17);
                                i29 = 5;
                            } else {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(m59222xfa2c08d42.m75945x2fec8307(r102), options2), min, min, r152), 100, android.graphics.Bitmap.CompressFormat.JPEG, d17, r102);
                                m59222xfa2c08d42.set(4, java.lang.Float.valueOf((int) (m75938x746dc8a62 * min)));
                                i29 = 5;
                                m59222xfa2c08d42.set(5, java.lang.Float.valueOf((int) (m75938x746dc8a63 * min)));
                            }
                            m59222xfa2c08d42.set(r102, d17);
                            m59222xfa2c08d42.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m59222xfa2c08d42.m75945x2fec8307(r102)));
                            m59222xfa2c08d42.set(46, hc2.l.k(m59222xfa2c08d42.m75945x2fec8307(r152)));
                            java.util.LinkedList linkedList4 = new java.util.LinkedList();
                            linkedList4.add(m59222xfa2c08d42);
                            r76.m59395xdb523460(linkedList4);
                            cu2.u.f303974a.n(cVar4.f531533h);
                        }
                    }
                    i18 = size;
                    cVar2 = cVar5;
                    z17 = r102;
                    i19 = i29;
                    options = options2;
                    cVar3 = cVar4;
                    z18 = r152;
                    i27 = 3;
                    r152 = z18;
                    cVar4 = cVar3;
                    i17 = i27;
                    options2 = options;
                    r102 = z17;
                    cVar5 = cVar2;
                    size = i18;
                    i29 = i19;
                    i37 = i38;
                }
                mVar = new wv2.m(cVar5.f531533h);
                cVar.f531535m.mo48814x2efc64();
                return mVar;
            }
            mVar = new wv2.n(cVar4.f531533h, 2);
        }
        cVar = cVar4;
        break;
        cVar.f531535m.mo48814x2efc64();
        return mVar;
    }

    public final void k(float f17, int i17, int i18) {
        float f18 = (f17 > 1.0f ? 1.0f : f17) * ((i17 + 1.0f) / i18);
        int i19 = (int) (45 * f18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f531533h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        sb6.append(" updateProgress ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(f18);
        sb6.append(", ");
        sb6.append(i19);
        sb6.append(", index:");
        sb6.append(i17);
        sb6.append(", size:");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.MvMediaProcessStage", sb6.toString());
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i19) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i19));
            cu2.u.f303974a.l(c14994x9b99c079);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = m59260x51f8f5b0;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        c5442xd807898f.e();
    }
}
