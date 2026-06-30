package ff4;

/* loaded from: classes4.dex */
public final class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f343204d;

    /* renamed from: e, reason: collision with root package name */
    public long f343205e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f343206f;

    /* renamed from: g, reason: collision with root package name */
    public final int f343207g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f343208h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f343209i;

    /* renamed from: m, reason: collision with root package name */
    public long f343210m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f343211n;

    /* renamed from: o, reason: collision with root package name */
    public long f343212o;

    public d(java.lang.String userName, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f343204d = userName;
        this.f343205e = j17;
        this.f343209i = "";
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "fp mUserName ".concat(userName));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "np mUserName ".concat(userName));
        }
        this.f343207g = 20;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ue6();
        lVar.f152198b = new r45.ve6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmstoryhistorypage";
        lVar.f152200d = 191;
        int i17 = 0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f343206f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageRequest");
        r45.ue6 ue6Var = (r45.ue6) fVar;
        ue6Var.f468838e = userName;
        long j18 = this.f343205e;
        ue6Var.f468840g = j18;
        boolean z18 = j18 == 0;
        this.f343211n = z18;
        ef4.v vVar = ef4.w.f334001t;
        vVar.j();
        long b17 = vVar.i().b1(z18 ? 0L : this.f343205e, 30);
        this.f343212o = b17;
        ue6Var.f468841h = b17;
        ue6Var.f468842i = 0;
        try {
            java.lang.String k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k07, "getTimeZoneOffset(...)");
            i17 = (int) java.lang.Float.parseFloat(k07);
        } catch (java.lang.Exception unused) {
        }
        ue6Var.f468839f = i17;
        if (this.f343211n) {
            java.lang.String str = ef4.w.f334001t.g().L0("@__weixinhistory").f66284x4b6e68b9;
            this.f343209i = str;
            if (str == null) {
                this.f343209i = "";
            }
            ue6Var.f468837d = this.f343209i;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "req.mUserName:" + ue6Var.f468838e + " req.MaxId:" + ue6Var.f468840g + " req.MinFilterId:" + ue6Var.f468841h + " req.LastRequestTime:" + ue6Var.f468842i + " req.FirstPageMd5:" + ue6Var.f468837d + " req.TimeZone:" + ue6Var.f468839f);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f343208h = callback;
        return mo9409x10f9447a(sVar, this.f343206f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 191;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        java.util.Iterator it;
        r45.te6 te6Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f343206f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageResponse");
        r45.ve6 ve6Var = (r45.ve6) fVar;
        this.f343210m = ve6Var.f469710h;
        java.lang.String str3 = ve6Var.f469706d;
        if (str3 == null) {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "objCount:" + ve6Var.f469707e + " firstPageMd5:" + str3 + ", expiredTime:" + ve6Var.f469711i);
        java.util.LinkedList linkedList = ve6Var.f469708f;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "server give size zero");
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f343208h;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
        }
        ef4.v vVar = ef4.w.f334001t;
        vVar.g().W0("@__weixinhistory", str3);
        boolean z17 = this.f343211n;
        java.lang.String userName = this.f343204d;
        if (z17) {
            str2 = "callback";
            if (((r45.te6) linkedList.get(linkedList.size() - 1)).f467892d > ef4.e0.f333974a.b(userName).f69410x443468b) {
                long j17 = ((r45.te6) linkedList.get(linkedList.size() - 1)).f467892d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(userName, vVar.e())) {
                    vVar.i().f418405h.A("MMStoryInfo", "UPDATE MMStoryInfo SET sourceType = 4 Where userName = '" + userName + "' AND storyID < " + j17);
                }
            }
        } else {
            str2 = "callback";
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.te6 te6Var2 = (r45.te6) it6.next();
            java.lang.String str4 = te6Var2.f467893e;
            r45.df6 StoryObject = te6Var2.f467894f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(StoryObject, "StoryObject");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            ef4.v vVar2 = ef4.w.f334001t;
            nf4.j D0 = vVar2.i().D0(StoryObject.f453916d);
            if (D0 == null) {
                D0 = new nf4.j();
            }
            r45.cu5 cu5Var = StoryObject.f453921i;
            if (cu5Var == null || (gVar = cu5Var.f453374f) == null) {
                it = it6;
                te6Var = te6Var2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryInfoStorageLogic", "object desc is null");
            } else {
                it = it6;
                java.lang.String str5 = new java.lang.String(gVar.g(), r26.c.f450398a);
                r45.lf6 a17 = ef4.h0.f333978a.a(str5);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || a17 == null || !D0.D0(a17)) {
                    te6Var = te6Var2;
                } else {
                    StoryObject.f453921i.d(new byte[0]);
                    D0.f69412xdde069b = StoryObject.f453917e;
                    D0.f69403xac3be4e = StoryObject.f453919g;
                    te6Var = te6Var2;
                    D0.f69410x443468b = StoryObject.f453916d;
                    java.util.LinkedList linkedList2 = StoryObject.f453923n;
                    if (!linkedList2.isEmpty()) {
                        D0.f69400x4c58c87d = StoryObject.mo14344x5f01b1f6();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryInfoStorageLogic", "id:" + D0.f69410x443468b + " createTime:" + D0.f69403xac3be4e + " CommentListSize:" + linkedList2.size() + " BubbleListSize:" + StoryObject.f453925p.size());
                    D0.f69409x76e81a5a = D0.f69409x76e81a5a | this.f343207g;
                    r45.lf6 y07 = D0.y0();
                    y07.f460962e = StoryObject.f453917e;
                    D0.G0(y07);
                    android.database.Cursor B = vVar2.i().f418405h.B("select *,rowid from MMStoryInfo  where MMStoryInfo.storyID = " + StoryObject.f453916d, null);
                    int count = B.getCount();
                    B.close();
                    if (count > 0) {
                        vVar2.i().mo11261xce0038c9(StoryObject.f453916d, D0);
                        vVar2.i().L0(StoryObject.f453916d);
                    } else {
                        vVar2.i().f418405h.l("MMStoryInfo", "", D0.mo9763xeb27878e());
                    }
                }
            }
            nf4.h hVar = new nf4.h();
            r45.te6 te6Var3 = te6Var;
            java.lang.String str6 = te6Var3.f467893e;
            if (str6 == null) {
                str6 = "";
            }
            hVar.f69196x225a93d3 = str6;
            hVar.f69195x28f0318a = te6Var3.f467895g;
            vVar2.h().z0(hVar);
            it6 = it;
        }
        if (this.f343205e == 0) {
            this.f343205e = ((r45.te6) linkedList.getFirst()).f467892d;
        }
        this.f343212o = ((r45.te6) linkedList.getLast()).f467892d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryHistoryPage", "insertList mUserName %s maxId %s minId %s NewRequestTime %s", userName, java.lang.Long.valueOf(this.f343205e), java.lang.Long.valueOf(this.f343212o), java.lang.Integer.valueOf(ve6Var.f469709g));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f343208h;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str2);
            throw null;
        }
    }
}
