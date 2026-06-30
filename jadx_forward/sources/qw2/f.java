package qw2;

/* loaded from: classes10.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f448654d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f448655e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448656f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f448657g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f448658h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f448659i;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f448654d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b((t85.d) kz5.n0.a0(this.f448654d, i17), qw2.g.f448660a) ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        qw2.c holder = (qw2.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        t85.d dVar = (t85.d) kz5.n0.a0(this.f448654d, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        holder.i(i17, dVar.f497989a);
        yz5.l lVar = this.f448659i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agb, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new qw2.d(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aga, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new qw2.e(this, inflate2);
    }
}
