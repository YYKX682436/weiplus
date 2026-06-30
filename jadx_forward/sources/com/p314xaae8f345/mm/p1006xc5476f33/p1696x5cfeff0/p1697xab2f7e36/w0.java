package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd f218722d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd) {
        this.f218722d = viewOnClickListenerC15534xde6dcfdd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd = this.f218722d;
        viewOnClickListenerC15534xde6dcfdd.Z6(i65.a.d(viewOnClickListenerC15534xde6dcfdd.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_youtusdk_switch, false) && viewOnClickListenerC15534xde6dcfdd.f218635d.getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionUI", "showFailedLayout [%s]FaceFlashActivity showFailedLayout, has shown");
            return;
        }
        viewOnClickListenerC15534xde6dcfdd.f218635d.setVisibility(8);
        if (wz2.a.f()) {
            viewOnClickListenerC15534xde6dcfdd.b7("fail");
        } else {
            viewOnClickListenerC15534xde6dcfdd.f218636e.setVisibility(0);
        }
        viewOnClickListenerC15534xde6dcfdd.f218636e.m63479xdfe966c7(viewOnClickListenerC15534xde6dcfdd.f218635d.m63477x6c781953());
        viewOnClickListenerC15534xde6dcfdd.f218636e.f218631p = viewOnClickListenerC15534xde6dcfdd.f218635d.f218600f.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 c15533x22cea970 = viewOnClickListenerC15534xde6dcfdd.f218636e;
        java.lang.String str = viewOnClickListenerC15534xde6dcfdd.f218639h;
        int height = viewOnClickListenerC15534xde6dcfdd.m78513xc2a54588().getHeight();
        c15533x22cea970.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionProcessLayout", "showFailedAnimation");
        try {
            if (c15533x22cea970.f218631p) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218629n.getLayoutParams();
                layoutParams.removeRule(3);
                int p17 = height - com.p314xaae8f345.mm.ui.bk.p(c15533x22cea970.getContext());
                int i17 = (int) c15533x22cea970.f218630o;
                double d17 = p17 * 0.5d;
                if (i17 > d17) {
                    layoutParams.topMargin = ((int) d17) - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100);
                } else {
                    layoutParams.topMargin = i17 - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100);
                }
                c15533x22cea970.f218629n.setLayoutParams(layoutParams);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218629n.getLayoutParams();
                layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.dnt);
                layoutParams2.topMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 48);
                c15533x22cea970.f218629n.setLayoutParams(layoutParams2);
            }
            c15533x22cea970.f218625g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562964t6);
            c15533x22cea970.f218625g.startAnimation(c15533x22cea970.f218632q);
            c15533x22cea970.f218624f.setImageDrawable(i65.a.i(c15533x22cea970.getContext(), com.p314xaae8f345.mm.R.raw.f79724xeb42fc43));
            c15533x22cea970.f218624f.startAnimation(c15533x22cea970.f218634s);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            c15533x22cea970.f218623e.setText(wz2.a.b(jSONObject, i65.a.r(c15533x22cea970.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c6l)));
            java.lang.String optString = jSONObject.optString("otherVerifyTitle");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionProcessLayout", "otherVerifyTitle is :%s", optString);
            if (android.text.TextUtils.isEmpty(optString)) {
                c15533x22cea970.f218627i.setVisibility(4);
                c15533x22cea970.f218626h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562978td);
                c15533x22cea970.f218626h.setTextColor(c15533x22cea970.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560481lo));
            } else {
                c15533x22cea970.f218626h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.t_);
                c15533x22cea970.f218626h.setTextColor(c15533x22cea970.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560475li));
                c15533x22cea970.f218627i.setVisibility(0);
                c15533x22cea970.f218627i.setText(optString);
                c15533x22cea970.f218627i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.c0(c15533x22cea970, jSONObject));
            }
            java.lang.String optString2 = jSONObject.optString("err_feedback", "");
            c15533x22cea970.f218628m.setVisibility(android.text.TextUtils.isEmpty(optString2) ? 4 : 0);
            com.p314xaae8f345.mm.ui.bk.r0(c15533x22cea970.f218628m.getPaint(), 0.8f);
            java.lang.String string = c15533x22cea970.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6s);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new l72.c0(string, c15533x22cea970.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), c15533x22cea970.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.d0(c15533x22cea970, jSONObject, optString2)), 0, spannableString.length(), 17);
            c15533x22cea970.f218628m.setClickable(true);
            android.widget.TextView textView = c15533x22cea970.f218628m;
            le0.u uVar = (le0.u) i95.n0.c(le0.u.class);
            c15533x22cea970.getContext();
            ((ke0.e) uVar).getClass();
            textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
            c15533x22cea970.f218628m.setText(spannableString);
            boolean z17 = jSONObject.optInt("err_retry", 1) == 1;
            c15533x22cea970.f218626h.setVisibility(0);
            c15533x22cea970.f218626h.setText(z17 ? i65.a.r(c15533x22cea970.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7v) : i65.a.r(c15533x22cea970.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7r));
            c15533x22cea970.f218626h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.e0(c15533x22cea970, z17, jSONObject, optString));
            if (c15533x22cea970.f218627i.getVisibility() == 0 && c15533x22cea970.f218628m.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218627i.getLayoutParams();
                layoutParams3.bottomMargin = i65.a.b(c15533x22cea970.getContext(), 108);
                c15533x22cea970.f218627i.setLayoutParams(layoutParams3);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218626h.getLayoutParams();
                layoutParams4.removeRule(12);
                layoutParams4.addRule(2, com.p314xaae8f345.mm.R.id.dnk);
                layoutParams4.bottomMargin = i65.a.b(c15533x22cea970.getContext(), 16);
                c15533x22cea970.f218626h.setLayoutParams(layoutParams4);
            }
            if (c15533x22cea970.f218627i.getVisibility() != 0 && c15533x22cea970.f218628m.getVisibility() != 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218626h.getLayoutParams();
                layoutParams5.addRule(12);
                layoutParams5.removeRule(2);
                layoutParams5.bottomMargin = i65.a.b(c15533x22cea970.getContext(), 96);
                c15533x22cea970.f218626h.setLayoutParams(layoutParams5);
            }
            if (c15533x22cea970.f218627i.getVisibility() == 0 && c15533x22cea970.f218628m.getVisibility() != 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218627i.getLayoutParams();
                layoutParams6.bottomMargin = i65.a.b(c15533x22cea970.getContext(), 96);
                c15533x22cea970.f218627i.setLayoutParams(layoutParams6);
                android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218626h.getLayoutParams();
                layoutParams7.removeRule(12);
                layoutParams7.addRule(2, com.p314xaae8f345.mm.R.id.dnk);
                layoutParams7.bottomMargin = i65.a.b(c15533x22cea970.getContext(), 16);
                c15533x22cea970.f218626h.setLayoutParams(layoutParams7);
            }
            if (c15533x22cea970.f218627i.getVisibility() != 0 && c15533x22cea970.f218628m.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) c15533x22cea970.f218626h.getLayoutParams();
                layoutParams8.addRule(12);
                layoutParams8.removeRule(2);
                layoutParams8.bottomMargin = i65.a.b(c15533x22cea970.getContext(), 108);
                c15533x22cea970.f218626h.setLayoutParams(layoutParams8);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "parse face failed result error.%s", str);
            c15533x22cea970.f218623e.setText(str);
            c15533x22cea970.f218628m.setVisibility(4);
            c15533x22cea970.f218626h.setVisibility(0);
            c15533x22cea970.f218626h.setText(i65.a.r(c15533x22cea970.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7v));
            c15533x22cea970.f218626h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.f0(c15533x22cea970));
        }
        java.lang.String str2 = viewOnClickListenerC15534xde6dcfdd.f218639h;
        try {
            vz2.c.h(new org.json.JSONObject(str2).optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 1));
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "parse face fail result error.%s", str2);
        }
    }
}
