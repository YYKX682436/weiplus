package eh5;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f334501d;

    public o(eh5.y yVar) {
        this.f334501d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f334501d;
        yVar.f334517p = false;
        super/*android.app.Dialog*/.dismiss();
    }
}
