package sc3;

/* loaded from: classes7.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487990f;

    public i0(yz5.l lVar, sc3.k1 k1Var, java.lang.String str) {
        this.f487988d = lVar;
        this.f487989e = k1Var;
        this.f487990f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf3.g0 g0Var = bf3.g0.f101160a;
        jc3.x xVar = this.f487989e.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        this.f487988d.mo146xb9724478(g0Var.c(xVar, this.f487990f));
    }
}
