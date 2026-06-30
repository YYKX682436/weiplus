package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176868e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f) {
        this.f176868e = activityC13069x47bc6a4f;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569856q5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a item = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.s(com.p314xaae8f345.mm.R.id.bvx, item.a().f472877g);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bvx)).getPaint(), 0.8f);
        holder.s(com.p314xaae8f345.mm.R.id.bvr, item.a().f472876f);
        java.lang.Object tag = holder.f3639x46306858.getTag();
        java.lang.String str = item.a().f472875e;
        if (str == null) {
            str = "";
        }
        if ((tag instanceof java.lang.String) && !android.text.TextUtils.isEmpty((java.lang.CharSequence) tag) && tag.equals(str)) {
            return;
        }
        holder.f3639x46306858.setTag(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) holder.p(com.p314xaae8f345.mm.R.id.bvs);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176868e;
        c22643xbdaadc7d.r(i65.a.b(activityC13069x47bc6a4f.mo55332x76847179(), 1), activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        c22643xbdaadc7d.setImageDrawable(null);
        java.lang.String str2 = item.a().f472881n;
        if (str2 != null) {
            int dimensionPixelSize = activityC13069x47bc6a4f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            lu1.b0.b(c22643xbdaadc7d, str2, 0.0f, true, com.p314xaae8f345.mm.R.raw.f78750xb43c3b23, dimensionPixelSize, dimensionPixelSize);
        }
        if (item.a().f472880m == 3) {
            holder.v(com.p314xaae8f345.mm.R.id.bvx, activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f_));
            holder.v(com.p314xaae8f345.mm.R.id.bvr, activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f_));
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.bvx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            ((android.widget.TextView) p17).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.bvr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            ((android.widget.TextView) p18).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            holder.w(com.p314xaae8f345.mm.R.id.bvq, 8);
            holder.w(com.p314xaae8f345.mm.R.id.bvu, 0);
            holder.w(com.p314xaae8f345.mm.R.id.bvp, 8);
            return;
        }
        holder.v(com.p314xaae8f345.mm.R.id.bvx, activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        holder.v(com.p314xaae8f345.mm.R.id.bvr, activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.bvx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        ((android.widget.TextView) p19).setShadowLayer(i65.a.b(r13.getContext(), 4), 0.0f, 0.0f, activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f));
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.bvr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
        ((android.widget.TextView) p27).setShadowLayer(i65.a.b(r13.getContext(), 4), 0.0f, 0.0f, activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f));
        holder.w(com.p314xaae8f345.mm.R.id.bvu, 8);
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.bvq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5) p28;
        c13081x70323a5.setImageDrawable(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c cVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c(activityC13069x47bc6a4f, holder, c13081x70323a5, item);
        if (activityC13069x47bc6a4f.f176783w <= 0 || activityC13069x47bc6a4f.f176784x <= 0) {
            activityC13069x47bc6a4f.f176783w = holder.f3639x46306858.getHeight();
            int width = holder.f3639x46306858.getWidth();
            activityC13069x47bc6a4f.f176784x = width;
            if (activityC13069x47bc6a4f.f176783w <= 0 || width <= 0) {
                holder.f3639x46306858.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.b(activityC13069x47bc6a4f, holder, cVar2));
                return;
            }
        }
        cVar2.mo152xb9724478();
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.bvw);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176868e;
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.d(holder, activityC13069x47bc6a4f));
        viewGroup.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g(holder, activityC13069x47bc6a4f, this));
    }
}
