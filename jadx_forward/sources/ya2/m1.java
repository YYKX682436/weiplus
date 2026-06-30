package ya2;

/* loaded from: classes10.dex */
public final class m1 implements zy2.tb {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.m1 f542044a = new ya2.m1();

    public final bw5.bu b(r45.nw6 nw6Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17;
        java.util.LinkedList<r45.ow6> m75941xfb821914;
        java.lang.String U = g92.b.f351302e.U();
        bw5.bu buVar = new bw5.bu();
        if (U.length() == 0) {
            return buVar;
        }
        bw5.ae aeVar = new bw5.ae();
        if (nw6Var == null || (i17 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0)) == null) {
            ya2.b2 b17 = ya2.h.f542017a.b(U);
            i17 = b17 != null ? ya2.d.i(b17) : null;
        }
        aeVar.mo11468x92b714fd(i17 != null ? i17.mo14344x5f01b1f6() : null);
        buVar.f107378d = aeVar;
        boolean[] zArr = buVar.f107381g;
        zArr[1] = true;
        l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int Bi = ((k40.f) eVar).Bi(context, U);
        buVar.f107379e = Bi == 2 || Bi == 3;
        zArr[2] = true;
        if (nw6Var != null && (m75941xfb821914 = nw6Var.m75941xfb821914(6)) != null) {
            for (r45.ow6 ow6Var : m75941xfb821914) {
                java.util.LinkedList linkedList = buVar.f107380f;
                bw5.au auVar = new bw5.au();
                auVar.f106967d = ow6Var.m75945x2fec8307(0);
                boolean[] zArr2 = auVar.f106971h;
                zArr2[1] = true;
                auVar.f106968e = ow6Var.m75939xb282bd08(1);
                zArr2[2] = true;
                auVar.f106969f = ow6Var.m75945x2fec8307(2);
                zArr2[3] = true;
                auVar.f106970g = ow6Var.m75939xb282bd08(3);
                zArr2[4] = true;
                linkedList.add(auVar);
            }
        }
        return buVar;
    }

    public void c(android.widget.ImageView view, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.graphics.drawable.Drawable drawable = view.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(null);
        }
        int m76027x1cbb0791 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76027x1cbb0791() : 0;
        java.lang.String m76028x11716638 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76028x11716638() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderUserApi", "[setAuthIcon] authType:" + m76027x1cbb0791 + " authIconUrl:" + m76028x11716638);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (m76027x1cbb0791 == 1) {
            view.setVisibility(0);
            if (!(m76028x11716638 == null || m76028x11716638.length() == 0)) {
                g1Var.e().c(new mn2.q3(m76028x11716638, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), view, g1Var.h(mn2.f1.B));
                return;
            } else if (i17 == 0) {
                view.setImageResource(com.p314xaae8f345.mm.R.raw.f79912xe883d012);
                return;
            } else {
                view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79909x77ca9e41, i65.a.d(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a0m)));
                return;
            }
        }
        if (m76027x1cbb0791 != 2) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (!(m76028x11716638 == null || m76028x11716638.length() == 0)) {
            g1Var.e().c(new mn2.q3(m76028x11716638, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), view, g1Var.h(mn2.f1.B));
        } else if (i17 == 0) {
            view.setImageResource(com.p314xaae8f345.mm.R.raw.f79911x8d68c0f4);
        } else {
            view.setImageResource(com.p314xaae8f345.mm.R.raw.f79910x4f27281f);
        }
    }

    public void d(android.widget.TextView nickNameView, int i17, android.widget.ImageView authIconView, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickNameView, "nickNameView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authIconView, "authIconView");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
        c19780xceb4c4dc.m76038x5304029d(i18);
        c19780xceb4c4dc.m76039xa7d6d9ac(str);
        zy2.tb.a(this, authIconView, c19780xceb4c4dc, 0, 4, null);
        android.view.ViewGroup.LayoutParams layoutParams = nickNameView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        if (i18 == 1 || i18 == 2) {
            marginLayoutParams.setMarginEnd(i17);
        } else {
            marginLayoutParams.setMarginEnd(0);
        }
        nickNameView.setLayoutParams(marginLayoutParams);
    }
}
