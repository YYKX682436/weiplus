package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xy implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az f196667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.x f196668b;

    public xy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az azVar, cm2.x xVar) {
        this.f196667a = azVar;
        this.f196668b = xVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az azVar = this.f196667a;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = azVar.f193487o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = azVar.f193486n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        cm2.x xVar = this.f196668b;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ((r45.zs1) fVar.f152151d).m75934xbce7f2f(1);
            if (m75934xbce7f2f == null) {
                return null;
            }
            r45.b52 b52Var = new r45.b52();
            b52Var.mo11468x92b714fd(m75934xbce7f2f.g());
            xVar.getClass();
            xVar.f124940v = b52Var;
            ((mm2.f6) azVar.f193480e.a(mm2.f6.class)).c7(xVar);
            java.lang.String m75945x2fec8307 = ((r45.zs1) fVar.f152151d).m75945x2fec8307(2);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                ae2.in inVar = ae2.in.f85221a;
                if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85407s5).mo141623x754a37bb()).r()).booleanValue()) {
                    java.lang.String m75945x2fec83072 = xVar.f124940v.m75945x2fec8307(3);
                    if (m75945x2fec83072 == null) {
                        return null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az.a(azVar, m75945x2fec83072);
                }
            }
            android.content.Context context = azVar.f193479d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
            y1Var.i(true);
            y1Var.m(java.lang.Boolean.TRUE);
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dan, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
            android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.fbn);
            android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.fbm);
            ae2.in inVar2 = ae2.in.f85221a;
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85407s5).mo141623x754a37bb()).r()).booleanValue()) {
                textView.setText("这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案");
            } else {
                textView.setText(((r45.zs1) fVar.f152151d).m75945x2fec8307(2));
            }
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wy(xVar, y1Var, azVar));
            y1Var.k(c22646x1e9ca55);
            y1Var.s();
        } else {
            java.lang.String m75945x2fec83073 = xVar.f124940v.m75945x2fec8307(3);
            if (m75945x2fec83073 == null) {
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.az.a(azVar, m75945x2fec83073);
        }
        return f0Var;
    }
}
