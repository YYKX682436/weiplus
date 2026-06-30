package zw1;

/* loaded from: classes8.dex */
public final class n2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.uk4 f558269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(r45.uk4 r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw1.n2.O6(r45.uk4):void");
    }

    public final android.widget.LinearLayout P6() {
        return (android.widget.LinearLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565328c23);
    }

    public final void Q6(int i17, ww1.b3 b3Var, android.widget.RelativeLayout relativeLayout, r45.nn nnVar) {
        android.view.View view;
        if (P6() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh] mBottomEntranceContainer == null");
            return;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pay_qrcode_bottom_entrance_close, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[needClose] switch：" + fj6);
        if (fj6) {
            android.widget.LinearLayout P6 = P6();
            if (P6 == null) {
                return;
            }
            P6.setVisibility(8);
            return;
        }
        if (nnVar == null || !nnVar.f463054d || nnVar.f463055e == null) {
            android.widget.LinearLayout P62 = P6();
            if (P62 != null) {
                P62.setVisibility(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh] bottomEntrance == null || !bottomEntrance.need_show || bottomEntrance.click_item_info == null");
            return;
        }
        android.widget.LinearLayout P63 = P6();
        android.view.ViewGroup.LayoutParams layoutParams = P63 != null ? P63.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            android.widget.LinearLayout P64 = P6();
            if (P64 != null) {
                P64.setVisibility(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh] lp == null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh] do refresh");
        android.widget.LinearLayout P65 = P6();
        float b17 = i65.a.b(m80379x76847179(), 8);
        if (P65 != null) {
            P65.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (P65 != null) {
            P65.setClipToOutline(true);
        }
        if ((b3Var == null || (view = b3Var.f531654a) == null || view.getVisibility() != 0) ? false : true) {
            layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.c4l);
        } else {
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.c4g);
            } else {
                layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.c4m);
            }
        }
        android.widget.LinearLayout P66 = P6();
        if (P66 != null) {
            P66.setLayoutParams(layoutParams2);
        }
        android.widget.LinearLayout P67 = P6();
        if (P67 != null) {
            P67.setVisibility(0);
        }
        int b18 = i65.a.b(m80379x76847179(), 16);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565329c24);
        if (c19659x677e0913 != null) {
            c19659x677e0913.b(nnVar.f463056f, b18, b18, -1);
        }
        r45.uk4 uk4Var = nnVar.f463055e;
        this.f558269d = uk4Var;
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565335c26);
        if (textView != null) {
            textView.setText(uk4Var != null ? uk4Var.f468965e : null);
        }
        O6(uk4Var);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565330c25);
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new zw1.m2(uk4Var, this, i17));
        }
    }
}
