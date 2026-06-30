package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f283202a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ScrollView f283203b;

    /* renamed from: e, reason: collision with root package name */
    public int f283206e;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f283208g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f283209h;

    /* renamed from: i, reason: collision with root package name */
    public final long f283210i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.a f283211j;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f283204c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public boolean f283205d = true;

    /* renamed from: f, reason: collision with root package name */
    public int f283207f = 1;

    public hc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ec ecVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f283202a = ecVar.f282006a;
        this.f283203b = ecVar.f282007b;
        this.f283208g = ecVar.f282008c;
        this.f283209h = ecVar.f282009d;
        this.f283210i = ecVar.f282010e;
        this.f283211j = ecVar.f282011f;
    }

    public final android.text.SpannableString a(android.text.SpannableString spannableString, int i17) {
        android.widget.ScrollView scrollView;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spannableString, "spannableString");
        int i27 = this.f283206e;
        android.view.View view = this.f283202a;
        spannableString.setSpan(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.dc(view, i17, this.f283206e, this.f283207f + 1), wl5.y.h(view, wl5.y.d(view, i27)), java.lang.Math.min(this.f283207f + 1, spannableString.length()), 17);
        boolean z17 = this.f283209h;
        if (z17) {
            android.os.Handler handler = this.f283204c;
            handler.removeCallbacksAndMessages(null);
            this.f283205d = true;
            if (z17) {
                handler.postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.gc(this), this.f283210i);
            }
        }
        boolean z18 = this.f283208g;
        if (z18 && (scrollView = this.f283203b) != null && z18 && (i18 = this.f283206e) != -1 && (i19 = this.f283207f) != -1) {
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.fc(textView, scrollView, i18, i19));
            }
        }
        return spannableString;
    }

    public final void b() {
        if (this.f283205d) {
            this.f283205d = false;
            android.view.View view = this.f283202a;
            java.lang.CharSequence o17 = wl5.y.o(view);
            android.text.Spannable spannable = o17 instanceof android.text.Spannable ? (android.text.Spannable) o17 : null;
            if (spannable != null) {
                java.lang.Object[] spans = spannable.getSpans(0, spannable.length(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.dc.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spans, "getSpans(...)");
                for (java.lang.Object obj : spans) {
                    spannable.removeSpan((com.p314xaae8f345.mm.ui.p2650x55bb7a46.dc) obj);
                }
                wl5.y.q(view, spannable, android.widget.TextView.BufferType.SPANNABLE);
            }
            yz5.a aVar = this.f283211j;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
