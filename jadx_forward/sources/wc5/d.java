package wc5;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f526080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f526081e;

    public d(wc5.q qVar, int i17) {
        this.f526080d = qVar;
        this.f526081e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.q qVar = this.f526080d;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) qVar.X6()).v7(true);
        wc5.q.T6(qVar, this.f526081e);
    }
}
