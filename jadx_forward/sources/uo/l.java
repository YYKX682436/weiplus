package uo;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo.a f511052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f511053e;

    public l(uo.a aVar, yz5.p pVar) {
        this.f511052d = aVar;
        this.f511053e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uo.a aVar = this.f511052d;
        if (((java.lang.Boolean) aVar.f511033b.mo152xb9724478()).booleanValue()) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.f511035d);
        yz5.p pVar = this.f511053e;
        pVar.mo149xb9724478(valueOf, new uo.k(aVar, pVar));
    }
}
