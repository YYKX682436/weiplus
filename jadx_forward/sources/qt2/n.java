package qt2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.u f448137d;

    public n(qt2.u uVar) {
        this.f448137d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qt2.u uVar = this.f448137d;
        if (uVar.f448153p) {
            return;
        }
        uVar.f448153p = true;
        uVar.R6("photo");
    }
}
