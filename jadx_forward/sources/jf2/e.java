package jf2;

/* loaded from: classes3.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf2.g f380899e;

    public e(android.content.Context context, jf2.g gVar) {
        this.f380898d = context;
        this.f380899e = gVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f380899e.f380904J.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        jf2.a holder = (jf2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        jf2.g gVar = this.f380899e;
        jf2.o oVar = (jf2.o) kz5.n0.a0(gVar.f380904J, i17);
        android.view.View view = holder.f380884d;
        if (oVar != null) {
            jf2.l lVar = oVar instanceof jf2.l ? (jf2.l) oVar : null;
            if (lVar != null) {
                holder.f380885e.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), ((java.lang.Number) lVar.d().f384366d).intValue(), ((java.lang.Number) ((jz5.n) gVar.K).mo141623x754a37bb()).intValue()));
                holder.f380886f.setText(view.getContext().getString(((java.lang.Number) lVar.d().f384367e).intValue()));
            }
        }
        if (oVar != null) {
            jf2.m mVar = oVar instanceof jf2.m ? (jf2.m) oVar : null;
            if (mVar != null) {
                view.setOnClickListener(new jf2.c(mVar, i17, gVar));
            }
        }
        if (oVar != null) {
            jf2.n nVar = oVar instanceof jf2.n ? (jf2.n) oVar : null;
            if (nVar != null) {
                view.setOnTouchListener(new jf2.d(nVar));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f380898d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dr9, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new jf2.a(inflate);
    }
}
