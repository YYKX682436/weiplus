package bg2;

/* loaded from: classes3.dex */
public final class d2 extends tc2.c implements tc2.h, uc2.f {

    /* renamed from: z, reason: collision with root package name */
    public static final int f20008z;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20009e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20010f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20011g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20012h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20013i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20014m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20015n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20016o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20017p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20018q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20019r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20020s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20021t;

    /* renamed from: u, reason: collision with root package name */
    public long f20022u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20023v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20024w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Runnable f20025x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f20026y;

    static {
        ae2.in inVar = ae2.in.f3688a;
        f20008z = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3852q3).getValue()).r()).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20009e = "Finder.LiveConvertMainController";
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0320  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x03ff -> B:14:0x0404). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0412 -> B:15:0x0422). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y6(bg2.d2 r35, kotlinx.coroutines.y0 r36, r45.hc1 r37, android.content.Context r38, com.tencent.mm.protocal.protobuf.FinderObject r39, r45.qt2 r40, r45.nw1 r41, r45.kr0 r42, kotlin.coroutines.Continuation r43) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.d2.Y6(bg2.d2, kotlinx.coroutines.y0, r45.hc1, android.content.Context, com.tencent.mm.protocal.protobuf.FinderObject, r45.qt2, r45.nw1, r45.kr0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc2.c
    public void P6() {
        r45.kz3 kz3Var;
        r45.kz3 kz3Var2;
        r45.kz3 kz3Var3;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.lang.Object obj;
        java.util.LinkedList list3;
        java.lang.Object obj2;
        java.util.LinkedList list4;
        java.lang.Object obj3;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        java.lang.Object obj4 = null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        r45.kr0 d17 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
        this.f20010f = finderObject != null && com.tencent.mm.plugin.finder.storage.FinderItem.Companion.f(finderObject);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBind nickName:");
        sb6.append(finderObject != null ? finderObject.getNickname() : null);
        sb6.append(", isExptOn:");
        sb6.append(this.f20010f);
        sb6.append(", style_type:");
        sb6.append(d17 != null ? java.lang.Integer.valueOf(d17.getInteger(0)) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f20009e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (this.f20010f) {
            java.lang.Integer valueOf = d17 != null ? java.lang.Integer.valueOf(d17.getInteger(0)) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                this.f20011g = ((r45.jg6) d17.getCustom(1)) != null;
            } else if (valueOf != null && valueOf.intValue() == 2) {
                this.f20012h = ((r45.bh6) d17.getCustom(2)) != null;
            } else if (valueOf != null && valueOf.intValue() == 3) {
                this.f20013i = ((r45.qg6) d17.getCustom(3)) != null;
            } else if (valueOf != null && valueOf.intValue() == 5) {
                this.f20014m = ((r45.bg6) d17.getCustom(5)) != null;
            } else if (valueOf != null && valueOf.intValue() == 10) {
            } else if (valueOf != null && valueOf.intValue() == 11) {
            } else if (valueOf != null && valueOf.intValue() == 12) {
                this.f20017p = ((r45.rg6) d17.getCustom(8)) != null;
            } else if (valueOf != null && valueOf.intValue() == 17) {
                this.f20018q = true;
            } else {
                com.tencent.mars.xlog.Log.e(str, "invalid style type");
            }
            this.f20021t = pm0.v.A(d17 != null ? d17.getLong(11) : 0L, 1L);
            if (d17 == null || (list4 = d17.getList(12)) == null) {
                kz3Var = null;
            } else {
                java.util.Iterator it = list4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    r45.kz3 kz3Var4 = (r45.kz3) obj3;
                    if (kz3Var4.getInteger(0) == 6 && ((r45.mg6) kz3Var4.getCustom(1)) != null) {
                        break;
                    }
                }
                kz3Var = (r45.kz3) obj3;
            }
            this.f20015n = kz3Var != null;
            if (d17 == null || (list3 = d17.getList(12)) == null) {
                kz3Var2 = null;
            } else {
                java.util.Iterator it6 = list3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    r45.kz3 kz3Var5 = (r45.kz3) obj2;
                    if (kz3Var5.getInteger(0) == 7 && ((r45.kg6) kz3Var5.getCustom(2)) != null) {
                        break;
                    }
                }
                kz3Var2 = (r45.kz3) obj2;
            }
            this.f20016o = kz3Var2 != null;
            if (d17 == null || (list2 = d17.getList(12)) == null) {
                kz3Var3 = null;
            } else {
                java.util.Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    r45.kz3 kz3Var6 = (r45.kz3) obj;
                    if (kz3Var6.getInteger(0) == 25 && ((r45.tg6) kz3Var6.getCustom(16)) != null) {
                        break;
                    }
                }
                kz3Var3 = (r45.kz3) obj;
            }
            this.f20019r = kz3Var3 != null;
            if (d17 != null && (list = d17.getList(12)) != null) {
                java.util.Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it8.next();
                    r45.kz3 kz3Var7 = (r45.kz3) next;
                    if (kz3Var7.getInteger(0) == 27 && ((r45.wg6) kz3Var7.getCustom(18)) != null) {
                        obj4 = next;
                        break;
                    }
                }
                obj4 = (r45.kz3) obj4;
            }
            this.f20020s = obj4 != null;
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.G2).getValue()).r()).intValue() == 1) {
                this.f20021t = true;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "isExptOn:" + this.f20010f + ", hitStyleOne:" + this.f20011g + ", hitStyleTwo:" + this.f20012h + ", hitStyleThree:" + this.f20013i + ", hitStyleFive:" + this.f20014m + ", hitStyleSix:" + this.f20015n + ", hitStyleSeven:" + this.f20016o + ", hitStyleTwentySeven:" + this.f20020s + ", forbidenPk: " + this.f20021t);
    }

    @Override // tc2.c
    public void Q6() {
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.dm2 object_extend;
        r45.t94 t94Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        kotlinx.coroutines.r2 r2Var = null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null) ? null : feedObject3.getFinderObject();
        r45.kr0 d17 = finderObject2 != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject2) : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
        r45.nw1 liveInfo = (baseFinderFeed2 == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null) ? null : feedObject2.getLiveInfo();
        in5.s0 s0Var = gVar.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = gVar.f417148h;
        boolean z17 = false;
        if (baseFinderFeed3 != null && (feedObject = baseFinderFeed3.getFeedObject()) != null && (finderObject = feedObject.getFinderObject()) != null && (object_extend = finderObject.getObject_extend()) != null && (t94Var = (r45.t94) object_extend.getCustom(44)) != null && t94Var.getBoolean(0)) {
            z17 = true;
        }
        java.lang.String str = this.f20009e;
        if (context != null && finderObject2 != null && liveInfo != null && ((d17 != null || z17) && this.f20010f)) {
            com.tencent.mars.xlog.Log.i(str, "start live job");
            this.f20026y = null;
            kotlinx.coroutines.r2 r2Var2 = this.f20023v;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            in5.s0 s0Var2 = gVar.f417149i;
            if (s0Var2 != null && (y0Var = s0Var2.f293120d) != null) {
                r2Var = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new bg2.b2(this, liveInfo, context, finderObject2, d17, null), 2, null);
            }
            this.f20023v = r2Var;
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "onFocusFeedCenter params invalid, isExptOn:" + this.f20010f + ", styleInfo:" + d17 + ", context:" + context + ", finderObject:" + finderObject2 + ", liveInfo:" + liveInfo);
    }

    @Override // tc2.c
    public void U6() {
        if (this.f20010f) {
            com.tencent.mars.xlog.Log.i(this.f20009e, "onUnFocusFeedCenter offlineJob:" + this.f20025x);
            release();
        }
    }

    public final com.tencent.mm.modelbase.i Z6(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var, boolean z17, byte[] bArr) {
        r45.o72 o72Var;
        android.content.Context context2;
        long j17;
        r45.qt2 qt2Var2 = qt2Var;
        boolean E = zl2.q4.f473933a.E();
        java.lang.String str = this.f20009e;
        if (E) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("traceLiveCookies ");
            sb6.append(bArr == null ? "null" : android.util.Base64.encodeToString(bArr, 2));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
        i95.m c17 = i95.n0.c(ss5.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ss5.k0 k0Var = (ss5.k0) c17;
        r45.kv0 b17 = db2.t4.f228171a.b(3976, qt2Var2);
        java.lang.String e17 = xy2.c.e(context);
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        long j18 = liveInfo != null ? liveInfo.getLong(0) : -1L;
        long id6 = finderObject.getId();
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        if (objectNonceId == null) {
            objectNonceId = "";
        }
        java.lang.String str2 = objectNonceId;
        r45.dm2 object_extend = finderObject.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        ml2.e4 e4Var = ml2.e4.f327376e;
        if (qt2Var2 == null) {
            qt2Var2 = new r45.qt2();
        }
        r45.qt2 qt2Var3 = qt2Var2;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        sb7.append(liveInfo2 != null ? liveInfo2.getLong(0) : -1L);
        sb7.append('_');
        sb7.append(java.lang.System.currentTimeMillis());
        java.lang.String sb8 = sb7.toString();
        bg2.u1 u1Var = new bg2.u1();
        if (z17) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
            if (liveInfo3 != null) {
                j17 = liveInfo3.getLong(0);
                context2 = context;
            } else {
                context2 = context;
                j17 = -1;
            }
            o72Var = r4Var.T(context2, j17, str);
        } else {
            o72Var = null;
        }
        com.tencent.mm.modelbase.i B4 = ss5.k0.B4(k0Var, b17, e17, bArr, j18, id6, str2, string, 9, z17, 4, null, 2, qt2Var3, sb8, u1Var, "", null, o72Var, true, null, null, 0L, null, 5768192, null);
        ((ke2.c) B4).f306939z = false;
        return B4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(boolean r45, r45.nw1 r46, android.content.Context r47, com.tencent.mm.protocal.protobuf.FinderObject r48, r45.qt2 r49, r45.kr0 r50, int r51, kotlin.coroutines.Continuation r52) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.d2.a7(boolean, r45.nw1, android.content.Context, com.tencent.mm.protocal.protobuf.FinderObject, r45.qt2, r45.kr0, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc2.h
    public void g5(android.content.Intent intent, r45.wk0 enterLiveParams) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(enterLiveParams, "enterLiveParams");
        super.g5(intent, enterLiveParams);
        if (this.f20010f) {
            tc2.g gVar = this.f417141d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
            long j17 = (baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject2.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
            r45.kr0 styleInfo = (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null) ? null : feedObject.getStyleInfo();
            r45.ta4 ta4Var = (r45.ta4) enterLiveParams.getCustom(7);
            if (ta4Var == null) {
                ta4Var = new r45.ta4();
            }
            ta4Var.set(17, java.lang.Long.valueOf(j17));
            r45.li4 li4Var = new r45.li4();
            li4Var.set(0, styleInfo != null ? hc2.b.a(styleInfo) : null);
            byte[] bArr = this.f20026y;
            li4Var.set(1, bArr != null ? pm0.b0.h(bArr) : null);
            ta4Var.set(18, li4Var);
        }
    }

    public final void release() {
        kotlinx.coroutines.r2 r2Var = this.f20023v;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f20023v = null;
        kotlinx.coroutines.r2 r2Var2 = this.f20024w;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f20024w = null;
        java.lang.Runnable runnable = this.f20025x;
        if (runnable != null) {
            runnable.run();
        }
        this.f20025x = null;
        this.f20026y = null;
    }
}
