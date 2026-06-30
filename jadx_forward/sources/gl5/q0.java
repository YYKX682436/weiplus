package gl5;

/* loaded from: classes5.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gl5.d1 d1Var) {
        super(0);
        this.f354611d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gl5.d1 d1Var = this.f354611d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) d1Var.e().findViewById(com.p314xaae8f345.mm.R.id.b1f);
        c22698xdfbd289f.setOnClickListener(new gl5.p0(d1Var));
        return c22698xdfbd289f;
    }
}
