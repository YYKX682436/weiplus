package cj5;

/* loaded from: classes.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.c5 f123602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(cj5.c5 c5Var) {
        super(1);
        this.f123602d = c5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        cj5.c5 c5Var = this.f123602d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = c5Var.T6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null && (g0Var = a17.f233604u) != null) {
            g0Var.mo7806x9d92d11c(c5Var.m158354x19263085(), new cj5.z4(c5Var));
        }
        return jz5.f0.f384359a;
    }
}
