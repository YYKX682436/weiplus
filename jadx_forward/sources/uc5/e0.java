package uc5;

/* loaded from: classes4.dex */
public final class e0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f508013d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f508014e;

    public e0(java.util.List items, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f508013d = items;
        this.f508014e = talker;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f508013d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        uc5.d0 holder = (uc5.d0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        aq.a aVar = (aq.a) kz5.n0.a0(this.f508013d, i17);
        if (aVar == null) {
            return;
        }
        java.lang.String talker = this.f508014e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        int h17 = i65.a.h(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561262dl);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f353967e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b;
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ai(holder.f508012d, aVar.f94360b, kVar);
        holder.f3639x46306858.setOnClickListener(new uc5.c0(aVar, talker, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eko, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new uc5.d0(inflate);
    }
}
