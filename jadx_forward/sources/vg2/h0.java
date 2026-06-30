package vg2;

/* loaded from: classes3.dex */
public final class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f518048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.j0 f518049e;

    public h0(vg2.j0 j0Var, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f518049e = j0Var;
        this.f518048d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f518049e.f518061p).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        vg2.f0 holder = (vg2.f0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vg2.j0 j0Var = this.f518049e;
        km2.q qVar = (km2.q) ((java.util.ArrayList) j0Var.f518061p).get(i17);
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.a().c(new mn2.n(qVar.f390704b, null, 2, null), holder.f518039d, g1Var.h(mn2.f1.f411490h));
        holder.f518040e.setText(qVar.f390706d);
        km2.q qVar2 = j0Var.f518062q;
        holder.f518041f.setVisibility(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar2 != null ? qVar2.f390705c : null, qVar.f390705c) ? 0 : 8);
        holder.f3639x46306858.setOnClickListener(new vg2.g0(j0Var, qVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f518048d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.div, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new vg2.f0(this, inflate);
    }
}
