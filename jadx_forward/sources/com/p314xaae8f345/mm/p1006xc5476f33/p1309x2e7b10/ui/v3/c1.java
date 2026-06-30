package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class c1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176834e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf) {
        this.f176834e = activityC13074xfcf8fabf;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569859q8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bwc);
        textView.setText(item.a().f468299e);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        holder.s(com.p314xaae8f345.mm.R.id.f565266bw5, item.a().f468300f);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.bw7);
        java.lang.String str = item.a().f468312u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176834e;
        if (str != null) {
            int dimensionPixelSize = activityC13074xfcf8fabf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            java.lang.String card_icon_url = item.a().f468312u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_icon_url, "card_icon_url");
            lu1.b0.c(imageView, card_icon_url, 0.0f, false, com.p314xaae8f345.mm.R.raw.f78750xb43c3b23, dimensionPixelSize, dimensionPixelSize, 12, null);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.bw9);
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        if (item.a().f468304m.isEmpty()) {
            linearLayout.setVisibility(8);
        } else {
            java.util.LinkedList<r45.st> coupon_label = item.a().f468304m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(coupon_label, "coupon_label");
            for (r45.st stVar : coupon_label) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(activityC13074xfcf8fabf.mo55332x76847179());
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13074xfcf8fabf.mo55332x76847179();
                c13079x2ba3d9dc.setMinHeight(i65.a.b(mo55332x76847179, 18));
                c13079x2ba3d9dc.setMinWidth(i65.a.b(mo55332x76847179, 56));
                int b17 = i65.a.b(mo55332x76847179, 8);
                int b18 = i65.a.b(mo55332x76847179, 4);
                c13079x2ba3d9dc.setPadding(b17, b18, b17, b18);
                c13079x2ba3d9dc.setText(stVar.f467500d);
                c13079x2ba3d9dc.setTextSize(1, 10.0f);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467501e)) {
                    c13079x2ba3d9dc.setTextColor(-1);
                } else {
                    c13079x2ba3d9dc.setTextColor(android.graphics.Color.parseColor(stVar.f467501e));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467502f)) {
                    c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.a(-16777216, 26));
                } else {
                    c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.b(stVar.f467502f, stVar.f467505i));
                }
                linearLayout.addView(c13079x2ba3d9dc);
            }
            linearLayout.setVisibility(0);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565264bw3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5 c13081x70323a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13081x70323a5) p17;
        java.lang.Object tag = c13081x70323a5.getTag();
        java.lang.String str2 = item.a().f468298d;
        if (str2 == null) {
            str2 = "";
        }
        if ((tag instanceof java.lang.String) && !android.text.TextUtils.isEmpty((java.lang.CharSequence) tag) && tag.equals(str2)) {
            return;
        }
        c13081x70323a5.setTag(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.v0(activityC13074xfcf8fabf, c13081x70323a5, item);
        if (activityC13074xfcf8fabf.N <= 0 || activityC13074xfcf8fabf.P <= 0) {
            activityC13074xfcf8fabf.N = holder.f3639x46306858.getHeight();
            int width = holder.f3639x46306858.getWidth();
            activityC13074xfcf8fabf.P = width;
            if (activityC13074xfcf8fabf.N <= 0 || width <= 0) {
                holder.f3639x46306858.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.u0(activityC13074xfcf8fabf, holder, v0Var));
                return;
            }
        }
        v0Var.mo152xb9724478();
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d c22643xbdaadc7d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22643xbdaadc7d) holder.p(com.p314xaae8f345.mm.R.id.bw7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176834e;
        c22643xbdaadc7d.r(i65.a.b(activityC13074xfcf8fabf.mo55332x76847179(), 1), activityC13074xfcf8fabf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w0(holder, activityC13074xfcf8fabf));
        holder.f3639x46306858.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.z0(holder, activityC13074xfcf8fabf, this));
    }
}
