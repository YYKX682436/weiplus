package fq1;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final fq1.e f347040a = new fq1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f347041b = new java.util.HashMap();

    public static /* synthetic */ void h(fq1.e eVar, android.view.View view, float f17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = true;
        }
        eVar.g(view, f17, z17, z18);
    }

    public final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 tv6, java.lang.CharSequence text, android.graphics.drawable.Drawable drawable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        tv6.j(android.text.TextUtils.TruncateAt.END, 0.0f);
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        android.content.Context context = tv6.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int m84164x40077844 = (int) tv6.m84164x40077844();
        android.graphics.drawable.Drawable drawable2 = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        drawable2.setBounds(0, 0, i65.a.b(context, i17), m84164x40077844);
        al5.w wVar2 = new al5.w(drawable2, 1);
        android.text.SpannableString spannableString2 = new android.text.SpannableString("@");
        spannableString2.setSpan(wVar2, 0, 1, 33);
        tv6.b(android.text.TextUtils.concat(text, spannableString2, spannableString));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.view.ViewParent viewParent, android.view.View view, int i17, int i18) {
        if (view == null || viewParent == 0) {
            return;
        }
        android.view.View view2 = viewParent instanceof android.view.View ? (android.view.View) viewParent : null;
        if (view2 == null) {
            return;
        }
        view2.post(new fq1.b(view, i17, i18, view2));
    }

    public final java.lang.String c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (android.view.View view2 : d(view)) {
            if (view2.getVisibility() == 0) {
                sb6.append(view2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 ? ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view2).a() : view2 instanceof android.widget.TextView ? ((android.widget.TextView) view2).getText() : "");
                sb6.append("，");
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.util.List d(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view != null && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getVisibility() != 0) {
                return kz5.p0.f395529d;
            }
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                arrayList.add(childAt);
                arrayList.addAll(d(childAt));
            }
        }
        return arrayList;
    }

    public final int e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            return com.p314xaae8f345.mm.ui.bh.a(context).f278668a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizViewUtils", e17, "getRealScreenWidth exception", new java.lang.Object[0]);
            return 0;
        }
    }

    public final java.lang.String f(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        return textView.getVisibility() == 0 ? textView.getText().toString() : "";
    }

    public final void g(android.view.View view, float f17, boolean z17, boolean z18) {
        if (f17 <= 0.0f) {
            return;
        }
        if (view != null) {
            view.setOutlineProvider(new fq1.a(f17, z17, z18));
        }
        if (view == null) {
            return;
        }
        view.setClipToOutline(true);
    }

    public final void i(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 tv6, int i17, java.lang.CharSequence text, int i18) {
        int i19;
        int B;
        int b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        tv6.b(text);
        if (tv6.getWidth() > 0) {
            i19 = tv6.getWidth();
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.util.HashMap hashMap = f347041b;
            if (hashMap.containsKey(valueOf)) {
                java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i18));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                i19 = ((java.lang.Number) obj).intValue();
            } else {
                hashMap.put(java.lang.Integer.valueOf(i18), 0);
                i19 = 0;
            }
        }
        if (i19 <= 0) {
            android.view.ViewTreeObserver viewTreeObserver = tv6.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new fq1.d(tv6, i18));
            }
            if (i18 == 0 || i18 == 11) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 48);
            } else if (i18 == 1) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 136);
            } else if (i18 == 2 || i18 == 21) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 64);
            } else if (i18 == 3) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 136);
            } else if (i18 == 4 || i18 == 41) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 64);
            } else if (i18 == 5) {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 144);
            } else {
                B = i65.a.B(context);
                b17 = i65.a.b(context, 64);
            }
            i19 = B - b17;
        }
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i17);
        int m84164x40077844 = (int) tv6.m84164x40077844();
        int intrinsicWidth = (drawable.getIntrinsicWidth() * m84164x40077844) / drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, m84164x40077844);
        tv6.j(android.text.TextUtils.TruncateAt.END, intrinsicWidth + i65.a.b(context, 9));
        ks5.a i27 = tv6.i(i19, Integer.MAX_VALUE);
        if (i27 != null) {
            int l17 = ((ks5.c) i27).l(tv6.m84159x931cb571() - 1);
            if (l17 <= 0) {
                a(tv6, text, drawable, 8);
                return;
            }
            a(tv6, text.subSequence(0, text.length() - l17).toString() + (char) 8230, drawable, 8);
        } else {
            a(tv6, text, drawable, 8);
        }
        tv6.setContentDescription(((java.lang.Object) tv6.a()) + (char) 65292 + tv6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574097gz4));
    }
}
