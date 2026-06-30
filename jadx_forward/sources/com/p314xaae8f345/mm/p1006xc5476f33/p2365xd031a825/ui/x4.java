package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public abstract class x4 {
    public static android.app.Dialog a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b43, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6w, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 50.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(imageView, d17, d17, d17, d17);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j96);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567368j90);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.otp);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j8x);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.btf);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.btm);
        textView.setText(c19096xf9c99b43.f261171p);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19096xf9c99b43.f261178w)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(c19096xf9c99b43.f261178w);
            textView2.setVisibility(0);
        }
        int length = c19096xf9c99b43.f261175t.length();
        int length2 = (c19096xf9c99b43.f261175t + c19096xf9c99b43.f261176u).length();
        android.text.SpannableString spannableString = new android.text.SpannableString(c19096xf9c99b43.f261175t + c19096xf9c99b43.f261176u);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length, length2, 33);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableString)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(spannableString);
            textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s4(c19096xf9c99b43, context, i17));
        }
        sp.b bVar = new sp.b(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        bVar.setContentView(inflate);
        bVar.setTitle((java.lang.CharSequence) null);
        bVar.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t4(bVar));
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u4(bVar));
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v4(c19096xf9c99b43, context, bVar));
        if (c19096xf9c99b43.f261164f == 1) {
            checkBox.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w4(button));
            if (c19096xf9c99b43.f261165g == 1) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
                button.setEnabled(false);
                button.setClickable(false);
            }
        } else {
            checkBox.setVisibility(8);
        }
        int length3 = c19096xf9c99b43.f261166h.length();
        int length4 = (c19096xf9c99b43.f261166h + c19096xf9c99b43.f261167i).length();
        android.text.SpannableString spannableString2 = new android.text.SpannableString(c19096xf9c99b43.f261166h + c19096xf9c99b43.f261167i);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length3, length4, 33);
        textView4.setText(spannableString2);
        textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n4(c19096xf9c99b43, context));
        bVar.show();
        db5.e1.a(context, bVar);
        return bVar;
    }

    public static void b(android.content.Context context) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8i, (android.view.ViewGroup) null, false);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569294pr0);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569295pr1);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563749ci2);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gr8);
        aVar.B = true;
        aVar.A = false;
        aVar.L = inflate;
        aVar.f293242a = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l07);
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }

    public static android.app.Dialog c(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6u, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 15.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(imageView, d17, d17, d17, d17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.j96);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567372j94);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567373j95);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.otp);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j8x);
        c22624x85d69039.m84162x74f59ea8().setFakeBoldText(true);
        c22624x85d69039.b(str);
        textView.setText(str2);
        linearLayout.removeAllViews();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str8 = (java.lang.String) it.next();
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6v, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.po7)).setText(str8);
            linearLayout.addView(inflate2);
        }
        button.setText(str3);
        if (i17 > 0) {
            int length = str4.length();
            int length2 = (str4 + str5).length();
            android.text.SpannableString spannableString = new android.text.SpannableString(str4 + str5);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561080aa4)), length, length2, 33);
            textView2.setText(spannableString);
        } else {
            textView2.setText("");
        }
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o4(str6, context));
        sp.b bVar = new sp.b(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        bVar.setContentView(inflate);
        bVar.setTitle((java.lang.CharSequence) null);
        bVar.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p4(bVar));
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q4(bVar));
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r4(str7, context, bVar));
        bVar.show();
        android.view.Window window = bVar.getWindow();
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        window.getDecorView().setPadding(b17, 0, b17, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        return bVar;
    }
}
