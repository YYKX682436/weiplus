package mp5;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp5.j f412018d;

    public i(mp5.j jVar) {
        this.f412018d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mp5.j jVar = this.f412018d;
        if (jVar.f412019a) {
            return;
        }
        jVar.f412020b.f295347r.setVisibility(0);
        jVar.f412020b.f295353x.setVisibility(4);
    }
}
