package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ui.at;

/* loaded from: classes11.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f196951e;

    public q(java.lang.Boolean bool) {
        this.f196951e = bool;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a5y);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a5z);
        android.view.View m79176xc2a54588 = c21522xf5a6e956.m79176xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m79176xc2a54588, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) m79176xc2a54588;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = this.f196951e;
        textView.setTextColor(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool) ? android.graphics.Color.parseColor("#CCFFFFFF") : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560946yk));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool)) {
            holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a5x).setBackgroundDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563070vy));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f210435e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("notify@all", z3Var.d1())) {
            imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79881x2a0b8f39)));
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573005d63));
            return;
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.view.View m79176xc2a545882 = c21522xf5a6e956.m79176xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m79176xc2a545882, "null cannot be cast to non-null type android.widget.ImageView");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai((android.widget.ImageView) m79176xc2a545882, z3Var.d1(), null);
        if (z3Var.f1() == 0) {
            c21522xf5a6e956.m79178xd0b5cd2c(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(z3Var.f1(), false);
            if (b17 != null) {
                ((qv.y) ((rv.b3) i95.n0.c(rv.b3.class))).getClass();
                c21522xf5a6e956.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                c21522xf5a6e956.m79178xd0b5cd2c(null);
            }
        } else {
            c21522xf5a6e956.m79178xd0b5cd2c(null);
        }
        java.lang.String p17 = zl2.q4.f555466a.p(z3Var.d1(), z3Var.P0(), false);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(context, textView, p17, z3Var.Q0(), z3Var.G0(), (int) textView.getTextSize());
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, p17, textSize));
        }
        if (!item.f210439i) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.bde);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.bde);
        if (textView3 != null) {
            textView3.setText(item.f210441n);
            textView3.setVisibility(0);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool)) {
                textView3.setBackgroundColor(android.graphics.Color.parseColor("#0DFFFFFF"));
                textView3.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
            }
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
