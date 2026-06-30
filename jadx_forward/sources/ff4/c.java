package ff4;

/* loaded from: classes4.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f343198d;

    /* renamed from: e, reason: collision with root package name */
    public long f343199e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f343200f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f343201g;

    /* renamed from: h, reason: collision with root package name */
    public final int f343202h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f343203i;

    public c(java.lang.String userName, long j17, java.lang.String date) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(date, "date");
        this.f343198d = userName;
        this.f343199e = j17;
        this.f343200f = date;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "fp mUserName " + userName);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "np mUserName " + userName);
        }
        this.f343202h = 4;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pe6();
        lVar.f152198b = new r45.qe6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmstorydatedetail";
        lVar.f152200d = yc1.z.f77533x366c91de;
        int i17 = 0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f343201g = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailRequest");
        r45.pe6 pe6Var = (r45.pe6) fVar;
        pe6Var.f464519d = userName;
        pe6Var.f464522g = this.f343199e;
        try {
            java.lang.String k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k07, "getTimeZoneOffset(...)");
            i17 = (int) java.lang.Float.parseFloat(k07);
        } catch (java.lang.Exception unused) {
        }
        pe6Var.f464520e = i17;
        pe6Var.f464521f = this.f343200f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "req.mUserName:" + pe6Var.f464519d + " req.MaxId:" + pe6Var.f464522g + " req.TimeZone:" + pe6Var.f464520e + " req.Date:" + pe6Var.f464521f);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f343203i = callback;
        return mo9409x10f9447a(sVar, this.f343201g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return yc1.z.f77533x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        nf4.l lVar;
        int i27;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f343201g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailResponse");
        r45.qe6 qe6Var = (r45.qe6) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "objCount: " + qe6Var.f465449d + ", expiredTime: " + qe6Var.f465453h);
        java.util.LinkedList linkedList = qe6Var.f465450e;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f343203i;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
        }
        ef4.d0 d0Var = ef4.e0.f333974a;
        java.lang.String userName = this.f343198d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (linkedList == null || linkedList.isEmpty()) {
            new java.util.LinkedList();
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            nf4.l i28 = ef4.w.f334001t.i();
            int size = linkedList.size();
            int i29 = 0;
            while (i29 < size) {
                r45.df6 df6Var = (r45.df6) linkedList.get(i29);
                nf4.j D0 = i28.D0(df6Var.f453916d);
                if (D0 == null) {
                    D0 = new nf4.j();
                }
                if (d0Var.c(D0, df6Var, this.f343202h) == 0) {
                    lVar = i28;
                    i27 = size;
                } else {
                    lVar = i28;
                    i27 = size;
                    if (D0.f69410x443468b != 0) {
                        linkedList2.add(D0);
                    }
                }
                i29++;
                i28 = lVar;
                size = i27;
            }
        }
        if (this.f343199e == 0) {
            this.f343199e = ((r45.df6) linkedList.getFirst()).f453916d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryDateDetail", "insertList mUserName %s maxId %s minId %s", userName, java.lang.Long.valueOf(this.f343199e), 0L);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f343203i;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }
}
