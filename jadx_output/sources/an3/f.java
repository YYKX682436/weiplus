package an3;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, an3.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f8868d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f8869e;

    public f(int i17, float f17, float f18, int i18, int i19, java.lang.String str, java.lang.String str2) {
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneLbsP", "OpCode Error :" + i17);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.f64();
        lVar.f70665b = new r45.g64();
        lVar.f70666c = "/cgi-bin/micromsg-bin/lbsfind";
        lVar.f70667d = 148;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f8869e = a17;
        r45.f64 f64Var = (r45.f64) a17.f70710a.f70684a;
        f64Var.f374037d = i17;
        f64Var.f374038e = f17;
        f64Var.f374039f = f18;
        f64Var.f374040g = i18;
        f64Var.f374041h = str;
        f64Var.f374042i = str2;
        f64Var.f374043m = i19;
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.toByteArray());
            f64Var.f374045o = cu5Var2;
        } catch (java.lang.Throwable unused) {
        }
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2001, f17, f18, i18);
    }

    public java.util.List H() {
        java.util.LinkedList<r45.b64> linkedList = ((r45.g64) this.f8869e.f70711b.f70700a).f374918e;
        if (linkedList != null) {
            gm0.j1.b().c();
            for (r45.b64 b64Var : linkedList) {
                ((us.a) ((vs.e) i95.n0.c(vs.e.class))).Bi(b64Var.f370550d, 18, b64Var.C);
            }
        }
        return linkedList;
    }

    public int I() {
        return ((r45.f64) this.f8869e.f70710a.f70684a).f374037d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f8868d = u0Var;
        return dispatch(sVar, this.f8869e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 148;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.g64 g64Var = (r45.g64) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i27 = 0; i27 < g64Var.f374918e.size(); i27++) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            java.util.LinkedList linkedList = g64Var.f374918e;
            r0Var.f70529a = ((r45.b64) linkedList.get(i27)).f370550d;
            r0Var.f70530b = ((r45.b64) linkedList.get(i27)).f370557n;
            r0Var.f70533e = ((r45.b64) linkedList.get(i27)).f370568y;
            r0Var.f70532d = ((r45.b64) linkedList.get(i27)).f370569z;
            r0Var.f70534f = 1;
            arrayList.add(r0Var);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().m0(arrayList);
        if (I() == 1 || I() == 3 || I() == 4) {
            if (i18 != 0 && i19 == -2001) {
                gm0.j1.u().c().w(8210, 0L);
                this.f8868d.onSceneEnd(i18, i19, str, this);
                return;
            }
            gm0.j1.u().c().w(8210, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (g64Var.f374920g * 1000)));
        } else if (I() == 2) {
            gm0.j1.u().c().w(8210, 0L);
        }
        this.f8868d.onSceneEnd(i18, i19, str, this);
    }
}
