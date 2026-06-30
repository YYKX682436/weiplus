package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView */
/* loaded from: classes9.dex */
public class C16405x4886faea extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f228205d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f228206e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f228207f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f228208g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a f228209h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik f228210i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnClickListener f228211m;

    public C16405x4886faea(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bv8, (android.view.ViewGroup) this, true);
        this.f228205d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) inflate.findViewById(com.p314xaae8f345.mm.R.id.j6x);
        this.f228206e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j6z);
        this.f228207f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.j0o);
        this.f228208g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j0p);
        this.f228209h = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a) inflate.findViewById(com.p314xaae8f345.mm.R.id.j0n);
        this.f228205d.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gp(this));
        this.f228207f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.hp(this));
        this.f228207f.setVisibility(8);
        this.f228208g.setContentDescription(inflate.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gj7));
        this.f228205d.setMaxLines(Integer.MAX_VALUE);
        this.f228205d.mo81583x7e4f2d39(new android.text.InputFilter[0]);
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

    public void f(boolean z17) {
        if (z17) {
            this.f228207f.setVisibility(8);
            return;
        }
        this.f228207f.setVisibility(0);
        this.f228208g.setVisibility(0);
        this.f228209h.setVisibility(8);
    }

    public void g(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f228207f.setTag("delete");
        this.f228208g.setVisibility(8);
        this.f228209h.setVisibility(0);
        this.f228209h.m43719xc040f7d2(interfaceC4987x84e327cb);
    }

    /* renamed from: getInput */
    public java.lang.String m66211x7498fe14() {
        return this.f228205d.getText().toString();
    }

    /* renamed from: getInputViewId */
    public int m66212xcc1739d4() {
        return getId();
    }

    /* renamed from: setHintText */
    public void m66213x1eba9ad6(java.lang.String str) {
        this.f228205d.setHint(str);
    }

    /* renamed from: setOnInputValidChangerListener */
    public void m66214x4af3f603(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar) {
        this.f228210i = ikVar;
    }

    /* renamed from: setTitle */
    public void m66215x53bfe316(java.lang.String str) {
        this.f228206e.setText(str);
    }

    /* renamed from: setmOnEmojiSelectClickListener */
    public void m66216x6bdd5a44(android.view.View.OnClickListener onClickListener) {
        this.f228211m = onClickListener;
    }
}
