package dj5;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f314634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dj5.b0 b0Var, java.lang.String str) {
        super(1);
        this.f314634d = b0Var;
        this.f314635e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.p pVar = (wi5.p) state.a(wi5.p.class);
        dj5.b0 b0Var = this.f314634d;
        if (pVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) b0Var.f314589e).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 instanceof com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e.C22460x20778e62) {
                ((em.l2) ((jz5.n) b0Var.f314589e).mo141623x754a37bb()).l().m78861xe90b84f5(new java.lang.String[]{"🔍", "#"});
                ((com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e.C22460x20778e62) a17).f233604u.mo7806x9d92d11c(b0Var.m158354x19263085(), new dj5.x(b0Var, a17));
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", kz5.n0.g0(c0Var.f527815b, ",", null, null, 0, null, null, 62, null));
            intent.putExtra("chatroomName", this.f314635e);
            b0Var.m158354x19263085().setResult(-1, intent);
            b0Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
