package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ih extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f290459d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f290460e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f290461f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.hh f290462g;

    public ih(android.content.Context context) {
        super(context);
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569447bg, (android.view.ViewGroup) this, true);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a)).setOnClickListener(new com.p314xaae8f345.mm.ui.eh(this));
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.mdy);
        this.f290459d = editText;
        editText.requestFocus();
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.bxn);
        this.f290460e = imageButton;
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.ui.fh(this));
        this.f290459d.addTextChangedListener(new com.p314xaae8f345.mm.ui.gh(this));
    }

    /* renamed from: getSearchEditText */
    public android.widget.EditText m80722xce9d8115() {
        return this.f290459d;
    }

    /* renamed from: setHint */
    public void m80723x764b0e09(java.lang.String str) {
        this.f290461f = str;
    }

    /* renamed from: setSearchViewListener */
    public void m80724xcd6a5043(com.p314xaae8f345.mm.ui.hh hhVar) {
        this.f290462g = hhVar;
    }
}
