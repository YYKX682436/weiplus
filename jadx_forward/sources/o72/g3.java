package o72;

/* loaded from: classes8.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.i3 f424876e;

    public g3(o72.i3 i3Var, java.lang.String str) {
        this.f424876e = i3Var;
        this.f424875d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f424876e.h(this.f424875d);
    }
}
