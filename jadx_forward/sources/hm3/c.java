package hm3;

/* loaded from: classes4.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363763d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363764e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363765f;

    /* renamed from: g, reason: collision with root package name */
    public final s45.c f363766g;

    public c(java.util.LinkedList listenIds, int i17, java.lang.String str, java.lang.String cacheKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenIds, "listenIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        this.f363763d = cacheKey;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5950;
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listengetlyric";
        lVar.f152197a = new s45.c();
        lVar.f152198b = new s45.d();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363765f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricRequest");
        this.f363766g = (s45.c) fVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = listenIds.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            s45.b bVar = new s45.b();
            bVar.f484503h = true;
            bVar.f484499d = str2;
            bVar.f484504i = android.text.TextUtils.isEmpty(str);
            linkedList.add(bVar);
        }
        s45.c cVar = this.f363766g;
        cVar.f484505d = linkedList;
        cVar.f484506e = i17;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append("listen_ids:" + listenIds);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMMListenGetLyric", "request music info:%s, mid:" + str, stringBuffer.substring(0, stringBuffer.length() - 1) + ']');
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f363764e = u0Var;
        return mo9409x10f9447a(sVar, this.f363765f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5950;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMMListenGetLyric", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363764e;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363765f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenGetLyricResponse");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363764e;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
