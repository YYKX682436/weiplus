package xu2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.u f538756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f538757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xu2.u uVar, boolean z17) {
        super(0);
        this.f538756d = uVar;
        this.f538757e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xu2.u uVar = this.f538756d;
        if (!((mm2.c1) uVar.S0().a(mm2.c1.class)).L5) {
            android.view.ViewGroup viewGroup = uVar.f446856d;
            boolean z17 = this.f538757e;
            if (z17 || uVar.v1() <= 0) {
                ((mm2.c1) uVar.S0().a(mm2.c1.class)).L5 = true;
                if (z17) {
                    ((mm2.c1) uVar.S0().a(mm2.c1.class)).K5 = ((mm2.c1) uVar.S0().a(mm2.c1.class)).J5;
                }
                android.widget.TextView textView = uVar.f538766s;
                if (textView != null) {
                    textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2c));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = uVar.f538768u;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(0);
                }
                db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2c));
            } else {
                ((mm2.c1) uVar.S0().a(mm2.c1.class)).L5 = false;
                android.widget.TextView textView2 = uVar.f538766s;
                if (textView2 != null) {
                    textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2b, java.lang.String.valueOf(uVar.v1())));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
