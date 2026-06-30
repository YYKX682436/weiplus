package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class c6 implements com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d f255299a;

    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d) {
        this.f255299a = activityC18631x6637f79d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.u
    public void a(android.view.View v17, java.lang.String iconId) {
        android.widget.Button button;
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049;
        pj4.b0 b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconId, "iconId");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iconId, "userdefine");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d = this.f255299a;
        if (!b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d.U6(activityC18631x6637f79d, iconId);
            return;
        }
        bi4.d1 d1Var = activityC18631x6637f79d.f255051i;
        if (d1Var != null) {
            d1Var.f436479p++;
        }
        activityC18631x6637f79d.f255062w = activityC18631x6637f79d.findViewById(com.p314xaae8f345.mm.R.id.cp_);
        activityC18631x6637f79d.A = activityC18631x6637f79d.findViewById(com.p314xaae8f345.mm.R.id.ovp);
        android.view.View view = activityC18631x6637f79d.f255062w;
        if (view != null) {
            bk4.e1 e1Var = bk4.e1.f102993a;
            bi4.d1 d1Var2 = activityC18631x6637f79d.f255051i;
            view.setBackgroundResource(e1Var.b((d1Var2 == null || (b0Var = d1Var2.f436470d) == null) ? null : b0Var.f436522x));
        }
        android.view.View view2 = activityC18631x6637f79d.f255062w;
        float f17 = i65.a.f(activityC18631x6637f79d.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        if (view2 != null) {
            view2.setOutlineProvider(new bk4.e2(true, true, f17));
        }
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        android.view.View view3 = activityC18631x6637f79d.f255062w;
        activityC18631x6637f79d.f255063x = view3 != null ? (android.widget.EditText) view3.findViewById(com.p314xaae8f345.mm.R.id.cp8) : null;
        android.view.View view4 = activityC18631x6637f79d.f255062w;
        activityC18631x6637f79d.f255064y = view4 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.cp9) : null;
        bk4.f.V(bk4.i.a(), activityC18631x6637f79d.f255064y, "userdefine", null, null, null, false, false, 124, null);
        android.view.View view5 = activityC18631x6637f79d.f255062w;
        if (view5 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = activityC18631x6637f79d.A;
        if (view6 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view7 = activityC18631x6637f79d.A;
        if (view7 != null) {
            view7.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d6.f255338d);
        }
        java.lang.String str = activityC18631x6637f79d.f255049g;
        if (str.length() > 0) {
            android.widget.EditText editText = activityC18631x6637f79d.f255063x;
            if (editText != null) {
                editText.setText(str);
            }
            android.widget.EditText editText2 = activityC18631x6637f79d.f255063x;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        }
        activityC18631x6637f79d.V6();
        android.widget.EditText editText3 = activityC18631x6637f79d.f255063x;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u5 u5Var = activityC18631x6637f79d.f255065z;
        if (editText3 != null) {
            editText3.removeTextChangedListener(u5Var);
        }
        android.widget.EditText editText4 = activityC18631x6637f79d.f255063x;
        if (editText4 != null) {
            editText4.addTextChangedListener(u5Var);
        }
        android.view.View view8 = activityC18631x6637f79d.f255062w;
        if (view8 != null && (c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) view8.findViewById(com.p314xaae8f345.mm.R.id.cow)) != null) {
            c22607x763d2049.e(activityC18631x6637f79d);
        }
        android.view.View view9 = activityC18631x6637f79d.f255062w;
        if (view9 != null && (imageView = (android.widget.ImageView) view9.findViewById(com.p314xaae8f345.mm.R.id.hkr)) != null) {
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e6(activityC18631x6637f79d));
        }
        android.view.View view10 = activityC18631x6637f79d.f255062w;
        if (view10 != null && (button = (android.widget.Button) view10.findViewById(com.p314xaae8f345.mm.R.id.b0z)) != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.f6(activityC18631x6637f79d, iconId));
        }
        android.view.View view11 = activityC18631x6637f79d.f255062w;
        activityC18631x6637f79d.B = view11 != null ? (android.widget.TextView) view11.findViewById(com.p314xaae8f345.mm.R.id.oqc) : null;
        android.widget.EditText editText5 = activityC18631x6637f79d.f255063x;
        if (editText5 != null) {
            editText5.requestFocus();
        }
        activityC18631x6637f79d.mo26063x7b383410();
    }
}
