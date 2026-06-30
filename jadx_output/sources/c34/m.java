package c34;

/* loaded from: classes11.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f38213d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f38214e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f38215f;

    /* renamed from: g, reason: collision with root package name */
    public int f38216g;

    /* renamed from: h, reason: collision with root package name */
    public int f38217h;

    public m(byte[] bArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q36();
        lVar.f70665b = new r45.r36();
        lVar.f70666c = "/cgi-bin/micromsg-bin/shakeget";
        lVar.f70667d = 162;
        lVar.f70668e = 57;
        lVar.f70669f = 1000000057;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f38214e = a17;
        r45.q36 q36Var = (r45.q36) a17.f70710a.f70684a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        q36Var.f383633d = cu5Var;
        q36Var.f383634e = 1;
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.toByteArray());
            q36Var.f383636g = cu5Var3;
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f38213d = u0Var;
        return dispatch(sVar, this.f38214e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 162;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.r36 r36Var = (r45.r36) this.f38214e.f70711b.f70700a;
        this.f38215f = new java.util.LinkedList();
        this.f38216g = r36Var.f384510g;
        this.f38217h = r36Var.f384511h;
        int i27 = r36Var.f384507d;
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        if (i27 >= 1) {
            c34.s Ni = c34.h0.Ni();
            Ni.L0();
            com.tencent.mars.xlog.Log.i("MicroMsg.NewShakeItemStorage", "delOldRecord count:" + i27);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM shakeitem1 WHERE shakeItemID NOT IN ( SELECT shakeItemID FROM shakeitem1 ORDER BY shakeItemID DESC LIMIT ");
            sb6.append(100 > i27 ? 100 - i27 : 0);
            sb6.append(" )");
            if (Ni.f38240d.A("shakeitem1", sb6.toString())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewShakeItemStorage", "delOldRecord success count:" + i27);
                Ni.doNotify();
            }
            for (int i28 = i27 - 1; i28 >= 0; i28--) {
                java.lang.String r17 = c01.z1.r();
                java.util.LinkedList linkedList = r36Var.f384508e;
                if (!r17.equals(((r45.p36) linkedList.get(i28)).f382704d)) {
                    qk.o b17 = r01.q3.cj().b1(((r45.p36) linkedList.get(i28)).f382704d);
                    b17.field_username = ((r45.p36) linkedList.get(i28)).f382704d;
                    b17.field_brandList = ((r45.p36) linkedList.get(i28)).C;
                    r45.va0 va0Var = ((r45.p36) linkedList.get(i28)).D;
                    if (va0Var != null) {
                        b17.field_brandFlag = va0Var.f388021d;
                        b17.field_brandInfo = va0Var.f388023f;
                        b17.field_brandIconURL = va0Var.f388024g;
                        b17.field_extInfo = va0Var.f388022e;
                    }
                    if (!r01.q3.cj().replace(b17)) {
                        r01.q3.cj().insert(b17);
                    }
                }
                c34.r rVar = new c34.r((r45.p36) linkedList.get(i28));
                com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                r0Var.f70529a = rVar.field_username;
                r0Var.f70534f = rVar.field_hasHDImg > 0 ? 1 : 0;
                r0Var.f70530b = rVar.field_imgstatus;
                r0Var.f70533e = ((r45.p36) linkedList.get(i28)).A;
                r0Var.f70532d = ((r45.p36) linkedList.get(i28)).B;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                r0Var.f70537i = -1;
                com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) q17;
                rVar.field_reserved2 = k4Var.h(rVar.field_username) ? 1 : 0;
                com.tencent.mm.storage.z3 n17 = k4Var.n(rVar.field_username, true);
                if (n17 != null && ((int) n17.E2) > 0) {
                    Ni.D0(n17.d1());
                    Ni.D0(n17.J0());
                }
                Ni.J0(rVar, false);
                c01.d9.b().getClass();
                gm0.j1.i();
                gm0.j1.b().c();
                g81.e.Ai().wi().y0(rVar.field_username, this.f38216g, ((r45.p36) linkedList.get(i28)).E);
                rVar.f38238x0 = this.f38216g;
                ((java.util.LinkedList) this.f38215f).add(rVar);
            }
        }
        this.f38213d.onSceneEnd(i18, i19, str, this);
    }
}
