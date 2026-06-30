package vb1;

/* loaded from: classes7.dex */
public final class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f516031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f516033f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad) {
        this.f516031d = n7Var;
        this.f516032e = i17;
        this.f516033f = c4209xd2d3ddad;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiInsertHTMLCanvasElement", "background");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f516031d;
        if (n7Var.mo32091x9a3f0ba2().L0()) {
            return;
        }
        vb1.b bVar = vb1.d.f516006c;
        java.lang.String mo48798x74292566 = n7Var.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vb1.d a17 = bVar.a(mo48798x74292566);
        a17.b(this.f516032e);
        if (a17.d() == 0) {
            this.f516033f.e();
        }
    }
}
