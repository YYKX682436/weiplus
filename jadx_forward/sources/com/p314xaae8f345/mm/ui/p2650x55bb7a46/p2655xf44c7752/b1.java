package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes.dex */
public final class b1 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f282333a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f282334b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f282335c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f282336d;

    /* renamed from: e, reason: collision with root package name */
    public final int f282337e;

    /* renamed from: f, reason: collision with root package name */
    public final int f282338f;

    public b1(android.widget.TextView tv6, java.lang.CharSequence longText, java.lang.CharSequence shortText, boolean z17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longText, "longText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortText, "shortText");
        this.f282333a = tv6;
        this.f282334b = longText;
        this.f282335c = shortText;
        this.f282336d = z17;
        this.f282337e = i17;
        this.f282338f = i18;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    public int a() {
        this.f282333a.setText(this.f282335c);
        return mo79581x29d8f80a();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getMinWidth */
    public int mo79581x29d8f80a() {
        if (this.f282336d) {
            return ((int) this.f282333a.getPaint().measureText(this.f282335c.toString())) + this.f282337e;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getPriority */
    public int mo79582x3662b71a() {
        return this.f282338f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getWidth */
    public int mo79583x755bd410() {
        if (this.f282336d) {
            return ((int) this.f282333a.getPaint().measureText(this.f282334b.toString())) + this.f282337e;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: reset */
    public int mo79584x6761d4f() {
        this.f282333a.setText(this.f282334b);
        return mo79583x755bd410();
    }
}
