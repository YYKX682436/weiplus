package vb1;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f516028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f516030f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad) {
        this.f516028d = n7Var;
        this.f516029e = i17;
        this.f516030f = c4209xd2d3ddad;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiInsertHTMLCanvasElement", "foreground");
        vb1.b bVar = vb1.d.f516006c;
        java.lang.String mo48798x74292566 = this.f516028d.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vb1.d a17 = bVar.a(mo48798x74292566);
        a17.c(this.f516029e);
        if (a17.d() == 1) {
            this.f516030f.f();
        }
    }
}
