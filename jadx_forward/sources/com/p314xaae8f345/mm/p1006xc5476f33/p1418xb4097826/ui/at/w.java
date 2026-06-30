package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class w extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f210448e;

    public w(java.lang.Boolean bool) {
        this.f210448e = bool;
    }

    @Override // in5.r
    public int e() {
        return i65.a.D(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7 : com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.mie);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cut);
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.d1g);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f210448e, java.lang.Boolean.TRUE)) {
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            textView2.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
            findViewById.setBackgroundDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563070vy));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f210435e;
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        if (d17.length() > 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, z3Var.d1(), 0.1f);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        }
        checkBox.setVisibility(8);
        p13.y yVar = item.f210437g;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d18 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        java.lang.CharSequence bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.f(d18, ""), i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        java.lang.CharSequence charSequence = null;
        if (yVar != null) {
            int i19 = yVar.f432718c;
            if (i19 == 1) {
                p13.i iVar = new p13.i();
                iVar.f432626a = bj6;
                iVar.f432627b = item.f210438h;
                iVar.f432628c = false;
                iVar.f432629d = false;
                iVar.f432633h = textView2.getPaint();
                bj6 = o13.q.e(iVar).f432638a;
            } else if (i19 == 15) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = yVar.f432723h;
                float textSize = textView2.getPaint().getTextSize();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize);
                p13.i iVar2 = new p13.i();
                iVar2.f432626a = j17;
                iVar2.f432627b = item.f210438h;
                iVar2.f432628c = false;
                iVar2.f432629d = false;
                iVar2.f432633h = textView2.getPaint();
                charSequence = o13.q.e(iVar2).f432638a;
            }
        }
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(bj6, textView);
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView2);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
