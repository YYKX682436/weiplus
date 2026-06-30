package ll3;

/* loaded from: classes11.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql3.a f400731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f400732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ll3.o1 f400733f;

    public n1(ll3.o1 o1Var, ql3.a aVar, int[] iArr) {
        this.f400733f = o1Var;
        this.f400731d = aVar;
        this.f400732e = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        ll3.p1 p1Var = this.f400733f.f400737a.f400757b;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u) p1Var).d(this.f400731d, this.f400732e);
    }
}
