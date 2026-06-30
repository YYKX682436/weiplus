package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class f9 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        super(false);
        this.f228434d = activityC16371xf216ae6d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i0 i0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i0 i0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228434d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = activityC16371xf216ae6d.U2;
        if (e1Var == null || e1Var.W == null) {
            return;
        }
        java.util.LinkedList linkedList = null;
        android.view.View inflate = android.view.LayoutInflater.from(activityC16371xf216ae6d.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bul, (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567322j24) : null;
        android.widget.LinearLayout linearLayout = viewGroup != null ? (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567321j23) : null;
        if (textView != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var2 = activityC16371xf216ae6d.U2;
            textView.setText((e1Var2 == null || (i0Var2 = e1Var2.W) == null) ? null : i0Var2.f226861d);
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = i65.a.b(activityC16371xf216ae6d.mo55332x76847179(), 16);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var3 = activityC16371xf216ae6d.U2;
        if (e1Var3 != null && (i0Var = e1Var3.W) != null) {
            linkedList = i0Var.f226862e;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            boolean z17 = true;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f226894d)) {
                    android.widget.TextView textView2 = new android.widget.TextView(activityC16371xf216ae6d.mo55332x76847179());
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(kVar.f226894d);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f226895e)) {
                        java.lang.String str = kVar.f226894d;
                        if (str != null) {
                            java.lang.String str2 = kVar.f226895e;
                            if (str2 == null) {
                                str2 = "";
                            }
                            i17 = r26.n0.L(str, str2, 0, false, 6, null);
                        } else {
                            i17 = 0;
                        }
                        if (i17 > 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.r9(activityC16371xf216ae6d, kVar));
                            java.lang.String str3 = kVar.f226895e;
                            spannableStringBuilder.setSpan(d7Var, i17, (str3 != null ? str3.length() : 0) + i17, 18);
                            textView2.setClickable(true);
                            textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC16371xf216ae6d.mo55332x76847179()));
                        }
                    }
                    textView2.setText(spannableStringBuilder);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(activityC16371xf216ae6d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
                    if (z17) {
                        if (linearLayout != null) {
                            linearLayout.addView(textView2);
                        }
                    } else if (linearLayout != null) {
                        linearLayout.addView(textView2, marginLayoutParams);
                    }
                    if (z17) {
                        z17 = false;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC16371xf216ae6d.mo55332x76847179(), 2, 0);
        z2Var.y(activityC16371xf216ae6d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        z2Var.x(1);
        z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.q9(z2Var);
        z2Var.j(viewGroup);
        z2Var.C();
    }
}
