package ck3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f124028d;

    public m(kk3.d dVar) {
        this.f124028d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f124028d;
        if (dVar != null) {
            kk3.d.f(dVar, 0, 1, null);
        }
    }
}
