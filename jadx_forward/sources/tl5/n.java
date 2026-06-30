package tl5;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.s f501910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f501911e;

    public n(tl5.s sVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f501910d = sVar;
        this.f501911e = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl5.s sVar = this.f501910d;
        tl5.d dVar = sVar.f501921d;
        if (dVar == null) {
            return;
        }
        dVar.animate().alpha(0.0f).setDuration(sVar.f501919b.f490820e).withEndAction(new tl5.m(dVar, this.f501911e, sVar)).start();
    }
}
