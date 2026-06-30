package bm2;

/* loaded from: classes3.dex */
public final class w7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f103949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f103950e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f103951f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f103952g;

    public w7(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f103949d = activity;
        this.f103950e = new java.util.ArrayList();
        this.f103951f = jz5.h.b(new bm2.v7(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f103950e).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.u7 holder = (bm2.u7) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String word = (java.lang.String) ((java.util.ArrayList) this.f103950e).get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        holder.f103888f = word;
        holder.f103887e.setText(word);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ayz, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.u7(this, inflate);
    }
}
