package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KCountryCallingCodeViewImpl extends com.tencent.kinda.framework.widget.base.MMKView implements com.tencent.kinda.gen.KCountryCallingCodeView {
    private static final java.lang.String TAG = "KCountryCallingCodeView";
    private java.lang.String[] mBannedCountryIsoCodes;
    private com.tencent.kinda.gen.KCountryCallingCodeViewOnSelectCallback mCallback;
    private java.lang.String mCountryCode;
    private java.util.HashMap<java.lang.String, u11.a> mCountryCodeMap;
    private java.lang.String mCountryIsoCode;
    private java.lang.String mCountryName;
    private android.widget.EditText mEditText;
    private boolean mHideCode;
    private java.util.HashMap<java.lang.String, u11.a> mISOCountryCodeMap;
    private com.tencent.mm.framework.app.UIPageFragmentActivity mUIPageFragmentActivity;

    private void initData(android.app.Activity activity) {
        java.util.List b17 = u11.b.b(true);
        this.mCountryCodeMap = new java.util.HashMap<>();
        this.mISOCountryCodeMap = new java.util.HashMap<>();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            u11.a aVar = (u11.a) it.next();
            if (aVar != null) {
                this.mCountryCodeMap.put(aVar.f423728b, aVar);
                this.mISOCountryCodeMap.put(aVar.f423727a, aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCountryName() {
        java.lang.String str = this.mCountryName;
        if (str != null && str.length() > 0) {
            this.mEditText.setText(this.mCountryName);
            this.mEditText.setTextColor(this.mUIPageFragmentActivity.getResources().getColor(com.tencent.mm.R.color.a0c));
            return;
        }
        java.lang.String charSequence = this.mEditText.getHint() != null ? this.mEditText.getHint().toString() : null;
        if (charSequence == null || charSequence.length() == 0) {
            this.mEditText.setText(com.tencent.mm.R.string.kwl);
            this.mEditText.setTextColor(this.mUIPageFragmentActivity.getResources().getColor(com.tencent.mm.R.color.f479482a31));
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(context, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 16.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
            this.mUIPageFragmentActivity = (com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity;
            initData(topOrUIPageFragmentActivity);
        } else {
            com.tencent.mars.xlog.Log.e(TAG, "没有找到UIPageFragmentActivity，却展示了KCountryCallingCodeView");
        }
        return this.mEditText;
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public java.lang.String getCountryCode() {
        return this.mCountryCode;
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public boolean getFocus() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public boolean getHideCode() {
        return this.mHideCode;
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public java.lang.String getNationality() {
        return this.mCountryIsoCode;
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public java.lang.String getPlaceHolder() {
        return this.mEditText.getHint().toString();
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setCountryCode(java.lang.String str) {
        if (this.mCountryCodeMap != null) {
            if (str.contains("+")) {
                str = str.substring(1);
            }
            if (str.equals("1") && this.mCountryIsoCode.equals("CA")) {
                return;
            }
            if (str.equals("1") && this.mCountryIsoCode.equals("US")) {
                return;
            }
            if (!this.mCountryCodeMap.containsKey(str) || this.mCountryCodeMap.get(str) == null) {
                com.tencent.mars.xlog.Log.i(TAG, "country code is %s, can not found valid data, reset data to null", str);
                this.mCountryName = "";
                this.mCountryCode = "";
                this.mCountryIsoCode = "";
            } else {
                u11.a aVar = this.mCountryCodeMap.get(str);
                com.tencent.mars.xlog.Log.i(TAG, "country code is %s, find target data, country name is %s", str, this.mCountryName);
                this.mCountryCode = str;
                this.mCountryName = aVar.f423729c;
                this.mCountryIsoCode = aVar.f423727a;
            }
        } else {
            com.tencent.mars.xlog.Log.e(TAG, "输入国家代码后无法找到国家名称，因为国家代码、名称映射表为空！");
        }
        updateCountryName();
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setFocus(boolean z17) {
        if (!z17 || this.mUIPageFragmentActivity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CountryCodeUI_isShowCountryCode", !this.mHideCode);
        intent.putExtra("exclude_countries_iso", this.mBannedCountryIsoCodes);
        intent.setClassName(this.mUIPageFragmentActivity, "com.tencent.mm.ui.tools.CountryCodeUI");
        this.mUIPageFragmentActivity.startActivityForResult(intent, (hashCode() & 16777215) + com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_ABS);
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setHideCode(boolean z17) {
        this.mHideCode = z17;
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setNationality(java.lang.String str) {
        java.util.HashMap<java.lang.String, u11.a> hashMap = this.mISOCountryCodeMap;
        if (hashMap != null) {
            java.util.Iterator<u11.a> it = hashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u11.a next = it.next();
                if (next.f423727a.equals(str)) {
                    this.mCountryCode = next.f423728b;
                    this.mCountryName = next.f423729c;
                    this.mCountryIsoCode = next.f423727a;
                    break;
                }
            }
        }
        updateCountryName();
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setNationalityExcludeArray(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList != null) {
            this.mBannedCountryIsoCodes = com.tencent.mm.sdk.platformtools.t8.d1(arrayList);
        }
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setOnSelectCallback(com.tencent.kinda.gen.KCountryCallingCodeViewOnSelectCallback kCountryCallingCodeViewOnSelectCallback) {
        this.mCallback = kCountryCallingCodeViewOnSelectCallback;
        ej0.f fVar = new ej0.f() { // from class: com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.1
            @Override // ej0.f
            public void handle(int i17, android.content.Intent intent) {
                java.lang.String stringExtra = intent.getStringExtra("country_name");
                java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
                java.lang.String stringExtra3 = intent.getStringExtra("iso_code");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.TAG, "countryName or countrycode is null , user cancel case");
                    return;
                }
                com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryName = stringExtra;
                com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryCode = stringExtra2;
                com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryIsoCode = stringExtra3;
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.TAG, "handle back mCountryName:%s.mCountryCode:%s mCountryIsoCode:%s", com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryName, com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryCode, com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryIsoCode);
                com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.updateCountryName();
                com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCallback.onSelect(com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryCode, com.tencent.kinda.framework.widget.base.KCountryCallingCodeViewImpl.this.mCountryIsoCode);
            }
        };
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = this.mUIPageFragmentActivity;
        if (uIPageFragmentActivity != null) {
            uIPageFragmentActivity.f68164t.put(java.lang.Integer.valueOf((hashCode() & 16777215) + com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_ABS), fVar);
        }
    }

    @Override // com.tencent.kinda.gen.KCountryCallingCodeView
    public void setPlaceHolder(java.lang.String str) {
        this.mEditText.setHint(str);
    }
}
