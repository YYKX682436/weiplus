package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaRegionEditViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<android.view.View> implements com.tencent.kinda.gen.KRegionEditView {
    private int REQUEST_CODE;
    private java.lang.String cityCode;
    private java.lang.String countryCode;
    private java.util.ArrayList<java.lang.String> excludeAreaList;
    private com.tencent.kinda.gen.KRegionEditViewOnRegionSelectedCallback mCallback;
    private android.widget.LinearLayout mContainer;
    private android.content.Context mContext;
    private android.widget.EditText mEditText;
    private java.lang.String provinceCode;
    private boolean mShowDomesticCity = false;
    private boolean mShowSelectedLocation = true;
    private boolean mAutoLocation = false;
    private ej0.f intentHandler = new ej0.f() { // from class: com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.1
        @Override // ej0.f
        public void handle(int i17, android.content.Intent intent) {
            if (i17 != -1) {
                return;
            }
            com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.countryCode = intent.getStringExtra("Country");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("Contact_City"))) {
                com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.provinceCode = intent.getStringExtra("Contact_Province");
                com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.cityCode = intent.getStringExtra("Contact_City");
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("Contact_Province"))) {
                com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl kindaRegionEditViewImpl = com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this;
                kindaRegionEditViewImpl.cityCode = kindaRegionEditViewImpl.countryCode;
            } else {
                com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.cityCode = intent.getStringExtra("Contact_Province");
            }
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                sb6.append(" ");
                sb6.append(stringExtra2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                sb6.append(" ");
                sb6.append(stringExtra3);
            }
            com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.mEditText.setText(sb6.toString());
            com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.mContainer.setContentDescription(sb6.toString());
            if (com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.mCallback != null) {
                com.tencent.kinda.framework.widget.base.KindaRegionEditViewImpl.this.mCallback.onRegionSelected();
            }
        }
    };

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setSingleLine(false);
        this.mEditText.setHint(com.tencent.mm.R.string.f493512kj3);
        this.mEditText.setTextSize(0, com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(context, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mContext = context;
        if (context instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
            int andIncrement = ((com.tencent.mm.framework.app.UIPageFragmentActivity) context).f68163s.getAndIncrement();
            this.REQUEST_CODE = andIncrement;
            com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = (com.tencent.mm.framework.app.UIPageFragmentActivity) this.mContext;
            uIPageFragmentActivity.f68164t.put(java.lang.Integer.valueOf(andIncrement), this.intentHandler);
        }
        com.tencent.kinda.framework.widget.base.LayoutWrapper layoutWrapper = new com.tencent.kinda.framework.widget.base.LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        layoutWrapper.setContentDescription(context.getString(com.tencent.mm.R.string.f493512kj3));
        return this.mContainer;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public boolean getAutoLocation() {
        return this.mAutoLocation;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public java.lang.String getCity() {
        return this.cityCode;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public java.lang.String getCountry() {
        return this.countryCode;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public java.lang.String getProvince() {
        return this.provinceCode;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public boolean getShowDomesticCity() {
        return this.mShowDomesticCity;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public boolean getShowSelectedLocation() {
        return this.mShowSelectedLocation;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public boolean isUSOrCA() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.countryCode)) {
            return false;
        }
        return "US".equals(this.countryCode) || "CA".equals(this.countryCode);
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setAreaExcludeArray(java.util.ArrayList<java.lang.String> arrayList) {
        this.excludeAreaList = arrayList;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setAutoLocation(boolean z17) {
        this.mAutoLocation = z17;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setFocus(boolean z17) {
        if (z17) {
            android.content.Context context = this.mContext;
            if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
                ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).hideTenpayKB();
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.tools.MultiStageCitySelectUI");
                intent.putExtra("GetAddress", true);
                intent.putExtra("IsNeedShowSearchBar", this.mShowDomesticCity);
                intent.putExtra("IsRealNameVerifyScene", this.mShowDomesticCity);
                intent.putExtra("ShowSelectedLocation", this.mShowSelectedLocation);
                intent.putExtra("IsAutoPosition", this.mAutoLocation);
                java.util.ArrayList<java.lang.String> arrayList = this.excludeAreaList;
                if (arrayList != null && !arrayList.isEmpty()) {
                    intent.putStringArrayListExtra("BlockedCountries", this.excludeAreaList);
                }
                ((com.tencent.kinda.framework.widget.base.BaseFrActivity) this.mContext).startActivityForResult(intent, this.REQUEST_CODE);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setOnRegionSelectedCallback(com.tencent.kinda.gen.KRegionEditViewOnRegionSelectedCallback kRegionEditViewOnRegionSelectedCallback) {
        this.mCallback = kRegionEditViewOnRegionSelectedCallback;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setOriginRegion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.countryCode = str;
        this.provinceCode = str2;
        this.cityCode = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            return;
        }
        this.mEditText.setText(str4);
        this.mContainer.setContentDescription(str4);
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setShowDomesticCity(boolean z17) {
        this.mShowDomesticCity = z17;
    }

    @Override // com.tencent.kinda.gen.KRegionEditView
    public void setShowSelectedLocation(boolean z17) {
        this.mShowSelectedLocation = z17;
    }
}
