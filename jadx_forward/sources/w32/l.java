package w32;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w32.n f524219d;

    public l(w32.n nVar) {
        this.f524219d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w32.n nVar = this.f524219d;
        nVar.f524227f = true;
        nVar.getClass();
        ((w32.a) nVar.f524226e).c(-1L, -1, -2, "TimeOut", null);
    }

    /* renamed from: toString */
    public java.lang.String m173179x9616526c() {
        return super.toString() + "|mAsyncTimeOut";
    }
}
