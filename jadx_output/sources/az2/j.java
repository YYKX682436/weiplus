package az2;

/* loaded from: classes10.dex */
public class j extends bz2.c implements cz2.j {

    /* renamed from: r */
    public static final az2.h f16133r = new az2.h(null);

    /* renamed from: s */
    public static final android.util.SparseArray f16134s = new android.util.SparseArray();

    /* renamed from: n */
    public final r45.qt2 f16135n;

    /* renamed from: o */
    public az2.f f16136o;

    /* renamed from: p */
    public boolean f16137p;

    /* renamed from: q */
    public final jz5.g f16138q;

    public j(r45.qt2 qt2Var, im5.b bVar) {
        super(bVar);
        this.f16135n = qt2Var;
        this.f16137p = true;
        this.f16138q = jz5.h.b(new az2.i(this));
    }

    public static /* synthetic */ az2.j u(az2.j jVar, android.content.Context context, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delayLoading");
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            j17 = 500;
        }
        jVar.t(context, str, j17);
        return jVar;
    }

    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
    }

    @Override // com.tencent.mm.modelbase.i
    public void j() {
        az2.f fVar = this.f16136o;
        if (fVar != null) {
            fVar.b();
        }
        super.j();
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public final void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        jz5.g gVar = this.f16138q;
        cz2.i iVar = (cz2.i) ((jz5.n) gVar).getValue();
        iVar.f225012e = iVar.f225011d.a();
        az2.f fVar = this.f16136o;
        if (fVar != null) {
            fVar.b();
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        java.lang.String str2 = oVar != null ? oVar.f70712c : null;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List s17 = s();
        if (s17 != null) {
            arrayList.addAll(s17);
        }
        arrayList.add(new jz5.l("errType", java.lang.String.valueOf(i17)));
        arrayList.add(new jz5.l("errCode", java.lang.String.valueOf(i18)));
        ((b92.d1) zbVar).Di(str2, 1, arrayList);
        A(i17, i18, str, resp, m1Var);
        cz2.i iVar2 = (cz2.i) ((jz5.n) gVar).getValue();
        iVar2.f225013f = iVar2.f225011d.a();
        ((cz2.i) ((jz5.n) gVar).getValue()).a(i17, i18, str, this.f70646f);
        if (this.f16137p) {
            hz2.d dVar = hz2.d.f286313a;
            dVar.g(i17, i18, str);
            dVar.i(i17, i18, str);
            dVar.e(i17, i18, str);
        }
        az2.m.b(az2.m.f16144a, i18, str, 0, 4, null);
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        az2.f fVar = this.f16136o;
        if (fVar != null) {
            fVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dispatchCgi] ");
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        kotlin.jvm.internal.o.f(oVar, "getReqResp(...)");
        sb6.append(oVar.f70712c);
        com.tencent.mars.xlog.Log.i("Finder.FinderCgi", sb6.toString());
        if (y()) {
            r45.qt2 qt2Var = this.f16135n;
            f16134s.put(qt2Var != null ? qt2Var.getInteger(5) : 0, java.lang.Long.valueOf(c01.id.c()));
        }
        ((cz2.i) ((jz5.n) this.f16138q).getValue()).c(this.f70646f);
        az2.k.f16139a.a(this.f70646f.f70713d);
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }

    public java.util.List s() {
        return null;
    }

    public final az2.j t(android.content.Context context, java.lang.String str, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f16136o = az2.c.a(az2.f.f16125d, context, str, j17, null, 8, null);
        return this;
    }

    @Override // cz2.j
    public cz2.f v() {
        return cz2.f.f225002d;
    }

    @Override // cz2.j
    public org.json.JSONObject w() {
        return null;
    }

    @Override // ay1.m
    /* renamed from: x */
    public java.lang.String getKey() {
        return java.lang.String.valueOf(this.f70646f.f70713d);
    }

    public boolean y() {
        return this instanceof db2.e1;
    }

    @Override // cz2.j
    public org.json.JSONObject z() {
        return null;
    }

    public /* synthetic */ j(r45.qt2 qt2Var, im5.b bVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : qt2Var, (i17 & 2) != 0 ? null : bVar);
    }
}
