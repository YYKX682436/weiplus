package cp2;

/* loaded from: classes2.dex */
public final class z0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dd2 f302490d;

    /* renamed from: e, reason: collision with root package name */
    public int f302491e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f302492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f302493g;

    public z0(cp2.q1 q1Var, r45.dd2 parentTab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentTab, "parentTab");
        this.f302493g = q1Var;
        this.f302490d = parentTab;
        this.f302492f = new java.util.LinkedList();
        if (parentTab.m75941xfb821914(6).isEmpty()) {
            return;
        }
        r45.dd2 dd2Var = new r45.dd2();
        byte[] mo14344x5f01b1f6 = parentTab.mo14344x5f01b1f6();
        if (mo14344x5f01b1f6 != null) {
            try {
                dd2Var.mo11468x92b714fd(mo14344x5f01b1f6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        dd2Var.m75941xfb821914(6).clear();
        this.f302492f.add(0, dd2Var);
        java.util.LinkedList linkedList = this.f302492f;
        java.util.LinkedList m75941xfb821914 = this.f302490d.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSub_tab_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            java.lang.String m75945x2fec8307 = ((r45.dd2) obj).m75945x2fec8307(1);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                arrayList.add(obj);
            }
        }
        linkedList.addAll(arrayList);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f302492f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        cp2.a1 holder = (cp2.a1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f302492f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.dd2 dd2Var = (r45.dd2) obj;
        android.widget.TextView textView = holder.f302305d;
        if (i17 == 0) {
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzf));
        } else {
            textView.setText(dd2Var.m75945x2fec8307(1));
        }
        int i18 = this.f302491e;
        android.view.View view = holder.f302306e;
        if (i18 == i17) {
            view.setBackground(view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asn));
            textView.setTextColor(android.graphics.Color.parseColor("#E6000000"));
        } else {
            view.setBackground(view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.asm));
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        }
        android.view.View view2 = holder.f3639x46306858;
        cp2.q1 q1Var = this.f302493g;
        view2.setOnClickListener(new cp2.x0(this, i17, q1Var, dd2Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "live_tab_page_label");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(q1Var.a().m75939xb282bd08(5))), new jz5.l("live_tab_id", java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)))));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.f3639x46306858, new cp2.y0(q1Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571082cx5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new cp2.a1(inflate);
    }
}
