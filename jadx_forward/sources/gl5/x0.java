package gl5;

/* loaded from: classes5.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(gl5.d1 d1Var) {
        super(0);
        this.f354642d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gl5.d1 d1Var = this.f354642d;
        android.view.View inflate = android.view.LayoutInflater.from(d1Var.f354457a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egr, (android.view.ViewGroup) null);
        android.view.ViewParent parent = d1Var.f354457a.findViewById(com.p314xaae8f345.mm.R.id.jlt).getParent().getParent().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        return inflate;
    }
}
