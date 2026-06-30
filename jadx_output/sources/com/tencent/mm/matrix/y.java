package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class y implements com.tencent.mm.matrix.dice.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f68851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ih.c f68852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f68853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.o f68854g;

    public y(com.tencent.mm.matrix.o oVar, boolean z17, ih.c cVar, double d17) {
        this.f68854g = oVar;
        this.f68851d = z17;
        this.f68852e = cVar;
        this.f68853f = d17;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1 || o45.wf.f343033k) {
            return 1.0d;
        }
        return this.f68853f;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        if (this.f68851d) {
            li.d dVar = new li.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.matrix.o oVar = this.f68854g;
            oVar.f68839n = dVar;
            com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().setJavaStackDump(true);
            oVar.f68839n.getClass();
            com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().setNativeStackDump(true);
            li.d dVar2 = oVar.f68839n;
            com.tencent.mm.matrix.b0 b0Var = new com.tencent.mm.matrix.b0(oVar);
            dVar2.getClass();
            if (li.d.f318744m != null) {
                oj.j.b("matrix.OpenglLeakPlugin", "OpenglReportCallback register again, May be overwrite !!!", new java.lang.Object[0]);
            }
            li.d.f318744m = b0Var;
            this.f68852e.a(oVar.f68839n);
            com.tencent.mars.xlog.Log.i("MatrixDelegate", "[OpenglLeakPlugin: Matrix add OpenglLeakPlugin success]");
            com.tencent.mm.app.w.INSTANCE.a(new com.tencent.mm.matrix.x(this));
        }
    }

    @Override // com.tencent.mm.matrix.dice.a
    public long V3() {
        return 0L;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return "OpenglLeakPlugin_Dice";
    }
}
