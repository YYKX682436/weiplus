package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class h0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f93160d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f93161e;

    /* renamed from: f, reason: collision with root package name */
    public int f93162f = -1;

    public h0(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        this.f93160d = g0Var;
        this.f93161e = k0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int i17 = this.f93162f;
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f93160d;
        if (i17 != g0Var.m7803x52c258a2()) {
            this.f93162f = g0Var.m7803x52c258a2();
            this.f93161e.mo525x7bb163d5(obj);
        }
    }
}
