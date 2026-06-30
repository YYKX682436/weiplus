package b83;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b83.h f18320d;

    public f(b83.i iVar, b83.h hVar) {
        this.f18320d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b83.h hVar = this.f18320d;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch runnable try to start");
            hVar.a();
        }
    }
}
