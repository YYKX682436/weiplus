package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.a f224876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d f224877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d f224879g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d dVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d dVar2) {
        this.f224876d = aVar;
        this.f224877e = dVar;
        this.f224878f = context;
        this.f224879g = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.CharSequence ellipsize;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d dVar = this.f224877e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.a aVar = this.f224876d;
        android.content.Context context = this.f224878f;
        try {
            android.widget.TextView textView = aVar.f224871p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            android.view.ViewParent parent = textView.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int measuredWidth = ((android.view.ViewGroup) parent).getMeasuredWidth();
            if (measuredWidth == 0) {
                return;
            }
            java.lang.String str2 = "@" + dVar.f224886i;
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3);
            android.widget.TextView textView2 = new android.widget.TextView(context);
            float f17 = h17;
            textView2.getPaint().setTextSize(f17);
            float measureText = textView2.getPaint().measureText(" " + str2);
            android.text.TextPaint paint = textView2.getPaint();
            android.widget.TextView textView3 = aVar.f224871p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            paint.setTextSize(textView3.getTextSize());
            double d17 = measuredWidth;
            if (measureText >= 0.6d * d17) {
                ellipsize = android.text.TextUtils.ellipsize(dVar.f224884g, textView2.getPaint(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize, "ellipsize(...)");
                float measureText2 = textView2.getPaint().measureText(ellipsize.toString());
                textView2.getPaint().setTextSize(f17);
                ?? ellipsize2 = android.text.TextUtils.ellipsize(str2, textView2.getPaint(), (measuredWidth - measureText2) - 20, android.text.TextUtils.TruncateAt.END);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize2, "ellipsize(...)");
                str = ellipsize2;
            } else {
                ellipsize = android.text.TextUtils.ellipsize(dVar.f224884g, textView2.getPaint(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize, "ellipsize(...)");
                str = str2;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) ellipsize);
            sb6.append(' ');
            sb6.append((java.lang.Object) str);
            java.lang.String sb7 = sb6.toString();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, sb7);
            android.content.res.ColorStateList e17 = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0k);
            i17.setSpan(new android.text.style.TextAppearanceSpan(null, 0, h17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            i17.setSpan(new r85.b(h17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
            android.widget.TextView textView4 = aVar.f224871p;
            ((s50.r0) yVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(i17, textView4);
        } catch (java.lang.Exception e18) {
            this.f224879g.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactDataItem", "fillingViewItem Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
        }
    }
}
