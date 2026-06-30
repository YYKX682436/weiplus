package jj4;

/* loaded from: classes11.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final bi4.m0 f381563e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f381564f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f381565g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f381566h;

    public c(bi4.m0 m0Var, java.lang.String str, java.util.ArrayList likeList, android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeList, "likeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f381563e = m0Var;
        this.f381564f = str;
        this.f381565g = likeList;
        this.f381566h = z17;
    }

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        int height = recyclerView.getHeight();
        if (height != 0 && (layoutParams = convertView.getLayoutParams()) != null) {
            layoutParams.height = height - i65.a.b(recyclerView.getContext(), 1);
            convertView.setLayoutParams(layoutParams);
        }
        return new in5.s0(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dx7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Object m143895xf1229813;
        jj4.b item = (jj4.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.m8211x9616526c();
        item.m141056x9616526c();
        java.util.Objects.toString(list);
        java.lang.Object obj = holder.f374657h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) obj : null;
        if (w1Var != null) {
            w1Var.setTag(com.p314xaae8f345.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
        }
        if (w1Var != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ej4.c0.f334868a.b(w1Var);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(w1Var.f255923i, "forceRemoveListenDBNotify: e:" + p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
            }
        }
        if (w1Var != null) {
            w1Var.j(item.f381562d);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        recyclerView.toString();
        holder.m8211x9616526c();
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.content.Context context = recyclerView.getContext();
        java.lang.String str = this.f381564f;
        java.util.ArrayList arrayList = this.f381565g;
        bi4.m0 m0Var = this.f381563e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f381566h);
        ((we0.j1) l0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1(context, null, m0Var, str, arrayList, valueOf != null ? valueOf.booleanValue() : false, null, 66, null);
        frameLayout.addView(w1Var, 0);
        holder.f374657h = w1Var;
        android.view.ViewGroup.LayoutParams layoutParams = w1Var.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.m8211x9616526c();
    }
}
