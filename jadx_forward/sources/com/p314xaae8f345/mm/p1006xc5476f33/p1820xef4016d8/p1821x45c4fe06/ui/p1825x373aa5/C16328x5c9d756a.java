package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1825x373aa5;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView */
/* loaded from: classes9.dex */
public class C16328x5c9d756a extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f226594d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f226595e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik f226596f;

    public C16328x5c9d756a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_s, (android.view.ViewGroup) this, true);
        this.f226594d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) inflate.findViewById(com.p314xaae8f345.mm.R.id.j6x);
        this.f226595e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j6z);
        this.f226594d.setOnFocusChangeListener(new qb3.a(this));
        ck5.f b17 = ck5.f.b(this.f226594d);
        b17.f124094f = 0;
        b17.f124093e = 24;
        b17.f124089a = false;
        b17.d(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public java.lang.String d(int i17) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int e() {
        return 0;
    }

    /* renamed from: getInput */
    public java.lang.String m66047x7498fe14() {
        return this.f226594d.getText().toString();
    }

    /* renamed from: getInputViewId */
    public int m66048xcc1739d4() {
        return getId();
    }

    /* renamed from: setHintText */
    public void m66049x1eba9ad6(java.lang.String str) {
        this.f226594d.setHint(str);
    }

    /* renamed from: setOnInputValidChangerListener */
    public void m66050x4af3f603(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar) {
        this.f226596f = ikVar;
    }

    /* renamed from: setTitle */
    public void m66051x53bfe316(java.lang.String str) {
        this.f226595e.setText(str);
    }
}
