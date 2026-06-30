package fk1;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344818e;

    public o(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344817d = i17;
        this.f344818e = activityC12732x6baffca6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("app_brand_game_record_education_flag_");
        int i17 = this.f344817d;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        boolean i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i(sb7, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: scene " + i17 + " is shown education " + i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        int i19 = i18 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f569567ez : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569566ey;
        long j17 = 2;
        if (i17 == 1) {
            h0Var.f391656d = "{\"sharetype\": 1}";
        } else if (i17 != 2) {
            j17 = i17 != 3 ? 1000L : 1L;
        } else {
            h0Var.f391656d = "{\"sharetype\": 2}";
        }
        long j18 = j17;
        if (!i18 || i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344818e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC12732x6baffca6, 2, 0);
            jz5.f0 f0Var2 = null;
            android.view.View inflate = android.view.LayoutInflater.from(activityC12732x6baffca6).inflate(i19, (android.view.ViewGroup) null);
            java.lang.String string = (i17 == 1 || i17 == 2) ? activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1s) : i17 != 3 ? null : i18 ? activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1t) : activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1u);
            java.lang.String string2 = i17 == 3 ? i18 ? activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1q) : activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1r) : null;
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d9t);
            jz5.f0 f0Var3 = jz5.f0.f384359a;
            if (string != null) {
                textView.setText(string);
                textView.setVisibility(0);
                f0Var = f0Var3;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d9n);
            if (string2 != null) {
                textView2.setText(string2);
                textView2.setVisibility(0);
                f0Var2 = f0Var3;
            }
            if (f0Var2 == null) {
                textView2.setVisibility(8);
            }
            z2Var.j(inflate);
            z2Var.y(activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var.x(1);
            z2Var.F = new fk1.n(activityC12732x6baffca6, j18, h0Var, z2Var);
            z2Var.u(activityC12732x6baffca6.W6(i19));
            z2Var.C();
            activityC12732x6baffca6.Z6(602L, j18, 1, 1, (java.lang.String) h0Var.f391656d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G(sb7, true);
        }
    }
}
