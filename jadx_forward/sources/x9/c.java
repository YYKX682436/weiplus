package x9;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f534140d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f534141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2684x5190b082 f534142f;

    public c(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2684x5190b082 c2684x5190b082, android.view.View view, boolean z17) {
        this.f534142f = c2684x5190b082;
        this.f534140d = view;
        this.f534141e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252.C2684x5190b082 c2684x5190b082 = this.f534142f;
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = c2684x5190b082.f125888d;
        if (lVar != null && lVar.h(true)) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(this.f534140d, this);
        } else if (this.f534141e) {
            c2684x5190b082.getClass();
        }
    }
}
