package nt3;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.k f421322d;

    public h(nt3.k kVar) {
        this.f421322d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nt3.k kVar = this.f421322d;
        yz5.p pVar = kVar.B;
        if (pVar != null) {
            pVar.mo149xb9724478(kVar, java.lang.Boolean.TRUE);
        }
    }
}
