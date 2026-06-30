package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class y implements com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f150384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ih.c f150385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f150386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.o f150387g;

    public y(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar, boolean z17, ih.c cVar, double d17) {
        this.f150387g = oVar;
        this.f150384d = z17;
        this.f150385e = cVar;
        this.f150386f = d17;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public double A4() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1 || o45.wf.f424566k) {
            return 1.0d;
        }
        return this.f150386f;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public void Sg(double d17) {
        if (this.f150384d) {
            li.d dVar = new li.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p849xbf8d97c1.o oVar = this.f150387g;
            oVar.f150372n = dVar;
            com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41206xc6dcb58(true);
            oVar.f150372n.getClass();
            com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41208x68925183(true);
            li.d dVar2 = oVar.f150372n;
            com.p314xaae8f345.mm.p849xbf8d97c1.b0 b0Var = new com.p314xaae8f345.mm.p849xbf8d97c1.b0(oVar);
            dVar2.getClass();
            if (li.d.f400277m != null) {
                oj.j.b("matrix.OpenglLeakPlugin", "OpenglReportCallback register again, May be overwrite !!!", new java.lang.Object[0]);
            }
            li.d.f400277m = b0Var;
            this.f150385e.a(oVar.f150372n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "[OpenglLeakPlugin: Matrix add OpenglLeakPlugin success]");
            com.p314xaae8f345.mm.app.w.INSTANCE.a(new com.p314xaae8f345.mm.p849xbf8d97c1.x(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public long V3() {
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public java.lang.String key() {
        return "OpenglLeakPlugin_Dice";
    }
}
