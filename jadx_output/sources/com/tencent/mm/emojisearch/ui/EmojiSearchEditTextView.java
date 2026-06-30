package com.tencent.mm.emojisearch.ui;

/* loaded from: classes14.dex */
public class EmojiSearchEditTextView extends android.widget.LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f64948o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f64949d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f64950e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f64951f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f64952g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f64953h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f64954i;

    /* renamed from: m, reason: collision with root package name */
    public ur.g f64955m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f64956n;

    public EmojiSearchEditTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64954i = "";
        this.f64955m = ur.g.UserInput;
        this.f64956n = new ur.e(this);
        a();
    }

    public void a() {
        ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getLayoutById(), (android.view.ViewGroup) this, true);
        this.f64953h = findViewById(com.tencent.mm.R.id.f487217nx3);
        this.f64949d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n);
        this.f64951f = (android.widget.EditText) findViewById(com.tencent.mm.R.id.d98);
        this.f64950e = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.bxn);
        this.f64951f.setOnKeyListener(new ur.a(this));
        this.f64951f.addTextChangedListener(new ur.b(this));
        this.f64951f.setOnFocusChangeListener(this.f64956n);
        this.f64951f.setOnEditorActionListener(new ur.c(this));
        this.f64950e.setOnClickListener(new ur.d(this));
        ck5.f b17 = ck5.f.b(this.f64951f);
        b17.f42561f = 0;
        b17.f42560e = 100;
        b17.d(null);
        if (com.tencent.mm.ui.bk.C()) {
            this.f64950e.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public android.widget.ImageButton getClearBtn() {
        return this.f64950e;
    }

    public android.widget.EditText getEditText() {
        return this.f64951f;
    }

    public int getHighlightColor() {
        return this.f64951f.getHighlightColor();
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView getIconView() {
        return this.f64949d;
    }

    public java.lang.String getInEditTextQuery() {
        return this.f64951f.getText().toString().trim();
    }

    public int getLayoutById() {
        return com.tencent.mm.R.layout.a7e;
    }

    public android.view.View getTagPanel() {
        return this.f64953h;
    }

    public ur.g getTextChangeStatus() {
        return this.f64955m;
    }

    public java.lang.String getTotalQuery() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f64951f.getText().toString());
        return stringBuffer.toString().trim();
    }

    public void setEditTextDrawableLeft(int i17) {
        if (i17 == -1) {
            this.f64951f.setCompoundDrawablesRelative(null, null, null, null);
            return;
        }
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(i17);
        drawable.setBounds(0, 0, i65.a.b(getContext(), 15), i65.a.b(getContext(), 15));
        this.f64951f.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setEmojiSearchEditTextListener(ur.f fVar) {
    }

    public void setHint(java.lang.String str) {
        this.f64951f.setHint(str);
        this.f64952g = str;
    }

    public void setText(android.text.SpannableString spannableString) {
        ur.g gVar = ur.g.UserInput;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSearch", "setText: %s", spannableString);
        this.f64955m = ur.g.SetText;
        this.f64951f.setText(spannableString);
        android.text.Selection.setSelection(this.f64951f.getText(), this.f64951f.getText().length());
        this.f64955m = gVar;
    }

    public EmojiSearchEditTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f64954i = "";
        this.f64955m = ur.g.UserInput;
        this.f64956n = new ur.e(this);
        a();
    }

    public void setText(java.lang.String str) {
        ur.g gVar = ur.g.UserInput;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSearch", "setText: %s", str);
        this.f64955m = ur.g.SetText;
        this.f64951f.setText(str);
        android.text.Selection.setSelection(this.f64951f.getText(), this.f64951f.getText().length());
        this.f64955m = gVar;
    }
}
