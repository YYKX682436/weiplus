package com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.k f292591a = new com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.k();

    public final android.view.View a(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        if (3 == i17) {
            if (sheet.D1 == null) {
                sheet.g();
            }
            if (sheet.E1 == null) {
                sheet.E1 = (android.widget.TextView) sheet.S.findViewById(com.p314xaae8f345.mm.R.id.ptd);
            }
            android.widget.TextView textView = sheet.E1;
            if (textView != null) {
                textView.setVisibility(0);
                sheet.E1.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ifg);
                if (sheet.f293390e2) {
                    sheet.E1.setTextColor(sheet.f293403m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                } else {
                    sheet.E1.setTextColor(sheet.f293403m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                }
            }
            return null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cch, (android.view.ViewGroup) null);
        if (inflate != null) {
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ave);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.avf);
            com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
            context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            sheet.S1 = true;
            android.widget.ImageView imageView = sheet.M1;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            android.widget.LinearLayout linearLayout = sheet.U;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                sheet.U.removeAllViews();
                sheet.U.setGravity(17);
                sheet.U.addView(inflate, -1, -2);
            }
            if (i17 == 1) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                textView3.setVisibility(0);
            } else if (i17 == 2) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                textView3.setVisibility(0);
            } else if (i17 == 5) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                textView3.setVisibility(0);
            } else if (i17 != 6) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                textView3.setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MircoMsg.RecentForwardUtils", "invalid type:" + i17);
            } else {
                textView3.setVisibility(8);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                textView2.setLayoutParams(marginLayoutParams);
            }
        }
        return inflate;
    }
}
