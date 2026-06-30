package r35;

/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r35.g0 f450645a = new r35.g0();

    public final android.view.View a(android.content.Context context, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String imageUrl, int i17, int i18, int i19, java.lang.String isFinderContact, int i27) {
        int b17;
        int i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrl, "imageUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isFinderContact, "isFinderContact");
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1o, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/applet/BizPicShareViewHelper", "initBizPicShareCustomViewDialog", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/pluginsdk/ui/applet/BizPicShareViewHelper", "initBizPicShareCustomViewDialog", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.spv);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565180sq0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqt);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqs);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqn);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqp);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqq);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qhm);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qhn);
        android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565204sr0);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pth);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqo);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.sqj);
        r35.h0 h0Var = r35.h0.f450653d;
        r35.h0 h0Var2 = ot0.f.f(num != null ? num.intValue() : 0) ? r35.h0.f450654e : h0Var;
        textView.setText(str);
        textView.setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        viewGroup2.setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        o11.f fVar = new o11.f();
        imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80862x137353c3, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836)));
        imageView2.setVisibility(8);
        viewGroup.setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.a9e;
        fVar.f423611b = true;
        fVar.f423610a = true;
        n11.a.b().i(imageUrl, imageView, fVar.a(), new r35.f0(imageUrl, imageView2));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.f(context, str2, imageView4, textView2, true, isFinderContact.equals("1"), false);
        r35.h0 h0Var3 = h0Var2;
        if (h0Var3 == r35.h0.f450654e) {
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView4 != null) {
                int i29 = i27;
                if (i29 == -1) {
                    i29 = 0;
                }
                textView4.setText(ot0.g0.d(i29));
            }
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
        } else if (h0Var3 == h0Var) {
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            java.lang.String format = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView3.setText(format);
            if (imageView5 != null) {
                imageView5.setVisibility(0);
            }
        }
        java.lang.String format2 = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        textView3.setText(format2);
        textView3.setVisibility(8);
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        if (i17 <= 0 || i18 <= 0) {
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 144);
            i28 = b17;
        } else {
            float f17 = i17;
            float f18 = i18;
            double a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.a(h0Var3.ordinal(), f17, f18);
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 144);
            if (a17 > 1.0d) {
                i28 = (int) (b17 * a17);
            } else {
                int i37 = (int) (b17 / a17);
                i28 = b17;
                b17 = i37;
            }
            if (f17 / f18 < 0.33f) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.j(imageView);
            } else if (imageView != null && (imageView instanceof com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizUtils", "resetBizSharePicImageViewCropWithLongPic");
                ((com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0) imageView).m82522xf4e85f16(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f));
            }
        }
        if (viewGroup.getLayoutParams() != null) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i28;
            layoutParams2.height = b17;
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (linearLayout2.getLayoutParams() != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = i28;
            linearLayout2.setLayoutParams(layoutParams4);
        }
        linearLayout.setVisibility(0);
        relativeLayout.addView(inflate, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        android.view.ViewGroup.LayoutParams layoutParams5 = inflate.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams5).addRule(14);
        return relativeLayout;
    }
}
