package id2;

/* loaded from: classes3.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f372282d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372283e;

    public q(id2.v1 v1Var) {
        this.f372283e = v1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f372282d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        id2.p holder = (id2.p) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f372282d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.n30 n30Var = (r45.n30) obj;
        r45.kv1 kv1Var = (r45.kv1) this.f372283e.E.get(n30Var.m75945x2fec8307(0));
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(kv1Var != null ? kv1Var.m75945x2fec8307(2) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        android.widget.ImageView imageView = holder.f372253d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        holder.f372256g.setText(java.lang.String.valueOf(kv1Var != null ? java.lang.Integer.valueOf((int) kv1Var.m75938x746dc8a6(9)) : null));
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.widget.TextView textView = holder.f372254e;
        r4Var.b3(textView);
        textView.setText("x" + n30Var.m75939xb282bd08(1));
        if (kv1Var == null || (str = kv1Var.m75945x2fec8307(8)) == null) {
            str = "";
        }
        holder.f372255f.setText(str);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.arx, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new id2.p(inflate);
    }

    public final void x() {
        id2.v1 v1Var = this.f372283e;
        java.util.LinkedList linkedList = v1Var.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((r45.n30) obj).m75939xb282bd08(1) > 0) {
                arrayList.add(obj);
            }
        }
        this.f372282d = new java.util.LinkedList(arrayList);
        m8146xced61ae5();
        v1Var.T6().post(new id2.s(v1Var));
    }
}
