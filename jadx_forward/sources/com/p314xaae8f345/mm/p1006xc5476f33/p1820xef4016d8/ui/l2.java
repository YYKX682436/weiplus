package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class l2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        super(false);
        this.f228655d = activityC16363x8a0a619d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int indexOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228655d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = activityC16363x8a0a619d.U2;
        if (e1Var == null || e1Var.W == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(activityC16363x8a0a619d.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bul, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567322j24);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567321j23);
        textView.setText(activityC16363x8a0a619d.U2.W.f226861d);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = i65.a.b(activityC16363x8a0a619d.mo55332x76847179(), 16);
        java.util.Iterator it = activityC16363x8a0a619d.U2.W.f226862e.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f226894d)) {
                android.widget.TextView textView2 = new android.widget.TextView(activityC16363x8a0a619d.mo55332x76847179());
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(kVar.f226894d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f226895e) && (indexOf = kVar.f226894d.indexOf(kVar.f226895e)) > 0) {
                    spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w1(activityC16363x8a0a619d, kVar)), indexOf, kVar.f226895e.length() + indexOf, 18);
                    textView2.setClickable(true);
                    textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC16363x8a0a619d.mo55332x76847179()));
                }
                textView2.setText(spannableStringBuilder);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(activityC16363x8a0a619d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
                if (z17) {
                    linearLayout.addView(textView2);
                } else {
                    linearLayout.addView(textView2, marginLayoutParams);
                }
                if (z17) {
                    z17 = false;
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC16363x8a0a619d.mo55332x76847179(), 2, 0);
        z2Var.y(activityC16363x8a0a619d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        z2Var.x(1);
        z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x1(activityC16363x8a0a619d, z2Var);
        z2Var.j(viewGroup);
        z2Var.C();
    }
}
