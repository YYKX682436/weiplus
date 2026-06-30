package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.q0 f93170d;

    public m0(p012xc85e97e9.p093xedfae76a.q0 q0Var) {
        this.f93170d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p093xedfae76a.q0 q0Var = this.f93170d;
        int i17 = q0Var.f93175e;
        p012xc85e97e9.p093xedfae76a.b0 b0Var = q0Var.f93179i;
        if (i17 == 0) {
            q0Var.f93176f = true;
            b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        }
        if (q0Var.f93174d == 0 && q0Var.f93176f) {
            b0Var.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
            q0Var.f93177g = true;
        }
    }
}
