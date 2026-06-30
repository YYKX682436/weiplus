package vb1;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f516023a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f516024b;

    /* renamed from: c, reason: collision with root package name */
    public gb1.n f516025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb1.u f516026d;

    public q(vb1.u uVar, int i17) {
        this.f516026d = uVar;
        this.f516023a = i17;
    }

    public final void a() {
        if (!this.f516024b) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        gb1.n nVar = this.f516025c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        vb1.u uVar = this.f516026d;
        nVar.a(uVar.o("ok"));
        java.util.HashMap hashMap = uVar.f516034g;
        int i17 = this.f516023a;
        hashMap.remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiInsertHTMLCanvasElement", "callback ok for canvasId [" + i17 + ']');
    }
}
