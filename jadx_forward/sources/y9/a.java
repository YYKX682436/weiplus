package y9;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f541770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f541771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f541772f;

    public a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046, android.view.View view, int i17) {
        this.f541772f = c2690x46972046;
        this.f541770d = view;
        this.f541771e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f541772f.G(this.f541770d, this.f541771e);
    }
}
