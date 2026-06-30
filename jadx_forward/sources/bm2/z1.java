package bm2;

/* loaded from: classes3.dex */
public final class z1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f104005d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104006e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ma0 f104007f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f104008g;

    /* renamed from: h, reason: collision with root package name */
    public int f104009h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f104010i;

    public z1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f104005d = context;
        this.f104006e = "FinderLiveCustomGiftEditAdapter";
        this.f104008g = jz5.h.b(bm2.x1.f103958d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return x().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        r45.gs5 gs5Var;
        bm2.w1 holder = (bm2.w1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.f70 f70Var = (i17 < 0 || i17 >= x().size()) ? null : (r45.f70) x().get(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" getView position:");
        sb6.append(i17);
        sb6.append(", curPos:");
        sb6.append(this.f104009h);
        sb6.append(", componentValue:");
        java.lang.String str2 = "";
        sb6.append(pm0.b0.g(f70Var == null ? "" : f70Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f104006e, sb6.toString());
        if (f70Var == null || (gs5Var = (r45.gs5) f70Var.m75936x14adae67(4)) == null || (str = gs5Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(holder.f103933f);
        if (f70Var != null && (m75945x2fec8307 = f70Var.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        android.widget.TextView textView = holder.f103934g;
        textView.setText(str2);
        if (str2.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        float m75938x746dc8a6 = f70Var != null ? f70Var.m75938x746dc8a6(2) : 0.0f;
        if (m75938x746dc8a6 > 0.0f) {
            android.view.View view = holder.f103935h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f103936i.setText(java.lang.String.valueOf((int) m75938x746dc8a6));
        } else {
            android.view.View view2 = holder.f103935h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$FinderLiveCustomGiftItemHolder", "setEditPrice", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i18 = this.f104009h;
        android.view.View view3 = holder.f103932e;
        if (i17 == i18) {
            view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayy);
        } else {
            view3.setBackgroundResource(0);
        }
        holder.f3639x46306858.setOnClickListener(new bm2.y1(this, i17, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f104005d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.apw, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.w1(inflate);
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f104008g).mo141623x754a37bb();
    }
}
