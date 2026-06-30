package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl */
/* loaded from: classes9.dex */
public class C3290xda55238b extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb {
    private static final java.lang.String TAG = "KCountryCallingCodeView";

    /* renamed from: mBannedCountryIsoCodes */
    private java.lang.String[] f12701x4d02f6ec;

    /* renamed from: mCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3445x939a9e0b f12702x1ab9c7d2;

    /* renamed from: mCountryCode */
    private java.lang.String f12703x5202cff6;

    /* renamed from: mCountryCodeMap */
    private java.util.HashMap<java.lang.String, u11.a> f12704xb547d186;

    /* renamed from: mCountryIsoCode */
    private java.lang.String f12705xfa0ca569;

    /* renamed from: mCountryName */
    private java.lang.String f12706x52079c94;

    /* renamed from: mEditText */
    private android.widget.EditText f12707x847ab9e4;

    /* renamed from: mHideCode */
    private boolean f12708xbb3a35dc;

    /* renamed from: mISOCountryCodeMap */
    private java.util.HashMap<java.lang.String, u11.a> f12709x269e2b1;

    /* renamed from: mUIPageFragmentActivity */
    private com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 f12710x1ce9ff8f;

    /* renamed from: initData */
    private void m26166xff8c0da(android.app.Activity activity) {
        java.util.List b17 = u11.b.b(true);
        this.f12704xb547d186 = new java.util.HashMap<>();
        this.f12709x269e2b1 = new java.util.HashMap<>();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            u11.a aVar = (u11.a) it.next();
            if (aVar != null) {
                this.f12704xb547d186.put(aVar.f505261b, aVar);
                this.f12709x269e2b1.put(aVar.f505260a, aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateCountryName */
    public void m26167x640bd2b8() {
        java.lang.String str = this.f12706x52079c94;
        if (str != null && str.length() > 0) {
            this.f12707x847ab9e4.setText(this.f12706x52079c94);
            this.f12707x847ab9e4.setTextColor(this.f12710x1ce9ff8f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            return;
        }
        java.lang.String charSequence = this.f12707x847ab9e4.getHint() != null ? this.f12707x847ab9e4.getHint().toString() : null;
        if (charSequence == null || charSequence.length() == 0) {
            this.f12707x847ab9e4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwl);
            this.f12707x847ab9e4.setTextColor(this.f12710x1ce9ff8f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.f12707x847ab9e4 = editText;
        editText.setInputType(0);
        this.f12707x847ab9e4.setFocusable(false);
        this.f12707x847ab9e4.setBackground(null);
        this.f12707x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 16.0f));
        this.f12707x847ab9e4.setPadding(0, 0, 0, 0);
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
            this.f12710x1ce9ff8f = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) m27313x7608d9c4;
            m26166xff8c0da(m27313x7608d9c4);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "没有找到UIPageFragmentActivity，却展示了KCountryCallingCodeView");
        }
        return this.f12707x847ab9e4;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: getCountryCode */
    public java.lang.String mo26168x81cc056d() {
        return this.f12703x5202cff6;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: getFocus */
    public boolean mo26169x746efb22() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: getHideCode */
    public boolean mo26170x1216cbc5() {
        return this.f12708xbb3a35dc;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: getNationality */
    public java.lang.String mo26171xdf5f0486() {
        return this.f12705xfa0ca569;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: getPlaceHolder */
    public java.lang.String mo26172xc6e3b85d() {
        return this.f12707x847ab9e4.getHint().toString();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setCountryCode */
    public void mo26173x183178e1(java.lang.String str) {
        if (this.f12704xb547d186 != null) {
            if (str.contains("+")) {
                str = str.substring(1);
            }
            if (str.equals("1") && this.f12705xfa0ca569.equals("CA")) {
                return;
            }
            if (str.equals("1") && this.f12705xfa0ca569.equals("US")) {
                return;
            }
            if (!this.f12704xb547d186.containsKey(str) || this.f12704xb547d186.get(str) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "country code is %s, can not found valid data, reset data to null", str);
                this.f12706x52079c94 = "";
                this.f12703x5202cff6 = "";
                this.f12705xfa0ca569 = "";
            } else {
                u11.a aVar = this.f12704xb547d186.get(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "country code is %s, find target data, country name is %s", str, this.f12706x52079c94);
                this.f12703x5202cff6 = str;
                this.f12706x52079c94 = aVar.f505262c;
                this.f12705xfa0ca569 = aVar.f505260a;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "输入国家代码后无法找到国家名称，因为国家代码、名称映射表为空！");
        }
        m26167x640bd2b8();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setFocus */
    public void mo26174x52fd1596(boolean z17) {
        if (!z17 || this.f12710x1ce9ff8f == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CountryCodeUI_isShowCountryCode", !this.f12708xbb3a35dc);
        intent.putExtra("exclude_countries_iso", this.f12701x4d02f6ec);
        intent.setClassName(this.f12710x1ce9ff8f, "com.tencent.mm.ui.tools.CountryCodeUI");
        this.f12710x1ce9ff8f.startActivityForResult(intent, (hashCode() & 16777215) + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55825xa5f977ac);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setHideCode */
    public void mo26175xccf2cd1(boolean z17) {
        this.f12708xbb3a35dc = z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setNationality */
    public void mo26176x75c477fa(java.lang.String str) {
        java.util.HashMap<java.lang.String, u11.a> hashMap = this.f12709x269e2b1;
        if (hashMap != null) {
            java.util.Iterator<u11.a> it = hashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u11.a next = it.next();
                if (next.f505260a.equals(str)) {
                    this.f12703x5202cff6 = next.f505261b;
                    this.f12706x52079c94 = next.f505262c;
                    this.f12705xfa0ca569 = next.f505260a;
                    break;
                }
            }
        }
        m26167x640bd2b8();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setNationalityExcludeArray */
    public void mo26177x7b14e1b9(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList != null) {
            this.f12701x4d02f6ec = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d1(arrayList);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setOnSelectCallback */
    public void mo26178xa921a1a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3445x939a9e0b abstractC3445x939a9e0b) {
        this.f12702x1ab9c7d2 = abstractC3445x939a9e0b;
        ej0.f fVar = new ej0.f() { // from class: com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.1
            @Override // ej0.f
            /* renamed from: handle */
            public void mo24862xb7026e28(int i17, android.content.Intent intent) {
                java.lang.String stringExtra = intent.getStringExtra("country_name");
                java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
                java.lang.String stringExtra3 = intent.getStringExtra("iso_code");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.TAG, "countryName or countrycode is null , user cancel case");
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12706x52079c94 = stringExtra;
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12703x5202cff6 = stringExtra2;
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12705xfa0ca569 = stringExtra3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.TAG, "handle back mCountryName:%s.mCountryCode:%s mCountryIsoCode:%s", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12706x52079c94, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12703x5202cff6, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12705xfa0ca569);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.m26167x640bd2b8();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12702x1ab9c7d2.mo27950x58f40bbb(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12703x5202cff6, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3290xda55238b.this.f12705xfa0ca569);
            }
        };
        com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = this.f12710x1ce9ff8f;
        if (activityC10720x85cbbee2 != null) {
            activityC10720x85cbbee2.f149697t.put(java.lang.Integer.valueOf((hashCode() & 16777215) + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55825xa5f977ac), fVar);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3444xb86aaacb
    /* renamed from: setPlaceHolder */
    public void mo26179x5d492bd1(java.lang.String str) {
        this.f12707x847ab9e4.setHint(str);
    }
}
