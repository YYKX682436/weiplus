package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* renamed from: com.tencent.mm.plugin.lite.ui.LiteAppPayTextView */
/* loaded from: classes9.dex */
public class C16236x1ead31c7 extends android.widget.TextView {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f225824f = "MicroMsg." + new java.lang.StringBuilder("weiVtxeTtellaW").reverse().toString();

    /* renamed from: d, reason: collision with root package name */
    public int f225825d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225826e;

    public C16236x1ead31c7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: setPrefix */
    public void m65856x1de10994(java.lang.String str) {
        this.f225826e = str;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2 != null && charSequence2.length() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(7);
            for (int i17 = 0; i17 < 7; i17++) {
                sb6.append((char) ((6222620280936476253 >> ((6 - i17) * 8)) & 255));
            }
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            charSequence2.replaceAll(sb7, sb6.toString());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f225826e) && !charSequence.toString().startsWith(this.f225826e)) {
            charSequence = this.f225826e + ((java.lang.Object) charSequence);
        }
        if (this.f225825d < 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence) && java.util.regex.Pattern.compile(".*?[a-zA-Z]+.*?").matcher(charSequence).matches()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f225824f, "force use std font");
            if (charSequence instanceof java.lang.String) {
                charSequence = ((java.lang.String) charSequence).toLowerCase();
            }
        }
        super.setText(charSequence, bufferType);
    }

    public C16236x1ead31c7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ke.a.f388450a, i17, 0);
        this.f225825d = obtainStyledAttributes.getInteger(1, 4);
        this.f225826e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        switch (this.f225825d) {
            case 1:
                str = "fonts/WeChatSansSS-Bold.ttf";
                break;
            case 2:
                str = "fonts/WeChatSansSS-Light.ttf";
                break;
            case 3:
                str = "fonts/WeChatSansSS-Regular.ttf";
                break;
            case 4:
                str = "fonts/WeChatSansStd-Medium.ttf";
                break;
            case 5:
                str = "fonts/WeChatSansStd-Bold.ttf";
                break;
            case 6:
                str = "fonts/WeChatSansStd-Light.ttf";
                break;
            case 7:
                str = "fonts/WeChatSansStd-Regular.ttf";
                break;
            default:
                str = "fonts/WeChatSansSS-Medium.ttf";
                break;
        }
        try {
            setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f225824f, "updateWalletTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
