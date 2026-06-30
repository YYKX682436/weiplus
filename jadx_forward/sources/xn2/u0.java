package xn2;

/* loaded from: classes2.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f537113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(xn2.f1 f1Var) {
        super(0);
        this.f537113d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        android.view.View view2;
        xn2.f1 f1Var = this.f537113d;
        f1Var.g().setVisibility(8);
        f1Var.f537028g = false;
        on5.c m82923x19404fcc = f1Var.j().m82923x19404fcc();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = (m82923x19404fcc == null || (view2 = m82923x19404fcc.getView()) == null) ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view2.findViewById(com.p314xaae8f345.mm.R.id.ilh);
        if (c22627xa933f8e42 != null) {
            c22627xa933f8e42.setVisibility(8);
        }
        on5.c m82923x19404fcc2 = f1Var.j().m82923x19404fcc();
        if (m82923x19404fcc2 != null && (view = m82923x19404fcc2.getView()) != null) {
            c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.ilh);
        }
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
