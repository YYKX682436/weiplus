package nw4;

/* loaded from: classes8.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f422462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422463e;

    public n2(nw4.n nVar, nw4.y2 y2Var) {
        this.f422463e = nVar;
        this.f422462d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f422463e.e(this.f422462d.f422546c, "system:access_denied", null);
    }
}
