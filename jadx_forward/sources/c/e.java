package c;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f118385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 f118387f;

    public e(p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6, android.view.View view, int i17) {
        this.f118387f = c0029xbc4672a6;
        this.f118385d = view;
        this.f118386e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = this.f118387f;
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = c0029xbc4672a6.f90425p;
        if (lVar == null || !lVar.h(true)) {
            c0029xbc4672a6.D(this.f118386e);
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(this.f118385d, this);
        }
    }
}
