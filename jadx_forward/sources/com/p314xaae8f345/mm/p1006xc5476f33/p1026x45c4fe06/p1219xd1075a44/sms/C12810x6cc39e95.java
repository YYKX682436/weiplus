package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView */
/* loaded from: classes5.dex */
public class C12810x6cc39e95 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f173637d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView[] f173638e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView[] f173639f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12812xc5f5929d f173640g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnKeyListener f173641h;

    public C12810x6cc39e95(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173637d = new java.lang.StringBuilder();
        this.f173638e = new android.widget.ImageView[6];
        this.f173639f = new android.widget.TextView[6];
        this.f173641h = new xl1.c(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a58, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0v);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0w);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0x);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0y);
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0z);
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565311c10);
        android.widget.TextView[] textViewArr = this.f173639f;
        textViewArr[0] = textView;
        textViewArr[1] = textView2;
        textViewArr[2] = textView3;
        textViewArr[3] = textView4;
        textViewArr[4] = textView5;
        textViewArr[5] = textView6;
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0b);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0c);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0d);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0e);
        android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0f);
        android.widget.ImageView imageView6 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0g);
        android.widget.ImageView[] imageViewArr = this.f173638e;
        imageViewArr[0] = imageView;
        imageViewArr[1] = imageView2;
        imageViewArr[2] = imageView3;
        imageViewArr[3] = imageView4;
        imageViewArr[4] = imageView5;
        imageViewArr[5] = imageView6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12812xc5f5929d c12812xc5f5929d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12812xc5f5929d) inflate.findViewById(com.p314xaae8f345.mm.R.id.ox8);
        this.f173640g = c12812xc5f5929d;
        c12812xc5f5929d.addTextChangedListener(new xl1.a(this));
        this.f173640g.setKeyListener(new xl1.b(this));
        this.f173640g.setOnKeyListener(this.f173641h);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: getEditText */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12812xc5f5929d m53690xdb574fcd() {
        return this.f173640g;
    }

    /* renamed from: getText */
    public java.lang.String m53691xfb85ada3() {
        return this.f173637d.toString();
    }

    /* renamed from: setCodeEditCompleListener */
    public void m53692x4618b215(xl1.d dVar) {
    }

    /* renamed from: setText */
    public void m53693x765074af(java.lang.String str) {
        java.lang.StringBuilder sb6 = this.f173637d;
        sb6.delete(0, sb6.length());
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        int length = sb7.length();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeView", "mBuilder:" + ((java.lang.Object) sb6));
        android.widget.ImageView[] imageViewArr = this.f173638e;
        android.widget.TextView[] textViewArr = this.f173639f;
        if (length <= 0) {
            for (int i17 = 0; i17 < 6; i17++) {
                textViewArr[i17].setVisibility(4);
                textViewArr[i17].setText("");
                imageViewArr[i17].setVisibility(0);
            }
            return;
        }
        for (int i18 = 0; i18 < length; i18++) {
            textViewArr[i18].setVisibility(0);
            textViewArr[i18].setText(java.lang.String.valueOf(sb7.charAt(i18)));
            imageViewArr[i18].setVisibility(4);
        }
    }

    public C12810x6cc39e95(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173637d = new java.lang.StringBuilder();
        this.f173638e = new android.widget.ImageView[6];
        this.f173639f = new android.widget.TextView[6];
        this.f173641h = new xl1.c(this);
        a(context);
    }
}
