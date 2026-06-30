package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* renamed from: com.tencent.mm.wallet_core.ui.WalletTextView */
/* loaded from: classes9.dex */
public class C22904x897710ab extends android.widget.TextView {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f295629g = "MicroMsg." + new java.lang.StringBuilder("weiVtxeTtellaW").reverse().toString();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f295630d;

    /* renamed from: e, reason: collision with root package name */
    public int f295631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f295632f;

    public C22904x897710ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public java.lang.CharSequence a() {
        return super.getText();
    }

    public void b() {
        m83144x1de10994(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
    }

    @Override // android.widget.TextView
    @java.lang.Deprecated
    public java.lang.CharSequence getText() {
        pp5.b bVar;
        boolean z17;
        synchronized (pp5.b.class) {
            bVar = pp5.a.f439082a;
        }
        bVar.getClass();
        if (fo3.s.INSTANCE.Vg(this)) {
            java.util.WeakHashMap weakHashMap = bVar.f439083a;
            if (!weakHashMap.containsKey(this)) {
                weakHashMap.put(this, java.lang.Boolean.TRUE);
                jx3.f.INSTANCE.mo68477x336bdfd8(715L, 0L, 1L, false);
                if (pp5.c.a() || fp.m.d()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(8);
                    try {
                        sb6.append(tp3.b.a("\u0086\u008a\u008e\u0083\u0087\u0085¼¬¯±«\u0087©»\u0084±»·µ¼´\u008d°«¤\u0091½\u00ad¹¥¹°\u009a¤¦®¯§±"));
                    } catch (java.lang.Throwable unused) {
                    }
                    java.lang.String sb7 = sb6.toString();
                    sb6.delete(0, sb6.length());
                    sb6.append(((pp5.c.class.hashCode() >>> 31) | 1) ^ 1);
                    if (!sb6.toString().equals(pp5.c.b(sb7, sb6.toString()))) {
                        w04.l.INSTANCE.Nf(Integer.MIN_VALUE);
                    }
                }
            }
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            return super.getText();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f295629g, new java.lang.Throwable(), "check point 0.", new java.lang.Object[0]);
        if (!pp5.c.a() && !fp.m.d()) {
            return super.getText();
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(8);
        try {
            sb8.append(tp3.b.a("»µ³¸²²\u0089§¢¾¦\u008c¼¬\u0091\u00ad¤¦© \u009b££³£©§±"));
        } catch (java.lang.Throwable unused2) {
        }
        java.lang.String sb9 = sb8.toString();
        sb8.delete(0, sb8.length());
        sb8.append(((pp5.c.class.hashCode() >>> 31) | 1) ^ 1);
        return (java.lang.CharSequence) (sb8.toString().equals(pp5.c.b(sb9, sb8.toString())) ^ true ? this.f295630d : super.getText());
    }

    /* renamed from: setPrefix */
    public void m83144x1de10994(java.lang.String str) {
        this.f295632f = str;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.String str;
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2 == null || charSequence2.length() == 0) {
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(7);
            for (int i17 = 0; i17 < 7; i17++) {
                sb6.append((char) ((6222620280936476253 >> ((6 - i17) * 8)) & 255));
            }
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            str = charSequence2.replaceAll(sb7, sb6.toString());
        }
        this.f295630d = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f295632f) && !charSequence.toString().startsWith(this.f295632f)) {
            charSequence = this.f295632f + ((java.lang.Object) charSequence);
        }
        if (this.f295631e < 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence) && java.util.regex.Pattern.compile(".*?[a-zA-Z]+.*?").matcher(charSequence).matches()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f295629g, "force use std font");
            if (charSequence instanceof java.lang.String) {
                charSequence = ((java.lang.String) charSequence).toLowerCase();
            }
        }
        super.setText(charSequence, bufferType);
    }

    /* renamed from: setTypeface */
    public void m83145x4e4ad719(int i17) {
        this.f295631e = i17;
        try {
            setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(i17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f295629g, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public C22904x897710ab(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f295630d = "";
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270121k, i17, 0);
        this.f295631e = obtainStyledAttributes.getInteger(1, 4);
        this.f295632f = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        try {
            setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(this.f295631e)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f295629g, "updateWalletTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
