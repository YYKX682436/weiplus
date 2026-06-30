package ch2;

/* loaded from: classes10.dex */
public final class o2 extends if2.b implements zh2.b, mf2.c, tn0.x0, mf2.f0, bh2.b {
    public long A;
    public boolean B;
    public boolean C;
    public final jz5.g D;
    public final jz5.g E;
    public kotlinx.coroutines.r2 F;
    public boolean G;
    public final java.util.List H;
    public kotlinx.coroutines.r2 I;

    /* renamed from: J, reason: collision with root package name */
    public kotlinx.coroutines.r2 f41419J;
    public kotlinx.coroutines.r2 K;
    public kotlinx.coroutines.r2 L;
    public kotlinx.coroutines.r2 M;
    public kotlinx.coroutines.r2 N;
    public com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole P;
    public int Q;
    public boolean R;
    public kotlinx.coroutines.r2 S;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f41420m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f41421n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f41422o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f41423p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f41424q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f41425r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f41426s;

    /* renamed from: t, reason: collision with root package name */
    public long f41427t;

    /* renamed from: u, reason: collision with root package name */
    public long f41428u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f41429v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f41430w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f41431x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f41432y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f41433z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f41420m = jz5.h.b(new ch2.w1(this));
        this.f41421n = jz5.h.b(new ch2.x(this));
        this.f41422o = jz5.h.b(new ch2.y(this));
        this.f41423p = jz5.h.b(new ch2.k0(this));
        this.f41424q = jz5.h.b(new ch2.l0(this));
        this.f41425r = jz5.h.b(new ch2.m0(this));
        this.f41426s = jz5.h.b(new ch2.j0(this));
        this.f41427t = i7().f328988r.getLong(0);
        this.f41428u = i7().f328983m;
        this.f41429v = h7().f328852o;
        this.f41431x = jz5.h.b(ch2.p1.f41436d);
        this.f41433z = new com.tencent.mm.sdk.platformtools.b4("sing_trtc_sei_sender", (com.tencent.mm.sdk.platformtools.a4) new ch2.l2(this), true);
        this.D = jz5.h.b(new ch2.i0(this, store));
        this.E = jz5.h.b(new ch2.h0(this));
        this.H = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.Q = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (((kotlinx.coroutines.a) r4).a() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E7(ch2.o2 r12, r45.yx1 r13, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole r14, yz5.l r15, int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.E7(ch2.o2, r45.yx1, com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole, yz5.l, int, java.lang.Object):void");
    }

    public static final void Z6(ch2.o2 o2Var, boolean z17, org.json.JSONObject jSONObject, long j17, r45.yx1 yx1Var) {
        r45.ay1 ay1Var;
        jSONObject.putOpt("liveId", java.lang.Long.valueOf(o2Var.i7().f328988r.getLong(0)));
        jSONObject.putOpt("objectId", java.lang.Long.valueOf(o2Var.i7().f328983m));
        jSONObject.putOpt("uniqueId", yx1Var.f391459e);
        r45.by1 by1Var = yx1Var.f391466o;
        java.lang.String str = (by1Var == null || (ay1Var = by1Var.f371143d) == null) ? null : ay1Var.f370351e;
        if (str == null) {
            str = "";
        }
        jSONObject.putOpt("songName", str);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct();
        finderLiveErrorReportStruct.f57145e = 201;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("result", z17 ? 1 : 0);
        jSONObject2.put("songPrepareCost", r26.i0.v(java.lang.String.valueOf(j17), ",", ";", false, 4, null));
        jSONObject2.put("errMsg", jSONObject);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        finderLiveErrorReportStruct.p(r26.i0.t(jSONObject3, ",", ";", false));
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "reportSongResourceLoad success: " + z17 + " errMsg: " + jSONObject);
        finderLiveErrorReportStruct.k();
    }

    public final void A7(r45.fa4 seiData) {
        r45.x84 x84Var;
        r45.ha4 ha4Var;
        r45.ha4 ha4Var2;
        kotlin.jvm.internal.o.g(seiData, "seiData");
        if (i7().b7() && (x84Var = seiData.f374147h) != null) {
            x84Var.f389873o = c01.id.c();
            r45.x84 x84Var2 = q7().f346309p;
            java.lang.Integer valueOf = x84Var2 != null ? java.lang.Integer.valueOf(x84Var2.f389867f) : null;
            if ((valueOf != null ? valueOf.intValue() : 0) > x84Var.f389867f) {
                com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "handleSEIKTVInfo first check version, ktv_action_version invalid, local: " + valueOf + " cur: " + x84Var.f389867f);
                return;
            }
            r45.ia4 ia4Var = x84Var.f389870i;
            java.lang.String str = ia4Var != null ? ia4Var.f376870e : null;
            if (str == null) {
                str = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0(x84Var2 != null ? x84Var2.f389868g : null, x84Var.f389868g)) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(x84Var2 != null ? x84Var2.f389871m : null, x84Var.f389871m)) {
                    if ((x84Var2 != null ? x84Var2.f389866e : 0L) > x84Var.f389866e) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseSingSEIInfoData seq invalid, outsideSingSEISeq: ");
                        sb6.append(x84Var2 != null ? java.lang.Long.valueOf(x84Var2.f389866e) : null);
                        sb6.append(" seq: ");
                        sb6.append(x84Var.f389866e);
                        sb6.append(" uniqueId: ");
                        sb6.append(str);
                        sb6.append(" act: ");
                        sb6.append(x84Var2 != null ? x84Var2.f389868g : null);
                        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
                        return;
                    }
                }
            }
            if (x84Var.f389873o - (x84Var2 != null ? x84Var2.f389873o : 0L) < 40) {
                com.tencent.mars.xlog.Log.e("FinderLiveKTVSingController", "parseSingSEIInfoData invalid, receiveTime is very close");
                return;
            }
            if (this.B && this.C) {
                com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = this.P;
                if (tXChorusRole == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) {
                    return;
                }
                if (tXChorusRole == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger) {
                    ah2.b k76 = k7();
                    if (k76 != null) {
                        ((dh2.x) k76).f();
                    }
                    om2.i iVar = q7().f346307n;
                    if (iVar != null && (ha4Var = iVar.f346324d) != null) {
                        synchronized (ha4Var) {
                            ha4Var2 = new r45.ha4();
                            byte[] byteArray = ha4Var.toByteArray();
                            if (byteArray != null) {
                                try {
                                    ha4Var2.parseFrom(byteArray);
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                                }
                            }
                        }
                        java.util.LinkedList linkedList = x84Var.f389865d;
                        if (linkedList != null) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((r45.w84) it.next()).f388964d = ha4Var2;
                            }
                        }
                    }
                }
            }
            t7(x84Var);
        }
    }

    public final void B7() {
        om2.i iVar = q7().f346307n;
        if (iVar != null) {
            if (!iVar.f346330j) {
                iVar.g();
                kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) this.f41431x).getValue(), null, null, new ch2.s1(iVar, this, null), 3, null);
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "reportSingScore songUniqueId: " + iVar.c() + " hadReport report");
            }
        }
    }

    public final void C7() {
        if (zl2.r4.f473950a.x1()) {
            return;
        }
        tn0.w0 Q6 = Q6();
        boolean z17 = false;
        if (Q6 != null && Q6.X()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "resetAdjustSingMute");
            tn0.w0 Q62 = Q6();
            if (Q62 != null) {
                Q62.v0(100);
            }
            if (h7().O4 || o7().C7()) {
                ((kotlinx.coroutines.flow.h3) m7().f346291g).k(100);
                return;
            }
            tn0.w0 Q63 = Q6();
            if (Q63 != null) {
                Q63.u0(q7().S6() ? ((java.lang.Number) ((kotlinx.coroutines.flow.h3) m7().f346291g).getValue()).intValue() : 100);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v13, types: [yz5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D7(r45.yx1 r17, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.D7(r45.yx1, com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // zh2.a
    public void E(r45.yx1 songInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.a0(this, songInfo, lVar, null), 3, null);
    }

    public final void F7(com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "role update from " + this.P + " to " + tXChorusRole);
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole2 = this.P;
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole3 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger;
        boolean z17 = tXChorusRole2 != tXChorusRole3 && tXChorusRole == tXChorusRole3;
        boolean z18 = tXChorusRole2 == tXChorusRole3 && tXChorusRole != tXChorusRole3;
        if (zl2.q4.f473933a.E() && (z17 || z18)) {
            pm0.v.X(new ch2.n2(z17));
        }
        this.P = tXChorusRole;
        ((kotlinx.coroutines.flow.h3) q7().C).k(tXChorusRole != null ? java.lang.Integer.valueOf(tXChorusRole.ordinal()) : null);
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        java.util.List list;
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        boolean z17 = false;
        if (!micInfoData.f454523b.containsKey(h7().m8())) {
            if (this.R) {
                b7();
                this.R = false;
                if (this.P == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger) {
                    com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "exitChorusSing, currRole:" + this.P);
                    if (this.P == null) {
                        return;
                    }
                    d7("exitChorusSing");
                    return;
                }
                return;
            }
            return;
        }
        tn0.w0 Q6 = Q6();
        if (Q6 != null && Q6.X() == this.R) {
            return;
        }
        b7();
        tn0.w0 Q62 = Q6();
        if (Q62 != null && Q62.X()) {
            z17 = true;
        }
        this.R = z17;
        if (!z17 || (list = (java.util.List) ((kotlinx.coroutines.flow.h3) q7().A).getValue()) == null) {
            return;
        }
        v7(list, true);
    }

    @Override // zh2.a
    public void Q0(r45.yx1 songInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.u1(this, songInfo, lVar, null), 3, null);
    }

    @Override // zh2.a
    public void R5(r45.yx1 songInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.m1(this, songInfo, lVar, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // bh2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.a0(java.lang.String, int):void");
    }

    public final void a7(java.lang.String str) {
        tn0.w0 Q6;
        if (zl2.r4.f473950a.x1()) {
            return;
        }
        tn0.w0 Q62 = Q6();
        boolean z17 = true;
        if (Q62 != null && Q62.X()) {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(h7().m8(), str);
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "adjustSingMute isSelf: " + D0);
            if (D0) {
                tn0.w0 Q63 = Q6();
                if (Q63 == null) {
                    return;
                }
                Q63.v0(100);
                return;
            }
            tn0.w0 Q64 = Q6();
            if (Q64 != null) {
                Q64.v0(80);
            }
            if (h7().O4 || o7().C7() || (Q6 = Q6()) == null) {
                return;
            }
            Q6.u0(80);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00aa A[Catch: JSONException -> 0x0068, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0068, blocks: (B:55:0x006a, B:58:0x0070, B:60:0x008f, B:66:0x009d, B:72:0x00aa), top: B:54:0x006a }] */
    @Override // mf2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(java.lang.String r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.b0(java.lang.String, org.json.JSONObject):void");
    }

    public final void b7() {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "checkChangeLinkState");
        if (zl2.r4.f473950a.x1() || !(((kotlinx.coroutines.flow.h3) q7().f346303g).getValue() instanceof om2.v)) {
            return;
        }
        q7().P6(new om2.v(), true);
    }

    public final void c7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "checkDestroySingEngine source: " + str);
        ah2.b k76 = k7();
        if (k76 != null) {
            ((dh2.x) k76).b("stopSing");
        }
    }

    public final void d7(java.lang.String str) {
        java.lang.Boolean bool;
        tn0.w0 Q6;
        vn0.e eVar;
        vn0.e eVar2;
        com.tencent.trtc.TRTCCloud T;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDestroySingRes source: ");
        sb6.append(str);
        sb6.append(" isSing: ");
        ah2.b k76 = k7();
        if (k76 != null) {
            ah2.c cVar = ((dh2.x) k76).f232473m;
            bool = java.lang.Boolean.valueOf(cVar != null && ((dh2.b0) cVar).b());
        } else {
            bool = null;
        }
        sb6.append(bool);
        sb6.append(" seiInfoListSize: ");
        java.util.List list = this.H;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
        kotlinx.coroutines.r2 r2Var = this.f41432y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        c7("checkDestroySingRes");
        if (!list.isEmpty()) {
            if (this.B && this.C && this.P != com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) {
                return;
            }
            r45.fa4 f76 = f7(list);
            tn0.w0 Q62 = Q6();
            if (Q62 != null && (T = Q62.T()) != null) {
                T.sendSEIMsg(f76.toByteArray(), 1);
            }
        }
        list.clear();
        this.G = false;
        om2.g q76 = q7();
        q76.getClass();
        q76.f346306m = "";
        om2.g q77 = q7();
        om2.i iVar = q77.f346307n;
        if (kotlin.jvm.internal.o.b(iVar != null ? iVar.d() : null, ((mm2.c1) q77.business(mm2.c1.class)).m8())) {
            B7();
        }
        q7().f346307n = null;
        q7().f346308o = null;
        this.A = 0L;
        F7(null);
        this.B = false;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "KtvEnableChorus: false");
        this.C = false;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "CurSongEnableChorus: false");
        fn0.g gVar = fn0.g.f264195a;
        fn0.g.f264197c = false;
        com.tencent.mars.xlog.Log.i("LiveCorePluginManager", "isCurSongEnableChorus=false");
        if (w7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onEndSing");
            tn0.w0 Q63 = Q6();
            if (Q63 != null && (eVar2 = Q63.f420764m) != null) {
                eVar2.b(vn0.b.f438174a.a().f455408f, false);
            }
            ((kotlinx.coroutines.flow.h3) m7().f346295n).k(java.lang.Boolean.FALSE);
            tn0.w0 Q64 = Q6();
            if (Q64 != null) {
                Q64.e0(h7().O4 || o7().C7());
            }
            if (n7().Q6() != 1 || (Q6 = Q6()) == null || (eVar = Q6.f420764m) == null) {
                return;
            }
            eVar.h(0);
        }
    }

    public void e7() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(O6(), false, 1);
        k0Var.f211872n = new ch2.v(this);
        k0Var.f211881s = new ch2.w(this);
        k0Var.v();
    }

    public final r45.fa4 f7(java.util.List list) {
        r45.ia4 ia4Var;
        r45.fa4 fa4Var = new r45.fa4();
        om2.i iVar = q7().f346307n;
        if (iVar != null) {
            hn0.u uVar = hn0.u.f282437e;
            fa4Var.f374143d = 256;
            r45.x84 x84Var = new r45.x84();
            long j17 = this.A + 1;
            this.A = j17;
            x84Var.f389866e = j17;
            x84Var.f389867f = iVar.f346322b;
            x84Var.f389871m = iVar.f346326f;
            x84Var.f389868g = h7().m8();
            java.lang.String str = q7().f346306m;
            if (str == null) {
                str = "";
            }
            x84Var.f389869h = str;
            synchronized (iVar.f346323c) {
                ia4Var = new r45.ia4();
                byte[] byteArray = iVar.f346323c.toByteArray();
                if (byteArray != null) {
                    try {
                        ia4Var.parseFrom(byteArray);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
            }
            x84Var.f389870i = ia4Var;
            x84Var.f389865d.addAll(list);
            x84Var.f389872n = n7().P6();
            fa4Var.f374147h = x84Var;
        }
        return fa4Var;
    }

    public final r45.gc2 g7() {
        r45.gc2 gc2Var = new r45.gc2();
        gc2Var.f375081d = q7().f346314u;
        gc2Var.f375082e = q7().f346315v;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "genSyncKtvReq first_song_version: " + gc2Var.f375081d + " song_list_version: " + gc2Var.f375082e);
        return gc2Var;
    }

    public final mm2.c1 h7() {
        return (mm2.c1) this.f41421n.getValue();
    }

    public final mm2.e1 i7() {
        return (mm2.e1) this.f41422o.getValue();
    }

    public final ah2.b k7() {
        return (ah2.b) ((jz5.n) this.D).getValue();
    }

    public final gh2.f l7() {
        return (gh2.f) ((jz5.n) this.f41426s).getValue();
    }

    public final om2.e m7() {
        return (om2.e) ((jz5.n) this.f41423p).getValue();
    }

    public final om2.l n7() {
        return (om2.l) ((jz5.n) this.f41424q).getValue();
    }

    public final mm2.o4 o7() {
        return (mm2.o4) ((jz5.n) this.f41425r).getValue();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new ch2.i1(null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLivePause() {
        r45.yx1 yx1Var;
        super.onLivePause();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onLivePause");
        java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) q7().A).getValue();
        if (list == null || (yx1Var = (r45.yx1) kz5.n0.Z(list)) == null || !q7().T6(yx1Var)) {
            return;
        }
        zh2.a.t0(this, yx1Var, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveResume() {
        r45.yx1 yx1Var;
        super.onLiveResume();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onLiveResume");
        java.util.List list = (java.util.List) ((kotlinx.coroutines.flow.h3) q7().A).getValue();
        if (list == null || (yx1Var = (r45.yx1) kz5.n0.Z(list)) == null || !q7().T6(yx1Var)) {
            return;
        }
        zh2.a.i4(this, yx1Var, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        this.f41427t = i7().f328988r.getLong(0);
        this.f41428u = i7().f328983m;
        this.f41429v = h7().f328852o;
        if (((kotlinx.coroutines.flow.h3) q7().f346303g).getValue() instanceof om2.v) {
            q7().P6(new om2.v(), true);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        super.onLiveStartFromWindow();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", " onLiveStartFromWindow()");
        com.tencent.mm.plugin.finder.live.util.y.d(this, kotlinx.coroutines.q1.f310570c, null, new ch2.k1(this, null), 2, null);
    }

    public final r45.xn1 p7(java.lang.String str) {
        java.lang.Object obj;
        if (com.tencent.mm.sdk.platformtools.t8.D0(i7().f328987q.f380301n, str)) {
            return o7().a7().f309187r;
        }
        java.util.List Z6 = o7().Z6();
        kotlin.jvm.internal.o.f(Z6, "<get-allLinkMicUserList>(...)");
        synchronized (Z6) {
            java.util.Iterator it = Z6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, str)) {
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        if (qVar != null) {
            return qVar.f309187r;
        }
        return null;
    }

    @Override // tn0.x0
    public void q1(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        om2.o oVar;
        if (i7().b7() && i17 == 20) {
            kotlinx.coroutines.flow.f3 f3Var = q7().f346303g;
            java.lang.Object obj = f3Var != null ? (om2.d0) ((kotlinx.coroutines.flow.h3) f3Var).getValue() : null;
            om2.e0 e0Var = obj instanceof om2.e0 ? (om2.e0) obj : null;
            if (e0Var == null || (oVar = e0Var.f346299a) == null || (str2 = oVar.f346360a) == null) {
                str2 = "";
            }
            a7(str2);
        }
    }

    public final om2.g q7() {
        return (om2.g) ((jz5.n) this.f41420m).getValue();
    }

    @Override // zh2.a
    public void r(r45.yx1 songInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        B7();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r7(java.lang.String r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.r7(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s7(r45.yx1 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ch2.f0
            if (r0 == 0) goto L13
            r0 = r7
            ch2.f0 r0 = (ch2.f0) r0
            int r1 = r0.f41348h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41348h = r1
            goto L18
        L13:
            ch2.f0 r0 = new ch2.f0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f41346f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f41348h
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f41345e
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f41344d
            ch2.o2 r5 = (ch2.o2) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Class<sf2.d3> r7 = sf2.d3.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r4.controller(r7)
            sf2.d3 r7 = (sf2.d3) r7
            if (r7 == 0) goto L58
            r0.f41344d = r4
            r0.f41345e = r6
            r0.f41348h = r3
            r2 = 10
            java.lang.Object r7 = r7.o7(r2, r5, r3, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r5 = r4
        L55:
            r45.mx1 r7 = (r45.mx1) r7
            goto L5a
        L58:
            r7 = 0
            r5 = r4
        L5a:
            if (r7 == 0) goto L80
            android.content.Context r7 = com.tencent.mm.sdk.platformtools.x2.f193071a
            if (r6 != 0) goto L70
            android.content.res.Resources r6 = r7.getResources()
            r0 = 2131764042(0x7f10234a, float:1.9159206E38)
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.o.f(r6, r0)
        L70:
            r0 = 0
            android.widget.Toast r6 = db5.t7.makeText(r7, r6, r0)
            r6.show()
            java.lang.String r6 = "finishSing"
            r5.c7(r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L80:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.s7(r45.yx1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void t7(r45.x84 x84Var) {
        om2.i iVar = q7().f346307n;
        if (iVar != null) {
            int i17 = x84Var.f389867f;
            int i18 = iVar.f346322b;
            if (i18 < i17 && !kotlin.jvm.internal.o.b(h7().m8(), x84Var.f389868g)) {
                com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "handleSEIKTVInfo curSingVersion: " + i18 + " newVersion: " + x84Var.f389867f + " act_user_id: " + x84Var.f389868g);
                d7("handleSEIKTVInfo");
            }
        }
        java.lang.String str = x84Var.f389868g;
        if (str == null) {
            str = "";
        }
        x84Var.f389868g = str;
        java.lang.String str2 = x84Var.f389869h;
        if (str2 == null) {
            str2 = "";
        }
        x84Var.f389869h = str2;
        r45.ia4 ia4Var = x84Var.f389870i;
        if (ia4Var != null) {
            java.lang.String str3 = ia4Var.f376869d;
            if (str3 == null) {
                str3 = "";
            }
            ia4Var.f376869d = str3;
            java.lang.String str4 = ia4Var.f376871f;
            if (str4 == null) {
                str4 = "";
            }
            ia4Var.f376871f = str4;
            java.lang.String str5 = ia4Var.f376876n;
            if (str5 == null) {
                str5 = "";
            }
            ia4Var.f376876n = str5;
            java.lang.String str6 = ia4Var.f376870e;
            if (str6 == null) {
                str6 = "";
            }
            ia4Var.f376870e = str6;
            java.lang.String str7 = ia4Var.f376880r;
            if (str7 == null) {
                str7 = "";
            }
            ia4Var.f376880r = str7;
        }
        if (ia4Var != null) {
            pm0.v.X(new ch2.o0(ia4Var, this));
            java.lang.String str8 = ia4Var.f376869d;
            if (str8 == null) {
                str8 = "";
            }
            om2.t b17 = com.tencent.mm.plugin.finder.live.util.d2.b(str8);
            om2.p pVar = b17 != null ? b17.f346382b : null;
            java.lang.String str9 = ia4Var.f376871f;
            if (str9 == null) {
                str9 = "";
            }
            r45.xn1 p76 = p7(str9);
            if (!(p76 == null) || n7().R6()) {
                if (pVar == null) {
                    kotlinx.coroutines.r2 r2Var = this.I;
                    if (!(r2Var != null && r2Var.a())) {
                        java.lang.String str10 = ia4Var.f376871f;
                        java.lang.String str11 = str10 == null ? "" : str10;
                        java.lang.String str12 = ia4Var.f376870e;
                        java.lang.String str13 = str12 == null ? "" : str12;
                        java.lang.String str14 = ia4Var.f376869d;
                        java.lang.String str15 = str14 == null ? "" : str14;
                        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "requestSongPlayDetailInfo sdkUserId: " + str11 + " songUniqueId: " + str13 + " songId: " + str15);
                        this.I = com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.t1(this, str11, str13, str15, null), 3, null);
                    }
                }
                r45.x84 x84Var2 = q7().f346309p;
                int i19 = x84Var2 != null ? x84Var2.f389867f : 0;
                if (i19 <= x84Var.f389867f) {
                    q7().f346309p = x84Var;
                    u7(ia4Var, p76, x84Var);
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "handleSEIKTVInfo second check version, ktv_action_version invalid, local: " + i19 + " cur: " + x84Var.f389867f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
    
        if ((r7 != null ? r7.f346270b : 0) == r4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0079, code lost:
    
        if (kotlin.jvm.internal.o.b(r9 != null ? r9.f391459e : null, r4) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7(r45.ia4 r26, r45.xn1 r27, r45.x84 r28) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.o2.u7(r45.ia4, r45.xn1, r45.x84):void");
    }

    public final void v7(java.util.List list, boolean z17) {
        boolean z18;
        kotlin.jvm.internal.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            } else {
                com.tencent.mm.plugin.finder.live.util.d2.c((r45.yx1) it.next(), true);
            }
        }
        if (list.isEmpty() && zl2.r4.f473950a.w1()) {
            y7(q7().f346314u, true);
        }
        r45.yx1 yx1Var = (r45.yx1) kz5.n0.Z(list);
        boolean T6 = q7().T6(yx1Var);
        boolean S6 = n7().S6();
        this.B = S6;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "KtvEnableChorus: " + S6);
        boolean z19 = yx1Var != null && yx1Var.f391471t == 1;
        this.C = z19;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "CurSongEnableChorus: " + z19);
        fn0.g gVar = fn0.g.f264195a;
        boolean z27 = this.B && this.C && z17;
        fn0.g.f264197c = z27;
        com.tencent.mars.xlog.Log.i("LiveCorePluginManager", "isCurSongEnableChorus=" + z27);
        if (!fn0.g.f264197c) {
            x7(yx1Var, T6);
            return;
        }
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (!(w0Var != null && w0Var.X()) && !zl2.r4.f473950a.x1()) {
            z18 = false;
        }
        F7((T6 && z18) ? com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger : (this.Q > 2 || !z18) ? null : com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger);
        if (yx1Var != null) {
            if (!z18) {
                if (q7().f346307n != null) {
                    d7("dispatchSongListState");
                }
            } else {
                com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = this.P;
                if (tXChorusRole == null) {
                    x7(yx1Var, T6);
                } else {
                    E7(this, yx1Var, tXChorusRole, null, 4, null);
                }
            }
        }
    }

    public final boolean w7() {
        if (zl2.r4.f473950a.x1()) {
            return true;
        }
        tn0.w0 Q6 = Q6();
        return Q6 != null && Q6.X();
    }

    @Override // zh2.a
    public void x5(r45.yx1 songInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.b0(this, songInfo, lVar, null), 3, null);
    }

    public final void x7(r45.yx1 yx1Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "normalSing");
        if (z17) {
            if (yx1Var != null) {
                E7(this, yx1Var, null, null, 6, null);
            }
        } else if (q7().f346307n != null) {
            d7("dispatchSongListState");
        }
    }

    public final void y7(int i17, boolean z17) {
        if (((kotlinx.coroutines.flow.h3) q7().f346303g).getValue() instanceof om2.v) {
            return;
        }
        d7("notifyNoSing newActionVersion: " + i17);
        r45.x84 x84Var = q7().f346309p;
        if (x84Var != null) {
            x84Var.f389867f = i17;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ch2.n0(this, null), 3, null);
        } else {
            q7().P6(new om2.v(), false);
        }
    }

    public void z7(int i17) {
        lf2.a aVar = (lf2.a) controller(lf2.a.class);
        if (aVar != null) {
            aVar.a7(i17);
        }
    }
}
