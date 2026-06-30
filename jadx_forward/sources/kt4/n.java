package kt4;

/* loaded from: classes9.dex */
public class n extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f393576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt4.r f393577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kt4.r rVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f393577d = rVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        r45.od odVar = (r45.od) objArr[0];
        kt4.r rVar = this.f393577d;
        java.lang.String string = rVar.f295334c.getString("key_req_serial", "");
        if (odVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "empty bank item");
            return false;
        }
        np5.b0 b0Var = this.f420367b;
        b0Var.c(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
        java.lang.String format = java.lang.String.format("%s %s(%s)", odVar.f463687d, odVar.f463689f, odVar.f463691h);
        rVar.f295334c.putInt("key_verify_scene", 1);
        b0Var.d(new jt4.h(kt4.r.F(rVar), string, odVar.f463692i, odVar.f463690g, odVar.f463688e, rVar.G(), true, false, 1, format), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof jt4.h)) {
            return false;
        }
        this.f420367b.i(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
        jt4.h hVar = (jt4.h) m1Var;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 == 0 && i18 == 0) {
            r45.qz4 qz4Var = hVar.f383184f;
            if (qz4Var.f465899d == 0) {
                if (qz4Var.f465906n != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "show input alert");
                    r45.wz3 wz3Var = hVar.f383184f.f465906n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f393576c;
                    if (j0Var == null) {
                        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570252a52, null);
                        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.dg7);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dg8);
                        textView.setClickable(true);
                        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(abstractActivityC21394xb3d2c0cf));
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wz3Var.f471129e)) {
                            editText.setHint(hVar.f383184f.f465906n.f471129e);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                        aVar.f293242a = hVar.f383184f.f465906n.f471128d;
                        aVar.P = 4;
                        aVar.L = inflate;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wz3Var.f471133i)) {
                            aVar.f293265v = wz3Var.f471133i;
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wz3Var.f471132h)) {
                            aVar.f293266w = wz3Var.f471132h;
                        }
                        aVar.E = new kt4.l(this, editText, hVar, textView);
                        aVar.Z = false;
                        aVar.A = false;
                        aVar.H = new kt4.m(this);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                        j0Var2.e(aVar);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                        if (d0Var != null) {
                            d0Var.a(j0Var2.f293370r);
                        }
                        this.f393576c = j0Var2;
                        g(wz3Var, textView);
                        this.f393576c.show();
                    } else {
                        g(wz3Var, (android.widget.TextView) j0Var.findViewById(com.p314xaae8f345.mm.R.id.dg8));
                    }
                } else {
                    kt4.r rVar = this.f393577d;
                    rVar.f295334c.putInt("key_select_card_action", 1);
                    rVar.f295334c.putString("key_bind_card_no", hVar.f383185g);
                    rVar.f295334c.putString("key_bind_mobile_no", hVar.f383186h);
                    rVar.f295334c.putString("key_bind_bank_type", hVar.f383187i);
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (hVar.f383184f.f465905m != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "no need verify sms");
                        bundle.putBoolean("key_need_verify_sms", false);
                        try {
                            rVar.f295334c.putByteArray("key_open_card_finish_title", hVar.f383184f.f465905m.mo14344x5f01b1f6());
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "need verfiy sms");
                        bundle.putBoolean("key_need_verify_sms", true);
                        bundle.putString("key_open_card_bind_token", hVar.f383184f.f465902g);
                        bundle.putString("key_open_card_verify_msg_desc", hVar.f383184f.f465903h);
                    }
                    rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
                }
            } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, qz4Var.f465904i)) {
                int i19 = hVar.f383188m;
                java.lang.String str2 = hVar.f383189n;
                r45.qz4 qz4Var2 = hVar.f383184f;
                if (!jt4.f.b((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, hVar, i19, str2, qz4Var2.f465899d, qz4Var2.f465900e)) {
                    db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, hVar.f383184f.f465900e, hVar.f383189n, str), "", false);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", hVar);
            db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false);
        }
        return true;
    }

    public final void g(r45.wz3 wz3Var, android.widget.TextView textView) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        r45.td0 td0Var = wz3Var.f471130f;
        if (td0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(td0Var.f467852d)) {
            spannableStringBuilder.append((java.lang.CharSequence) wz3Var.f471130f.f467852d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wz3Var.f471130f.f467853e)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(wz3Var.f471130f.f467853e, false)), 0, spannableStringBuilder.length(), 18);
            }
        }
        r45.td0 td0Var2 = wz3Var.f471131g;
        if (td0Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(td0Var2.f467852d)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) wz3Var.f471131g.f467852d);
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(wz3Var.f471131g.f467853e, new kt4.k(this)), length, spannableStringBuilder.length(), 18);
        }
        textView.setText(spannableStringBuilder);
    }
}
