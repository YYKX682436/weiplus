package b83;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b83.h f99853d;

    public f(b83.i iVar, b83.h hVar) {
        this.f99853d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b83.h hVar = this.f99853d;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch runnable try to start");
            hVar.a();
        }
    }
}
