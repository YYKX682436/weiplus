package tw2;

/* loaded from: classes2.dex */
public class h extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public int f504005g;

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 10003) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ech, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return inflate;
        }
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2h, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return inflate2;
    }

    public final void I(eb5.e eVar, r45.mb4 mb4Var, android.widget.ImageView imageView) {
        if (eVar.p(com.p314xaae8f345.mm.R.id.tbn) != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M0).mo141623x754a37bb()).r()).booleanValue()) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                imageView.setLayoutParams(layoutParams2);
                layoutParams2.gravity = 17;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            } else if (this.f504005g <= 0 || mb4Var.m75938x746dc8a6(4) <= 0.0f) {
                android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                imageView.setLayoutParams(layoutParams3);
                layoutParams3.gravity = 17;
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            } else {
                android.content.Context context = eVar.f3639x46306858.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    jz5.l a17 = hc2.f1.a(activity, mb4Var.m75938x746dc8a6(5) / mb4Var.m75938x746dc8a6(4), this.f504005g, "", 0L, 0, 0, 32, null);
                    jz5.l lVar = (jz5.l) a17.f384367e;
                    android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(((java.lang.Number) lVar.f384366d).intValue(), ((java.lang.Number) lVar.f384367e).intValue());
                    jz5.o oVar = (jz5.o) a17.f384366d;
                    layoutParams4.gravity = ((java.lang.Number) oVar.f384376f).intValue();
                    layoutParams4.topMargin = ((java.lang.Number) oVar.f384374d).intValue();
                    layoutParams4.bottomMargin = ((java.lang.Number) oVar.f384375e).intValue();
                    imageView.setLayoutParams(layoutParams4);
                } else {
                    android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    imageView.setLayoutParams(layoutParams5);
                    layoutParams5.gravity = 17;
                }
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        eVar.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.teh, 0L);
        eVar.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tei, "");
        wo0.c a18 = e17.a(new mn2.u0(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null));
        a18.f529407e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J1).mo141623x754a37bb()).r()).intValue() > 0 ? new ap0.g(null, null, 3, null) : null;
        a18.g(g1Var.h(mn2.f1.f411487e));
        a18.f529406d = new tw2.g(eVar, mb4Var);
        a18.c(imageView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M1().r()).booleanValue() && ((r45.mb4) this.f332454d.get(i17)).m75939xb282bd08(2) == 2) {
            if (((r45.a42) ((r45.mb4) this.f332454d.get(i17)).m75936x14adae67(67)) != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
            }
            return 2;
        }
        return ((r45.mb4) this.f332454d.get(i17)).m75939xb282bd08(2);
    }

    @Override // eb5.d, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        eb5.e holder = (eb5.e) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo864xe5e2e48d(holder, i17);
        holder.f374658i = x(i17);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        if (mo863xcdaf1228 == 2 || mo863xcdaf1228 == 7) {
            r45.mb4 mb4Var = (r45.mb4) x(i17);
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mb4Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            I(holder, mb4Var, imageView);
            return;
        }
        if (mo863xcdaf1228 != 10003) {
            return;
        }
        r45.mb4 mb4Var2 = (r45.mb4) x(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a c15402xc40c224a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a) holder.p(com.p314xaae8f345.mm.R.id.tbn);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_j);
        r45.a42 a42Var = (r45.a42) mb4Var2.m75936x14adae67(67);
        if (c15402xc40c224a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M0).mo141623x754a37bb()).r()).booleanValue() || this.f504005g <= 0 || a42Var == null || a42Var.m75938x746dc8a6(1) <= 0.0f || a42Var.m75938x746dc8a6(2) <= 0.0f) {
                c15402xc40c224a.T();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15402xc40c224a.P(c15402xc40c224a, a42Var.m75938x746dc8a6(1), a42Var.m75938x746dc8a6(2), this.f504005g, 0L, 8, null);
            }
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209452rf).mo141623x754a37bb()).r()).booleanValue()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            I(holder, mb4Var2, imageView2);
        }
    }
}
