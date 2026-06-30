package lp4;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.f0 f401869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(lp4.f0 f0Var) {
        super(0);
        this.f401869d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lp4.f0 f0Var = this.f401869d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(f0Var.f401876f.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = f0Var.f401876f;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d48, (android.view.ViewGroup) c17043x8103c103, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103.k(c17043x8103c103, inflate, null, 2, null);
        inflate.setOnClickListener(lp4.c0.f401865d);
        return (android.view.ViewGroup) inflate;
    }
}
