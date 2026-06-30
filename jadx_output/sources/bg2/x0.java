package bg2;

/* loaded from: classes3.dex */
public final class x0 extends tc2.c implements tc2.h, cg2.l, uc2.b {
    public final double A;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20613e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f20614f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f20615g;

    /* renamed from: h, reason: collision with root package name */
    public cg2.k f20616h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f20617i;

    /* renamed from: m, reason: collision with root package name */
    public we2.p f20618m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20619n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20620o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20621p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20622q;

    /* renamed from: r, reason: collision with root package name */
    public int f20623r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20624s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f20625t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f20626u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f20627v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20628w;

    /* renamed from: x, reason: collision with root package name */
    public long f20629x;

    /* renamed from: y, reason: collision with root package name */
    public final double f20630y;

    /* renamed from: z, reason: collision with root package name */
    public final double f20631z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20613e = "LiveConvertDanmakuController";
        this.f20624s = 3;
        this.f20626u = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f20627v = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f20630y = 2.57309942E-4d;
        this.f20631z = 0.00140350877d;
        this.A = 0.286549708d;
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        java.util.ArrayList<r45.ch1> arrayList;
        java.util.ArrayList<r45.t12> arrayList2;
        java.lang.String str;
        cg2.k kVar;
        cg2.p bulletManager;
        java.lang.String string;
        int[] iArr;
        int[] iArr2;
        cg2.k kVar2;
        cg2.p bulletManager2;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (this.f20619n) {
            r45.nn0 nn0Var = (r45.nn0) resp.getCustom(48);
            if (nn0Var != null) {
                c7(java.lang.Boolean.valueOf(nn0Var.getBoolean(0)), java.lang.Boolean.valueOf(nn0Var.getBoolean(1)));
                r45.qx3 qx3Var = (r45.qx3) nn0Var.getCustom(3);
                if (qx3Var != null && (kVar2 = this.f20616h) != null && (bulletManager2 = kVar2.getBulletManager()) != null) {
                    bulletManager2.f41120h = qx3Var;
                    cg2.w wVar = bulletManager2.f41119g;
                    if (wVar != null) {
                        long integer = qx3Var.getInteger(0);
                        long integer2 = qx3Var.getInteger(1);
                        com.tencent.mars.xlog.Log.i("LiveFeedCenterDanmakuRender", "[updateAnimateDuration] " + integer + ", " + integer2);
                        wVar.f41143b = integer;
                        wVar.f41144c = integer2;
                    }
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList list = resp.getList(14);
            if (list != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    r45.ch1 ch1Var = (r45.ch1) obj;
                    we2.p pVar = this.f20618m;
                    if (pVar == null || (iArr2 = pVar.f()) == null) {
                        iArr2 = new int[0];
                    }
                    if (kz5.z.F(iArr2, ch1Var.getInteger(1))) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
                arrayList = null;
            }
            if (arrayList != null) {
                for (r45.ch1 ch1Var2 : arrayList) {
                    we2.p pVar2 = this.f20618m;
                    if (pVar2 != null) {
                        kotlin.jvm.internal.o.d(ch1Var2);
                        dk2.zf b17 = pVar2.b(ch1Var2);
                        if (b17 != null) {
                            if (!Y6(b17)) {
                                b17 = null;
                            }
                            if (b17 != null) {
                                linkedList.add(b17);
                            }
                        }
                    }
                }
            }
            java.util.LinkedList list2 = resp.getList(14);
            if (list2 != null) {
                kotlin.jvm.internal.m0.a(list2).removeAll(linkedList);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList list3 = resp.getList(2);
            if (list3 != null) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list3) {
                    r45.t12 t12Var = (r45.t12) obj2;
                    we2.p pVar3 = this.f20618m;
                    if (pVar3 == null || (iArr = pVar3.f()) == null) {
                        iArr = new int[0];
                    }
                    if (kz5.z.F(iArr, t12Var.getInteger(3))) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (!(arrayList2 != null && (arrayList2.isEmpty() ^ true))) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                for (r45.t12 t12Var2 : arrayList2) {
                    we2.p pVar4 = this.f20618m;
                    if (pVar4 != null) {
                        kotlin.jvm.internal.o.d(t12Var2);
                        dk2.zf c17 = pVar4.c(t12Var2);
                        if (c17 != null) {
                            if (!Y6(c17)) {
                                c17 = null;
                            }
                            if (c17 != null) {
                                linkedList2.add(c17);
                            }
                        }
                    }
                }
            }
            java.util.LinkedList list4 = resp.getList(2);
            if (list4 != null) {
                kotlin.jvm.internal.m0.a(list4).removeAll(linkedList2);
            }
            java.util.LinkedList list5 = resp.getList(14);
            kotlin.jvm.internal.o.f(list5, "getApp_msg_list(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list5) {
                if (((r45.ch1) obj3).getInteger(1) == 20082) {
                    arrayList3.add(obj3);
                }
            }
            java.util.Iterator it = arrayList3.iterator();
            r45.ai1 ai1Var = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.f20613e;
                if (!hasNext) {
                    break;
                }
                r45.ch1 ch1Var3 = (r45.ch1) it.next();
                com.tencent.mm.protobuf.g byteString = ch1Var3.getByteString(4);
                if (byteString != null && (string = ch1Var3.getString(2)) != null) {
                    r45.ai1 ai1Var2 = new r45.ai1();
                    ai1Var2.parseFrom(byteString.g());
                    if ((ai1Var != null ? ai1Var.getInteger(0) : 0) < ai1Var2.getInteger(0)) {
                        com.tencent.mars.xlog.Log.i(str, "received hot word app msg: " + ai1Var2.getString(1) + ", clientMsgId:" + string);
                        ai1Var = ai1Var2;
                    }
                }
            }
            if (ai1Var != null && (kVar = this.f20616h) != null && (bulletManager = kVar.getBulletManager()) != null) {
                com.tencent.mars.xlog.Log.i("LiveBulletManager", "addHotWordDanmaku " + ai1Var);
                wp.a f57 = bulletManager.a().f5(-2147483646, ai1Var);
                f57.f448335f = c01.id.c();
                f57.f448348s = true;
                f57.w(new zp.h(bulletManager.f41120h != null ? r10.getInteger(2) : 4000));
                bulletManager.a().f438852d.k1(kz5.b0.c(f57), false, false);
            }
            linkedList.addAll(linkedList2);
            kz5.g0.t(linkedList, new bg2.v0());
            if ((linkedList.isEmpty() ^ true ? linkedList : null) != null) {
                com.tencent.mars.xlog.Log.i(str, "[dealWithMsgList] size = " + linkedList.size() + ", isHistoryMsg = " + resp.getInteger(22));
                this.f20627v.addAll(linkedList);
                if (this.f20628w == null || (!((kotlinx.coroutines.a) r14).a())) {
                    kotlinx.coroutines.r2 r2Var = this.f20628w;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
                    this.f20628w = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new bg2.w0(this, null), 3, null) : null;
                }
            }
        }
    }

    @Override // tc2.c
    public void Q6() {
        r45.kz3 kz3Var;
        r45.ah6 ah6Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.kr0 d17;
        java.util.LinkedList list;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (finderObject = feedObject.getFinderObject()) == null || (d17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject)) == null || (list = d17.getList(12)) == null) {
            kz3Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.kz3) obj).getInteger(0) == 22) {
                        break;
                    }
                }
            }
            kz3Var = (r45.kz3) obj;
        }
        this.f20625t = (kz3Var == null || (ah6Var = (r45.ah6) kz3Var.getCustom(13)) == null) ? null : java.lang.Integer.valueOf(ah6Var.getInteger(2));
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.G7).getValue()).r()).booleanValue();
        boolean z17 = kz3Var != null || booleanValue;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.V7).getValue()).r();
        java.lang.Integer num = (java.lang.Integer) (((java.lang.Number) r17).intValue() > 0 ? r17 : null);
        if (num != null) {
            this.f20625t = java.lang.Integer.valueOf(num.intValue() * 1000);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svr = ");
        sb6.append(kz3Var != null);
        sb6.append(", local = ");
        sb6.append(booleanValue);
        sb6.append(", rowCount=");
        sb6.append(this.f20624s);
        sb6.append(", danmakuDuration=");
        sb6.append(this.f20625t);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f20613e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        this.f20619n = z17;
        com.tencent.mars.xlog.Log.i(str, "[isExptOn] = " + this.f20619n);
        if (this.f20619n && this.f20621p && this.f20620o) {
            a7();
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        android.content.Context context;
        zy2.ra Sj;
        b7();
        if (this.f20619n) {
            tc2.g gVar = this.f417141d;
            in5.s0 s0Var = gVar.f417149i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f293121e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
            in5.s0 s0Var2 = gVar.f417149i;
            com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var = s0Var2 != null ? (so2.j5) s0Var2.f293125i : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = r0Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0Var : null;
            com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
            ml2.u1 u1Var = ml2.u1.f328045f3;
            jz5.l[] lVarArr = new jz5.l[2];
            if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("liveid", str);
            lVarArr[1] = new jz5.l("barrage_count", java.lang.String.valueOf(this.f20623r));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        this.f20619n = false;
        this.f20623r = 0;
    }

    @Override // tc2.c
    public void X6() {
        this.f20626u.clear();
    }

    public final boolean Y6(dk2.zf zfVar) {
        java.lang.Object obj;
        java.util.List exposedMsgIdList = this.f20626u;
        kotlin.jvm.internal.o.f(exposedMsgIdList, "exposedMsgIdList");
        synchronized (exposedMsgIdList) {
            java.util.Iterator it = exposedMsgIdList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(zfVar.v(), (java.lang.String) obj)) {
                    break;
                }
            }
        }
        if (obj != null) {
            return false;
        }
        int type = zfVar.getType();
        if (type != 1) {
            return type == 20013 || type == 20113;
        }
        java.lang.String j17 = zfVar.j();
        int length = j17 != null ? j17.length() : 0;
        return 1 <= length && length < 21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z6(dk2.zf r18) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x0.Z6(dk2.zf):void");
    }

    public final void a7() {
        cg2.p bulletManager;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        cg2.k finderLiveFeedDanmakuTextureView;
        if (this.f20622q) {
            return;
        }
        this.f20622q = true;
        if (this.f20616h != null) {
            return;
        }
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = null;
        if (s0Var != null) {
            android.widget.FrameLayout frameLayout = this.f20615g;
            if (frameLayout == null) {
                frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.uah);
            }
            this.f20614f = frameLayout;
            this.f20617i = new android.view.View(s0Var.f293121e);
            android.widget.FrameLayout frameLayout2 = this.f20614f;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            int i17 = cg2.j.f41109a;
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            if (cg2.j.f41109a == 1) {
                android.content.Context context = itemView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                finderLiveFeedDanmakuTextureView = new com.tencent.mm.plugin.finder.live.convert.danmaku.FinderLiveFeedDanmakuNativeView(context);
            } else {
                android.content.Context context2 = itemView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                finderLiveFeedDanmakuTextureView = new com.tencent.mm.plugin.finder.live.convert.danmaku.FinderLiveFeedDanmakuTextureView(context2);
            }
            this.f20616h = finderLiveFeedDanmakuTextureView;
            android.widget.FrameLayout frameLayout3 = this.f20614f;
            if (frameLayout3 != null) {
                frameLayout3.addView(this.f20617i, new android.widget.FrameLayout.LayoutParams(-1, 1));
            }
            android.widget.FrameLayout frameLayout4 = this.f20614f;
            if (frameLayout4 != null) {
                frameLayout4.addView(finderLiveFeedDanmakuTextureView.getView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
            so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
            if (h1Var != null) {
                finderLiveFeedDanmakuTextureView.e(h1Var);
            }
            cg2.p bulletManager2 = finderLiveFeedDanmakuTextureView.getBulletManager();
            bg2.p0 p0Var = new bg2.p0(this);
            bulletManager2.getClass();
            cg2.c0 c0Var = bulletManager2.f41118f;
            if (c0Var != null) {
                c0Var.f41095c = p0Var;
            }
            finderLiveFeedDanmakuTextureView.getBulletManager().f41117e = new bg2.s0(this, s0Var);
            finderLiveFeedDanmakuTextureView.onAttach();
            finderLiveFeedDanmakuTextureView.getBulletManager().d(this.f20624s, this.f20615g == null);
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
        if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null) {
            finderObject = feedObject.getFinderObject();
        }
        we2.p pVar = new we2.p();
        pVar.g(new bg2.t0(finderObject, this));
        this.f20618m = pVar;
        cg2.k kVar = this.f20616h;
        if (kVar == null || (bulletManager = kVar.getBulletManager()) == null) {
            return;
        }
        we2.p pVar2 = this.f20618m;
        bulletManager.f41121i = pVar2;
        cg2.c0 c0Var2 = bulletManager.f41118f;
        if (c0Var2 != null) {
            c0Var2.f41094b = pVar2;
        }
    }

    public final void b7() {
        if (this.f20622q) {
            this.f20622q = false;
            cg2.k kVar = this.f20616h;
            if (kVar != null) {
                kVar.onDetach();
            }
            this.f20616h = null;
            android.widget.FrameLayout frameLayout = this.f20614f;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            kotlinx.coroutines.r2 r2Var = this.f20628w;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f20628w = null;
        }
    }

    public final void c7(java.lang.Boolean bool, java.lang.Boolean bool2) {
        boolean booleanValue;
        boolean booleanValue2;
        if (this.f20619n) {
            java.lang.String str = this.f20613e;
            if (bool != null && this.f20621p != (booleanValue2 = bool.booleanValue())) {
                this.f20621p = booleanValue2;
                com.tencent.mars.xlog.Log.i(str, "[updateDanmakuConfig] user: " + booleanValue2);
            }
            if (bool2 != null && this.f20620o != (booleanValue = bool2.booleanValue())) {
                this.f20620o = booleanValue;
                com.tencent.mars.xlog.Log.i(str, "[updateDanmakuConfig] sys: " + booleanValue);
            }
            tc2.g gVar = this.f417141d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
            if (baseFinderFeed != null) {
                baseFinderFeed.S1(this.f20619n && this.f20620o);
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
            if (baseFinderFeed2 != null) {
                baseFinderFeed2.d2(this.f20621p);
            }
            if (this.f20619n && this.f20620o && this.f20621p) {
                a7();
            } else {
                b7();
            }
        }
    }
}
