package bq;

/* loaded from: classes10.dex */
public abstract class e extends com.tencent.mm.modelbase.i implements cz2.j {

    /* renamed from: m, reason: collision with root package name */
    public final r45.qt2 f23483m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f23484n;

    public e(r45.qt2 qt2Var) {
        this.f23483m = qt2Var;
        this.f23484n = jz5.h.b(new bq.d(this));
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public final void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        jz5.g gVar = this.f23484n;
        cz2.i iVar = (cz2.i) ((jz5.n) gVar).getValue();
        iVar.f225012e = iVar.f225011d.a();
        s(i17, i18, str, resp, m1Var);
        cz2.i iVar2 = (cz2.i) ((jz5.n) gVar).getValue();
        iVar2.f225013f = iVar2.f225011d.a();
        ((cz2.i) ((jz5.n) gVar).getValue()).a(i17, i18, str, this.f70646f);
        hz2.d dVar = hz2.d.f286313a;
        dVar.g(i17, i18, str);
        dVar.i(i17, i18, str);
        dVar.e(i17, i18, str);
        az2.m.b(az2.m.f16144a, i18, str, 0, 4, null);
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCgi", "[dispatchCgi] " + this.f70646f.f70712c);
        ((cz2.i) ((jz5.n) this.f23484n).getValue()).c(this.f70646f);
        az2.k.f16139a.a(this.f70646f.f70713d);
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }

    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
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

    public /* synthetic */ e(r45.qt2 qt2Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : qt2Var);
    }
}
