package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew */
/* loaded from: classes7.dex */
public class C12811x748ecb extends android.widget.RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f173642g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView[] f173643d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f173644e;

    /* renamed from: f, reason: collision with root package name */
    public xl1.i f173645f;

    public C12811x748ecb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173643d = new android.widget.TextView[6];
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a59, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0v);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0w);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0x);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0y);
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c0z);
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565311c10);
        android.widget.TextView[] textViewArr = this.f173643d;
        textViewArr[0] = textView;
        textViewArr[1] = textView2;
        textViewArr[2] = textView3;
        textViewArr[3] = textView4;
        textViewArr[4] = textView5;
        textViewArr[5] = textView6;
        textView.setSelected(true);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.ox8);
        this.f173644e = editText;
        editText.addTextChangedListener(new xl1.e(this));
        this.f173644e.setOnFocusChangeListener(new xl1.f(this));
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f173644e.setFocusable(true);
        this.f173644e.setFocusableInTouchMode(true);
        b();
    }

    public void b() {
        ((ku5.t0) ku5.t0.f394148d).B(new xl1.g(this));
    }

    /* renamed from: getEditText */
    public android.widget.EditText m53694xdb574fcd() {
        return this.f173644e;
    }

    /* renamed from: getText */
    public java.lang.String m53695xfb85ada3() {
        return this.f173644e.getText().toString();
    }

    /* renamed from: setCodeEditCompleteListener */
    public void m53696xfc227346(xl1.i iVar) {
        this.f173645f = iVar;
    }

    /* renamed from: setText */
    public void m53697x765074af(java.lang.String str) {
        this.f173644e.setText(str);
    }

    public C12811x748ecb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173643d = new android.widget.TextView[6];
        a(context);
    }
}
