package com.tencent.mm.plugin.appbrand.widget.sms;

/* loaded from: classes5.dex */
public class EditVerifyCodeView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f92104d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView[] f92105e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView[] f92106f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.sms.VerifyCodeEditText f92107g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnKeyListener f92108h;

    public EditVerifyCodeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92104d = new java.lang.StringBuilder();
        this.f92105e = new android.widget.ImageView[6];
        this.f92106f = new android.widget.TextView[6];
        this.f92108h = new xl1.c(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a58, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0v);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0w);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0x);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0y);
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0z);
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483778c10);
        android.widget.TextView[] textViewArr = this.f92106f;
        textViewArr[0] = textView;
        textViewArr[1] = textView2;
        textViewArr[2] = textView3;
        textViewArr[3] = textView4;
        textViewArr[4] = textView5;
        textViewArr[5] = textView6;
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c0b);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c0c);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c0d);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c0e);
        android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c0f);
        android.widget.ImageView imageView6 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c0g);
        android.widget.ImageView[] imageViewArr = this.f92105e;
        imageViewArr[0] = imageView;
        imageViewArr[1] = imageView2;
        imageViewArr[2] = imageView3;
        imageViewArr[3] = imageView4;
        imageViewArr[4] = imageView5;
        imageViewArr[5] = imageView6;
        com.tencent.mm.plugin.appbrand.widget.sms.VerifyCodeEditText verifyCodeEditText = (com.tencent.mm.plugin.appbrand.widget.sms.VerifyCodeEditText) inflate.findViewById(com.tencent.mm.R.id.ox8);
        this.f92107g = verifyCodeEditText;
        verifyCodeEditText.addTextChangedListener(new xl1.a(this));
        this.f92107g.setKeyListener(new xl1.b(this));
        this.f92107g.setOnKeyListener(this.f92108h);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public com.tencent.mm.plugin.appbrand.widget.sms.VerifyCodeEditText getEditText() {
        return this.f92107g;
    }

    public java.lang.String getText() {
        return this.f92104d.toString();
    }

    public void setCodeEditCompleListener(xl1.d dVar) {
    }

    public void setText(java.lang.String str) {
        java.lang.StringBuilder sb6 = this.f92104d;
        sb6.delete(0, sb6.length());
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        int length = sb7.length();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeView", "mBuilder:" + ((java.lang.Object) sb6));
        android.widget.ImageView[] imageViewArr = this.f92105e;
        android.widget.TextView[] textViewArr = this.f92106f;
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

    public EditVerifyCodeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f92104d = new java.lang.StringBuilder();
        this.f92105e = new android.widget.ImageView[6];
        this.f92106f = new android.widget.TextView[6];
        this.f92108h = new xl1.c(this);
        a(context);
    }
}
