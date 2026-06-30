package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f202157e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55) {
        this.f202156d = xVar;
        this.f202157e = c22646x1e9ca55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar = this.f202156d;
        android.view.View view = xVar.f202208l;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f3w);
            java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573099dk0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.djz, string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= string2.length()) {
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.g(view, textView), L, string.length() + L, 33);
            }
            textView.setText(spannableString);
            textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            view.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.h.f202165d);
        }
        android.view.View view2 = xVar.f202208l;
        if (view2 != null) {
            view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.b(xVar, this.f202157e));
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_WALL_OPENED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
