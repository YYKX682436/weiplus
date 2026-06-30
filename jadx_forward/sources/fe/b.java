package fe;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe.g f342880d;

    public b(fe.g gVar) {
        this.f342880d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fe.g gVar = this.f342880d;
        yg.h hVar = gVar.f342891f;
        if (hVar != null) {
            gVar.f342893h = ((hVar.c() - r2) * 1000.0f) / ((float) (android.os.SystemClock.elapsedRealtime() - hVar.f543598b.get(gVar.f342892g)));
        }
    }
}
