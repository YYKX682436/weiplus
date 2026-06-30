package bm2;

/* loaded from: classes5.dex */
public final class n7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f103697d;

    /* renamed from: e, reason: collision with root package name */
    public final mm2.k5 f103698e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f103699f;

    /* renamed from: g, reason: collision with root package name */
    public final int f103700g;

    public n7(android.content.Context context, sf2.d3 controller, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f103697d = new java.util.ArrayList();
        this.f103698e = (mm2.k5) controller.m56788xbba4bfc0(mm2.k5.class);
        this.f103699f = "";
        this.f103700g = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f103697d).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.l7 holder = (bm2.l7) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.hy1 hy1Var = (r45.hy1) ((java.util.ArrayList) this.f103697d).get(i17);
        java.lang.String name = hy1Var.f458086f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
        holder.f103604d.setText(bm2.p6.a(name, this.f103699f, this.f103700g));
        holder.f3639x46306858.setOnClickListener(new bm2.m7(hy1Var, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dso, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.l7(this, inflate);
    }
}
