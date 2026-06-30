package o72;

/* loaded from: classes8.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.i3 f424868e;

    public f3(o72.i3 i3Var, java.lang.String str) {
        this.f424868e = i3Var;
        this.f424867d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f424868e.b(this.f424867d);
    }
}
