package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class b60 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f199373d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f199374e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f199375f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f199376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 f199377h;

    public b60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var, yz5.l onTabSelected) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTabSelected, "onTabSelected");
        this.f199377h = z60Var;
        this.f199373d = onTabSelected;
        this.f199374e = kz5.p0.f395529d;
        this.f199375f = "";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f199374e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        this.f199376g = recyclerView;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z50 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z50) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) this.f199374e.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = this.f199377h;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60.a(z60Var) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y50Var.f201948a, "co_live");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y50Var.f201948a, this.f199375f);
        holder.f202060d.setText(y50Var.f201949b);
        android.view.View view = holder.f3639x46306858;
        java.lang.String str = y50Var.f201948a;
        view.setTag(str);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 b60Var = holder.f202062f;
        android.content.Context context = b60Var.f199377h.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.vc8);
        if (textView != null) {
            textView.setTextColor(context.getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84 : b17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19 : com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
            if (b17) {
                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            } else {
                com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            }
        }
        int color = context.getColor(b17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289 : android.R.color.transparent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setTabBackgroundColor: color=" + (b17 ? "Brand_Alpha_0_1" : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63) + ", isSelected=" + b17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(context.getResources().getDisplayMetrics().density * 8.0f);
        itemView.setBackground(gradientDrawable);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "video")) {
            android.content.Context context2 = b60Var.f199377h.getContext();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2 : null;
            if (activityC0065xcd7aa112 != null) {
                ll2.e.l(ll2.e.f400666a, activityC0065xcd7aa112, "startlive.more.video", holder.f202061e, null, null, 24, null);
            }
        } else {
            android.view.View view2 = holder.f202061e;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$TabViewHolder", "bind", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$TabViewHolder", "bind", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (true ^ this.f199374e.isEmpty()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f199376g;
            int width = c1163xf1deaba4 != null ? c1163xf1deaba4.getWidth() : 0;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f199376g;
            int paddingLeft = c1163xf1deaba42 != null ? c1163xf1deaba42.getPaddingLeft() : 0;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f199376g;
            int paddingRight = width - (paddingLeft + (c1163xf1deaba43 != null ? c1163xf1deaba43.getPaddingRight() : 0));
            if (paddingRight > 0) {
                layoutParams.width = paddingRight / this.f199374e.size();
            } else {
                layoutParams.width = -2;
            }
        } else {
            layoutParams.width = -2;
        }
        holder.f3639x46306858.setLayoutParams(layoutParams);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a60(z60Var, y50Var, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570530ec3, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z50(this, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8158xdba684df(recyclerView);
        this.f199376g = null;
    }
}
