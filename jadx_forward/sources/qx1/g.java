package qx1;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f448818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f448819e;

    public g(qx1.q qVar, android.view.View view, boolean z17) {
        this.f448818d = view;
        this.f448819e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f448818d.setPressed(this.f448819e);
    }
}
