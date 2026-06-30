package vv1;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vv1.d f521937d;

    public c(vv1.d dVar) {
        this.f521937d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vv1.d dVar = this.f521937d;
        dVar.f521942h = true;
        vv1.a aVar = dVar.f521939e;
        if (aVar != null) {
            aVar.a(dVar.f521940f, dVar.f521941g);
        }
    }
}
