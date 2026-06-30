package bg;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101367d;

    public t(bg.f fVar) {
        this.f101367d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101367d;
        ye1.e eVar = fVar.f101297h;
        if (eVar == null || eVar.mo1856xc00617a4()) {
            return;
        }
        fVar.K(false, true);
    }
}
