package g42;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42.b f350252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g42.f f350253e;

    public e(g42.f fVar, s42.b bVar) {
        this.f350253e = fVar;
        this.f350252d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s42.b bVar = this.f350252d;
        if (bVar.f484470g == 0) {
            n42.a aVar = this.f350253e.f350260m;
            java.lang.String str = bVar.f484464a;
            if (u46.l.e(str)) {
                aVar.getClass();
                return;
            }
            synchronized (aVar.f416435a) {
                ((java.util.HashMap) aVar.f416435a).remove(str);
                aVar.a();
            }
        }
    }
}
