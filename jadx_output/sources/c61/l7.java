package c61;

@j95.b(dependencies = {c42.i.class, m40.g0.class})
/* loaded from: classes10.dex */
public final class l7 extends l85.m1 implements zy2.b6, com.tencent.mm.modelbase.u0 {
    public final jz5.g A;
    public final c61.i6 A1;
    public final jz5.g B;
    public final java.util.concurrent.ConcurrentHashMap B1;
    public final jz5.g C;
    public final java.util.HashMap C1;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f39115J;
    public final jz5.g K;
    public com.tencent.mm.plugin.finder.storage.sj0 L;
    public com.tencent.mm.plugin.finder.storage.g90 M;
    public com.tencent.mm.plugin.finder.storage.ia0 N;
    public final ic2.l0 P;
    public final ya2.c Q;
    public final jz5.g R;
    public volatile zy2.fa S;
    public final jz5.g T;
    public final kotlinx.coroutines.y0 U;
    public final kotlinx.coroutines.y0 V;
    public final jz5.g W;
    public final jz5.g X;
    public cw2.m9 Y;
    public final jz5.g Z;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f39116g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f39117h;

    /* renamed from: i, reason: collision with root package name */
    public final d95.b0[] f39118i;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.plugin.FinderCommonFeatureService$entryConfigChangeListener$1 f39119l1;

    /* renamed from: m, reason: collision with root package name */
    public final d95.b0[] f39120m;

    /* renamed from: n, reason: collision with root package name */
    public final d95.b0[] f39121n;

    /* renamed from: o, reason: collision with root package name */
    public final d95.b0[] f39122o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f39123p;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f39124p0;

    /* renamed from: p1, reason: collision with root package name */
    public volatile boolean f39125p1;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f39126q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f39127r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f39128s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f39129t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f39130u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f39131v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f39132w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f39133x;

    /* renamed from: x0, reason: collision with root package name */
    public final c61.yb f39134x0;

    /* renamed from: x1, reason: collision with root package name */
    public long f39135x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f39136y;

    /* renamed from: y0, reason: collision with root package name */
    public final jz5.g f39137y0;

    /* renamed from: y1, reason: collision with root package name */
    public final c61.k4 f39138y1;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f39139z;

    /* renamed from: z1, reason: collision with root package name */
    public final c61.v2 f39140z1;

    /* JADX WARN: Type inference failed for: r1v62, types: [com.tencent.mm.plugin.FinderCommonFeatureService$entryConfigChangeListener$1] */
    public l7() {
        super("FinderUIC");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        this.f39116g = com.tencent.mm.sdk.platformtools.w2.b("FinderMM029.dbFinderMention001.db".getBytes());
        this.f39117h = com.tencent.mm.sdk.platformtools.w2.b("FinderMM029.dbFinderMention001.db".getBytes());
        this.f39118i = new d95.b0[]{null};
        this.f39120m = new d95.b0[]{null};
        this.f39121n = new d95.b0[]{null};
        this.f39122o = new d95.b0[]{null};
        this.f39123p = jz5.h.b(new c61.v4(this));
        this.f39126q = jz5.h.b(new c61.e5(this));
        this.f39127r = jz5.h.b(new c61.d5(this));
        jz5.h.b(new c61.q5(this));
        this.f39128s = jz5.h.b(new c61.y4(this));
        this.f39129t = jz5.h.b(new c61.x4(this));
        this.f39130u = jz5.h.b(new c61.r4(this));
        this.f39131v = jz5.h.b(new c61.a5(this));
        this.f39132w = jz5.h.b(new c61.r5(this));
        this.f39133x = jz5.h.b(new c61.g5(this));
        this.f39136y = jz5.h.b(new c61.h5(this));
        this.f39139z = jz5.h.b(new c61.b5(this));
        this.A = jz5.h.b(new c61.s5(this));
        this.B = jz5.h.b(new c61.c5(this));
        this.C = jz5.h.b(new c61.n5(this));
        this.D = jz5.h.b(c61.m5.f39158d);
        this.E = jz5.h.b(c61.l5.f39114d);
        this.F = jz5.h.b(new c61.o5(this));
        this.G = jz5.h.b(new c61.j5(this));
        this.H = jz5.h.b(new c61.t4(this));
        this.I = jz5.h.b(new c61.w4(this));
        this.f39115J = jz5.h.b(new c61.p5(this));
        this.K = jz5.h.b(new c61.i5(this));
        this.P = new ic2.l0();
        this.Q = new ya2.c();
        this.R = jz5.h.b(c61.s2.f39286d);
        this.T = jz5.h.b(c61.t5.f39301d);
        this.U = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.V = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.W = jz5.h.b(c61.j6.f39063d);
        this.X = jz5.h.b(c61.f5.f38973d);
        this.Z = jz5.h.b(c61.s4.f39288d);
        this.f39124p0 = jz5.h.b(c61.u4.f39318d);
        this.f39134x0 = (c61.yb) i95.n0.c(c61.yb.class);
        this.f39137y0 = jz5.h.b(c61.z4.f39441d);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f39119l1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.FinderCommonFeatureService$entryConfigChangeListener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                c61.l7.this.uj();
                return false;
            }
        };
        this.f39138y1 = new c61.k4();
        this.f39140z1 = new c61.v2(this);
        this.A1 = new c61.i6();
        this.B1 = new java.util.concurrent.ConcurrentHashMap();
        new java.util.ArrayList();
        this.C1 = new java.util.HashMap();
    }

    public static final java.util.HashMap Ai(c61.l7 l7Var) {
        l7Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1369323289, c61.c4.f38917a);
        hashMap.put(643438356, c61.d4.f38935a);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        int i17 = dm.x4.f241026a3;
        hashMap2.put(633857321, com.tencent.mm.feature.finder.live.z2.f67053a);
        hashMap.putAll(hashMap2);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d95.b0 Bi(c61.l7 r13, java.lang.String r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Bi(c61.l7, java.lang.String, java.util.HashMap):d95.b0");
    }

    public static final void Fj(kotlin.jvm.internal.h0 h0Var, android.content.Context context) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
    }

    public static final zy2.ba ok(c61.l7 l7Var) {
        if (!((java.lang.Boolean) ((jz5.n) ((ey2.r1) pf5.u.f353936a.e(c61.l7.class).a(ey2.r1.class)).f257492g).getValue()).booleanValue()) {
            return l7Var.lk();
        }
        l7Var.getClass();
        gm0.j1.b().c();
        return (cu2.i0) ((jz5.n) l7Var.E).getValue();
    }

    public void Aj(boolean z17, java.lang.String objectNonceId, long j17, boolean z18) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.setId(j17);
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 0);
        a17.setObjectNonceId(objectNonceId);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) t70Var.N().r()).booleanValue()) {
            if (z18) {
                if (((java.lang.Boolean) t70Var.m2().r()).booleanValue()) {
                    nv2.d1 d1Var = nv2.d1.f340475b;
                    nv2.d1.b(nv2.d1.f340475b, a17, z17, false, 1200001, 0, new r45.qt2(), null, null, 208, null);
                    return;
                } else {
                    nv2.h1 h1Var = nv2.n1.f340550g;
                    nv2.n1.c(nv2.n1.f340551h, a17, z17, false, 1200001, 0, null, new r45.qt2(), null, null, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, null);
                    return;
                }
            }
            if (((java.lang.Boolean) t70Var.d2().r()).booleanValue()) {
                nv2.d1 d1Var2 = nv2.d1.f340475b;
                nv2.d1.a(nv2.d1.f340475b, a17, z17, 1200001, new r45.qt2(), 0, null, null, null, 240, null);
                return;
            } else {
                nv2.o oVar = nv2.o.f340558e;
                nv2.o.a(nv2.o.f340558e, a17, z17, 1200001, null, new r45.qt2(), 0, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX, null);
                return;
            }
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 1200001);
        if (z18) {
            if (((java.lang.Boolean) t70Var.m2().r()).booleanValue()) {
                nv2.d1 d1Var3 = nv2.d1.f340475b;
                nv2.d1.b(nv2.d1.f340475b, a17, z17, false, qt2Var.getInteger(5), 0, qt2Var, null, null, 208, null);
                return;
            } else {
                nv2.h1 h1Var2 = nv2.n1.f340550g;
                nv2.n1.c(nv2.n1.f340551h, a17, z17, false, qt2Var.getInteger(5), 0, null, qt2Var, null, null, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, null);
                return;
            }
        }
        if (((java.lang.Boolean) t70Var.d2().r()).booleanValue()) {
            nv2.d1 d1Var4 = nv2.d1.f340475b;
            nv2.d1.a(nv2.d1.f340475b, a17, z17, qt2Var.getInteger(5), qt2Var, 0, null, null, null, 240, null);
        } else {
            nv2.o oVar2 = nv2.o.f340558e;
            nv2.o.a(nv2.o.f340558e, a17, z17, qt2Var.getInteger(5), null, qt2Var, 0, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX, null);
        }
    }

    public boolean Ak() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R2).getValue()).r()).intValue() == 1;
    }

    public java.lang.String Bj(int i17, int i18, int i19, android.content.Intent intent) {
        return Cj(Gj(i17, i18, i19), intent);
    }

    public boolean Bk() {
        java.util.Iterator it = this.C1.entrySet().iterator();
        while (it.hasNext()) {
            if (((java.lang.Boolean) ((java.util.Map.Entry) it.next()).getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String Cj(java.lang.String str, android.content.Intent intent) {
        if (intent != null) {
            intent.putExtra("key_context_id", str);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "fillContextIdToIntent USERINFO_FINDER_CONTEXT_ID_STRING:" + str);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CONTEXT_ID_STRING, str);
        com.tencent.mm.plugin.finder.report.s0.f125339a = str;
        return str == null ? "" : str;
    }

    public boolean Ck() {
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderOpenShareListFeedsIgnoreLimitedSwitch", 0) == 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "isEnableTeenModeCheckInShareScene:" + z17);
        return z17;
    }

    public void Di(android.app.Activity activity, long j17, java.lang.String str, java.lang.String coverUrl, java.lang.String nickName, java.lang.String headUrl, long j18, android.graphics.Bitmap bitmap, android.graphics.Rect rect, int i17, long j19, java.lang.String str2) {
        android.view.Window window;
        java.lang.String title = str;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(headUrl, "headUrl");
        r45.yj4 yj4Var = new r45.yj4();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            title = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cw6, nickName);
        }
        kotlin.jvm.internal.o.d(title);
        yj4Var.set(3, 0);
        java.util.LinkedList list = yj4Var.getList(1);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = yj4Var.getList(6);
        if (list2 != null) {
            list2.clear();
        }
        yj4Var.set(9, java.lang.Long.valueOf(j17));
        yj4Var.set(10, coverUrl);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        if (h17 != null) {
            java.util.LinkedList list3 = yj4Var.getList(6);
            if (list3 != null) {
                list3.add(h17.getFeedObject());
            }
            r45.hl2 client_local_buffer = h17.getFeedObject().getClient_local_buffer();
            yj4Var.set(7, java.lang.Long.valueOf(client_local_buffer != null ? client_local_buffer.getLong(0) : c01.id.c()));
            h17.getFeedObject().getUrlValidDuration();
        }
        com.tencent.mm.plugin.finder.megavideo.multitask.i iVar = new com.tencent.mm.plugin.finder.megavideo.multitask.i(activity, null, (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = new com.tencent.mm.plugin.finder.megavideo.multitask.h(context, iVar);
        hVar.y(i17, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk());
        long c17 = j19 == 0 ? c01.id.c() : j19;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = hVar.f300077a;
        if (multiTaskInfo != null) {
            multiTaskInfo.field_id = str2 == null || str2.length() == 0 ? pm0.v.u(j17) : str2;
            multiTaskInfo.v0().set(1, title);
            multiTaskInfo.v0().set(5, headUrl);
            multiTaskInfo.field_data = yj4Var.toByteArray();
            multiTaskInfo.v0().set(0, nickName);
            multiTaskInfo.v0().set(3, java.lang.Integer.valueOf((int) j18));
            multiTaskInfo.field_createTime = c17;
        }
        hVar.f300117j = new c61.t2(hVar);
        hVar.f120866z = c61.u2.f39316d;
        if (rect != null && bitmap != null) {
            iVar.s(new android.graphics.Rect(rect), bitmap);
        }
        hVar.V(true, 9, jk3.c.f300081e);
        int Di = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Di(pm0.v.u(j17), 22);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", pm0.v.u(j17));
        jSONObject.put("feed_index", Di + 1);
        jSONObject.put("import_time", c17);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, null, "float_feed_import", 1, jSONObject, false, null, 48, null);
    }

    public r45.f03 Dj(dm.a5 ctrlInfo, java.lang.String path) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = ctrlInfo instanceof com.tencent.mm.plugin.finder.extension.reddot.jb ? (com.tencent.mm.plugin.finder.extension.reddot.jb) ctrlInfo : null;
        if (jbVar != null) {
            return jbVar.I0(path);
        }
        return null;
    }

    public boolean Dk() {
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() && (((c01.z1.j() & 34359738368L) > 0L ? 1 : ((c01.z1.j() & 34359738368L) == 0L ? 0 : -1)) == 0) && !(((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0338 -> B:28:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ej(android.content.Context r21, r45.zc5 r22, long r23, long r25, com.tencent.mm.protobuf.g r27, java.lang.String r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Ej(android.content.Context, r45.zc5, long, long, com.tencent.mm.protobuf.g, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean Ek(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return (context instanceof com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI) || (context instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI);
    }

    public boolean Fk() {
        boolean z17;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            return true;
        }
        kb2.b bVar = kb2.b.f306225a;
        return false;
    }

    public java.lang.String Gj(int i17, int i18, int i19) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return i17 + '-' + i18 + '-' + i19 + '-' + r26.i0.t(uuid, "-", "", false);
    }

    public final boolean Gk(java.lang.String str) {
        boolean z17 = false;
        if (str == null) {
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.B1;
        java.lang.Boolean bool = (java.lang.Boolean) concurrentHashMap.get(str);
        if (bool == null) {
            if (!r26.i0.n(str, "@stranger", false) && !com.tencent.mm.storage.z3.S3(str) && !kotlin.jvm.internal.o.b(str, c01.z1.r()) && c01.e2.J(str)) {
                z17 = true;
            }
            bool = java.lang.Boolean.valueOf(z17);
            concurrentHashMap.put(str, bool);
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Hj(long r44, java.lang.String r46, int r47, long r48, zy2.g5 r50, zy2.ub r51, java.lang.String r52, boolean r53, com.tencent.mm.pluginsdk.ui.e1 r54, kotlin.coroutines.Continuation r55) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Hj(long, java.lang.String, int, long, zy2.g5, zy2.ub, java.lang.String, boolean, com.tencent.mm.pluginsdk.ui.e1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean Hk() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        return true;
    }

    public final com.tencent.mm.plugin.finder.storage.l Ij() {
        return (com.tencent.mm.plugin.finder.storage.l) ((jz5.n) this.f39130u).getValue();
    }

    public final boolean Ik() {
        if (!el()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[isShowFinderEntrance] FinderEntry close!");
            return false;
        }
        if ((c01.z1.j() & 34359738368L) != 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[isShowFinderEntrance] find more setting close!");
            return false;
        }
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[isShowFinderEntrance] TeenMode close Finder!");
        return false;
    }

    public com.tencent.mm.plugin.finder.storage.o80 Jj() {
        return (com.tencent.mm.plugin.finder.storage.o80) this.f39123p.getValue();
    }

    public boolean Jk() {
        long j17 = c01.z1.j();
        boolean a07 = c01.e2.a0();
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ExtFunctionSwitchEntry", 0) == 1;
        boolean z18 = (j17 & 34359738368L) != 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "isWechatFinderDisable isShowWechatUserDialog:" + z17 + ", isWeChatUser:" + a07 + ", close:" + z18);
        return a07 && z17 && z18;
    }

    public com.tencent.mm.plugin.finder.storage.t80 Kj() {
        return (com.tencent.mm.plugin.finder.storage.t80) ((jz5.n) this.I).getValue();
    }

    public boolean Kk() {
        long j17 = c01.z1.j();
        boolean a07 = c01.e2.a0();
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ExtFunctionSwitchEntry", 0) == 1;
        boolean z18 = (j17 & 9007199254740992L) != 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "isWechatFinderLiveDisable isShowWechatUserDialog:" + z17 + ", isWeChatUser:" + a07 + ", close:" + z18);
        return a07 && z17 && z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public in5.c Lj(androidx.appcompat.app.AppCompatActivity r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L8e
            boolean r1 = r10.Ek(r11)
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            pf5.z r1 = pf5.z.f353948a
            pf5.v r11 = r1.a(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r1 = com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.c1 r11 = r11.a(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r11 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) r11
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r11 = r11.getActiveFragment()
            android.view.View r11 = r11.f206301h
            r1 = 0
            if (r11 == 0) goto L7b
            r2 = 2131318974(0x7f0958be, float:1.8256501E38)
            android.view.View r11 = r11.findViewById(r2)
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = (com.tencent.mm.view.RefreshLoadMoreLayout) r11
            if (r11 == 0) goto L7b
            androidx.recyclerview.widget.RecyclerView r11 = r11.getRecyclerView()
            if (r11 == 0) goto L7b
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r11.getLayoutManager()
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L43
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            goto L44
        L43:
            r3 = r0
        L44:
            if (r3 == 0) goto L7b
            int r4 = r3.t()
            int r3 = r3.x()
            if (r4 > r3) goto L7b
            r6 = r0
            r5 = r1
        L52:
            androidx.recyclerview.widget.k3 r7 = r11.q0(r4, r1)
            if (r7 != 0) goto L59
            goto L76
        L59:
            android.view.View r8 = r7.itemView
            java.lang.String r9 = "itemView"
            kotlin.jvm.internal.o.f(r8, r9)
            r8.getLocalVisibleRect(r2)
            int r8 = r2.height()
            if (r8 <= r5) goto L76
            int r5 = r2.height()
            boolean r6 = r7 instanceof in5.s0
            if (r6 == 0) goto L75
            in5.s0 r7 = (in5.s0) r7
            r6 = r7
            goto L76
        L75:
            r6 = r0
        L76:
            if (r4 == r3) goto L7c
            int r4 = r4 + 1
            goto L52
        L7b:
            r6 = r0
        L7c:
            if (r6 == 0) goto L8e
            java.lang.Object r11 = r6.f293125i     // Catch: java.lang.Exception -> L84
            in5.c r11 = (in5.c) r11     // Catch: java.lang.Exception -> L84
            r0 = r11
            goto L8e
        L84:
            r11 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Finder.FinderCommonFeatureService"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r11, r2, r1)
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Lj(androidx.appcompat.app.AppCompatActivity):in5.c");
    }

    public void Lk(com.tencent.mm.ui.MMActivity activity, int i17, android.content.Intent intent, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_remind_finder_half_screen_source", i18);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Yk(activity, intent, i17, true);
    }

    public final d95.b0 Mj() {
        return xk(this.f39118i, new c61.x5(this));
    }

    public java.lang.Object Mk(android.content.Context context, byte[] bArr, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = nVar;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        pr4.l lVar = new pr4.l(1, (androidx.fragment.app.FragmentActivity) context, new c61.f6(h0Var), new c61.g6(h0Var), new c61.h6(h0Var));
        kotlin.jvm.internal.o.g(str, "<set-?>");
        lVar.f358026g = bArr;
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public void Ni(android.content.Context context, java.lang.String json) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(json, "json");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sd2.a.f406679a;
        com.tencent.mars.xlog.Log.i("FinderJsHandler", "json = ".concat(json));
        try {
            cl0.g gVar = new cl0.g(json);
            java.lang.String optString = gVar.optString("businessType", "0");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            int parseInt = java.lang.Integer.parseInt(optString);
            java.lang.String optString2 = gVar.optString("finderJumpId", "");
            java.lang.String optString3 = gVar.optString("commentScene", "0");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            int parseInt2 = java.lang.Integer.parseInt(optString3);
            java.lang.String optString4 = gVar.optString("status", "0");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            java.lang.Integer.parseInt(optString4);
            if (parseInt == 1) {
                kotlin.jvm.internal.o.d(optString2);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) sd2.a.f406679a.remove(optString2);
                if (baseFinderFeed == null) {
                    return;
                }
                androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                xc2.k0.e7((xc2.k0) a17, baseFinderFeed.getFeedObject().getFeedObject(), parseInt2, null, 1, null, null, 52, null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderJsHandler", th6, "callFinderJsHandler exception", new java.lang.Object[0]);
        }
    }

    public l75.k0 Nj(com.tencent.mm.plugin.finder.storage.v80 dbType) {
        kotlin.jvm.internal.o.g(dbType, "dbType");
        int ordinal = dbType.ordinal();
        if (ordinal == 1) {
            return xk(this.f39120m, new c61.y5(this));
        }
        if (ordinal != 2) {
            return ordinal != 3 ? Mj() : gk();
        }
        return xk(this.f39121n, new c61.c6(this));
    }

    public void Nk(java.lang.String mpPassInfo, int i17, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderObject Yk;
        kotlin.jvm.internal.o.g(mpPassInfo, "mpPassInfo");
        try {
            r45.an2 an2Var = new r45.an2();
            an2Var.parseFrom(android.util.Base64.decode(mpPassInfo, 0));
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.FinderItem wi6 = cq.k.wi((cq.k) c17, an2Var.getString(0), 0, 2, null);
            if (wi6 == null || (Yk = wi6.getFeedObject()) == null) {
                java.lang.String string = an2Var.getString(1);
                java.lang.String string2 = an2Var.getString(0);
                if (string2 == null) {
                    string2 = "";
                }
                Yk = Yk(0L, string, i17, string2);
            }
            if (Yk != null) {
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.m2().r()).booleanValue()) {
                    nv2.d1 d1Var = nv2.d1.f340475b;
                    nv2.d1 d1Var2 = nv2.d1.f340475b;
                    com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(Yk, 0);
                    r45.qt2 qt2Var = new r45.qt2();
                    qt2Var.set(5, java.lang.Integer.valueOf(i17));
                    nv2.d1.b(d1Var2, a17, z17, false, 2, 0, qt2Var, null, null, 208, null);
                    return;
                }
                nv2.h1 h1Var = nv2.n1.f340550g;
                nv2.n1 n1Var = nv2.n1.f340551h;
                com.tencent.mm.plugin.finder.storage.FinderItem a18 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(Yk, 0);
                r45.qt2 qt2Var2 = new r45.qt2();
                qt2Var2.set(5, java.lang.Integer.valueOf(i17));
                nv2.n1.c(n1Var, a18, z17, false, 2, 0, null, qt2Var2, null, null, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "likeFeed e:" + th6);
        }
    }

    public final cu2.n Oj() {
        return (cu2.n) ((jz5.n) this.f39129t).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #0 {all -> 0x008d, blocks: (B:3:0x000e, B:7:0x001f, B:10:0x0024, B:13:0x002d, B:15:0x0034, B:21:0x0041, B:25:0x0071, B:28:0x007f), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zy2.a5 Ok(java.lang.String r7, long r8, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.String r0 = "xml"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "talker"
            kotlin.jvm.internal.o.g(r10, r0)
            r0 = 0
            r1 = 0
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L8d
            ot0.q r7 = ot0.q.v(r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.Class<zy2.i> r2 = zy2.i.class
            ot0.h r7 = r7.y(r2)     // Catch: java.lang.Throwable -> L8d
            zy2.i r7 = (zy2.i) r7     // Catch: java.lang.Throwable -> L8d
            if (r7 != 0) goto L1f
            return r1
        L1f:
            r45.kv2 r7 = r7.f477411b     // Catch: java.lang.Throwable -> L8d
            if (r7 != 0) goto L24
            return r1
        L24:
            r2 = 5
            int r2 = r7.getInteger(r2)     // Catch: java.lang.Throwable -> L8d
            r3 = 1
            if (r2 != r3) goto L2d
            return r1
        L2d:
            r2 = 7
            java.util.LinkedList r2 = r7.getList(r2)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L3d
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L3b
            goto L3d
        L3b:
            r2 = r0
            goto L3e
        L3d:
            r2 = r3
        L3e:
            if (r2 == 0) goto L41
            return r1
        L41:
            com.tencent.mm.plugin.finder.assist.n7 r2 = com.tencent.mm.plugin.finder.assist.n7.f102406a     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r2.c(r7)     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.plugin.finder.storage.h90 r2 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion     // Catch: java.lang.Throwable -> L8d
            r4 = 32
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.a(r7, r4)     // Catch: java.lang.Throwable -> L8d
            r7.setMsgId(r8)     // Catch: java.lang.Throwable -> L8d
            r7.setMsgTalker(r10)     // Catch: java.lang.Throwable -> L8d
            cu2.t r8 = cu2.u.f222441a     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r8.p(r7)     // Catch: java.lang.Throwable -> L8d
            zy2.a5 r8 = new zy2.a5     // Catch: java.lang.Throwable -> L8d
            long r9 = r7.getItemId()     // Catch: java.lang.Throwable -> L8d
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r7.getFeedObject()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r4.getNickName()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = ""
            if (r4 != 0) goto L71
            r4 = r5
        L71:
            r2[r0] = r4     // Catch: java.lang.Throwable -> L8d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r7.getFeedObject()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r4.getDescription()     // Catch: java.lang.Throwable -> L8d
            if (r4 != 0) goto L7e
            goto L7f
        L7e:
            r5 = r4
        L7f:
            r2[r3] = r5     // Catch: java.lang.Throwable -> L8d
            java.util.List r2 = kz5.c0.i(r2)     // Catch: java.lang.Throwable -> L8d
            r8.<init>(r7, r9, r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r8)     // Catch: java.lang.Throwable -> L8d
            goto L98
        L8d:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)
        L98:
            java.lang.Throwable r8 = kotlin.Result.m524exceptionOrNullimpl(r7)
            if (r8 != 0) goto La0
            r1 = r7
            goto La9
        La0:
            java.lang.String r7 = "msgHistoryGalleryParseFinderFeedXml failed"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r10 = "Finder.FinderCommonFeatureService"
            com.tencent.mars.xlog.Log.printErrStackTrace(r10, r8, r7, r9)
        La9:
            zy2.a5 r1 = (zy2.a5) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Ok(java.lang.String, long, java.lang.String):zy2.a5");
    }

    public final com.tencent.mm.plugin.finder.storage.f90 Pj() {
        return (com.tencent.mm.plugin.finder.storage.f90) this.f39128s.getValue();
    }

    public void Pk() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC;
        if (c17.o(u3Var, false)) {
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f388490h = java.lang.String.valueOf(c01.id.c());
        vs2Var.f388486d = 0;
        vs2Var.f388487e = 1018;
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = 1;
        f03Var.f373891h = 1;
        f03Var.f373892i = "TLPersonalCenter";
        vs2Var.f388489g.add(f03Var);
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f373887d = 1;
        f03Var2.f373891h = 1;
        f03Var2.f373892i = "FinderPosterEntrance";
        vs2Var.f388489g.add(f03Var2);
        r45.f03 f03Var3 = new r45.f03();
        f03Var3.f373887d = 1;
        f03Var3.f373891h = 1;
        f03Var3.f373892i = "FinderLiveIncomeEntrance";
        f03Var3.f373893m = "TLPersonalCenter";
        vs2Var.f388489g.add(f03Var3);
        zy2.fa.D(nk(), vs2Var, "notifyFinderLiveFirstReward", null, false, null, 28, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "notifyFinderLiveFirstReward");
    }

    public final com.tencent.mm.plugin.finder.feed.l2 Qj() {
        return (com.tencent.mm.plugin.finder.feed.l2) this.f39124p0.getValue();
    }

    public void Qk(boolean z17, int i17, boolean z18) {
        com.tencent.mm.autogen.events.FinderVideoCtrlEvent finderVideoCtrlEvent = new com.tencent.mm.autogen.events.FinderVideoCtrlEvent();
        am.qd qdVar = finderVideoCtrlEvent.f54337g;
        qdVar.f7706a = z17;
        qdVar.f7707b = i17;
        qdVar.f7708c = z18;
        finderVideoCtrlEvent.b(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "notifyFinderVideoPlayStateToChange, shouldPlay=" + z17);
    }

    public boolean Ri() {
        boolean z17;
        boolean z18 = false;
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk() || ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk()) {
            pm0.v.X(c61.y2.f39420d);
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17 && !iq.b.q(com.tencent.mm.sdk.platformtools.x2.f193071a, true)) {
            z18 = true;
        }
        pm0.v.X(c61.z2.f39439d);
        return z18;
    }

    public com.tencent.mm.protocal.protobuf.FinderContact Rj(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        ya2.b2 y07 = Jj().y0(username);
        if (y07 != null) {
            return ya2.d.i(y07);
        }
        return null;
    }

    public void Rk(r45.ic4 ic4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyRedPacketCoverEditResult success:");
        sb6.append(ic4Var != null);
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", sb6.toString());
        if (ic4Var != null) {
            zy2.i5 i5Var = qd2.d0.f361717d;
            if (i5Var != null) {
                i5Var.a(ic4Var);
            }
        } else {
            zy2.i5 i5Var2 = qd2.d0.f361718e;
            if (i5Var2 != null) {
                i5Var2.a(-1);
            }
        }
        qd2.d0.f361717d = null;
        qd2.d0.f361718e = null;
    }

    public zy2.s7 Sj() {
        return (qb2.r1) ((jz5.n) ((c61.w1) i95.n0.c(c61.w1.class)).f39368d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Sk(android.content.Context r18, r45.zc5 r19, long r20, long r22, com.tencent.mm.protobuf.g r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Sk(android.content.Context, r45.zc5, long, long, com.tencent.mm.protobuf.g, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public zy2.v8 Tj() {
        return ya2.l.f460502a;
    }

    public jz5.o Tk(java.lang.String contextId) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        java.util.List f07 = r26.n0.f0(contextId, new java.lang.String[]{"-"}, false, 0, 6, null);
        if (f07.size() != 4) {
            return new jz5.o(0, 0, 0);
        }
        try {
            return new jz5.o(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(0))), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(1))), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(2))));
        } catch (java.lang.NumberFormatException unused) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "parseContextId error contextId: ".concat(contextId));
            return new jz5.o(0, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ui(java.lang.String r20, long r21, int r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Ui(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final kw2.y Uj() {
        return (kw2.y) this.X.getValue();
    }

    public void Uk(java.util.LinkedList objectIds, int i17, int i18) {
        kotlin.jvm.internal.o.g(objectIds, "objectIds");
        ((as2.l) pf5.u.f353936a.e(c61.l7.class).a(as2.l.class)).getClass();
        zr2.k kVar = (zr2.k) ((jz5.n) zr2.k.f475196a).getValue();
        kVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new zr2.j(kVar, objectIds, i17, i18), "FinderSearchRelPreLoader");
    }

    public com.tencent.mm.modelbase.i Vi(java.lang.String req_username, long j17, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var, int i18, long j18, boolean z17, java.lang.Integer num, java.lang.Long l17, java.lang.String str, yz5.p pVar, yz5.p pVar2) {
        kotlin.jvm.internal.o.g(req_username, "req_username");
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return cq.j1.n((cq.k) c17, req_username, j17, gVar, i17, qt2Var, i18, j18, z17, null, 0L, num, l17, null, false, false, null, false, null, null, null, str, pVar, pVar2, 1045248, null);
    }

    public final com.tencent.mm.plugin.finder.storage.ab0 Vj() {
        return (com.tencent.mm.plugin.finder.storage.ab0) ((jz5.n) this.K).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (kotlin.jvm.internal.o.b(r4, r10.getString(3)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vk(r45.of1 r10, boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.Vk(r45.of1, boolean, java.lang.String):void");
    }

    public c50.u0 Wj() {
        return com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a;
    }

    public void Wk(java.lang.String filePath, java.lang.String fromUsername, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(activity, "activity");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.lang.String format = java.lang.String.format("%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), fromUsername}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        jq0Var.e(fromUsername);
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(currentTimeMillis);
        jq0Var.d(format);
        jq0Var.i(format);
        gp0Var.g0(format);
        gp0Var.A0(filePath);
        boolean j17 = com.tencent.mm.vfs.w6.j(filePath);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (j17) {
            gp0Var.B0(filePath);
        } else {
            c4Var.f6326l = com.tencent.mm.R.string.cad;
        }
        gp0Var.h0(2);
        bq0Var.f370964f.add(gp0Var);
        bq0Var.o(jq0Var);
        c4Var.f6315a = bq0Var;
        c4Var.f6323i = activity;
        c4Var.f6317c = 2;
        doFavoriteEvent.e();
    }

    public void Xj(java.lang.String str, zy2.i5 i5Var) {
        cl0.e eVar;
        if (str != null) {
            try {
                cl0.g gVar = new cl0.g(str);
                java.lang.String optString = gVar.optString("businessType");
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "getFinderRedDot json: " + str + " businessType:" + optString);
                java.util.HashSet hashSet = new java.util.HashSet();
                java.lang.Object opt = gVar.opt("redDotPath");
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "redDotPath :" + opt);
                if (opt instanceof java.lang.String) {
                    eVar = new cl0.e((java.lang.String) opt);
                } else if (opt instanceof cl0.e) {
                    kotlin.jvm.internal.o.d(opt);
                    eVar = (cl0.e) opt;
                } else {
                    eVar = new cl0.e("");
                }
                int length = eVar.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String obj = eVar.get(i17).toString();
                    com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "getFinderRedDot path:" + obj);
                    hashSet.add(obj);
                }
                com.tencent.mm.plugin.finder.extension.reddot.h3 h3Var = com.tencent.mm.plugin.finder.extension.reddot.h3.f105549a;
                kotlin.jvm.internal.o.d(optString);
                java.lang.String b17 = h3Var.b(hashSet, optString);
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "redDots :" + b17);
                if (i5Var != null) {
                    i5Var.a(b17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCommonFeatureService", e17, "getFinderRedDot exception", new java.lang.Object[0]);
            }
        }
    }

    public java.util.LinkedList Xk() {
        byte[] j17 = com.tencent.mm.sdk.platformtools.o4.M("_finder_at_mmkv" + gm0.j1.b().h()).j("_finder_at_mmkv_recent_at");
        if (j17 != null) {
            if (!(j17.length == 0)) {
                r45.sb4 sb4Var = new r45.sb4();
                try {
                    sb4Var.parseFrom(j17);
                    return sb4Var.getList(0);
                } catch (java.io.IOException e17) {
                    int i17 = com.tencent.mm.plugin.finder.ui.FinderPostAtUI.D;
                    int i18 = com.tencent.mm.plugin.finder.ui.FinderPostAtUI.D;
                    com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderPostAtUI", e17, "_readRecentAt, LocalFinderRecentAtContactCache, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }

    public java.lang.String Yj() {
        androidx.appcompat.app.AppCompatActivity context;
        android.content.Intent intent;
        java.lang.String stringExtra;
        java.lang.String str = com.tencent.mm.plugin.finder.report.s0.f125340b;
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "keep searchH5 contextId");
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        com.tencent.mm.ui.MMActivity mMActivity = ll6 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) ll6 : null;
        return (mMActivity == null || (context = mMActivity.getContext()) == null || (intent = context.getIntent()) == null || (stringExtra = intent.getStringExtra("key_context_id")) == null) ? str : stringExtra;
    }

    public com.tencent.mm.protocal.protobuf.FinderObject Yk(long j17, java.lang.String str, int i17, java.lang.String encryptedObjectId) {
        java.lang.String str2;
        kotlin.jvm.internal.c0 c0Var;
        java.lang.Object obj;
        kotlin.jvm.internal.h0 h0Var;
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "requestFinderObject " + j17 + ", " + str + " enter");
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        h0Var2.f310123d = h17;
        java.lang.Object obj2 = new java.lang.Object();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "requestFinderObject " + j17 + ", start");
            c0Var = c0Var2;
            obj = obj2;
            str2 = "requestFinderObject wait ";
            new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, encryptedObjectId, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().q(new c61.x6(obj, j17, h0Var2, c0Var));
            h0Var = h0Var2;
        } else {
            str2 = "requestFinderObject wait ";
            c0Var = c0Var2;
            obj = obj2;
            h0Var = h0Var2;
        }
        if (h0Var.f310123d == null) {
            java.lang.Object obj3 = obj;
            synchronized (obj3) {
                if (!c0Var.f310112d) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", str2 + j17);
                    obj3.wait(2000L);
                    com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "requestFinderObject notify " + j17);
                }
            }
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) h0Var.f310123d;
        if (finderItem != null) {
            return finderItem.getFeedObject();
        }
        return null;
    }

    public void Zi(android.content.Context context, java.lang.String tip, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tip, "tip");
        if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context))) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "need create finder contact");
            java.lang.String string = context.getString(com.tencent.mm.R.string.crn);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.finder.assist.p1.f102448a.a(context, context.getString(com.tencent.mm.R.string.crv), !com.tencent.mm.sdk.platformtools.t8.K0(tip) ? tip : string, context.getString(com.tencent.mm.R.string.crr), context.getString(com.tencent.mm.R.string.crl), new c61.d3(false, i17, context), new c61.e3(false), new c61.f3(false));
        }
    }

    public zy2.ab Zj() {
        return com.tencent.mm.plugin.finder.service.m4.f126148a;
    }

    public void Zk(android.app.Activity activity, java.lang.String jsonStr, zy2.i5 didOpenCallback, zy2.i5 failCallback, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        kotlin.jvm.internal.o.g(didOpenCallback, "didOpenCallback");
        kotlin.jvm.internal.o.g(failCallback, "failCallback");
        try {
            com.tencent.mm.plugin.finder.feed.jh.f107101a.b((com.tencent.mm.ui.MMActivity) activity, jsonStr, didOpenCallback, failCallback, z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCommonFeatureService", e17, "reserveChannelsLive exception", new java.lang.Object[0]);
            failCallback.a(-1);
        }
    }

    public void aj() {
        if (!vk()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[checkInsertLiveTaskRedDot] hasFinderAccount = false");
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MY_FINDER_LIVE_TASK_REDDOT_FLAG_INT_SYNC;
        if (c17.r(u3Var, 0) == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[checkInsertLiveTaskRedDot] hasShow = true");
            return;
        }
        if (!ya2.h.f460484a.d("Entrance_PrimarySetting")) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[checkInsertLiveTaskRedDot] getLiveTaskEnable = false");
            return;
        }
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f388490h = java.lang.String.valueOf(c01.id.c());
        vs2Var.f388486d = 50000;
        vs2Var.f388487e = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT;
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = 1;
        f03Var.f373891h = 1;
        f03Var.f373892i = "TLPersonalCenter";
        vs2Var.f388489g.add(f03Var);
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f373887d = 1;
        f03Var2.f373891h = 1;
        f03Var2.f373892i = "FinderPosterEntrance";
        vs2Var.f388489g.add(f03Var2);
        r45.f03 f03Var3 = new r45.f03();
        f03Var3.f373887d = 1;
        f03Var3.f373891h = 1;
        f03Var3.f373892i = "FinderSettingLiveTask";
        vs2Var.f388489g.add(f03Var3);
        zy2.fa.D(nk6, vs2Var, "checkInsertLiveTaskRedDot", null, true, null, 20, null);
        gm0.j1.u().c().x(u3Var, 1);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "checkInsertLiveTaskRedDot");
    }

    public vd2.h5 ak() {
        return vd2.t3.f435921a;
    }

    public void al(r45.qt2 qt2Var, int i17, r45.jn0 extStats) {
        kotlin.jvm.internal.o.g(extStats, "extStats");
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, i17, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, i17, kz5.c0.d(extStats), null);
    }

    public boolean bj(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        eo2.f fVar = eo2.f.f255565a;
        eo2.d dVar = (eo2.d) ((java.util.HashMap) eo2.f.f255566b).get(name);
        java.lang.String str = "checkMemberStatusWithoutCgi name=" + name + " %d";
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(dVar != null ? dVar.f255561c : -1);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberStatusManager", str, objArr);
        return dVar != null && dVar.f255559a && c01.id.c() / ((long) 1000) <= dVar.f255562d && dVar.f255561c == 1;
    }

    public java.lang.String bk(com.tencent.mm.modelbase.m1 scene) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(scene, "scene");
        db2.u5 u5Var = scene instanceof db2.u5 ? (db2.u5) scene : null;
        if (u5Var == null) {
            return null;
        }
        try {
            java.util.List list = u5Var.f228192g;
            if (list == null) {
                return null;
            }
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list == null || (str = (java.lang.String) kz5.n0.Z(list)) == null) {
                return null;
            }
            return android.net.Uri.parse(str).getQueryParameter("promoter_token");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(u5Var.f228189d, th6, "getPromoterToken exception", new java.lang.Object[0]);
            return null;
        }
    }

    public void bl(java.lang.String commentScene) {
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d(commentScene);
    }

    public void cj(r45.nw1 nw1Var, int i17) {
        r45.i72 i72Var;
        r45.i72 i72Var2;
        long j17 = (nw1Var == null || (i72Var2 = (r45.i72) nw1Var.getCustom(44)) == null) ? 0L : i72Var2.getLong(12);
        long j18 = (nw1Var == null || (i72Var = (r45.i72) nw1Var.getCustom(44)) == null) ? 0L : i72Var.getLong(13);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "checkPreloadReplayFeed, replayFeedId:" + pm0.v.u(j17) + ", replay_control_flag:" + j18);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127975v).getValue()).r()).intValue() == 1 || (j17 != 0 && pm0.v.A(j18, 1L))) {
            com.tencent.mm.plugin.finder.service.l2 l2Var = (com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class));
            l2Var.getClass();
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
            if (h17 != null && h17.isUrlValid()) {
                l2Var.Bi(h17.getFinderObject(), i17, 1);
            } else {
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).wi(j17, h17 != null ? h17.getDupFlag() : null).l().K(new com.tencent.mm.plugin.finder.service.g2(l2Var, i17, 1));
            }
        }
    }

    public jz5.l ck(boolean z17) {
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.k0 k0Var = (ey2.k0) a17;
        jz5.l P6 = k0Var.P6();
        if (!(((java.lang.Number) P6.f302833d).floatValue() == 0.0f)) {
            return P6;
        }
        if (!(((java.lang.Number) P6.f302834e).floatValue() == 0.0f) || !z17) {
            return P6;
        }
        ey2.d0 O6 = k0Var.O6();
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "getLastLocation read global cache=" + O6);
        return new jz5.l(java.lang.Float.valueOf(O6.f257338a), java.lang.Float.valueOf(O6.f257339b));
    }

    public void cl(zy2.z5 state, boolean z17) {
        kotlin.jvm.internal.o.g(state, "state");
        this.C1.put(state, java.lang.Boolean.valueOf(z17));
    }

    public java.lang.String dk(com.tencent.mm.modelbase.m1 scene) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(scene, "scene");
        zy2.rc rcVar = scene instanceof zy2.rc ? (zy2.rc) scene : null;
        if (rcVar == null || (str = rcVar.f477565i) == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            return android.net.Uri.parse(str).getQueryParameter("promoter_token");
        }
        return null;
    }

    public void dl(android.content.Context context, java.lang.String username, java.lang.String subTitle, boolean z17, java.lang.String okText, com.tencent.mm.ui.widget.dialog.j dialogClick, android.content.DialogInterface.OnDismissListener onDismissListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(subTitle, "subTitle");
        kotlin.jvm.internal.o.g(okText, "okText");
        kotlin.jvm.internal.o.g(dialogClick, "dialogClick");
        cx2.i iVar = new cx2.i(context);
        if (onDismissListener != null) {
            iVar.f224543e = onDismissListener;
        }
        iVar.c(username);
        i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(subTitle)) {
            iVar.f224540b.f211821b.f211730t = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, subTitle);
        }
        iVar.b(java.lang.Boolean.valueOf(z17));
        iVar.f224542d = okText;
        iVar.a(dialogClick);
        iVar.f224541c.show();
    }

    public final yr2.k ek() {
        return (yr2.k) this.W.getValue();
    }

    public boolean el() {
        return pr2.a.f357949a.a();
    }

    public final void fj() {
        pf5.u uVar = pf5.u.f353936a;
        ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).N6();
        bu2.e0.f24498a.c(true);
        bu2.j jVar = bu2.j.f24534a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cacheItems size ");
        com.tencent.mm.sdk.platformtools.c0 c0Var = bu2.j.f24535b;
        sb6.append(c0Var.f192494e);
        com.tencent.mars.xlog.Log.i("Finder.FinderCache", sb6.toString());
        c0Var.a();
        bu2.j.f24536c.clear();
        ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).U6();
        ey2.c3 c3Var = (ey2.c3) uVar.e(c61.l7.class).a(ey2.c3.class);
        c3Var.f257333e.clear();
        c3Var.f257334f.clear();
        c3Var.f257335g.clear();
        com.tencent.mm.plugin.finder.service.s1 s1Var = (com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class));
        s1Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.ContactService", "[clearFollowStateCache]");
        s1Var.f126200h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l75.n0 fk(int i17) {
        com.tencent.mm.plugin.finder.storage.g90 g90Var;
        gm0.j1.b().c();
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.storage.sj0 sj0Var = this.L;
            com.tencent.mm.plugin.finder.storage.sj0 sj0Var2 = sj0Var;
            if (sj0Var == null) {
                sj0Var2 = new com.tencent.mm.plugin.finder.storage.sj0(xk(this.f39121n, new c61.c6(this)));
            }
            this.L = sj0Var2;
            g90Var = sj0Var2;
        } else {
            com.tencent.mm.plugin.finder.storage.g90 g90Var2 = this.M;
            com.tencent.mm.plugin.finder.storage.g90 g90Var3 = g90Var2;
            if (g90Var2 == null) {
                g90Var3 = new com.tencent.mm.plugin.finder.storage.g90(xk(this.f39120m, new c61.y5(this)));
            }
            this.M = g90Var3;
            g90Var = g90Var3;
        }
        return g90Var;
    }

    public void fl(android.content.Context context, java.lang.String title, java.lang.String content, android.content.DialogInterface.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper.INSTANCE.showOverSeaAgreeConfirmDiaglog(context, title, content, onClickListener);
    }

    public final d95.b0 gk() {
        return xk(this.f39122o, new c61.a6(this));
    }

    public boolean gl() {
        return pr2.a.f357949a.a();
    }

    public void hj() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, "");
        g92.b bVar = g92.b.f269769e;
        m92.c cVar = new m92.c(bVar.T0());
        cVar.field_messageLikeBuf = null;
        cVar.field_messageCommentBuf = null;
        cVar.field_messageFollowBuf = null;
        bVar.C(cVar, m92.j.f325004v);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
    }

    public com.tencent.mm.plugin.finder.storage.ma0 hk() {
        return (com.tencent.mm.plugin.finder.storage.ma0) ((jz5.n) this.f39127r).getValue();
    }

    public void hl(long j17, java.lang.String mediaId, java.lang.String originalMediaId, java.lang.String url, int i17, java.lang.String specFormat, int i18, long j18, long j19, int i19, int i27, java.lang.String str, java.lang.String str2, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(originalMediaId, "originalMediaId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "storeFinderMediaCache mediaId" + mediaId + " cacheSize:" + j18 + " totalSize:" + j19 + " state:" + i19 + " specFormat:" + specFormat);
        cu2.x.h(cu2.x.f222449a, j17, mediaId, originalMediaId, url, i17, specFormat, i18, j18, j19, i19, i27, str, str2, z17, false, 16384, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ij(java.lang.String r12, zy2.i5 r13) {
        /*
            r11 = this;
            jz5.f0 r0 = jz5.f0.f302826a
            java.lang.String r1 = "Finder.FinderCommonFeatureService"
            java.lang.String r2 = "clearFinderRedDot json: "
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r12 == 0) goto La4
            r5 = 0
            cl0.g r6 = new cl0.g     // Catch: java.lang.Exception -> L95
            r6.<init>(r12)     // Catch: java.lang.Exception -> L95
            java.lang.String r7 = "businessType"
            java.lang.String r7 = r6.optString(r7)     // Catch: java.lang.Exception -> L95
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L95
            r8.<init>(r2)     // Catch: java.lang.Exception -> L95
            r8.append(r12)     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = " businessType:"
            r8.append(r12)     // Catch: java.lang.Exception -> L95
            r8.append(r7)     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = r8.toString()     // Catch: java.lang.Exception -> L95
            com.tencent.mars.xlog.Log.i(r1, r12)     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = "redDotPath"
            java.lang.Object r12 = r6.get(r12)     // Catch: java.lang.Exception -> L95
            boolean r2 = r12 instanceof java.lang.String     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L42
            cl0.e r2 = new cl0.e     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L95
            r2.<init>(r12)     // Catch: java.lang.Exception -> L95
            goto L51
        L42:
            boolean r2 = r12 instanceof cl0.e     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L4a
            r2 = r12
            cl0.e r2 = (cl0.e) r2     // Catch: java.lang.Exception -> L95
            goto L51
        L4a:
            cl0.e r2 = new cl0.e     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = ""
            r2.<init>(r12)     // Catch: java.lang.Exception -> L95
        L51:
            int r12 = r2.length()     // Catch: java.lang.Exception -> L95
            r6 = r3
        L56:
            if (r6 >= r12) goto L88
            java.lang.Object r8 = r2.get(r6)     // Catch: java.lang.Exception -> L95
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L95
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L95
            r9.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.String r10 = "clearFinderRedDot path:"
            r9.append(r10)     // Catch: java.lang.Exception -> L95
            r9.append(r8)     // Catch: java.lang.Exception -> L95
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L95
            com.tencent.mars.xlog.Log.i(r1, r9)     // Catch: java.lang.Exception -> L95
            zy2.fa r9 = r11.nk()     // Catch: java.lang.Exception -> L95
            r9.N(r8)     // Catch: java.lang.Exception -> L95
            com.tencent.mm.plugin.finder.extension.reddot.h3 r9 = com.tencent.mm.plugin.finder.extension.reddot.h3.f105549a     // Catch: java.lang.Exception -> L95
            java.lang.String r10 = "clearFinderRedDot"
            kotlin.jvm.internal.o.d(r7)     // Catch: java.lang.Exception -> L95
            r9.e(r10, r8, r7)     // Catch: java.lang.Exception -> L95
            int r6 = r6 + 1
            goto L56
        L88:
            if (r13 == 0) goto L93
            r12 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L95
            r13.a(r12)     // Catch: java.lang.Exception -> L95
            goto La2
        L93:
            r0 = r5
            goto La2
        L95:
            r12 = move-exception
            java.lang.String r2 = "clearFinderRedDot exception"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r12, r2, r3)
            if (r13 == 0) goto L93
            r13.a(r4)
        La2:
            if (r0 != 0) goto La9
        La4:
            if (r13 == 0) goto La9
            r13.a(r4)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.ij(java.lang.String, zy2.i5):void");
    }

    public com.tencent.mm.plugin.finder.storage.na0 ik() {
        return (com.tencent.mm.plugin.finder.storage.na0) ((jz5.n) this.f39126q).getValue();
    }

    public java.lang.String il(int i17) {
        int hashCode;
        if (i17 > 99990) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d0u);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i17 <= 9990) {
            return java.lang.String.valueOf(i17);
        }
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.#");
        decimalFormat.setRoundingMode(java.math.RoundingMode.FLOOR);
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (f17 == null || ((hashCode = f17.hashCode()) == 115861276 ? !f17.equals("zh_CN") : hashCode == 115861428 ? !f17.equals("zh_HK") : !(hashCode == 115861812 && f17.equals("zh_TW")))) {
            return decimalFormat.format(java.lang.Float.valueOf(i17 / 1000)) + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f7y);
        }
        return decimalFormat.format(java.lang.Float.valueOf(i17 / 10000)) + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f7x);
    }

    public final com.tencent.mm.plugin.finder.storage.pa0 jk() {
        return (com.tencent.mm.plugin.finder.storage.pa0) ((jz5.n) this.f39133x).getValue();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034e A[Catch: Exception -> 0x03b3, all -> 0x03f7, TryCatch #3 {Exception -> 0x03b3, blocks: (B:101:0x033e, B:103:0x0342, B:108:0x034e, B:110:0x0356, B:111:0x0361, B:113:0x0393, B:152:0x035c), top: B:100:0x033e }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b A[Catch: Exception -> 0x0175, all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:31:0x0105, B:32:0x010b, B:34:0x0111, B:37:0x011b, B:39:0x011f, B:44:0x012b, B:46:0x0133, B:47:0x013e, B:49:0x016e, B:57:0x0139, B:62:0x01c6), top: B:30:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02df A[Catch: all -> 0x056f, TRY_LEAVE, TryCatch #4 {all -> 0x056f, blocks: (B:72:0x02c1, B:73:0x02d9, B:75:0x02df), top: B:71:0x02c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0332 A[Catch: all -> 0x03f7, Exception -> 0x03fa, TRY_LEAVE, TryCatch #10 {Exception -> 0x03fa, blocks: (B:92:0x0326, B:93:0x032c, B:95:0x0332), top: B:91:0x0326 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jl() {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.jl():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object kk(android.content.Context r16, com.tencent.mm.protobuf.g r17, boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.kk(android.content.Context, com.tencent.mm.protobuf.g, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long kl(long r7, int r9, java.lang.String r10) {
        /*
            r6 = this;
            pf5.u r0 = pf5.u.f353936a
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            pf5.v r0 = r0.e(r1)
            java.lang.Class<xc2.k0> r1 = xc2.k0.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            xc2.k0 r0 = (xc2.k0) r0
            androidx.lifecycle.j0 r7 = r0.W6(r7, r9, r10)
            java.lang.Object r7 = r7.getValue()
            java.util.Set r7 = (java.util.Set) r7
            r8 = 0
            if (r7 == 0) goto Le0
            java.util.Iterator r7 = r7.iterator()
        L22:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Le0
            java.lang.Object r10 = r7.next()
            xc2.t r10 = (xc2.t) r10
            java.util.List r10 = r10.f453302d
            java.util.Iterator r10 = r10.iterator()
        L34:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r10.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r0
            int r1 = r0.getBusiness_type()
            r2 = 39
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L5d
            com.tencent.mm.protocal.protobuf.NativeInfo r1 = r0.getNative_info()
            if (r1 == 0) goto L5a
            int r1 = r1.getNative_type()
            r2 = 14
            if (r1 != r2) goto L5a
            r1 = r3
            goto L5b
        L5a:
            r1 = r4
        L5b:
            if (r1 == 0) goto L34
        L5d:
            java.util.LinkedList r7 = r0.getStyle()
            r10 = 0
            if (r7 == 0) goto L92
            java.util.Iterator r7 = r7.iterator()
        L68:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r7.next()
            r2 = r1
            r45.wf6 r2 = (r45.wf6) r2
            r5 = 2
            int r2 = r2.getInteger(r5)
            r5 = 16
            if (r2 != r5) goto L80
            r2 = r3
            goto L81
        L80:
            r2 = r4
        L81:
            if (r2 == 0) goto L68
            goto L85
        L84:
            r1 = r10
        L85:
            r45.wf6 r1 = (r45.wf6) r1
            if (r1 == 0) goto L92
            r7 = 23
            com.tencent.mm.protobuf.f r7 = r1.getCustom(r7)
            r45.z84 r7 = (r45.z84) r7
            goto L93
        L92:
            r7 = r10
        L93:
            if (r7 == 0) goto L9b
            r1 = 3
            long r1 = r7.getLong(r1)
            goto L9c
        L9b:
            r1 = r8
        L9c:
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 != 0) goto Ldf
            cl0.g r7 = new cl0.g     // Catch: org.json.JSONException -> Ld5
            com.tencent.mm.protocal.protobuf.NativeInfo r8 = r0.getNative_info()     // Catch: org.json.JSONException -> Ld5
            java.lang.String r9 = ""
            if (r8 == 0) goto Lb0
            java.lang.String r8 = r8.getNecessary_params()     // Catch: org.json.JSONException -> Ld5
            if (r8 != 0) goto Lb1
        Lb0:
            r8 = r9
        Lb1:
            r7.<init>(r8)     // Catch: org.json.JSONException -> Ld5
            java.lang.String r8 = "liveid"
            boolean r0 = r7.has(r8)     // Catch: java.lang.Exception -> Lc5
            if (r0 != r3) goto Lbd
            goto Lbe
        Lbd:
            r3 = r4
        Lbe:
            if (r3 == 0) goto Lcf
            java.lang.String r10 = r7.getString(r8)     // Catch: java.lang.Exception -> Lc5
            goto Lcf
        Lc5:
            r7 = move-exception
            java.lang.String r8 = "safeGetString"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: org.json.JSONException -> Ld5
            com.tencent.mm.sdk.platformtools.Log.a(r8, r9, r7)     // Catch: org.json.JSONException -> Ld5
        Lcf:
            long r7 = pm0.v.Z(r10)     // Catch: org.json.JSONException -> Ld5
            r8 = r7
            goto Le0
        Ld5:
            r7 = move-exception
            java.lang.String r8 = "Finder.FeedGlobalJumperUIC"
            java.lang.String r7 = r7.getMessage()
            com.tencent.mars.xlog.Log.e(r8, r7)
        Ldf:
            r8 = r1
        Le0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.kl(long, int, java.lang.String):long");
    }

    public final cu2.k0 lk() {
        gm0.j1.b().c();
        return (cu2.k0) this.D.getValue();
    }

    public android.content.Context ll() {
        return com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
    }

    public final void mj() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.t5 mk() {
        gm0.j1.b().c();
        return (com.tencent.mm.plugin.finder.extension.reddot.t5) this.F.getValue();
    }

    public com.tencent.mm.protocal.protobuf.FinderObject ml(long j17, java.lang.String str, int i17, boolean z17, boolean z18, java.lang.String encryptedObjectId, zy2.a6 a6Var) {
        db2.g4 g4Var;
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + j17 + ", enter");
        if (z17) {
            bu2.j.f24534a.l(j17);
        }
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + j17 + ", start");
            db2.g4 g4Var2 = new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, encryptedObjectId, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null);
            android.content.Context b17 = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
            if (z18) {
                g4Var = g4Var2;
                g4Var.t(b17, b17.getResources().getString(com.tencent.mm.R.string.d0b), 1000L);
            } else {
                g4Var = g4Var2;
            }
            g4Var.l().q(new c61.d7(a6Var, j17));
        }
        if (h17 != null) {
            return h17.getFeedObject();
        }
        return null;
    }

    public void nj() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
    }

    public zy2.fa nk() {
        zy2.fa d8Var;
        if (this.S == null) {
            synchronized (this) {
                if (this.S == null) {
                    if (((java.lang.Boolean) ((jz5.n) ((ey2.r1) pf5.u.f353936a.e(c61.l7.class).a(ey2.r1.class)).f257491f).getValue()).booleanValue()) {
                        i95.n0.c(e70.q.class);
                        com.tencent.wechat.aff.finder.FinderCppToNativeOnLoader.getInstance().registerAffFinderProvider(com.tencent.mm.plugin.finder.service.b.class);
                        d8Var = new com.tencent.mm.plugin.finder.extension.reddot.x9(ok(this));
                    } else {
                        d8Var = new com.tencent.mm.plugin.finder.extension.reddot.d8(ok(this));
                    }
                    this.S = d8Var;
                }
            }
        }
        zy2.fa faVar = this.S;
        kotlin.jvm.internal.o.d(faVar);
        return faVar;
    }

    public java.lang.Long nl(java.lang.String data, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObject Yk;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderVideoInfoForSearch");
        try {
            cl0.g gVar = new cl0.g(data);
            java.lang.String optString = gVar.optString("nonceId");
            java.lang.String optString2 = gVar.optString("exportId");
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.FinderItem wi6 = cq.k.wi((cq.k) c17, optString2, 0, 2, null);
            if (wi6 == null || (Yk = wi6.getFeedObject()) == null) {
                kotlin.jvm.internal.o.d(optString2);
                Yk = Yk(0L, optString, i17, optString2);
            }
            if (Yk != null) {
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c18).rk(Yk, i17, null);
            }
            if (Yk != null) {
                return java.lang.Long.valueOf(Yk.getId());
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp e:" + th6);
            return null;
        }
    }

    public void oj(android.content.Context context) {
        com.tencent.mm.plugin.finder.uniComments.b bVar;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ci4.b bVar2 = (ci4.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ci4.b.class);
        com.tencent.mm.plugin.finder.uniComments.b bVar3 = bVar2.f41714d;
        boolean z17 = false;
        if (bVar3 != null) {
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer2 = bVar3.f130202a;
            if (textStatusCommentDrawer2 != null && textStatusCommentDrawer2.getVisibility() == 0) {
                z17 = true;
            }
        }
        if (!z17 || (bVar = bVar2.f41714d) == null || (textStatusCommentDrawer = bVar.f130202a) == null) {
            return;
        }
        textStatusCommentDrawer.h();
    }

    public jz5.l ol(long j17, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + j17 + ", start");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.lang.Object obj = new java.lang.Object();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null).l().q(new c61.e7(c0Var, obj, j17, h0Var, c0Var2));
        synchronized (obj) {
            if (!c0Var2.f310112d) {
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "requestFinderObject wait " + j17);
                obj.wait(5000L);
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "requestFinderObject notify " + j17);
            }
        }
        return new jz5.l(java.lang.Boolean.valueOf(c0Var.f310112d), h0Var.f310123d);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0432  */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 1985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.onAccountInitialized(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l85.m1, i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountReleased(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.onAccountReleased(android.content.Context):void");
    }

    @Override // l85.m1, i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wi();
        ru2.j jVar = ru2.j.f399741d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLifecycleCallback", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerActivityLifecycleCallbacks(jVar);
        ru2.i iVar = new ru2.i();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ru2.j.f399746i;
        copyOnWriteArrayList.add(iVar);
        copyOnWriteArrayList.add(new c61.r6());
        vp.c.f438736a = context;
        vp.c.f438737b = false;
        ms5.f fVar = ms5.f.f331158a;
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(ms5.f.f331163f);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 3512 && i17 == 0 && i18 == 0) {
            com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
            kotlin.jvm.internal.o.e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) reqResp).f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetUserResponse");
            java.util.LinkedList list = ((r45.ua1) fVar).getList(1);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ya2.g.m(ya2.h.f460484a, (com.tencent.mm.protocal.protobuf.FinderContact) it.next(), false, 2, null);
                }
            }
        }
    }

    public java.lang.String pj(r45.ht0 event) {
        kotlin.jvm.internal.o.g(event, "event");
        return (android.text.TextUtils.isEmpty(event.getString(2)) || !hc2.a0.c(event.getLong(4))) ? event.getString(1) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cjl, event.getString(2), event.getString(1));
    }

    public com.tencent.mm.plugin.finder.storage.dj0 pk() {
        return (com.tencent.mm.plugin.finder.storage.dj0) this.f39115J.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object pl(long r40, java.lang.String r42, int r43, kotlin.coroutines.Continuation r44) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.pl(long, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void qj(android.content.Context context, android.content.Intent intent, java.lang.String str, boolean z17, zy2.i5 i5Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[createAccount] in teen mode");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.f7n);
            e4Var.c();
            if (i5Var != null) {
                i5Var.a(2);
                return;
            }
            return;
        }
        if (!el() || !gl()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[createAccount] no finder entry");
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = context.getString(com.tencent.mm.R.string.m7o);
            e4Var2.c();
            if (i5Var != null) {
                i5Var.a(2);
                return;
            }
            return;
        }
        if (str != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "json: ".concat(str));
            try {
                if (str.length() == 0) {
                    str = "{}";
                }
                com.tencent.mm.plugin.finder.assist.b2.f102020d.a(context, new cl0.g(str), z17, i5Var);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCommonFeatureService", e17, "createAccount exception", new java.lang.Object[0]);
            }
        }
    }

    public final com.tencent.mm.plugin.finder.storage.gj0 qk() {
        return (com.tencent.mm.plugin.finder.storage.gj0) ((jz5.n) this.f39132w).getValue();
    }

    public void ql(java.lang.String finderUser, long j17) {
        kotlin.jvm.internal.o.g(finderUser, "finderUser");
        so2.z1.c(so2.z1.f410730a, new r45.qt2(), finderUser, 2, j17, null, false, 0, null, null, 0L, 992, null);
    }

    public dk4.a rj(com.tencent.mm.protocal.protobuf.FinderMedia finderMedia, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(finderMedia, "finderMedia");
        return yr2.c.f464661a.a(finderMedia, j17, z17);
    }

    public int rk() {
        int b17 = hc2.d0.b(((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).Q6());
        if (-1 == b17) {
            return 1;
        }
        return b17;
    }

    public void rl(com.tencent.mm.protocal.protobuf.FinderObject feed, java.lang.String source) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[updateFinderCache] feed=" + pm0.v.u(feed.getId()) + " source=" + source);
        bu2.j jVar = bu2.j.f24534a;
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(feed, 0);
        bu2.i iVar = bu2.i.f24521b;
        jVar.n(a17, bu2.i.f24531l);
    }

    public dk4.a sj(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        yr2.c cVar = yr2.c.f464661a;
        com.tencent.mars.xlog.Log.i("FinderTPMediaInfoHelper", "createTPMediaInfo, id:" + finderObject.getId());
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        if (finderMedia == null) {
            com.tencent.mars.xlog.Log.e("FinderTPMediaInfoHelper", "invalid media");
            return null;
        }
        dk4.a a17 = cVar.a(finderMedia, finderObject.getId(), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createTPMediaInfo, tpMediaInfo:");
        sb6.append(a17);
        sb6.append(", fileFormat:");
        sb6.append(a17 != null ? a17.f234465b : null);
        com.tencent.mars.xlog.Log.i("FinderTPMediaInfoHelper", sb6.toString());
        return a17;
    }

    public r45.fr0 sk() {
        r45.fr0 fr0Var = new r45.fr0();
        java.lang.Object l17 = gm0.j1.u().c().l(67591, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "lbs location is null, no cached data!");
        } else {
            try {
                kotlin.jvm.internal.o.d(str);
                java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
                fr0Var.set(1, java.lang.Float.valueOf(java.lang.Integer.valueOf(strArr[2]).intValue() / 1000000.0f));
                fr0Var.set(0, java.lang.Float.valueOf(java.lang.Integer.valueOf(strArr[3]).intValue() / 1000000.0f));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Finder.FinderCommonFeatureService", "getCurrentGPSData parse value error.", e17);
            }
        }
        return fr0Var;
    }

    public java.lang.Object sl(android.content.Context context, int i17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = nVar;
        if (context instanceof androidx.fragment.app.FragmentActivity) {
            js4.n nVar2 = new js4.n();
            nVar2.f301543a = i17;
            nVar2.f301555m = true;
            nVar2.f301546d = new c61.j7(h0Var);
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((androidx.fragment.app.FragmentActivity) context, nVar2);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "#weCoinChargeDialog context not FragmentActivity");
            kotlin.coroutines.Continuation continuation2 = (kotlin.coroutines.Continuation) h0Var.f310123d;
            if (continuation2 != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, new java.lang.Integer(0))));
            }
            h0Var.f310123d = null;
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tj(android.content.Context r9, r45.q23 r10, android.content.Intent r11, int r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l7.tj(android.content.Context, r45.q23, android.content.Intent, int):void");
    }

    public final com.tencent.mm.plugin.finder.storage.rj0 tk() {
        return (com.tencent.mm.plugin.finder.storage.rj0) ((jz5.n) this.A).getValue();
    }

    public void tl(java.util.LinkedList atContacts) {
        r45.gb4 gb4Var;
        kotlin.jvm.internal.o.g(atContacts, "atContacts");
        if (atContacts.isEmpty()) {
            return;
        }
        java.util.LinkedList Xk = Xk();
        if (Xk == null) {
            Xk = new java.util.LinkedList();
        }
        java.util.HashMap hashMap = new java.util.HashMap(Xk.size());
        java.util.Iterator it = Xk.iterator();
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                break;
            }
            r45.gb4 gb4Var2 = (r45.gb4) it.next();
            java.lang.String string = gb4Var2.getString(0);
            if (string != null) {
                str = string;
            }
            hashMap.put(str, gb4Var2);
        }
        java.util.Iterator it6 = atContacts.iterator();
        while (it6.hasNext()) {
            r45.gb4 gb4Var3 = (r45.gb4) it6.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gb4Var3.getString(0)) && ((gb4Var = (r45.gb4) hashMap.get(gb4Var3.getString(0))) == null || gb4Var.getLong(4) == 0 || gb4Var.getLong(4) < gb4Var3.getLong(4))) {
                java.lang.String string2 = gb4Var3.getString(0);
                if (string2 == null) {
                    string2 = "";
                }
                hashMap.put(string2, gb4Var3);
            }
        }
        Xk.clear();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            Xk.add((r45.gb4) entry.getValue());
        }
        java.util.Collections.sort(Xk, c61.k7.f39105d);
        if (Xk.size() > 5) {
            for (int size = Xk.size() - 1; 4 < size; size--) {
                Xk.remove(size);
            }
        }
        r45.sb4 sb4Var = new r45.sb4();
        sb4Var.set(0, Xk);
        try {
            byte[] byteArray = sb4Var.toByteArray();
            if (byteArray == null) {
                return;
            }
            com.tencent.mm.sdk.platformtools.o4.M("_finder_at_mmkv" + gm0.j1.b().h()).H("_finder_at_mmkv_recent_at", byteArray);
        } catch (java.io.IOException e17) {
            int i17 = com.tencent.mm.plugin.finder.ui.FinderPostAtUI.D;
            int i18 = com.tencent.mm.plugin.finder.ui.FinderPostAtUI.D;
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderPostAtUI", e17, "_writeRecentAt, LocalFinderRecentAtContactCache, _write: %s", e17.getMessage());
        }
    }

    public final void uj() {
        boolean z17;
        alive();
        if (this.f39125p1) {
            return;
        }
        boolean el6 = el();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127764j3).getValue()).r()).intValue() == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doSomethingImportantOnStart] ");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sb6.append(xy2.c.e(context));
        sb6.append(" isDoSomethingCompleted=");
        sb6.append(this.f39125p1);
        sb6.append(", isShowFinderEntry=");
        sb6.append(el6);
        sb6.append(" FIX_REINIT_SELECTOR_ENABLE_VALUE=");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", sb6.toString());
        if (el6) {
            this.f39125p1 = true;
            f92.i iVar = (f92.i) ((jz5.n) this.R).getValue();
            iVar.getClass();
            g92.b bVar = g92.b.f269769e;
            bVar.h6().f324984g.add(iVar);
            bVar.h6().f324985h.add(iVar);
            bVar.h6().f324986i.add(new f92.d());
            bVar.h6().f324986i.add(new f92.b());
            com.tencent.mm.app.w.INSTANCE.a(iVar);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC;
            int r17 = c17.r(u3Var, -1);
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC;
            int r18 = c18.r(u3Var2, 0);
            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC;
            int r19 = c19.r(u3Var3, 0);
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) m17;
            if (r17 == -1 && r18 != r19 && r19 != 0) {
                gm0.j1.u().c().x(u3Var, 1);
                r17 = 1;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[isNeedDoReInit] userVersion=");
            sb7.append(r18);
            sb7.append(", reInitUserVersion=");
            sb7.append(r19);
            sb7.append(", reInitUsername=");
            sb7.append(str);
            sb7.append(" isNeedDoReInit=");
            sb7.append(r17 == 1);
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", sb7.toString());
            boolean z19 = r17 == 1;
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context2))) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 34L, 1L);
            }
            if (z19) {
                int r27 = gm0.j1.u().c().r(u3Var3, 0);
                try {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 21L, 1L);
                    com.tencent.mars.xlog.Log.i("Finder.FinderContactPage", "clearAll");
                    java.lang.String Di = ((cq.k) i95.n0.c(cq.k.class)).Di(1);
                    if (com.tencent.mm.vfs.w6.j(Di)) {
                        com.tencent.mm.vfs.w6.g(Di, true);
                    }
                    bu2.e0.f24498a.c(true);
                    com.tencent.mars.xlog.Log.i("Finder.FansContactPage", "clearAll");
                    java.lang.String Di2 = ((cq.k) i95.n0.c(cq.k.class)).Di(3);
                    if (com.tencent.mm.vfs.w6.j(Di2)) {
                        com.tencent.mm.vfs.w6.g(Di2, true);
                    }
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, "");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 0);
                    m92.j jVar = m92.j.f324995m;
                    bVar.m5(jVar);
                    bVar.k4(jVar);
                    gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(r27));
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC, 0);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING, "");
                    gm0.j1.u().c().x(u3Var, 0);
                    com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var4 = com.tencent.mm.storage.u3.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC;
                    int r28 = c27.r(u3Var4, 0) + 1;
                    gm0.j1.u().c().x(u3Var4, java.lang.Integer.valueOf(r28));
                    mj();
                    com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[doReInit] reInit done. incrementId=" + r28);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCommonFeatureService", e17, "do ReInit occur error!", new java.lang.Object[0]);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 22L, 1L);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[doPrepareUser]... ");
                kotlinx.coroutines.l.d(this.U, null, null, new c61.l4(null), 3, null);
                if (!z18) {
                    this.P.e(826260477, 6);
                }
            } else {
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context3))) {
                    gm0.j1.d().a(3930, this);
                    ((f92.i) ((jz5.n) this.R).getValue()).b("without any finder username.");
                    if (!z18) {
                        this.P.e(826259965, 6);
                    }
                } else {
                    qx.a aVar = qx.a.f367240a;
                    c61.n4 n4Var = new c61.n4(this);
                    if (!qx.a.f367242c) {
                        synchronized (aVar) {
                            if (!qx.a.f367242c) {
                                if (qx.a.f367241b) {
                                    z17 = true;
                                } else {
                                    qx.a.f367243d = n4Var;
                                    z17 = false;
                                }
                                if (z17) {
                                    n4Var.invoke();
                                }
                            }
                        }
                    }
                }
            }
            if (z18) {
                this.P.e(826260477, 6);
            }
            ic2.l0 l0Var = this.P;
            com.tencent.mm.plugin.finder.extension.reddot.r rVar = new com.tencent.mm.plugin.finder.extension.reddot.r();
            l0Var.getClass();
            ic2.l0.f290338r.add(rVar);
            try {
                nk().prepare();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCommonFeatureService", e18, "reddot prepare", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.finder.assist.w5 w5Var = com.tencent.mm.plugin.finder.assist.w5.f102652d;
            gm0.j1.n().f273288b.a(3862, w5Var);
            gm0.j1.n().f273288b.a(7143, w5Var);
            gm0.j1.n().f273288b.a(3906, w5Var);
            com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var = (com.tencent.mm.plugin.finder.extension.reddot.w1) i95.n0.c(com.tencent.mm.plugin.finder.extension.reddot.w1.class);
            w1Var.f105950n.alive();
            nf.e.f(new com.tencent.mm.plugin.finder.extension.reddot.p1(w1Var));
            android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type android.app.Application");
            ((android.app.Application) context4).registerActivityLifecycleCallbacks(new com.tencent.mm.plugin.finder.extension.reddot.q1(w1Var));
            com.tencent.mm.storage.n3 c28 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var5 = com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_CLEAR_WX_IDENTITY_MSG_LAST_BUF_INT_SYNC;
            if (c28.r(u3Var5, 0) == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "doSomethingImportantOnStart: clear wx identity message last buffer when upgrade");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, "");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, "");
                gm0.j1.u().c().x(u3Var5, 1);
            }
        }
    }

    public java.lang.Object uk(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new c61.d6(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public void vj(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.String str3) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "enterProfileForWxPay exportId empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "enterFeedForWxPay exportId:" + str + ", enterCommentScene:" + i17 + ", extraInfo:" + str3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_encrypted_object_id", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("feed_object_nonceId", str2);
        intent.putExtra("key_need_related_list", true);
        intent.putExtra("key_comment_scene", i17);
        intent.putExtra("key_reuqest_scene", 22);
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("key_extra_info", str3);
        if (hz2.d.f286313a.b("entrance") != 0) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).kl(context);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 2, 25, intent);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent, false);
        }
    }

    public boolean vk() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return xy2.c.e(context).length() > 0;
    }

    public void wj(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentName;
        android.content.ComponentName componentName2;
        kotlin.jvm.internal.o.g(context, "context");
        if (intent == null) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String stringExtra = intent.getStringExtra("KEY_FINDER_POST_ASYNC_AIGC_TASK_ID");
        boolean z17 = false;
        int intExtra = intent.getIntExtra("KEY_FINDER_POST_ASYNC_AIGC_TASK_STATUS", 0);
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int i17 = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.f155625t;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.Object systemService = context2.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        if (activityManager != null) {
            try {
                java.util.Iterator<android.app.ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
                while (it.hasNext()) {
                    try {
                        android.app.ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                        componentName = taskInfo.topActivity;
                        componentName2 = taskInfo.baseActivity;
                    } catch (java.lang.Exception unused) {
                    }
                    if (kotlin.jvm.internal.o.b(componentName != null ? componentName.getClassName() : null, com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class.getName())) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(componentName2 != null ? componentName2.getClassName() : null, com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class.getName())) {
                        break;
                    }
                }
            } catch (java.lang.Exception unused2) {
            }
            try {
                for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(Integer.MAX_VALUE)) {
                    android.content.ComponentName componentName3 = runningTaskInfo.topActivity;
                    android.content.ComponentName componentName4 = runningTaskInfo.baseActivity;
                    if (!kotlin.jvm.internal.o.b(componentName3 != null ? componentName3.getClassName() : null, com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class.getName())) {
                        if (kotlin.jvm.internal.o.b(componentName4 != null ? componentName4.getClassName() : null, com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.class.getName())) {
                        }
                    }
                    z17 = true;
                }
            } catch (java.lang.Exception unused3) {
            }
        }
        if (!z17) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
            kotlinx.coroutines.y0 b17 = appCompatActivity != null ? v65.m.b(appCompatActivity) : kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new c61.q4(stringExtra, context, intExtra, intent, h0Var, null), 2, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "enterFinderAIGCGeneratePreviewUI " + stringExtra + " >> task return for isRecording");
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.oi8);
        e4Var.c();
    }

    public boolean wk() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context))) {
            return false;
        }
        return !bu2.e0.f24498a.j(r0, 1).isEmpty();
    }

    public void xj(android.content.Context context, java.lang.String str, int i17, java.lang.String str2) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "enterProfileForWxPay finderUserName empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "enterProfileForWxPay finderUserName:" + str + ", enterCommentScene:" + i17 + ", extraInfo:" + str2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_extra_info", str2);
        if (i17 > 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 2, 32, intent);
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d95.b0 xk(d95.b0[] b0VarArr, yz5.a aVar) {
        if (b0VarArr[0] == 0) {
            synchronized (b0VarArr) {
                if (b0VarArr[0] == 0) {
                    b0VarArr[0] = aVar.invoke();
                }
            }
        }
        d95.b0 b0Var = b0VarArr[0];
        kotlin.jvm.internal.o.d(b0Var);
        return b0Var;
    }

    public void yj(com.tencent.mm.plugin.finder.extension.reddot.b3 actionType) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        zy2.fa faVar = this.S;
        if (faVar != null) {
            faVar.q(actionType);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "exitFindTab(" + actionType + ") but redDotManager is null!");
        }
    }

    public void yk(android.content.Context context, android.content.Intent intent, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int integer = V6 != null ? V6.getInteger(5) : 0;
            et2.e eVar = et2.e.f256583f;
            et2.e eVar2 = et2.e.f256583f;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) context;
            c61.r2 r2Var = new c61.r2();
            eVar2.getClass();
            int hashCode = mMFragmentActivity.hashCode();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar2.f256585b;
            java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
            if (num == null) {
                num = r11;
            }
            if (num.intValue() > 0) {
                java.lang.String simpleName = mMFragmentActivity.getClass().getSimpleName();
                int hashCode2 = mMFragmentActivity.hashCode();
                eVar2.f256587d.put(java.lang.Integer.valueOf(hashCode2), r2Var);
                java.lang.Integer num2 = (java.lang.Integer) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode2));
                int intValue = (num2 != null ? num2 : 0).intValue();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = eVar2.f256586c;
                et2.a aVar = (et2.a) concurrentHashMap2.get(java.lang.Integer.valueOf(intValue));
                if (aVar == null) {
                    aVar = new et2.a();
                    concurrentHashMap2.put(java.lang.Integer.valueOf(intValue), aVar);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(integer);
                sb6.append('-');
                sb6.append(i18);
                sb6.append('-');
                sb6.append(i17);
                sb6.append('-');
                sb6.append(java.lang.System.currentTimeMillis());
                java.lang.String sb7 = sb6.toString();
                if (aVar.f256576a.length() == 0) {
                    kotlin.jvm.internal.o.g(sb7, "<set-?>");
                    aVar.f256576a = sb7;
                    aVar.f256577b = hashCode2;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("sourceid", aVar.f256576a);
                    jSONObject.put("traceid", sb7);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    intent.putExtra("key_jump_id", jSONObject2);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("FinderJumpDataManager", e17.getMessage());
                }
                com.tencent.mars.xlog.Log.i("FinderJumpDataManager", "[initJumpData] " + simpleName + " taskId=" + intValue + ", finderTaskId=" + eVar2.f256588e + ", activityId=" + aVar.f256577b + ", sourceId=" + aVar.f256576a + ", traceId=" + sb7 + ", fromCommentScene=" + integer + ", toCommentScene=" + i17 + ", entranceType=" + i18);
            }
            if (nyVar == null) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("key_jump_id");
            nyVar.B = stringExtra != null ? r26.i0.t(stringExtra, ",", ";", false) : "";
        }
    }

    public void zj(java.lang.String mpPassInfo, int i17, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderObject Yk;
        kotlin.jvm.internal.o.g(mpPassInfo, "mpPassInfo");
        try {
            r45.an2 an2Var = new r45.an2();
            an2Var.parseFrom(android.util.Base64.decode(mpPassInfo, 0));
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.FinderItem wi6 = cq.k.wi((cq.k) c17, an2Var.getString(0), 0, 2, null);
            if (wi6 == null || (Yk = wi6.getFeedObject()) == null) {
                java.lang.String string = an2Var.getString(1);
                java.lang.String string2 = an2Var.getString(0);
                if (string2 == null) {
                    string2 = "";
                }
                Yk = Yk(0L, string, i17, string2);
            }
            if (Yk != null) {
                r45.qt2 qt2Var = new r45.qt2();
                qt2Var.set(5, java.lang.Integer.valueOf(i17));
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.d2().r()).booleanValue()) {
                    nv2.d1 d1Var = nv2.d1.f340475b;
                    nv2.d1.a(nv2.d1.f340475b, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(Yk, 0), z17, 2, qt2Var, 0, null, null, null, 240, null);
                } else {
                    nv2.o oVar = nv2.o.f340558e;
                    nv2.o.a(nv2.o.f340558e, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(Yk, 0), z17, 2, null, qt2Var, 0, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX, null);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "favFeed e:" + th6);
        }
    }

    public boolean zk() {
        return ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
    }
}
