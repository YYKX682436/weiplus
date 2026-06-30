package pk2;

/* loaded from: classes3.dex */
public final class i2 {
    public i2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, r45.j32 j32Var, java.lang.String source, r45.c32 c32Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.y2 y2Var = ml2.y2.f409798u;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put("pos", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "showNoticeListWidget") ? 2 : 1);
        ((ml2.j0) zbVar).Ij(y2Var, jSONObject.toString(), "", pk2.l2.f437472n);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var, null, null, new pk2.c2(context, source, z17, j32Var, c32Var, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r25, java.lang.String r26, java.lang.String r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.i2.b(android.content.Context, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, r45.j32 j32Var, r45.c32 c32Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.y2 y2Var = ml2.y2.f409798u;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("pos", 1);
        ((ml2.j0) zbVar).Ij(y2Var, jSONObject.toString(), "", pk2.l2.f437472n);
        int i17 = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqr, (android.view.ViewGroup) null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMoreLiveNoticeOption", "onItemClicked: show empty dialog, peekHeight=" + i17);
        if (zl2.r4.f555483a.Y1(context)) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.b(context)));
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.rhl);
            if (findViewById != null) {
                com.p314xaae8f345.mm.ui.kk.f(findViewById, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
            }
        } else {
            if (i17 <= 0) {
                i17 = -1;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i17));
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.rhl);
            if (findViewById2 != null) {
                com.p314xaae8f345.mm.ui.kk.f(findViewById2, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.by));
            }
        }
        e3Var.a();
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.rhl);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new pk2.g2(context, j32Var, c32Var, z17, e3Var));
        }
        e3Var.c(true);
        e3Var.i();
    }

    public final void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, r45.j32 j32Var, r45.c32 c32Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        pk2.l2.f437472n = valueOf;
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.y2 y2Var = ml2.y2.f409798u;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("pos", 2);
        ((ml2.j0) zbVar).Ij(y2Var, jSONObject.toString(), "", pk2.l2.f437472n);
        i95.m c17 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.ic T6 = vd2.i5.T6((vd2.i5) c17, xy2.c.e(context), context, true, new r45.qt2(), 0, 16, null);
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573234mm1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        pk2.h2 h2Var = new pk2.h2(context, j32Var, c32Var, z17, T6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) T6;
        s4Var.f206304y = true;
        s4Var.f206305z = string;
        s4Var.A = h2Var;
        s4Var.F = true;
        java.lang.String str = pk2.l2.f437472n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        s4Var.E = str;
        zy2.ic.a(T6, j32Var, null, false, null, 0, 0, c32Var, 62, null);
    }

    public final void e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, r45.j32 j32Var, r45.c32 c32Var, boolean z17) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size()) <= 0) {
            if ((c32Var != null ? c32Var.m75939xb282bd08(0) : 0) == 0) {
                java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
                pk2.l2.f437472n = valueOf;
                zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.y2 y2Var = ml2.y2.f409798u;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put("pos", 1);
                ((ml2.j0) zbVar).Ij(y2Var, jSONObject.toString(), "", pk2.l2.f437472n);
                c(context, j32Var, c32Var, z17);
                return;
            }
        }
        d(context, j32Var, c32Var, z17);
    }
}
