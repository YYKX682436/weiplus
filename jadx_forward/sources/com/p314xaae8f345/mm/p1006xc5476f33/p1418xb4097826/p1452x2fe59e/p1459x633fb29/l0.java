package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class l0 extends fc2.d implements im5.b {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f189657t;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f189658g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f189659h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f189660i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f189661m;

    /* renamed from: n, reason: collision with root package name */
    public int f189662n;

    /* renamed from: o, reason: collision with root package name */
    public int f189663o;

    /* renamed from: p, reason: collision with root package name */
    public int f189664p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Vector f189665q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f189666r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f189667s;

    public l0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f189658g = activity;
        this.f189659h = "Finder.FinderCommentPreloader";
        this.f189660i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f189664p = 2;
        this.f189665q = new java.util.Vector();
        this.f189666r = new java.util.LinkedHashMap();
        this.f189667s = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final void I0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, java.util.LinkedList linkedList, long j17, java.lang.String str) {
        long j18;
        int i17;
        l0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            j18 = 0;
            i17 = 2;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 level1CommentInfo = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level1CommentInfo, "level1CommentInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = j17;
            yj0Var.f68957xec748fc6 = str;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, level1CommentInfo);
            yj0Var.n1(0L);
            arrayList2.add(new so2.y0(yj0Var));
        }
        arrayList.addAll(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.y0 y0Var = (so2.y0) next;
            arrayList3.add(y0Var);
            if (y0Var.f492236d.Y0() == j18 && y0Var.f492236d.P0().size() > 0 && (i18 >= arrayList.size() - 1 || ((so2.y0) arrayList.get(i19)).f492236d.Y0() == j18)) {
                int size = y0Var.f492236d.P0().size();
                int i27 = 0;
                while (true) {
                    if (i27 < size) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) y0Var.f492236d.P0().remove();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
                        long mo2128x1ed62e84 = y0Var.mo2128x1ed62e84();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
                        yj0Var2.f68959xf9a02e3e = j17;
                        yj0Var2.f68957xec748fc6 = str;
                        yj0Var2.f68965x29d3a50c = i17;
                        yj0Var2.f68953x27838069.set(1, c19781xd1c47b87);
                        yj0Var2.n1(mo2128x1ed62e84);
                        so2.y0 y0Var2 = new so2.y0(yj0Var2);
                        if (y0Var2.f492236d.h1()) {
                            y0Var2.f492236d.f209930x1 = true;
                            arrayList3.add(y0Var2);
                            break;
                        } else {
                            i27++;
                            i17 = 2;
                        }
                    }
                }
            }
            i18 = i19;
            j18 = 0;
            i17 = 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (((so2.y0) r17.get(r5)).f492236d.Y0() != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List J0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 r16, java.util.List r17, long r18, java.lang.String r20) {
        /*
            r16.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r17.iterator()
            r3 = 0
        Ld:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ld2
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 < 0) goto Lcd
            so2.y0 r4 = (so2.y0) r4
            r0.add(r4)
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r4.f492236d
            long r6 = r6.Y0()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto Lc3
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r4.f492236d
            java.util.LinkedList r6 = r6.P0()
            int r6 = r6.size()
            if (r6 <= 0) goto Lc3
            int r6 = r17.size()
            r7 = 1
            int r6 = r6 - r7
            if (r3 >= r6) goto L53
            r3 = r17
            java.lang.Object r6 = r3.get(r5)
            so2.y0 r6 = (so2.y0) r6
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r6.f492236d
            long r10 = r6.Y0()
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 != 0) goto Lc5
            goto L55
        L53:
            r3 = r17
        L55:
            com.tencent.mm.plugin.finder.storage.t70 r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209124a0
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.mo141623x754a37bb()
            lb2.j r6 = (lb2.j) r6
            java.lang.Object r6 = r6.r()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r7) goto Lc5
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r4.f492236d
            java.util.LinkedList r6 = r6.P0()
            int r6 = r6.size()
            r8 = 0
        L78:
            if (r8 >= r6) goto Lb4
            com.tencent.mm.plugin.finder.storage.yj0 r9 = r4.f492236d
            java.util.LinkedList r9 = r9.P0()
            java.lang.Object r9 = r9.remove()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) r9
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
            long r10 = r4.mo2128x1ed62e84()
            com.tencent.mm.plugin.finder.storage.yj0 r12 = new com.tencent.mm.plugin.finder.storage.yj0
            r12.<init>()
            r13 = r18
            r12.f68959xf9a02e3e = r13
            r15 = r20
            r12.f68957xec748fc6 = r15
            r2 = 2
            r12.f68965x29d3a50c = r2
            r45.et0 r2 = r12.f68953x27838069
            r2.set(r7, r9)
            r12.n1(r10)
            so2.y0 r2 = new so2.y0
            r2.<init>(r12)
            com.tencent.mm.plugin.finder.storage.yj0 r9 = r2.f492236d
            r9.f209930x1 = r7
            r0.add(r2)
            int r8 = r8 + 1
            goto L78
        Lb4:
            r13 = r18
            r15 = r20
            int r2 = r4.f492255z
            int r2 = r2 - r6
            r4.f492255z = r2
            if (r2 >= 0) goto Lc9
            r2 = 0
            r4.f492255z = r2
            goto Lca
        Lc3:
            r3 = r17
        Lc5:
            r13 = r18
            r15 = r20
        Lc9:
            r2 = 0
        Lca:
            r3 = r5
            goto Ld
        Lcd:
            kz5.c0.p()
            r0 = 0
            throw r0
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0.J0(com.tencent.mm.plugin.finder.feed.model.l0, java.util.List, long, java.lang.String):java.util.List");
    }

    public static final void L0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, java.util.List list, java.util.List list2, long j17, java.lang.String str) {
        long j18;
        java.lang.String str2;
        l0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            j18 = 0;
            int i17 = -1;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) it.next()).f68953x27838069.m75936x14adae67(5);
            if (c19781xd1c47b87 != null) {
                java.util.Iterator it6 = arrayList2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it6.next()).m76058xa6514d24() == c19781xd1c47b87.m76058xa6514d24()) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                if (i17 < 0 && c19781xd1c47b87.m76058xa6514d24() != 0) {
                    arrayList2.add(c19781xd1c47b87);
                }
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            str2 = l0Var.f189659h;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 level1CommentInfo = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it7.next();
            java.util.Iterator it8 = list2.iterator();
            int i19 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((so2.y0) it8.next()).f492236d.t0() == level1CommentInfo.m76058xa6514d24()) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 >= 0) {
                list2.remove(i19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "mergeLocalLevel2Comments, remove level1ExistIndex:" + i19 + ", id:" + level1CommentInfo.m76058xa6514d24());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level1CommentInfo, "level1CommentInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = j17;
            yj0Var.f68957xec748fc6 = str;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, level1CommentInfo);
            yj0Var.n1(j18);
            arrayList.add(new so2.y0(yj0Var));
            java.util.Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0) it9.next();
                if (yj0Var2.Y0() == level1CommentInfo.m76058xa6514d24()) {
                    arrayList.add(new so2.y0(yj0Var2));
                }
                j18 = 0;
            }
        }
        if (arrayList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "mergeLocalLevel2Comments, total local size: " + arrayList.size() + ", level1 size:" + arrayList2.size());
        }
        list2.addAll(arrayList);
    }

    public static /* synthetic */ void P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, long j17, java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z zVar, int i19, java.lang.Object obj) {
        l0Var.O0(j17, str, str2, i17, z17, str3, (i19 & 64) != 0 ? -1 : i18, (i19 & 128) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z.f190029d : zVar);
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!(event instanceof fc2.t)) {
            return (event instanceof ec2.f) && ((ec2.f) event).f332492d == 3;
        }
        int i17 = ((fc2.t) event).f342518d;
        return i17 == 0 || i17 == 5 || i17 == 4;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            int i17 = ((fc2.t) ev6).f342527m;
            this.f189663o = i17;
            if (i17 < 0) {
                return;
            } else {
                M0(i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i0(this, i17));
            }
        }
        if ((ev6 instanceof ec2.f) && g92.b.f351302e.Y() && ((ec2.f) ev6).f332492d == 3) {
            M0(this.f189663o, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j0(this, ev6));
        }
    }

    public final void M0(int i17, yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189659h, "findFeed " + java.lang.Thread.currentThread().getName());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a0(lVar, this, i17));
    }

    public final void N0(int i17, int i18, yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189659h, "onAttach");
        this.f189661m = lVar;
        this.f189664p = i17;
        this.f189662n = i18;
    }

    public final void O0(long j17, java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String feedUsername, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z preloadScene) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadScene, "preloadScene");
        int ordinal = preloadScene.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            z18 = true;
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            z18 = false;
        }
        java.lang.String str3 = this.f189659h;
        if (z18) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "***preloadFirstPageComment disable for 青少年模式");
                return;
            }
            if (f189657t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "preloadFirstPageComment disable commentScene=" + i17);
                return;
            } else {
                if (g92.b.f351302e.Y() && preloadScene != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z.f190031f && preloadScene != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z.f190030e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "preloadFirstPageComment disable commentScene=" + i17 + "  for isEnableFinderGetCommentList preloadScene:" + preloadScene);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_preload_comment, 1) == 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "***preloadFirstPageComment disable");
                    return;
                }
            }
        }
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "***preloadFirstPageComment feedId is 0");
        } else {
            M0(i18, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.k0(j17, this, z17, i18, str, str2, i17, feedUsername));
        }
    }

    public final void Q0(long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3) this.f189666r.remove(java.lang.Long.valueOf(j17));
        if (c5445x963cab3 != null) {
            c5445x963cab3.e();
        }
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f189660i.add(aVar);
    }

    /* renamed from: onDetach */
    public final void m56485x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189659h, "onDetach");
        this.f189661m = null;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f189660i;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        f189657t = false;
        copyOnWriteArraySet.clear();
        this.f189665q.clear();
        ((java.util.LinkedHashMap) this.f189666r).clear();
        this.f189667s.clear();
    }
}
