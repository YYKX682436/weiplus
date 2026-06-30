package y9;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f541774d;

    /* renamed from: e, reason: collision with root package name */
    public final int f541775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f541776f;

    public d(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046, android.view.View view, int i17) {
        this.f541776f = c2690x46972046;
        this.f541774d = view;
        this.f541775e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541776f;
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = c2690x46972046.f125979s;
        if (lVar == null || !lVar.h(true)) {
            c2690x46972046.E(this.f541775e);
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(this.f541774d, this);
        }
    }
}
