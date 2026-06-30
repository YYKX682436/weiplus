package qh4;

/* loaded from: classes8.dex */
public final class a extends ph4.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph4.f callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // ph4.j
    public int a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return com.p314xaae8f345.mm.R.C30861xcebc809e.f563693cg1;
    }

    @Override // ph4.j
    public java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571856rs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        r45.yj4 yj4Var = new r45.yj4();
        try {
            yj4Var.mo11468x92b714fd(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) viewModel.f400257d).get(i17)).f66790x225a93cf);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TaskBarSectionOtherViewVideoHelper", "MegaVideoFloatBallInfo parse fail", th6);
        }
        if (yj4Var.m75941xfb821914(6).isEmpty()) {
            return;
        }
        android.content.Context context = viewHolder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) yj4Var.m75941xfb821914(6).get(0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        java.lang.CharSequence m76184x8010e5e4 = m76760x76845fea != null ? m76760x76845fea.m76184x8010e5e4() : null;
        if (m76184x8010e5e4 == null) {
            m76184x8010e5e4 = new android.text.SpannableString("");
        }
        if (m76184x8010e5e4.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = ((java.lang.Object) m76184x8010e5e4) + i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571857rt);
            ((ke0.e) xVar).getClass();
            m76184x8010e5e4 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
        }
        viewHolder.f435996f.setText(m76184x8010e5e4);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
        java.lang.String m76585x66e287ae = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76585x66e287ae() : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m76585x66e287ae == null) {
            m76585x66e287ae = "";
        }
        java.lang.String m76587x815afa6b = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76587x815afa6b() : null;
        if (m76587x815afa6b == null) {
            m76587x815afa6b = "";
        }
        java.lang.String concat = m76585x66e287ae.concat(m76587x815afa6b);
        java.lang.String m76623xd93f812f = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76623xd93f812f() : null;
        if (m76623xd93f812f == null) {
            m76623xd93f812f = "";
        }
        java.lang.String m76624x4c9b7dca = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76624x4c9b7dca() : null;
        java.lang.String concat2 = m76623xd93f812f.concat(m76624x4c9b7dca != null ? m76624x4c9b7dca : "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            concat = concat2;
        }
        android.widget.ImageView imageView = viewHolder.f435995e;
        imageView.setImageBitmap(null);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        wo0.c a17 = e17.a(ya2.l.f542035a.e(concat, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
        a17.f529407e = new ap0.g(null, null, 3, null);
        a17.g(g1Var.h(mn2.f1.f411486d));
        a17.c(imageView);
        viewHolder.f436001n.setVisibility(0);
    }
}
