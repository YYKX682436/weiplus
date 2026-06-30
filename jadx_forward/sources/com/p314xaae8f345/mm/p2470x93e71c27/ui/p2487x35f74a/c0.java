package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes12.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f272724a = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0.f272695d;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Boolean[] f272725b = {null};

    /* renamed from: c, reason: collision with root package name */
    public static final le0.r f272726c = le0.x.P0;

    public static java.lang.CharSequence a(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i17);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        al5.w wVar = new al5.w(drawable, 1);
        wVar.f87612d = 0;
        spannableStringBuilder.setSpan(wVar, length, length + 1, 18);
        return spannableStringBuilder;
    }

    public static android.text.SpannableStringBuilder b(android.content.Context context, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Drawable drawable, boolean z17, boolean z18) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        int i17 = length + 1;
        if (z18) {
            spannableStringBuilder.append((java.lang.CharSequence) "  ");
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) " ");
        }
        spannableStringBuilder.append((java.lang.CharSequence) i(context, charSequence2));
        if (!z17) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(new al5.w(drawable, 1), length, i17, 17);
        return spannableStringBuilder;
    }

    public static boolean c(int i17) {
        if (i17 != 2) {
        }
        bx1.q qVar = (bx1.q) i95.n0.c(bx1.q.class);
        return qVar == null || !((vh4.f) qVar).m172127x74219ae7();
    }

    public static boolean d() {
        java.lang.Boolean[] boolArr = f272725b;
        if (boolArr[0] == null) {
            synchronized (boolArr) {
                if (boolArr[0] == null) {
                    boolArr[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                }
            }
        }
        return boolArr[0].booleanValue();
    }

    public static java.lang.String e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        j1Var.f272763i = false;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272770p = true;
        j1Var.f272771q = true;
        j1Var.f272772r = true;
        j1Var.f272779y = 1;
        j1Var.f272764j = false;
        j1Var.f272767m = false;
        j1Var.f272765k = false;
        j1Var.f272768n = false;
        j1Var.f272773s = false;
        j1Var.B = false;
        return j1Var.e(str, 0, false).toString();
    }

    public static void f(android.text.Spannable spannable) {
        for (android.text.style.ClickableSpan clickableSpan : (android.text.style.ClickableSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ClickableSpan.class)) {
            spannable.removeSpan(clickableSpan);
        }
    }

    public static void g(android.widget.TextView textView, android.text.Spannable spannable) {
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d0(spannable, textView));
    }

    public static android.text.SpannableString h(android.content.Context context, java.lang.CharSequence charSequence, int i17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = false;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272770p = true;
        j1Var.f272771q = z17;
        j1Var.f272772r = true;
        j1Var.f272779y = 1;
        j1Var.f272764j = false;
        j1Var.f272767m = false;
        j1Var.f272765k = false;
        j1Var.f272768n = false;
        j1Var.B = false;
        return j1Var.e(charSequence, i17, true);
    }

    public static android.text.SpannableString i(android.content.Context context, java.lang.CharSequence charSequence) {
        return m(context, charSequence, 0, true);
    }

    public static android.text.SpannableString j(android.content.Context context, java.lang.CharSequence charSequence, float f17) {
        return m(context, charSequence, 0, true);
    }

    public static android.text.SpannableString k(android.content.Context context, boolean z17, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, le0.r rVar, int i19, boolean z18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.D = i19;
        j1Var.f272763i = z17;
        j1Var.f272759e = z17;
        j1Var.f272760f = z17;
        j1Var.f272772r = z17;
        j1Var.f272762h = d() && z17;
        j1Var.f272769o = c(i18) && z17;
        j1Var.f272764j = z17;
        j1Var.f272767m = false;
        j1Var.f272779y = i18;
        j1Var.B = true;
        j1Var.H = obj;
        if (i18 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else {
            if (i18 == 2) {
                j1Var.f272765k = false;
                j1Var.f272768n = false;
                j1Var.D = i19 != -1 ? i19 : 2;
            }
        }
        if ((i18 == 1 || i18 == 4) && i19 == 10) {
            j1Var.f272772r = true;
        }
        if (rVar != null) {
            rVar.a(context, j1Var);
        }
        return j1Var.e(charSequence, i17, z18);
    }

    public static android.text.SpannableString l(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = true;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272762h = d();
        j1Var.f272772r = true;
        j1Var.f272779y = i18;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.H = obj;
        j1Var.f272778x = z17;
        if (i18 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i18 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        return j1Var.e(charSequence, i17, false);
    }

    public static android.text.SpannableString m(android.content.Context context, java.lang.CharSequence charSequence, int i17, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272764j = false;
        j1Var.f272765k = false;
        j1Var.f272759e = false;
        j1Var.f272760f = false;
        j1Var.f272767m = false;
        j1Var.f272763i = false;
        j1Var.B = false;
        android.text.SpannableString e17 = j1Var.e(charSequence, i17, z17);
        f(e17);
        return e17;
    }

    public static android.text.SpannableString n(android.content.Context context, java.lang.CharSequence charSequence, float f17) {
        return m(context, charSequence, (int) f17, false);
    }

    public static android.text.SpannableString o(android.widget.TextView textView, int i17, int i18, java.lang.Object obj, le0.r rVar, boolean z17, boolean z18) {
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            return new android.text.SpannableString("");
        }
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = true;
        j1Var.f272759e = true;
        j1Var.f272760f = z17;
        j1Var.f272762h = d();
        j1Var.f272779y = i17;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.f272769o = c(i17);
        j1Var.B = true;
        j1Var.H = obj;
        j1Var.g(textView);
        j1Var.D = i18;
        if (i17 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i17 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        if (rVar != null) {
            rVar.a(context, j1Var);
        }
        return j1Var.e(textView.getText(), textSize, z18);
    }

    public static android.text.SpannableString p(android.widget.TextView textView, int i17, boolean z17, java.lang.Object obj) {
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            return new android.text.SpannableString("");
        }
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = true;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272770p = true;
        j1Var.f272772r = true;
        j1Var.f272779y = i17;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.g(textView);
        if (i17 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i17 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        if (obj != null) {
            j1Var.H = obj;
        }
        return j1Var.e(textView.getText(), textSize, z17);
    }

    public static android.text.SpannableString q(android.widget.TextView textView, java.lang.Object obj, le0.r rVar, int i17) {
        if (textView != null) {
            return r(textView.getContext(), textView, (int) textView.getTextSize(), obj, rVar, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
        return new android.text.SpannableString("");
    }

    public static android.text.SpannableString r(android.content.Context context, android.widget.TextView textView, int i17, java.lang.Object obj, le0.r rVar, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = false;
        j1Var.f272759e = false;
        j1Var.f272760f = true;
        j1Var.f272762h = false;
        j1Var.f272764j = false;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.g(textView);
        j1Var.H = obj;
        j1Var.f272779y = 1;
        j1Var.f272765k = false;
        j1Var.f272768n = false;
        j1Var.D = i18;
        if (rVar != null) {
            rVar.a(context, j1Var);
        }
        return j1Var.e(textView.getText(), i17, false);
    }

    public static android.text.SpannableString s(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, java.lang.String str, int i19, le0.r rVar, boolean z17) {
        return t(context, charSequence, i17, i18, obj, str, i19, rVar, z17, true);
    }

    public static android.text.SpannableString t(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, java.lang.String str, int i19, le0.r rVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 w17 = w(context, z17, i18, obj, str);
        w17.f272774t = z18;
        w17.D = i19;
        if (rVar != null) {
            rVar.a(context, w17);
        }
        return w17.e(charSequence, i17, true);
    }

    public static android.text.SpannableString u(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, java.lang.String str, boolean z17) {
        return s(context, charSequence, i17, i18, obj, str, 0, null, z17);
    }

    public static void v(final android.content.Context context, java.util.List list, java.lang.String str, java.util.List list2, java.lang.Boolean bool, android.widget.TextView textView, final boolean z17, final le0.s sVar) {
        java.lang.String str2 = str;
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        int i17 = 0;
        while (i17 < list2.size()) {
            java.lang.String str3 = (java.lang.String) list2.get(i17);
            int indexOf = str2.indexOf(str3);
            int length = str3.length() + indexOf;
            if (indexOf >= 0 && length <= str.length()) {
                spannableString.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.e0((java.lang.String) list.get(i17), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), bool.booleanValue(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w() { // from class: com.tencent.mm.pluginsdk.ui.span.c0$$a
                    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w
                    public final void a(java.lang.String str4) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSpanManager", "click %s", str4);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", str4);
                        if (z17) {
                            intent.putExtra("neverGetA8Key", true);
                        }
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                        le0.s sVar2 = sVar;
                        if (sVar2 != null) {
                            sVar2.a();
                        }
                    }
                }), indexOf, length, 17);
            }
            i17++;
            str2 = str;
        }
        if (textView != null) {
            textView.setText(spannableString);
            g(textView, spannableString);
        }
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 w(android.content.Context context, boolean z17, int i17, java.lang.Object obj, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = z17;
        j1Var.f272759e = z17;
        j1Var.f272760f = z17;
        j1Var.f272762h = d() && z17;
        j1Var.f272779y = i17;
        j1Var.f272764j = z17;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.g(null);
        j1Var.H = obj;
        j1Var.C = str;
        if (i17 == 1 || i17 == 4) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i17 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        if ("zh_CN".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
            j1Var.f272766l = z17;
        }
        j1Var.f272769o = c(i17) && z17;
        if (obj instanceof android.os.Bundle) {
            j1Var.G = ((android.os.Bundle) obj).getBoolean("useChatTool", false);
        }
        java.util.Iterator it = le0.x.Q0.iterator();
        while (it.hasNext()) {
            ((le0.r) it.next()).a(context, j1Var);
        }
        return j1Var;
    }
}
