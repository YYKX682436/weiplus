package r50;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r50.j0 j0Var) {
        super(0);
        this.f474144d = j0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r50.j0 j0Var = this.f474144d;
        android.app.Activity m80379x76847179 = j0Var.m80379x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 e17 = j0Var.W6().e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getEtCustomText(...)");
        em.b W6 = j0Var.W6();
        if (W6.f335617g == null) {
            W6.f335617g = (android.widget.LinearLayout) W6.f335611a.findViewById(com.p314xaae8f345.mm.R.id.d6f);
        }
        android.widget.LinearLayout linearLayout = W6.f335617g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getEditLayout(...)");
        return new gl5.d1(m80379x76847179, e17, linearLayout, j0Var.W6().f(), j0Var.V6());
    }
}
