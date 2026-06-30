package tj3;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f501292d;

    public l(tj3.p pVar) {
        this.f501292d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tj3.p pVar = this.f501292d;
        if (pVar.f501324j) {
            return;
        }
        pVar.d().setVisibility(4);
    }
}
