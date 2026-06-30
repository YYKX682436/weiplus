package oj5;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.o f427389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f427390e;

    public k(oj5.o oVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f427389d = oVar;
        this.f427390e = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        oj5.o oVar = this.f427389d;
        oj5.o.a(oVar);
        oj5.o.b(this.f427389d, true, "recyclerView.first.post", 0L, 4, null);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f427390e;
        if (n3.x0.b(c1163xf1deaba4)) {
            c1163xf1deaba4.addOnAttachStateChangeListener(new oj5.j(c1163xf1deaba4, oVar));
            return;
        }
        oj5.g gVar = oVar.f427406l;
        if (gVar != null && (atomicBoolean = gVar.f427383n) != null) {
            atomicBoolean.set(true);
        }
        oVar.f427400f.mo50302x6b17ad39(null);
    }
}
