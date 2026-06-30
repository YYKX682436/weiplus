package sr2;

/* loaded from: classes10.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f493117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sr2.o1 o1Var) {
        super(0);
        this.f493117d = o1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sr2.o1 o1Var = this.f493117d;
        yz5.a aVar = o1Var.f493190h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        android.view.View view = o1Var.f493186d;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568959vi4) : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
