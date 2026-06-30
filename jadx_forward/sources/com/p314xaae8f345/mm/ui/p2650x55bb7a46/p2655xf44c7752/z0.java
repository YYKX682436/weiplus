package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes.dex */
public final class z0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f283122a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f283123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f283124c;

    /* renamed from: d, reason: collision with root package name */
    public final int f283125d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.SpannableString f283126e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f283127f;

    public z0(android.widget.TextView tv6, java.lang.String hdLengthStr, boolean z17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hdLengthStr, "hdLengthStr");
        this.f283122a = tv6;
        this.f283123b = z17;
        this.f283124c = i17;
        this.f283125d = i18;
        this.f283126e = new android.text.SpannableString("");
        this.f283127f = new android.text.SpannableString("");
        android.content.Context context = tv6.getContext();
        int color = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adi);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572558bm5);
        java.lang.String str = string + ' ' + hdLengthStr;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        this.f283126e = spannableString;
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), string.length() + 1, str.length(), 33);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncv);
        java.lang.String str2 = string2 + ' ' + hdLengthStr;
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str2);
        this.f283127f = spannableString2;
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(color), string2.length() + 1, str2.length(), 33);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    public int a() {
        this.f283122a.setText(this.f283127f);
        return mo79581x29d8f80a();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getMinWidth */
    public int mo79581x29d8f80a() {
        if (this.f283123b) {
            return ((int) this.f283122a.getPaint().measureText(this.f283127f.toString())) + this.f283124c;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getPriority */
    public int mo79582x3662b71a() {
        return this.f283125d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getWidth */
    public int mo79583x755bd410() {
        if (this.f283123b) {
            return ((int) this.f283122a.getPaint().measureText(this.f283126e.toString())) + this.f283124c;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: reset */
    public int mo79584x6761d4f() {
        this.f283122a.setText(this.f283126e);
        return mo79583x755bd410();
    }
}
