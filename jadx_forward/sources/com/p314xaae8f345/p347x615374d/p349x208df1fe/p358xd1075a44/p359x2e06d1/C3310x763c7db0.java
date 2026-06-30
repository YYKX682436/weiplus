package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl */
/* loaded from: classes9.dex */
public class C3310x763c7db0 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.view.View> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e {

    /* renamed from: REQUEST_CODE */
    private int f12851xd9888dbd;

    /* renamed from: cityCode */
    private java.lang.String f12852xab3e0df8;

    /* renamed from: countryCode */
    private java.lang.String f12853xa7f5bea3;

    /* renamed from: excludeAreaList */
    private java.util.ArrayList<java.lang.String> f12854x67e1aec5;

    /* renamed from: mCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3517xa358ce01 f12857x1ab9c7d2;

    /* renamed from: mContainer */
    private android.widget.LinearLayout f12858x62389694;

    /* renamed from: mContext */
    private android.content.Context f12859xd6cfe882;

    /* renamed from: mEditText */
    private android.widget.EditText f12860x847ab9e4;

    /* renamed from: provinceCode */
    private java.lang.String f12863xf3db353d;

    /* renamed from: mShowDomesticCity */
    private boolean f12861x41ac75d3 = false;

    /* renamed from: mShowSelectedLocation */
    private boolean f12862xe9596c9a = true;

    /* renamed from: mAutoLocation */
    private boolean f12856xfe87db91 = false;

    /* renamed from: intentHandler */
    private ej0.f f12855x4ea1510e = new ej0.f() { // from class: com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.1
        @Override // ej0.f
        /* renamed from: handle */
        public void mo24862xb7026e28(int i17, android.content.Intent intent) {
            if (i17 != -1) {
                return;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12853xa7f5bea3 = intent.getStringExtra("Country");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("Contact_City"))) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12863xf3db353d = intent.getStringExtra("Contact_Province");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12852xab3e0df8 = intent.getStringExtra("Contact_City");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("Contact_Province"))) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0 c3310x763c7db0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this;
                c3310x763c7db0.f12852xab3e0df8 = c3310x763c7db0.f12853xa7f5bea3;
            } else {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12852xab3e0df8 = intent.getStringExtra("Contact_Province");
            }
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                sb6.append(" ");
                sb6.append(stringExtra2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                sb6.append(" ");
                sb6.append(stringExtra3);
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12860x847ab9e4.setText(sb6.toString());
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12858x62389694.setContentDescription(sb6.toString());
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12857x1ab9c7d2 != null) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3310x763c7db0.this.f12857x1ab9c7d2.mo28133xf3a9f16e();
            }
        }
    };

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.f12860x847ab9e4 = editText;
        editText.setInputType(0);
        this.f12860x847ab9e4.setFocusable(false);
        this.f12860x847ab9e4.setBackground(null);
        this.f12860x847ab9e4.setSingleLine(false);
        this.f12860x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.f575045kj3);
        this.f12860x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f));
        this.f12860x847ab9e4.setPadding(0, 0, 0, 0);
        this.f12859xd6cfe882 = context;
        if (context instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
            int andIncrement = ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) context).f149696s.getAndIncrement();
            this.f12851xd9888dbd = andIncrement;
            com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) this.f12859xd6cfe882;
            activityC10720x85cbbee2.f149697t.put(java.lang.Integer.valueOf(andIncrement), this.f12855x4ea1510e);
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9 c3326x9cc74de9 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9(context, this.f12860x847ab9e4);
        this.f12858x62389694 = c3326x9cc74de9;
        c3326x9cc74de9.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575045kj3));
        return this.f12858x62389694;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getAutoLocation */
    public boolean mo26611xc7e554fa() {
        return this.f12856xfe87db91;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getCity */
    public java.lang.String mo26612xfb7e01e1() {
        return this.f12852xab3e0df8;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getCountry */
    public java.lang.String mo26613x76e49360() {
        return this.f12853xa7f5bea3;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getFocus */
    public boolean mo26614x746efb22() {
        return this.f12860x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getProvince */
    public java.lang.String mo26615x40fe68a6() {
        return this.f12863xf3db353d;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getShowDomesticCity */
    public boolean mo26616xc36d12bc() {
        return this.f12861x41ac75d3;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: getShowSelectedLocation */
    public boolean mo26617x2e3f6d03() {
        return this.f12862xe9596c9a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: isUSOrCA */
    public boolean mo26618xf48b2ee9() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f12853xa7f5bea3)) {
            return false;
        }
        return "US".equals(this.f12853xa7f5bea3) || "CA".equals(this.f12853xa7f5bea3);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setAreaExcludeArray */
    public void mo26619xfb4bf24e(java.util.ArrayList<java.lang.String> arrayList) {
        this.f12854x67e1aec5 = arrayList;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setAutoLocation */
    public void mo26620xfe2e5006(boolean z17) {
        this.f12856xfe87db91 = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setFocus */
    public void mo26621x52fd1596(boolean z17) {
        if (z17) {
            android.content.Context context = this.f12859xd6cfe882;
            if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26052xd46dd964();
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.tools.MultiStageCitySelectUI");
                intent.putExtra("GetAddress", true);
                intent.putExtra("IsNeedShowSearchBar", this.f12861x41ac75d3);
                intent.putExtra("IsRealNameVerifyScene", this.f12861x41ac75d3);
                intent.putExtra("ShowSelectedLocation", this.f12862xe9596c9a);
                intent.putExtra("IsAutoPosition", this.f12856xfe87db91);
                java.util.ArrayList<java.lang.String> arrayList = this.f12854x67e1aec5;
                if (arrayList != null && !arrayList.isEmpty()) {
                    intent.putStringArrayListExtra("BlockedCountries", this.f12854x67e1aec5);
                }
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) this.f12859xd6cfe882).startActivityForResult(intent, this.f12851xd9888dbd);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setOnRegionSelectedCallback */
    public void mo26622x36008255(com.p314xaae8f345.p347x615374d.gen.AbstractC3517xa358ce01 abstractC3517xa358ce01) {
        this.f12857x1ab9c7d2 = abstractC3517xa358ce01;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setOriginRegion */
    public void mo26623xfcb7db3c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f12853xa7f5bea3 = str;
        this.f12863xf3db353d = str2;
        this.f12852xab3e0df8 = str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            return;
        }
        this.f12860x847ab9e4.setText(str4);
        this.f12858x62389694.setContentDescription(str4);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setShowDomesticCity */
    public void mo26624x6769a7c8(boolean z17) {
        this.f12861x41ac75d3 = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3516xf4e34c0e
    /* renamed from: setShowSelectedLocation */
    public void mo26625xa8929c0f(boolean z17) {
        this.f12862xe9596c9a = z17;
    }
}
