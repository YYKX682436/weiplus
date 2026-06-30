package fi4;

/* loaded from: classes4.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f344594d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f344595e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.e2 f344596f;

    public b(java.util.LinkedList cmds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmds, "cmds");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5907;
        lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusoplog";
        lVar.f152197a = new pj4.d2();
        lVar.f152198b = new pj4.e2();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f344595e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusOplogReq");
        ((pj4.d2) fVar).f436557d = cmds;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("req cmds:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("items:");
        java.util.Iterator it = cmds.iterator();
        while (it.hasNext()) {
            pj4.v0 v0Var = (pj4.v0) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(v0Var);
            sb8.append('-');
            sb8.append(v0Var.f436841d);
            sb8.append(',');
            sb7.append(sb8.toString());
        }
        java.lang.String sb9 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        sb6.append(sb9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusOplog", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f344594d = callback;
        return mo9409x10f9447a(dispatcher, this.f344595e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5907;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusOplog", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f344595e.f152244b.f152233a;
            java.lang.String str2 = null;
            this.f344596f = fVar instanceof pj4.e2 ? (pj4.e2) fVar : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rsp:");
            pj4.e2 e2Var = this.f344596f;
            if (e2Var != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("items:");
                java.util.LinkedList<pj4.w0> linkedList = e2Var.f436568d;
                if (linkedList != null) {
                    for (pj4.w0 w0Var : linkedList) {
                        sb7.append(w0Var + '-' + w0Var.f436850d + '-' + w0Var.f436851e + '-' + w0Var.f436852f);
                    }
                }
                str2 = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
            }
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusOplog", sb6.toString());
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f344594d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
