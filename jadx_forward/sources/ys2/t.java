package ys2;

/* loaded from: classes3.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.x f546725d;

    public t(ys2.x xVar) {
        this.f546725d = xVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return x().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ys2.s holder = (ys2.s) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.w94 fragment = (r45.w94) x().get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        int m75939xb282bd08 = fragment.m75939xb282bd08(0);
        no0.l lVar = no0.m.f420263a;
        holder.f546721f.setText(m75939xb282bd08 >= 3600 ? no0.l.a(lVar, m75939xb282bd08, ":", true, false, false, 24, null) : no0.l.a(lVar, m75939xb282bd08, ":", false, false, false, 24, null));
        holder.f546723h.setText(fragment.m75945x2fec8307(1));
        holder.f546722g.setOnClickListener(new ys2.p(holder.f546724i.f546725d, fragment));
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(fragment.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        a17.f529406d = new ys2.r(holder);
        a17.f();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_i, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ys2.s(this, inflate);
    }

    public final java.util.List x() {
        java.util.LinkedList m75941xfb821914;
        ys2.x xVar = this.f546725d;
        r45.i72 i72Var = (r45.i72) ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75936x14adae67(44);
        if (i72Var == null || (m75941xfb821914 = i72Var.m75941xfb821914(7)) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            if (((r45.w94) obj).m75939xb282bd08(0) <= ((ct2.j) xVar.m56788xbba4bfc0(ct2.j.class)).S6()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
