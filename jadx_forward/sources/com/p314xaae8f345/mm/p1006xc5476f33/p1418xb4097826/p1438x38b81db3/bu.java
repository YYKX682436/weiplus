package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class bu extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f184531e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f184532f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.au.f184436d);

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b7o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.rz6 rz6Var2;
        r45.b70 b70Var2;
        r45.rz6 rz6Var3;
        r45.b70 b70Var3;
        r45.rz6 rz6Var4;
        r45.b70 b70Var4;
        so2.d5 item = (so2.d5) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odp);
        jz5.g gVar = this.f184532f;
        android.content.Context context = holder.f374654e;
        if (textView != null) {
            le0.x xVar = (le0.x) ((jz5.n) gVar).mo141623x754a37bb();
            java.lang.String b17 = item.b();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, b17));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odm);
        java.lang.String str = null;
        r45.r03 r03Var = item.f491847d;
        if (textView2 != null) {
            le0.x xVar2 = (le0.x) ((jz5.n) gVar).mo141623x754a37bb();
            r45.r23 r23Var = (r45.r23) r03Var.m75936x14adae67(23);
            java.lang.String str2 = (r23Var == null || (rz6Var4 = (r45.rz6) r23Var.m75936x14adae67(1)) == null || (b70Var4 = rz6Var4.f466856g) == null) ? null : b70Var4.f452122n;
            if (str2 == null) {
                str2 = "";
            }
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.cl7);
        if (imageView != null) {
            float measuredWidth = (holder.o().getMeasuredWidth() - (3 * context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv))) / 2.0f;
            int[] iArr = new int[2];
            r45.r23 r23Var2 = (r45.r23) r03Var.m75936x14adae67(23);
            iArr[0] = (r23Var2 == null || (rz6Var3 = (r45.rz6) r23Var2.m75936x14adae67(1)) == null || (b70Var3 = rz6Var3.f466856g) == null) ? 0 : b70Var3.f452125q;
            r45.r23 r23Var3 = (r45.r23) r03Var.m75936x14adae67(23);
            int i19 = (r23Var3 == null || (rz6Var2 = (r45.rz6) r23Var3.m75936x14adae67(1)) == null || (b70Var2 = rz6Var2.f466856g) == null) ? 0 : b70Var2.f452124p;
            iArr[1] = i19;
            float f17 = i19 > iArr[0] ? 1.0f : 1.3333334f;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a06.d.b(measuredWidth);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = a06.d.b(f17 * measuredWidth);
            }
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d e17 = g1Var.e();
            r45.r23 r23Var4 = (r45.r23) r03Var.m75936x14adae67(23);
            if (r23Var4 != null && (rz6Var = (r45.rz6) r23Var4.m75936x14adae67(1)) != null && (b70Var = rz6Var.f466856g) != null) {
                str = b70Var.f452123o;
            }
            e17.c(new mn2.q3(str != null ? str : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411486d));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zt(holder, this, recyclerView));
    }
}
