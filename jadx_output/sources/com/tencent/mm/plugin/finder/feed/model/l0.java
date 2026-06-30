package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l0 extends fc2.d implements im5.b {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f108124t;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f108125g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f108126h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f108127i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f108128m;

    /* renamed from: n, reason: collision with root package name */
    public int f108129n;

    /* renamed from: o, reason: collision with root package name */
    public int f108130o;

    /* renamed from: p, reason: collision with root package name */
    public int f108131p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Vector f108132q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f108133r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f108134s;

    public l0(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f108125g = activity;
        this.f108126h = "Finder.FinderCommentPreloader";
        this.f108127i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f108131p = 2;
        this.f108132q = new java.util.Vector();
        this.f108133r = new java.util.LinkedHashMap();
        this.f108134s = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final void I0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, java.util.LinkedList linkedList, long j17, java.lang.String str) {
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
            com.tencent.mm.protocal.protobuf.FinderCommentInfo level1CommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next();
            kotlin.jvm.internal.o.g(level1CommentInfo, "level1CommentInfo");
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = j17;
            yj0Var.field_dupFlag = str;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, level1CommentInfo);
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
            if (y0Var.f410703d.Y0() == j18 && y0Var.f410703d.P0().size() > 0 && (i18 >= arrayList.size() - 1 || ((so2.y0) arrayList.get(i19)).f410703d.Y0() == j18)) {
                int size = y0Var.f410703d.P0().size();
                int i27 = 0;
                while (true) {
                    if (i27 < size) {
                        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) y0Var.f410703d.P0().remove();
                        kotlin.jvm.internal.o.d(finderCommentInfo);
                        long itemId = y0Var.getItemId();
                        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = new com.tencent.mm.plugin.finder.storage.yj0();
                        yj0Var2.field_feedId = j17;
                        yj0Var2.field_dupFlag = str;
                        yj0Var2.field_state = i17;
                        yj0Var2.field_actionInfo.set(1, finderCommentInfo);
                        yj0Var2.n1(itemId);
                        so2.y0 y0Var2 = new so2.y0(yj0Var2);
                        if (y0Var2.f410703d.h1()) {
                            y0Var2.f410703d.f128397x1 = true;
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
    
        if (((so2.y0) r17.get(r5)).f410703d.Y0() != 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List J0(com.tencent.mm.plugin.finder.feed.model.l0 r16, java.util.List r17, long r18, java.lang.String r20) {
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
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r4.f410703d
            long r6 = r6.Y0()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto Lc3
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r4.f410703d
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
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r6.f410703d
            long r10 = r6.Y0()
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 != 0) goto Lc5
            goto L55
        L53:
            r3 = r17
        L55:
            com.tencent.mm.plugin.finder.storage.t70 r6 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r6 = com.tencent.mm.plugin.finder.storage.t70.f127591a0
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            lb2.j r6 = (lb2.j) r6
            java.lang.Object r6 = r6.r()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r7) goto Lc5
            com.tencent.mm.plugin.finder.storage.yj0 r6 = r4.f410703d
            java.util.LinkedList r6 = r6.P0()
            int r6 = r6.size()
            r8 = 0
        L78:
            if (r8 >= r6) goto Lb4
            com.tencent.mm.plugin.finder.storage.yj0 r9 = r4.f410703d
            java.util.LinkedList r9 = r9.P0()
            java.lang.Object r9 = r9.remove()
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) r9
            kotlin.jvm.internal.o.d(r9)
            long r10 = r4.getItemId()
            com.tencent.mm.plugin.finder.storage.yj0 r12 = new com.tencent.mm.plugin.finder.storage.yj0
            r12.<init>()
            r13 = r18
            r12.field_feedId = r13
            r15 = r20
            r12.field_dupFlag = r15
            r2 = 2
            r12.field_state = r2
            r45.et0 r2 = r12.field_actionInfo
            r2.set(r7, r9)
            r12.n1(r10)
            so2.y0 r2 = new so2.y0
            r2.<init>(r12)
            com.tencent.mm.plugin.finder.storage.yj0 r9 = r2.f410703d
            r9.f128397x1 = r7
            r0.add(r2)
            int r8 = r8 + 1
            goto L78
        Lb4:
            r13 = r18
            r15 = r20
            int r2 = r4.f410722z
            int r2 = r2 - r6
            r4.f410722z = r2
            if (r2 >= 0) goto Lc9
            r2 = 0
            r4.f410722z = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.l0.J0(com.tencent.mm.plugin.finder.feed.model.l0, java.util.List, long, java.lang.String):java.util.List");
    }

    public static final void L0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, java.util.List list, java.util.List list2, long j17, java.lang.String str) {
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
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) ((com.tencent.mm.plugin.finder.storage.yj0) it.next()).field_actionInfo.getCustom(5);
            if (finderCommentInfo != null) {
                java.util.Iterator it6 = arrayList2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it6.next()).getCommentId() == finderCommentInfo.getCommentId()) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                if (i17 < 0 && finderCommentInfo.getCommentId() != 0) {
                    arrayList2.add(finderCommentInfo);
                }
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            str2 = l0Var.f108126h;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo level1CommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it7.next();
            java.util.Iterator it8 = list2.iterator();
            int i19 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((so2.y0) it8.next()).f410703d.t0() == level1CommentInfo.getCommentId()) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 >= 0) {
                list2.remove(i19);
                com.tencent.mars.xlog.Log.i(str2, "mergeLocalLevel2Comments, remove level1ExistIndex:" + i19 + ", id:" + level1CommentInfo.getCommentId());
            }
            kotlin.jvm.internal.o.g(level1CommentInfo, "level1CommentInfo");
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = j17;
            yj0Var.field_dupFlag = str;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, level1CommentInfo);
            yj0Var.n1(j18);
            arrayList.add(new so2.y0(yj0Var));
            java.util.Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = (com.tencent.mm.plugin.finder.storage.yj0) it9.next();
                if (yj0Var2.Y0() == level1CommentInfo.getCommentId()) {
                    arrayList.add(new so2.y0(yj0Var2));
                }
                j18 = 0;
            }
        }
        if (arrayList.size() > 0) {
            com.tencent.mars.xlog.Log.i(str2, "mergeLocalLevel2Comments, total local size: " + arrayList.size() + ", level1 size:" + arrayList2.size());
        }
        list2.addAll(arrayList);
    }

    public static /* synthetic */ void P0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, long j17, java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3, int i18, com.tencent.mm.plugin.finder.feed.model.z zVar, int i19, java.lang.Object obj) {
        l0Var.O0(j17, str, str2, i17, z17, str3, (i19 & 64) != 0 ? -1 : i18, (i19 & 128) != 0 ? com.tencent.mm.plugin.finder.feed.model.z.f108496d : zVar);
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if (!(event instanceof fc2.t)) {
            return (event instanceof ec2.f) && ((ec2.f) event).f250959d == 3;
        }
        int i17 = ((fc2.t) event).f260985d;
        return i17 == 0 || i17 == 5 || i17 == 4;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            int i17 = ((fc2.t) ev6).f260994m;
            this.f108130o = i17;
            if (i17 < 0) {
                return;
            } else {
                M0(i17, new com.tencent.mm.plugin.finder.feed.model.i0(this, i17));
            }
        }
        if ((ev6 instanceof ec2.f) && g92.b.f269769e.Y() && ((ec2.f) ev6).f250959d == 3) {
            M0(this.f108130o, new com.tencent.mm.plugin.finder.feed.model.j0(this, ev6));
        }
    }

    public final void M0(int i17, yz5.l lVar) {
        com.tencent.mars.xlog.Log.i(this.f108126h, "findFeed " + java.lang.Thread.currentThread().getName());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.a0(lVar, this, i17));
    }

    public final void N0(int i17, int i18, yz5.l lVar) {
        com.tencent.mars.xlog.Log.i(this.f108126h, "onAttach");
        this.f108128m = lVar;
        this.f108131p = i17;
        this.f108129n = i18;
    }

    public final void O0(long j17, java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String feedUsername, int i18, com.tencent.mm.plugin.finder.feed.model.z preloadScene) {
        boolean z18;
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        kotlin.jvm.internal.o.g(preloadScene, "preloadScene");
        int ordinal = preloadScene.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            z18 = true;
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            z18 = false;
        }
        java.lang.String str3 = this.f108126h;
        if (z18) {
            if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                com.tencent.mars.xlog.Log.i(str3, "***preloadFirstPageComment disable for 青少年模式");
                return;
            }
            if (f108124t) {
                com.tencent.mars.xlog.Log.i(str3, "preloadFirstPageComment disable commentScene=" + i17);
                return;
            } else {
                if (g92.b.f269769e.Y() && preloadScene != com.tencent.mm.plugin.finder.feed.model.z.f108498f && preloadScene != com.tencent.mm.plugin.finder.feed.model.z.f108497e) {
                    com.tencent.mars.xlog.Log.i(str3, "preloadFirstPageComment disable commentScene=" + i17 + "  for isEnableFinderGetCommentList preloadScene:" + preloadScene);
                    return;
                }
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_preload_comment, 1) == 1)) {
                    com.tencent.mars.xlog.Log.i(str3, "***preloadFirstPageComment disable");
                    return;
                }
            }
        }
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "***preloadFirstPageComment feedId is 0");
        } else {
            M0(i18, new com.tencent.mm.plugin.finder.feed.model.k0(j17, this, z17, i18, str, str2, i17, feedUsername));
        }
    }

    public final void Q0(long j17) {
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = (com.tencent.mm.autogen.events.FeedUpdateEvent) this.f108133r.remove(java.lang.Long.valueOf(j17));
        if (feedUpdateEvent != null) {
            feedUpdateEvent.e();
        }
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f108127i.add(aVar);
    }

    public final void onDetach() {
        com.tencent.mars.xlog.Log.i(this.f108126h, "onDetach");
        this.f108128m = null;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f108127i;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        f108124t = false;
        copyOnWriteArraySet.clear();
        this.f108132q.clear();
        ((java.util.LinkedHashMap) this.f108133r).clear();
        this.f108134s.clear();
    }
}
