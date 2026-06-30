package sc3;

/* loaded from: classes7.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f487986e;

    public h1(sc3.k1 k1Var, java.util.List list) {
        this.f487985d = k1Var;
        this.f487986e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc3.k1 k1Var = this.f487985d;
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = k1Var.f488024w;
        jc3.x xVar = k1Var.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        c5128x72a3f151.m43155xb8268694(k1Var.D, xVar.d(), "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "ready to evaluate main scripts");
        java.util.List list = this.f487986e;
        if (list.isEmpty()) {
            je3.i.t8(je3.k.f380831e, k1Var.D, "descriptors not found", "", null, 1.0f, 8, null);
            k1Var.Y0();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k1Var.V0((lc3.g0) it.next()));
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        k1Var.M0().l0(new java.util.ArrayList(arrayList), (java.lang.String) ((jz5.n) k1Var.K).mo141623x754a37bb(), new sc3.g1(k1Var, android.os.SystemClock.elapsedRealtime()));
    }
}
