package aa3;

/* loaded from: classes14.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aa3.u0 f2601f;

    public t0(aa3.u0 u0Var, android.view.View view, int i17) {
        this.f2601f = u0Var;
        this.f2599d = view;
        this.f2600e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2601f.a(this.f2599d, this.f2600e);
    }
}
