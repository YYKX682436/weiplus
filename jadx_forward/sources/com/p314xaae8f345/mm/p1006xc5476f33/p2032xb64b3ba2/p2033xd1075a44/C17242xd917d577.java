package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/RingtoneAuthorLayout;", "Landroid/widget/LinearLayout;", "", "d", "Z", "getShowAuthProfession", "()Z", "setShowAuthProfession", "(Z)V", "showAuthProfession", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getAuthor", "()Landroid/widget/TextView;", "setAuthor", "(Landroid/widget/TextView;)V", "author", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getAuthIcon", "()Landroid/widget/ImageView;", "setAuthIcon", "(Landroid/widget/ImageView;)V", "authIcon", "g", "getAuthProfession", "setAuthProfession", "authProfession", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ringtone-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout */
/* loaded from: classes2.dex */
public final class C17242xd917d577 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean showAuthProfession;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView author;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView authIcon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView authProfession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17242xd917d577(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.showAuthProfession = true;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgu, (android.view.ViewGroup) this, true);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gi0.a.f353765a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(2, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
        android.content.res.ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList == null) {
            colorStateList = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(colorStateList, "getColorStateList(...)");
        }
        m68499xd398b523(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m4v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m68498x479788d((android.widget.TextView) findViewById);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.m4t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m68496xcbec18c3((android.widget.ImageView) findViewById2);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.m4u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m68497x758fddc6((android.widget.TextView) findViewById3);
        m68494x11444481().setTextSize(0, dimension);
        m68494x11444481().setTextColor(colorStateList);
        m68493xad9975ba().setTextSize(0, dimension);
        m68493xad9975ba().setTextColor(colorStateList);
    }

    /* renamed from: getAuthIcon */
    public android.widget.ImageView m68492xd133b7b7() {
        android.widget.ImageView imageView = this.authIcon;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authIcon");
        throw null;
    }

    /* renamed from: getAuthProfession */
    public android.widget.TextView m68493xad9975ba() {
        android.widget.TextView textView = this.authProfession;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authProfession");
        throw null;
    }

    /* renamed from: getAuthor */
    public android.widget.TextView m68494x11444481() {
        android.widget.TextView textView = this.author;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("author");
        throw null;
    }

    public boolean getShowAuthProfession() {
        return this.showAuthProfession;
    }

    /* renamed from: setAuthIcon */
    public void m68496xcbec18c3(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.authIcon = imageView;
    }

    /* renamed from: setAuthProfession */
    public void m68497x758fddc6(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.authProfession = textView;
    }

    /* renamed from: setAuthor */
    public void m68498x479788d(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.author = textView;
    }

    /* renamed from: setShowAuthProfession */
    public void m68499xd398b523(boolean z17) {
        this.showAuthProfession = z17;
    }
}
