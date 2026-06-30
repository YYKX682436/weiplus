package ff4;

/* loaded from: classes4.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f343213d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f343214e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f343215f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f343216g;

    public e(java.util.List opList, java.util.List localIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opList, "opList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localIdList, "localIdList");
        this.f343213d = opList;
        this.f343214e = localIdList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ff6();
        lVar.f152198b = new r45.gf6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmstoryobjectop";
        lVar.f152200d = 764;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f343215f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpRequest");
        r45.ff6 ff6Var = (r45.ff6) fVar;
        ff6Var.f455822d = opList.size();
        java.util.Iterator it = opList.iterator();
        while (it.hasNext()) {
            ff4.a aVar = (ff4.a) it.next();
            r45.ef6 ef6Var = new r45.ef6();
            ef6Var.f454941d = aVar.f343192a;
            int i17 = aVar.f343193b;
            ef6Var.f454942e = i17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("op.id:");
            long j17 = aVar.f343192a;
            sb6.append(j17);
            sb6.append(" op.type:");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", sb6.toString());
            if (aVar instanceof ff4.p) {
                r45.bf6 bf6Var = new r45.bf6();
                bf6Var.f452263d = j17;
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(bf6Var.mo14344x5f01b1f6());
                ef6Var.f454943f = cu5Var;
            } else if (aVar instanceof ff4.n) {
                r45.ze6 ze6Var = new r45.ze6();
                ze6Var.f473493d = ((ff4.n) aVar).f343241c;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(ze6Var.mo14344x5f01b1f6());
                ef6Var.f454943f = cu5Var2;
            } else if (aVar instanceof ff4.q) {
                r45.cf6 cf6Var = new r45.cf6();
                cf6Var.f453061e = ((ff4.q) aVar).f343243c;
                cf6Var.f453060d = j17;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(cf6Var.mo14344x5f01b1f6());
                ef6Var.f454943f = cu5Var3;
            } else if (aVar instanceof ff4.o) {
                r45.af6 af6Var = new r45.af6();
                af6Var.f451517e = ((ff4.o) aVar).f343242c;
                af6Var.f451516d = j17;
                r45.cu5 cu5Var4 = new r45.cu5();
                cu5Var4.d(af6Var.mo14344x5f01b1f6());
                ef6Var.f454943f = cu5Var4;
            }
            ff6Var.f455823e.add(ef6Var);
        }
    }

    public final ff4.a H() {
        java.util.List list = this.f343213d;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return (ff4.a) list.get(0);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f343216g = callback;
        return mo9409x10f9447a(dispatcher, this.f343215f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 764;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f343215f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpResponse");
        int i27 = ((r45.gf6) fVar).f456735d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("respCount=");
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCgi.NetSceneStoryObjectOp", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f343216g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
    }
}
