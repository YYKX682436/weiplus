package iy2;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static int f377416j = -1;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f377417a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.StringBuilder f377418b;

    /* renamed from: c, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f377419c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.SpannableString f377420d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f377421e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.style.CharacterStyle f377422f;

    /* renamed from: g, reason: collision with root package name */
    public int f377423g;

    /* renamed from: h, reason: collision with root package name */
    public int f377424h;

    /* renamed from: i, reason: collision with root package name */
    public int f377425i;

    public c(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f377417a = mContext;
        this.f377419c = new android.text.SpannableStringBuilder();
        this.f377421e = new android.text.SpannableStringBuilder();
        this.f377422f = new android.text.style.ForegroundColorSpan(-5066062);
        this.f377425i = 3;
    }

    public final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        if (c22621x7603e017 == null) {
            return;
        }
        this.f377423g = c22621x7603e017.getSelectionStart();
        this.f377424h = c22621x7603e017.getSelectionEnd();
        this.f377418b = new java.lang.StringBuilder(c22621x7603e017.getText());
        if (r26.i0.p(c22621x7603e017.getText().toString(), "", true)) {
            this.f377419c.clear();
        }
        if (this.f377423g < 0) {
            this.f377423g = 0;
        }
        if (this.f377424h < 0) {
            this.f377424h = 0;
        }
    }

    public final void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        if (c22621x7603e017 == null) {
            return;
        }
        this.f377425i = 0;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String obj = c22621x7603e017.getText().toString();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f377417a, obj);
        this.f377420d = i17;
        c22621x7603e017.setText(i17);
        android.text.SpannableString spannableString = this.f377420d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(spannableString);
        c22621x7603e017.mo81549xf579a34a(spannableString.length());
    }

    public final void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, java.lang.String text, boolean z17) {
        int length;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (c22621x7603e017 == null) {
            return;
        }
        if (this.f377418b == null) {
            throw new java.lang.IllegalStateException("You should saveHistory before setText".toString());
        }
        int length2 = this.f377423g + text.length();
        android.text.SpannableStringBuilder spannableStringBuilder = this.f377419c;
        spannableStringBuilder.clear();
        android.text.SpannableStringBuilder spannableStringBuilder2 = this.f377421e;
        spannableStringBuilder2.clear();
        android.content.Context context = this.f377417a;
        if (z17) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.StringBuilder sb6 = this.f377418b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb6);
            int i17 = 0;
            java.lang.CharSequence subSequence = sb6.subSequence(0, this.f377423g);
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, subSequence);
            this.f377420d = i18;
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) i18);
            if (spannableStringBuilder2 != null && text.length() != 0) {
                if (text.length() < this.f377425i) {
                    length = text.length();
                } else {
                    length = text.length();
                    i17 = length - this.f377425i;
                }
                spannableStringBuilder2.append((java.lang.CharSequence) text).setSpan(this.f377422f, i17, length, 33);
            }
            android.text.SpannableStringBuilder append2 = append.append((java.lang.CharSequence) spannableStringBuilder2);
            java.lang.StringBuilder sb7 = this.f377418b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb7);
            int i19 = this.f377424h;
            java.lang.StringBuilder sb8 = this.f377418b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb8);
            append2.append(sb7.subSequence(i19, sb8.length()));
        } else {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, text);
            this.f377420d = i27;
            spannableStringBuilder.append((java.lang.CharSequence) i27);
        }
        spannableStringBuilder.length();
        c22621x7603e017.setText(spannableStringBuilder);
        if (length2 <= spannableStringBuilder.length()) {
            if (length2 == 0) {
                c22621x7603e017.mo81549xf579a34a(spannableStringBuilder.length());
            } else {
                c22621x7603e017.mo81549xf579a34a(length2);
            }
        }
    }
}
