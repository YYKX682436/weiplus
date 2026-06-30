package ol4;

/* loaded from: classes11.dex */
public final class n extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427708d;

    public n(ol4.q qVar) {
        this.f427708d = qVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        ol4.q qVar = this.f427708d;
        long mo100915xddd35a52 = ((kk4.f0) qVar.f427713b).mo100915xddd35a52();
        long mo100917x37a7fa50 = ((kk4.f0) qVar.f427713b).mo100917x37a7fa50();
        ll4.a aVar = qVar.f427715d;
        if (aVar != null) {
            kl4.n nVar = (kl4.n) aVar;
            ll4.d dVar = nVar.f390489a.f390401e;
            ((ku5.t0) ku5.t0.f394148d).B(new kl4.m(dVar, nVar.f390489a, mo100915xddd35a52, mo100917x37a7fa50));
        }
    }
}
