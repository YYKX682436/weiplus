package s01;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s01.o f483439d;

    public n(s01.o oVar) {
        this.f483439d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.da daVar = this.f483439d.f483444f;
        if (daVar != null) {
            daVar.c();
        }
    }
}
