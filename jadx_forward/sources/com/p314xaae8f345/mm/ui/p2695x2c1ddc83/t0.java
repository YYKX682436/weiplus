package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class t0 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.HashMap f289604J;
    public final java.util.List K;

    public t0(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, y9Var);
        new android.graphics.Paint();
        this.f289604J = new java.util.HashMap();
        this.K = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public java.lang.String B() {
        return ".conbox";
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        s(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).s(1, null, "conversationboxservice", -1));
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void v(java.lang.String str, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var) {
        int dimensionPixelOffset;
        float f17;
        float f18;
        float f19;
        java.lang.CharSequence charSequence;
        java.util.HashMap hashMap = this.f289604J;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = ab5.c0.c(ab5.c0.b(str));
            if (!android.text.TextUtils.isEmpty(str2)) {
                hashMap.put(str, str2);
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) n2Var.f289419c.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.weight = 0.0f;
            n2Var.f289419c.setLayoutParams(layoutParams);
        } else {
            n2Var.f289420d.setVisibility(0);
            n2Var.f289420d.m79270x765074af(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571830r2, str2));
            int i17 = this.f294141e.getResources().getDisplayMetrics() != null ? this.f294141e.getResources().getDisplayMetrics().widthPixels : 0;
            int i18 = n2Var.f289421e.getLayoutParams().width;
            if (i65.a.D(this.f294141e)) {
                dimensionPixelOffset = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561424i4);
                if (i18 < 0) {
                    i18 = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
                }
            } else {
                dimensionPixelOffset = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561425i5);
                if (i18 < 0) {
                    i18 = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561152au);
                }
            }
            int dimensionPixelOffset2 = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * 2;
            int dimensionPixelOffset3 = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l2 l2Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l2) this.f289444p.get(str);
            java.lang.String charSequence2 = (l2Var == null || (charSequence = l2Var.f289359a) == null) ? "" : charSequence.toString();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = n2Var.f289419c;
            float measureText = ((c21526xca364659 == null || charSequence2 == null) ? 0.0f : c21526xca364659.m79227x74f59ea8().measureText(charSequence2)) + 48.0f;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca3646592 = n2Var.f289419c;
            if (c21526xca3646592 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence2)) {
                f17 = 0.0f;
            } else {
                java.lang.String str3 = charSequence2.substring(0, charSequence2.offsetByCodePoints(0, 1)) + "…";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "getMinTextWidth, minText: " + str3);
                f17 = c21526xca3646592.m79227x74f59ea8().measureText(str3);
            }
            float min = (int) java.lang.Math.min(measureText, f17 + 48.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "nickNameMinWidth:%f", java.lang.Float.valueOf(min));
            int dimensionPixelOffset4 = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561152au);
            int dimensionPixelOffset5 = this.f294141e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "screenWidth:%d, avatarLayoutWidth:%d, timeTVWidth:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(dimensionPixelOffset), java.lang.Integer.valueOf(i18));
            float f27 = i17 > 0 ? ((((i17 - dimensionPixelOffset) - dimensionPixelOffset2) - i18) - dimensionPixelOffset3) - dimensionPixelOffset5 : 0.0f;
            if (measureText <= f27 && measureText < f27 && f27 > 0.0f) {
                f19 = java.lang.Math.min(measureText / f27, (f27 - dimensionPixelOffset4) / f27);
                f18 = 1.0f - f19;
            } else {
                f18 = 0.4f;
                f19 = 0.6f;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "nickNameParentRemainWidth: %f, nicknameTVWeight:%f, sourceTVWeight:%f", java.lang.Float.valueOf(f27), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f18));
            if (f27 > 0.0f) {
                float min2 = java.lang.Math.min(1.0f, min / f27);
                if (min2 > f19) {
                    f18 = 1.0f - min2;
                    f19 = min2;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "weight fixed, nicknameTVWeight:%f, sourceTVWeight:%f", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f18));
            if (z65.c.a()) {
                n2Var.f289419c.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s0(this, n2Var, (int) (dimensionPixelOffset5 + f27), (int) (f27 * f19)));
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) n2Var.f289419c.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.weight = f19;
            n2Var.f289419c.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) n2Var.f289420d.getLayoutParams();
            layoutParams3.width = 0;
            layoutParams3.weight = f18;
            n2Var.f289420d.setLayoutParams(layoutParams3);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(n2Var.f289418b, str, 0.1f);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.K;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void y(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l2 l2Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var, android.view.View view) {
    }
}
