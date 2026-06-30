package cw4;

/* loaded from: classes8.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f305766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(cw4.m0 m0Var) {
        super(0);
        this.f305766d = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cw4.y yVar;
        cw4.m0 m0Var = this.f305766d;
        if (m0Var.f305780p.f93138c.a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
            hy4.g0 g0Var = m0Var.f305785u;
            int i17 = g0Var.f367638c;
            p012xc85e97e9.p093xedfae76a.j0 j0Var = m0Var.f305786v;
            if (i17 == 2) {
                j0Var.mo7808x76db6cb1(cw4.y.f305836h);
            } else {
                double d17 = g0Var.f367637b;
                if (0.7d <= d17 && d17 <= 1.0d) {
                    yVar = cw4.y.f305833e;
                } else {
                    if (0.2d <= d17 && d17 <= 0.7d) {
                        yVar = cw4.y.f305835g;
                    } else {
                        yVar = 0.0d <= d17 && d17 <= 0.2d ? cw4.y.f305834f : cw4.y.f305832d;
                    }
                }
                j0Var.mo7808x76db6cb1(yVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m0Var.f305772e, "pageLogic is inActive!");
        }
        return jz5.f0.f384359a;
    }
}
