package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView */
/* loaded from: classes9.dex */
public class C19148x59bc9c3a extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262250d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f262251e;

    /* renamed from: f, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f262252f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f262253g;

    /* renamed from: h, reason: collision with root package name */
    public int f262254h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f262255i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f262256m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f262257n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f262258o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f262259p;

    public C19148x59bc9c3a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f262254h = 0;
        this.f262256m = "";
        this.f262257n = "";
        this.f262258o = true;
        a(context);
        b(context, attributeSet, -1);
    }

    public final void a(android.content.Context context) {
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7y, this);
        this.f262250d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f567827ku0);
        this.f262251e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.kue);
        this.f262253g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kyc);
        this.f262250d.setOnClickListener(new gt4.d1(this));
        this.f262252f = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) this.f262251e.findViewById(com.p314xaae8f345.mm.R.id.f567921l30);
        if (getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            this.f262251e.m83210x25bc1800(new gt4.e1(this));
            this.f262251e.m83173x1e821d71().setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kix));
            this.f262251e.m83206xeace15c1(new gt4.f1(this));
        }
        java.util.List b17 = u11.b.b(true);
        this.f262255i = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            u11.a aVar = (u11.a) it.next();
            this.f262255i.put(aVar.f505261b, aVar);
        }
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270120j, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f262251e.m83199x764b0e09(context.getString(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.f262251e.m83214xdc742163(context.getString(resourceId2));
        }
    }

    public void c() {
        this.f262254h = 1;
        u11.a aVar = (u11.a) ((java.util.HashMap) this.f262255i).get("86");
        this.f262257n = aVar.f505261b;
        java.lang.String str = aVar.f505262c;
        this.f262256m = str;
        this.f262250d.m83213x765074af(str);
        this.f262252f.setText(this.f262257n);
        this.f262250d.setVisibility(0);
        this.f262252f.setVisibility(0);
        this.f262253g.setVisibility(0);
        this.f262252f.addTextChangedListener(new gt4.h1(this));
        this.f262252f.setOnFocusChangeListener(new gt4.i1(this));
    }

    public boolean d(int i17, int i18, android.content.Intent intent) {
        if (i17 != 65521) {
            return false;
        }
        if (i18 != 100) {
            return true;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPhoneInputView", "countryName: %s, countryCode: %s", this.f262256m, this.f262257n);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPhoneInputView", "cancel pick");
            return true;
        }
        this.f262256m = stringExtra;
        this.f262257n = stringExtra2;
        this.f262258o = false;
        this.f262250d.m83213x765074af(stringExtra);
        this.f262252f.setText(this.f262257n);
        this.f262252f.clearFocus();
        return true;
    }

    /* renamed from: getCountryCode */
    public java.lang.String m73926x81cc056d() {
        return this.f262254h == 0 ? "86" : this.f262252f.getText().toString();
    }

    /* renamed from: getPhoneNumberEt */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 m73927xcfff45b0() {
        return this.f262251e;
    }

    public C19148x59bc9c3a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262254h = 0;
        this.f262256m = "";
        this.f262257n = "";
        this.f262258o = true;
        a(context);
        b(context, attributeSet, i17);
    }
}
