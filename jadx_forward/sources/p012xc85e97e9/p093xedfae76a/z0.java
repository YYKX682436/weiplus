package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f93203a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f93204b = new android.os.Handler();

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.y0 f93205c;

    public z0(p012xc85e97e9.p093xedfae76a.y yVar) {
        this.f93203a = new p012xc85e97e9.p093xedfae76a.b0(yVar, true);
    }

    public final void a(p012xc85e97e9.p093xedfae76a.m mVar) {
        p012xc85e97e9.p093xedfae76a.y0 y0Var = this.f93205c;
        if (y0Var != null) {
            y0Var.run();
        }
        p012xc85e97e9.p093xedfae76a.y0 y0Var2 = new p012xc85e97e9.p093xedfae76a.y0(this.f93203a, mVar);
        this.f93205c = y0Var2;
        this.f93204b.postAtFrontOfQueue(y0Var2);
    }
}
