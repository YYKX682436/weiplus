package bg;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19834d;

    public t(bg.f fVar) {
        this.f19834d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19834d;
        ye1.e eVar = fVar.f19764h;
        if (eVar == null || eVar.isPlaying()) {
            return;
        }
        fVar.K(false, true);
    }
}
