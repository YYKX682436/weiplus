package fi4;

/* loaded from: classes9.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f344588d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f344589e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f344590f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f344591g;

    /* renamed from: h, reason: collision with root package name */
    public final pj4.g f344592h;

    /* renamed from: i, reason: collision with root package name */
    public pj4.i f344593i;

    public a(java.util.List sessionsToNames, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionsToNames, "sessionsToNames");
        this.f344588d = sessionsToNames;
        this.f344589e = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5829;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getv6stranger";
        lVar.f152197a = new pj4.g();
        lVar.f152198b = new pj4.i();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f344591g = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetV6StrangerReq");
        this.f344592h = (pj4.g) fVar;
        java.util.Iterator it = sessionsToNames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) ((jz5.l) it.next()).f384367e;
            if (str != null) {
                java.util.LinkedList linkedList = this.f344592h.f436578d;
                pj4.h hVar = new pj4.h();
                hVar.f436610d = str;
                linkedList.add(hVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "req sessionsToNames:" + this.f344588d + " canTalk:" + this.f344589e);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f344590f = callback;
        return mo9409x10f9447a(dispatcher, this.f344591g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5829;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f344591g.f152244b.f152233a;
            pj4.i iVar = fVar instanceof pj4.i ? (pj4.i) fVar : null;
            this.f344593i = iVar;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = (iVar == null || (linkedList2 = iVar.f436642d) == null) ? null : java.lang.Integer.valueOf(linkedList2.size());
            pj4.i iVar2 = this.f344593i;
            if (iVar2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = iVar2.f436642d.iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    pj4.j jVar = (pj4.j) it.next();
                    sb6.append(i27 + ':' + jVar.f436658d + ' ' + jVar.f436659e);
                    i27++;
                }
                str2 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
            } else {
                str2 = null;
            }
            objArr[1] = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "rsp size %s ret %s", objArr);
            pj4.i iVar3 = this.f344593i;
            if (iVar3 != null && (linkedList = iVar3.f436642d) != null) {
                int i28 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    pj4.j jVar2 = (pj4.j) obj;
                    if (jVar2.f436658d == 0) {
                        jz5.l lVar = (jz5.l) this.f344588d.get(i28);
                        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai((java.lang.String) lVar.f384366d);
                        if (Ai == null) {
                            Ai = new mj4.w();
                            Ai.f76642xbed8694c = (java.lang.String) lVar.f384366d;
                        }
                        Ai.f76640x21f9b213 = jVar2.f436661g;
                        Ai.f76643x4b6e7fa1 = jVar2.f436662h;
                        Ai.f76641xe2e734d5 = jVar2.f436663i;
                        Ai.f76638x225a3d90 = jVar2.f436664m;
                        Ai.f76644xda9bc3b3 = jVar2.f436665n;
                        Ai.f76635x93fe1b47 = jVar2.f436666o;
                        Ai.f76645x44fa3ce = jVar2.f436667p;
                        Ai.f76646x287b39eb = jVar2.f436668q;
                        Ai.f76639xadaa0551 = jVar2.f436669r;
                        Ai.f76648xdde069b = jVar2.f436660f;
                        Ai.f76647x4ac8801f = jVar2.f436670s;
                        Ai.f76636x28e0a508 = jVar2.f436671t ? 1 : 0;
                        if (this.f344589e) {
                            Ai.f76637x95576e57 = 1;
                        }
                        if (Ai.f72763xa3c65b86 == -1) {
                            ni4.x.f419309d.n().mo880xb970c2b9(Ai);
                        } else {
                            ni4.x.f419309d.n().mo9952xce0038c9(Ai, new java.lang.String[0]);
                        }
                    }
                    i28 = i29;
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f344590f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
