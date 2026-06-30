package yu4;

/* loaded from: classes8.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xi0 f547413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yu4.k kVar, r45.xi0 xi0Var) {
        super(0);
        this.f547412d = kVar;
        this.f547413e = xi0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yu4.k kVar = this.f547412d;
        android.view.View view = kVar.f547417i;
        if (view != null) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(kVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bxu));
            view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).animate().rotation(90.0f).setDuration(200L).start();
            yu4.o oVar = kVar.f547420o;
            r45.xi0 xi0Var = this.f547413e;
            if (oVar == null) {
                kVar.f547420o = new yu4.o(kVar, xi0Var, kVar.f547415g, view);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xi0Var, "<set-?>");
                oVar.f547440e = xi0Var;
            }
            kVar.f547418m = true;
            yu4.o oVar2 = kVar.f547420o;
            if (oVar2 != null) {
                oVar2.g5(xi0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
