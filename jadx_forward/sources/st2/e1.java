package st2;

/* loaded from: classes3.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dv1 f493806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r45.dv1 dv1Var, st2.h1 h1Var) {
        super(0);
        this.f493806d = dv1Var;
        this.f493807e = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        r45.wv2 wv2Var = (r45.wv2) this.f493806d.m75936x14adae67(23);
        boolean z17 = false;
        st2.h1 h1Var = this.f493807e;
        if (wv2Var != null) {
            ut2.j5 k17 = h1Var.k();
            java.lang.String str = "finder_live_order_unpaid_tips_prefix_" + wv2Var.m75945x2fec8307(3);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("finder_live_order_unpaid_tips_mmkv");
            long j18 = M.getLong(str, -1L);
            long c17 = c01.id.c();
            java.lang.String str2 = k17.f512473h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "try show bubble, last shown time = " + j18);
            if (j18 < 0) {
                gk2.e eVar = k17.f512471f;
                if (((mm2.f6) eVar.a(mm2.f6.class)).f410588y1) {
                    ((mm2.f6) eVar.a(mm2.f6.class)).Y6(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "try show bubble, but ignored");
                } else {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var2 = k17.E;
                    if (r2Var2 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                    }
                    xt2.n nVar = k17.C;
                    if (nVar != null) {
                        nVar.dismiss();
                    }
                    p3325xe03a0797.p3326xc267989b.y0 y0Var = k17.f512472g;
                    if (y0Var != null) {
                        j17 = c17;
                        r2Var = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ut2.h5(M, str, c17, k17, wv2Var, null), 3, null);
                    } else {
                        j17 = c17;
                        r2Var = null;
                    }
                    k17.E = r2Var;
                }
            } else {
                j17 = c17;
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ut2.i5(M, j17, null), 2, null);
        }
        ut2.j5 k18 = h1Var.k();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FLASH_SALE_TIPS_SHOWN_BOOLEAN_SYNC;
        boolean o17 = c18.o(u3Var, false);
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85398r6).mo141623x754a37bb()).r()).intValue() == 1;
        r45.k31 k31Var = ((mm2.f6) k18.f512471f.a(mm2.f6.class)).W;
        if (k31Var != null && k31Var.m75939xb282bd08(0) == 1) {
            z17 = true;
        }
        if ((z17 && !o17) || z18) {
            xt2.n nVar2 = k18.D;
            if (nVar2 != null) {
                nVar2.dismiss();
            }
            android.view.ViewGroup viewGroup = k18.f512470e;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xt2.n nVar3 = new xt2.n(context);
            android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
            textView.setTextColor(viewGroup.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView.setText(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lr9));
            textView.setTextSize(1, 14.0f);
            android.view.ViewGroup viewGroup2 = nVar3.f538430e;
            viewGroup2.removeAllViews();
            viewGroup2.addView(textView);
            k18.D = nVar3;
            android.view.View view = k18.f512469d.F;
            if (view != null) {
                nVar3.a(view);
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f384359a;
    }
}
