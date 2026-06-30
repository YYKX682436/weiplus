package bm2;

/* loaded from: classes9.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f103336d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f103337e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103336d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        bm2.a holder = (bm2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f103336d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        cm2.k kVar = (cm2.k) obj;
        holder.f103279g = kVar;
        r45.b73 b73Var = (r45.b73) kVar.f124891d.m75936x14adae67(1);
        r45.c73 c73Var = kVar.f124891d;
        if (b73Var == null || (m75945x2fec8307 = b73Var.m75945x2fec8307(12)) == null) {
            r45.b73 b73Var2 = (r45.b73) c73Var.m75936x14adae67(1);
            m75945x2fec8307 = b73Var2 != null ? b73Var2.m75945x2fec8307(1) : null;
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
        }
        holder.f103276d.setText(m75945x2fec8307);
        r45.b73 b73Var3 = (r45.b73) c73Var.m75936x14adae67(1);
        holder.f103277e.setVisibility(b73Var3 != null && b73Var3.m75939xb282bd08(10) == 1 ? 0 : 8);
        r45.b73 b73Var4 = (r45.b73) c73Var.m75936x14adae67(1);
        java.lang.String str = (b73Var4 == null || (m75945x2fec83072 = b73Var4.m75945x2fec8307(2)) == null) ? "" : m75945x2fec83072;
        i95.m c17 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        vd2.i5.l8((vd2.i5) c17, str, holder.f103278f, null, 4, null);
        holder.f3639x46306858.setOnClickListener(new bm2.b(this, kVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aju, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.a(inflate);
    }
}
