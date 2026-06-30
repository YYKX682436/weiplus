package com.p314xaae8f345.mm.p685x8ad1196e.ui;

/* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView */
/* loaded from: classes14.dex */
public class C10452xae330a2a extends android.widget.LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f146481o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f146482d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f146483e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f146484f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f146485g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f146486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f146487i;

    /* renamed from: m, reason: collision with root package name */
    public ur.g f146488m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f146489n;

    public C10452xae330a2a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146487i = "";
        this.f146488m = ur.g.UserInput;
        this.f146489n = new ur.e(this);
        a();
    }

    public void a() {
        ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(m43735x295de12(), (android.view.ViewGroup) this, true);
        this.f146486h = findViewById(com.p314xaae8f345.mm.R.id.f568750nx3);
        this.f146482d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f146484f = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f146483e = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.bxn);
        this.f146484f.setOnKeyListener(new ur.a(this));
        this.f146484f.addTextChangedListener(new ur.b(this));
        this.f146484f.setOnFocusChangeListener(this.f146489n);
        this.f146484f.setOnEditorActionListener(new ur.c(this));
        this.f146483e.setOnClickListener(new ur.d(this));
        ck5.f b17 = ck5.f.b(this.f146484f);
        b17.f124094f = 0;
        b17.f124093e = 100;
        b17.d(null);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f146483e.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: getClearBtn */
    public android.widget.ImageButton m43730xaaf4ce45() {
        return this.f146483e;
    }

    /* renamed from: getEditText */
    public android.widget.EditText m43731xdb574fcd() {
        return this.f146484f;
    }

    /* renamed from: getHighlightColor */
    public int m43732xbd65005() {
        return this.f146484f.getHighlightColor();
    }

    /* renamed from: getIconView */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m43733x4fdf4434() {
        return this.f146482d;
    }

    /* renamed from: getInEditTextQuery */
    public java.lang.String m43734x134c2d56() {
        return this.f146484f.getText().toString().trim();
    }

    /* renamed from: getLayoutById */
    public int m43735x295de12() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a7e;
    }

    /* renamed from: getTagPanel */
    public android.view.View m43736x4d774800() {
        return this.f146486h;
    }

    /* renamed from: getTextChangeStatus */
    public ur.g m43737x491af105() {
        return this.f146488m;
    }

    /* renamed from: getTotalQuery */
    public java.lang.String m43738xc3706fda() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f146484f.getText().toString());
        return stringBuffer.toString().trim();
    }

    /* renamed from: setEditTextDrawableLeft */
    public void m43739xa8369d3e(int i17) {
        if (i17 == -1) {
            this.f146484f.setCompoundDrawablesRelative(null, null, null, null);
            return;
        }
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(i17);
        drawable.setBounds(0, 0, i65.a.b(getContext(), 15), i65.a.b(getContext(), 15));
        this.f146484f.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    /* renamed from: setEmojiSearchEditTextListener */
    public void m43740xadd8e017(ur.f fVar) {
    }

    /* renamed from: setHint */
    public void m43741x764b0e09(java.lang.String str) {
        this.f146484f.setHint(str);
        this.f146485g = str;
    }

    /* renamed from: setText */
    public void m43742x765074af(android.text.SpannableString spannableString) {
        ur.g gVar = ur.g.UserInput;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSearch", "setText: %s", spannableString);
        this.f146488m = ur.g.SetText;
        this.f146484f.setText(spannableString);
        android.text.Selection.setSelection(this.f146484f.getText(), this.f146484f.getText().length());
        this.f146488m = gVar;
    }

    public C10452xae330a2a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f146487i = "";
        this.f146488m = ur.g.UserInput;
        this.f146489n = new ur.e(this);
        a();
    }

    /* renamed from: setText */
    public void m43743x765074af(java.lang.String str) {
        ur.g gVar = ur.g.UserInput;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSearch", "setText: %s", str);
        this.f146488m = ur.g.SetText;
        this.f146484f.setText(str);
        android.text.Selection.setSelection(this.f146484f.getText(), this.f146484f.getText().length());
        this.f146488m = gVar;
    }
}
