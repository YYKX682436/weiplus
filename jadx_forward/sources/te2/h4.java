package te2;

/* loaded from: classes3.dex */
public final class h4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f499589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499590e;

    public h4(te2.p8 p8Var, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f499590e = p8Var;
        this.f499589d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        te2.sc scVar = te2.sc.f499945a;
        return ((java.util.ArrayList) te2.sc.f499947c).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        te2.f4 holder = (te2.f4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        te2.sc scVar = te2.sc.f499945a;
        java.util.List list = te2.sc.f499947c;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        r45.s52 s52Var = arrayList.size() <= i17 ? (r45.s52) kz5.n0.Z(list) : (r45.s52) arrayList.get(i17);
        if (s52Var == null) {
            s52Var = new r45.s52();
        }
        android.widget.ImageView imageView = holder.f499531e;
        int m75939xb282bd08 = s52Var.m75939xb282bd08(1);
        te2.p8 p8Var = this.f499590e;
        if (m75939xb282bd08 == 1) {
            ya2.b2 b2Var = p8Var.f499868z1;
            if (b2Var != null) {
                if (!(b2Var.D0().length() > 0)) {
                    b2Var = null;
                }
                if (b2Var != null) {
                    i95.m c17 = i95.n0.c(vd2.i5.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    vd2.i5.l7((vd2.i5) c17, b2Var.m176700xe5e0d2a0(), imageView, null, 4, null);
                }
            }
        } else {
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(s52Var.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
        }
        holder.f499531e.setOnClickListener(new te2.g4(p8Var, s52Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f499589d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eay, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new te2.f4(this, inflate);
    }
}
