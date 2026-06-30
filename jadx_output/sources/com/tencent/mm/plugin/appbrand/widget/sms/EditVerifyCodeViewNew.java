package com.tencent.mm.plugin.appbrand.widget.sms;

/* loaded from: classes7.dex */
public class EditVerifyCodeViewNew extends android.widget.RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f92109g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView[] f92110d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f92111e;

    /* renamed from: f, reason: collision with root package name */
    public xl1.i f92112f;

    public EditVerifyCodeViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92110d = new android.widget.TextView[6];
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a59, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0v);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0w);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0x);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0y);
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c0z);
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483778c10);
        android.widget.TextView[] textViewArr = this.f92110d;
        textViewArr[0] = textView;
        textViewArr[1] = textView2;
        textViewArr[2] = textView3;
        textViewArr[3] = textView4;
        textViewArr[4] = textView5;
        textViewArr[5] = textView6;
        textView.setSelected(true);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.ox8);
        this.f92111e = editText;
        editText.addTextChangedListener(new xl1.e(this));
        this.f92111e.setOnFocusChangeListener(new xl1.f(this));
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f92111e.setFocusable(true);
        this.f92111e.setFocusableInTouchMode(true);
        b();
    }

    public void b() {
        ((ku5.t0) ku5.t0.f312615d).B(new xl1.g(this));
    }

    public android.widget.EditText getEditText() {
        return this.f92111e;
    }

    public java.lang.String getText() {
        return this.f92111e.getText().toString();
    }

    public void setCodeEditCompleteListener(xl1.i iVar) {
        this.f92112f = iVar;
    }

    public void setText(java.lang.String str) {
        this.f92111e.setText(str);
    }

    public EditVerifyCodeViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f92110d = new android.widget.TextView[6];
        a(context);
    }
}
