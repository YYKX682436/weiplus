package az2;

/* loaded from: classes10.dex */
public abstract class u extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, cz2.j {

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f16154d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f16155e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f16156f;

    public u(r45.qt2 qt2Var) {
        this.f16154d = qt2Var;
        jz5.g b17 = jz5.h.b(new az2.t(this));
        this.f16156f = b17;
        if (qt2Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderBase", "Create commentScene:" + qt2Var.getInteger(5) + " fromCommentScene:" + qt2Var.getInteger(7));
            ((cz2.i) ((jz5.n) b17).getValue()).f225016i = qt2Var.getInteger(7);
        }
    }

    public java.util.List H() {
        return null;
    }

    public boolean I() {
        return true;
    }

    public abstract void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr);

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        az2.f fVar = this.f16155e;
        if (fVar != null) {
            fVar.b();
        }
        super.cancel();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int dispatch(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        az2.f fVar = this.f16155e;
        if (fVar != null) {
            fVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dispatchCgi] ");
        sb6.append(v0Var != null ? v0Var.getUri() : null);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderBase", sb6.toString());
        ((cz2.i) ((jz5.n) this.f16156f).getValue()).c(v0Var instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) v0Var : null);
        az2.h hVar = az2.j.f16133r;
        r45.qt2 qt2Var = this.f16154d;
        az2.j.f16134s.put(qt2Var != null ? qt2Var.getInteger(5) : 0, java.lang.Long.valueOf(c01.id.c()));
        az2.k.f16139a.a(getType());
        return super.dispatch(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        jz5.g gVar = this.f16156f;
        cz2.i iVar = (cz2.i) ((jz5.n) gVar).getValue();
        iVar.f225012e = iVar.f225011d.a();
        az2.f fVar = this.f16155e;
        if (fVar != null) {
            fVar.b();
        }
        if (I()) {
            hz2.d dVar = hz2.d.f286313a;
            dVar.g(i18, i19, str);
            dVar.i(i18, i19, str);
            dVar.e(i18, i19, str);
        }
        az2.m.b(az2.m.f16144a, i19, str, 0, 4, null);
        J(i17, i18, i19, str, v0Var, bArr);
        cz2.i iVar2 = (cz2.i) ((jz5.n) gVar).getValue();
        iVar2.f225013f = iVar2.f225011d.a();
        ((cz2.i) ((jz5.n) gVar).getValue()).a(i18, i19, str, v0Var instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) v0Var : null);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.tencent.mm.network.v0 reqResp = getReqResp();
        java.lang.String uri = reqResp != null ? reqResp.getUri() : null;
        if (uri == null) {
            uri = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List H = H();
        if (H != null) {
            arrayList.addAll(H);
        }
        arrayList.add(new jz5.l("errType", java.lang.String.valueOf(i18)));
        arrayList.add(new jz5.l("errCode", java.lang.String.valueOf(i19)));
        ((b92.d1) zbVar).Di(uri, 1, arrayList);
    }

    @Override // cz2.j
    public cz2.f v() {
        return cz2.f.f225002d;
    }

    @Override // cz2.j
    public org.json.JSONObject w() {
        return null;
    }

    @Override // cz2.j
    public org.json.JSONObject z() {
        return null;
    }

    public /* synthetic */ u(r45.qt2 qt2Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : qt2Var);
    }
}
