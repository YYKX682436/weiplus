package ju5;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu5.e f383616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.f f383617e;

    public e(ju5.f fVar, eu5.e eVar) {
        this.f383617e = fVar;
        this.f383616d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ju5.f fVar = this.f383617e;
        eu5.b bVar = fVar.f383621a;
        if (bVar == null || fVar.f383622b) {
            return;
        }
        bVar.a(this.f383616d);
        fVar.f383622b = true;
    }
}
