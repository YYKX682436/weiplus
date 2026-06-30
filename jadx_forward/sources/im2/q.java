package im2;

/* loaded from: classes3.dex */
public final class q extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.atp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.cz1 cz1Var;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        abstractActivityC21394xb3d2c0cf.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.dxr);
        abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new im2.o(abstractActivityC21394xb3d2c0cf));
        java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("KEY_LIVE_ANCHOR_USERNAME");
        byte[] byteArrayExtra = m158354x19263085().getIntent().getByteArrayExtra("KEY_LOTTERY_HISTORY_INFO");
        jz5.f0 f0Var = null;
        if (byteArrayExtra != null) {
            r45.cz1 cz1Var2 = new r45.cz1();
            try {
                cz1Var2.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryDetailUIC", "onCreate: lottery info parse errpr", th6);
                cz1Var2 = null;
            }
            cz1Var = cz1Var2;
        } else {
            cz1Var = null;
        }
        long longExtra = m158354x19263085().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        if (cz1Var != null) {
            ya2.b2 b17 = ya2.h.f542017a.b(stringExtra);
            java.lang.String string = m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (b17 != null) {
                string = string + (char) 183 + b17.w0();
            }
            ((android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.irg)).setText(string);
            java.lang.String m75945x2fec8307 = cz1Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.irb);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.irb);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ird)).setText(cz1Var.m75945x2fec8307(4));
            android.widget.TextView textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.irq);
            if (textView != null) {
                on2.l3.f428499a.f(textView);
            }
            ((android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.irf)).setText(zl2.r4.f555483a.H0((r45.xy1) cz1Var.m75936x14adae67(5)));
            ((android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.irc)).setText(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqi, java.lang.Integer.valueOf(cz1Var.m75939xb282bd08(6))));
            ((android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ire)).setText(k35.m1.d("yyyy-MM-dd HH:mm", cz1Var.m75939xb282bd08(2)));
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zy2.ra Sj = ((c61.p2) ybVar).Sj((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852);
            r45.qt2 V6 = Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206761g;
            kVar.c(xy2.c.e(m80379x76847179()), "", stringExtra == null ? "" : stringExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k.b(kVar, V6, 4L, null, 4, null);
            m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f567258is4).setOnClickListener(new im2.p(this, cz1Var, longExtra, V6, stringExtra));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            m158354x19263085().finish();
        }
    }
}
