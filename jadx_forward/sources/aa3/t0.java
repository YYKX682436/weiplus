package aa3;

/* loaded from: classes14.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aa3.u0 f84134f;

    public t0(aa3.u0 u0Var, android.view.View view, int i17) {
        this.f84134f = u0Var;
        this.f84132d = view;
        this.f84133e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f84134f.a(this.f84132d, this.f84133e);
    }
}
