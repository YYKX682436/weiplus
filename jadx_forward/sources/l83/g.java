package l83;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public tl.w f398636d;

    public g(l83.h hVar, tl.w wVar) {
        this.f398636d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.w wVar = this.f398636d;
        if (wVar != null) {
            wVar.l();
            this.f398636d = null;
        }
    }
}
