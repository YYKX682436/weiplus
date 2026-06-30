package bm2;

/* loaded from: classes8.dex */
public final class i4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f103505d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f103506e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f103507f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f103508g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f103509h;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103505d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.text.SpannableString n17;
        java.lang.Object obj;
        jz5.f0 f0Var;
        bm2.f4 holder = (bm2.f4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj2 = this.f103505d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        r45.mu2 mu2Var = (r45.mu2) obj2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        mn2.n nVar = new mn2.n(c19782x23db1cfa != null ? c19782x23db1cfa.m76175x6d346f39() : null, null, 2, null);
        android.widget.ImageView imageView = holder.f103420f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-avatar>(...)");
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = holder.f103421g;
        java.lang.String m75945x2fec8307 = mu2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76184x8010e5e4() : null;
            float textSize = holder.f103421g.getTextSize();
            ((ke0.e) xVar).getClass();
            n17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, m76184x8010e5e4, textSize);
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
            java.lang.String m75945x2fec83072 = mu2Var.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            android.text.Spanned c17 = l4Var.c(m75945x2fec83072, "");
            float textSize2 = holder.f103421g.getTextSize();
            ((ke0.e) xVar2).getClass();
            n17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context2, c17, textSize2);
        }
        textView.setText(n17);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        java.lang.String m76192x3f6b0a02 = c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76192x3f6b0a02() : null;
        if (m76192x3f6b0a02 == null || m76192x3f6b0a02.length() == 0) {
            holder.f103426o.setVisibility(8);
        } else {
            holder.f103426o.setVisibility(0);
            android.widget.TextView textView2 = holder.f103426o;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = holder.f103426o.getContext();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
            java.lang.String m76192x3f6b0a022 = c19782x23db1cfa4 != null ? c19782x23db1cfa4.m76192x3f6b0a02() : null;
            float textSize3 = holder.f103426o.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, m76192x3f6b0a022, textSize3));
        }
        holder.f103418d.setVisibility(0);
        holder.f103425n.setVisibility(8);
        holder.f103419e.setVisibility(8);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        java.lang.String m76197x6c03c64c = c19782x23db1cfa5 != null ? c19782x23db1cfa5.m76197x6c03c64c() : null;
        java.util.ArrayList arrayList = this.f103508g;
        synchronized (arrayList) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390705c, m76197x6c03c64c)) {
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            android.widget.TextView textView3 = holder.f103424m;
            textView3.setText(textView3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmu));
        } else {
            java.util.HashMap hashMap = this.f103506e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
            if (hashMap.get(c19782x23db1cfa6 != null ? c19782x23db1cfa6.m76197x6c03c64c() : null) != null) {
                holder.f103419e.setVisibility(0);
                holder.f103418d.setVisibility(8);
            } else {
                java.util.HashMap hashMap2 = this.f103507f;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                km2.q qVar = (km2.q) hashMap2.get(c19782x23db1cfa7 != null ? c19782x23db1cfa7.m76197x6c03c64c() : null);
                if (qVar != null) {
                    if (qVar.m()) {
                        holder.f103424m.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmw));
                    } else if (qVar.o()) {
                        holder.f103425n.setVisibility(0);
                        holder.f103418d.setVisibility(8);
                    } else {
                        holder.f103424m.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmv));
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    holder.f103424m.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dmv));
                }
            }
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        android.widget.ImageView imageView2 = holder.f103422h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "<get-typeIcon>(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        m1Var.c(imageView2, c19782x23db1cfa8 != null ? c19782x23db1cfa8.m76160xd133dfec() : null, 0);
        holder.f103423i.setOnClickListener(new bm2.g4(this, i17));
        holder.f103419e.setOnClickListener(new bm2.h4(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ata, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.f4(inflate);
    }

    public final void x(java.util.List data) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f103505d.clear();
        java.util.ArrayList arrayList = this.f103505d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : data) {
            r45.mu2 mu2Var = (r45.mu2) obj2;
            java.util.ArrayList arrayList3 = this.f103508g;
            synchronized (arrayList3) {
                java.util.Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((km2.q) next).f390705c;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null)) {
                        obj = next;
                        break;
                    }
                }
            }
            if (obj == null) {
                arrayList2.add(obj2);
            }
        }
        arrayList.addAll(arrayList2);
    }

    public final void y(java.util.List localRecommApplyMicList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localRecommApplyMicList, "localRecommApplyMicList");
        java.util.HashMap hashMap = this.f103507f;
        hashMap.clear();
        java.util.Iterator it = localRecommApplyMicList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.lang.String str = qVar.f390705c;
            if (str != null) {
                hashMap.put(str, qVar);
            }
        }
    }
}
