package ke0;

@j95.b
/* loaded from: classes12.dex */
public class e extends i95.w implements le0.x, le0.u {
    public java.lang.CharSequence Ai(android.content.Context context, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, boolean z17) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        int i17 = length + 1;
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        if (!z17) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(new al5.w(drawable, 1), length, i17, 18);
        return spannableStringBuilder;
    }

    public void Bi() {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSpanManager", "clear MMSpanManager cache");
        ((lt0.f) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1.I).mo143584x5a5b64d();
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 Di(java.lang.String str, int i17, int i18, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w wVar) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.e0(str, i17, i18, z17, wVar);
    }

    public void Ni(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a.remove(zVar);
    }

    public void Ri(android.widget.TextView textView, java.lang.String content, java.util.List linkList, java.util.List separatorList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkList, "linkList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(separatorList, "separatorList");
        android.text.SpannableString spannableString = new android.text.SpannableString(content);
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : linkList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u uVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u) obj;
            spannableString.setSpan(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.v(i18, uVar), uVar.f272821b, uVar.f272822c, 17);
            i18 = i19;
        }
        for (java.lang.Object obj2 : separatorList) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b1 b1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b1) obj2;
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(b1Var.f272723c), b1Var.f272721a, b1Var.f272722b, 17);
            i17 = i27;
        }
        textView.setText(spannableString);
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.x(spannableString, textView));
    }

    public android.text.SpannableString Ui(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = false;
        j1Var.f272759e = true;
        j1Var.f272760f = false;
        j1Var.f272762h = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.d();
        j1Var.f272772r = false;
        j1Var.f272779y = i18;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.f272765k = false;
        j1Var.f272768n = false;
        return j1Var.e(charSequence, i17, true);
    }

    public android.text.SpannableString Vi(android.content.Context context, java.lang.CharSequence charSequence) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence);
    }

    public android.text.SpannableString Zi(android.content.Context context, java.lang.CharSequence charSequence, float f17) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, f17);
    }

    public android.text.SpannableString aj(android.content.Context context, java.lang.CharSequence charSequence, float f17, int i17) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272764j = false;
        j1Var.f272765k = false;
        j1Var.f272759e = false;
        j1Var.f272760f = false;
        j1Var.f272767m = false;
        j1Var.f272779y = i17;
        j1Var.f272763i = false;
        j1Var.B = false;
        android.text.SpannableString e17 = j1Var.e(charSequence, 0, true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f(e17);
        return e17;
    }

    public android.text.SpannableString bj(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.m(context, charSequence, 0, true);
    }

    public android.text.SpannableString cj(android.content.Context context, java.lang.CharSequence charSequence, boolean z17) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272764j = false;
        j1Var.f272765k = false;
        j1Var.f272759e = false;
        j1Var.f272760f = false;
        j1Var.f272767m = false;
        j1Var.f272763i = false;
        j1Var.B = false;
        j1Var.f272774t = z17;
        android.text.SpannableString e17 = j1Var.e(charSequence, 0, true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f(e17);
        return e17;
    }

    public android.text.SpannableString fj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, le0.r rVar) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.k(context, true, charSequence, i17, i18, obj, rVar, -1, true);
    }

    public android.text.SpannableString hj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = true;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272762h = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.d();
        j1Var.f272772r = true;
        j1Var.f272779y = i18;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.H = obj;
        if (i18 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i18 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        return j1Var.e(charSequence, i17, true);
    }

    public android.text.SpannableString ij(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.l(context, charSequence, i17, i18, obj, false);
    }

    public android.text.SpannableString mj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, boolean z17) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.l(context, charSequence, i17, i18, obj, z17);
    }

    public android.text.SpannableString nj(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = false;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272761g = false;
        j1Var.f272770p = false;
        j1Var.f272771q = false;
        j1Var.f272772r = false;
        j1Var.f272779y = 1;
        j1Var.f272764j = false;
        j1Var.f272767m = false;
        j1Var.f272765k = false;
        j1Var.f272768n = false;
        j1Var.B = true;
        return j1Var.e(charSequence, i17, true);
    }

    public android.text.SpannableString oj(android.widget.TextView textView, int i17) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.o(textView, i17, 0, null, null, true, true);
    }

    public android.text.SpannableString pj(android.widget.TextView textView, int i17, int i18, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a aVar, int i19, java.lang.Object obj) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
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
        j1Var.f272762h = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.d();
        j1Var.f272779y = i17;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.f272769o = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.c(i17);
        j1Var.B = true;
        j1Var.H = obj;
        j1Var.g(textView);
        j1Var.D = i18;
        j1Var.E = aVar;
        j1Var.F = i19;
        if (i17 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i17 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        return j1Var.e(textView.getText(), textSize, true);
    }

    public android.text.SpannableString qj(android.content.Context context, java.lang.CharSequence charSequence, int i17, boolean z17, int i18, java.lang.Object obj) {
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272770p = true;
        j1Var.f272759e = true;
        j1Var.f272772r = true;
        j1Var.f272779y = i18;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.g(null);
        if (i18 == 1) {
            j1Var.f272765k = true;
            j1Var.f272768n = true;
        } else if (i18 == 2) {
            j1Var.f272765k = false;
            j1Var.f272768n = false;
        }
        if (obj != null) {
            j1Var.H = obj;
        }
        return j1Var.e(charSequence, i17, z17);
    }

    public android.text.SpannableString rj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, java.lang.String str) {
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.u(context, charSequence, i17, i18, obj, str, true);
    }

    public void sj(android.content.Context context, java.util.List list, java.lang.String str, java.util.List list2, android.widget.TextView textView) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.v(context, list, str, list2, java.lang.Boolean.TRUE, textView, false, null);
    }

    public void wi(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a.add(zVar);
    }
}
