package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class KindaBankCardTypePickerViewImpl extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.EditText> implements com.tencent.kinda.gen.KBankCardTypePickerView {
    private java.util.ArrayList<com.tencent.kinda.gen.BankCardType> mBankCardTypeArray;
    private android.content.Context mContext;
    private android.widget.EditText mEditText;
    private com.tencent.kinda.gen.KBankCardTypePickerViewOnSelectCallback mOnSelectCallback;
    private com.tencent.mm.ui.widget.picker.c0 mOptionPiker;
    private com.tencent.kinda.gen.BankCardType mSelectedBankCardType;
    java.lang.String TAG = "KindaBankCardTypePickerViewImpl";
    private int mFirstSelectedIndex = -1;
    private int mSecondSelectedIndex = -1;
    private java.util.ArrayList<java.lang.String> mFirstOptionList = null;
    private java.util.Map<java.lang.String, java.util.ArrayList<com.tencent.kinda.gen.BankCardType>> mSecondOptionMap = null;
    private java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> mSecondOptionStringMap = null;
    private java.util.ArrayList<java.util.List<com.tencent.kinda.gen.BankCardType>> mSecondOptionList = null;
    private java.util.ArrayList<java.util.List<java.lang.String>> mSecondOptionStringList = null;

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public java.lang.String getValue() {
        return this.mSelectedBankCardType.mBankType;
    }

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public void setBankCardType(java.util.ArrayList<com.tencent.kinda.gen.BankCardType> arrayList) {
        this.mBankCardTypeArray = arrayList;
        this.mFirstOptionList = new java.util.ArrayList<>();
        this.mSecondOptionMap = new java.util.HashMap();
        this.mSecondOptionStringMap = new java.util.HashMap();
        java.util.Iterator<com.tencent.kinda.gen.BankCardType> it = this.mBankCardTypeArray.iterator();
        while (it.hasNext()) {
            com.tencent.kinda.gen.BankCardType next = it.next();
            if (this.mSecondOptionMap.containsKey(next.mBankName)) {
                java.util.ArrayList<com.tencent.kinda.gen.BankCardType> arrayList2 = this.mSecondOptionMap.get(next.mBankName);
                arrayList2.add(next);
                this.mSecondOptionMap.put(next.mBankName, arrayList2);
                java.util.ArrayList<java.lang.String> arrayList3 = this.mSecondOptionStringMap.get(next.mBankName);
                arrayList3.add(next.mBankaccTypeName);
                this.mSecondOptionStringMap.put(next.mBankName, arrayList3);
            } else {
                this.mFirstOptionList.add(next.mBankName);
                java.util.ArrayList<com.tencent.kinda.gen.BankCardType> arrayList4 = new java.util.ArrayList<>();
                arrayList4.add(next);
                this.mSecondOptionMap.put(next.mBankName, arrayList4);
                java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                arrayList5.add(next.mBankaccTypeName);
                this.mSecondOptionStringMap.put(next.mBankName, arrayList5);
            }
        }
        this.mSecondOptionList = new java.util.ArrayList<>();
        this.mSecondOptionStringList = new java.util.ArrayList<>();
        java.util.Iterator<java.lang.String> it6 = this.mFirstOptionList.iterator();
        while (it6.hasNext()) {
            java.lang.String next2 = it6.next();
            this.mSecondOptionList.add(this.mSecondOptionMap.get(next2));
            this.mSecondOptionStringList.add(this.mSecondOptionStringMap.get(next2));
        }
    }

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public void setFocus(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(this.mContext, this.mFirstOptionList, this.mSecondOptionStringList);
            this.mOptionPiker = c0Var;
            c0Var.f212259t = new com.tencent.mm.ui.widget.picker.a0() { // from class: com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.1
                @Override // com.tencent.mm.ui.widget.picker.a0
                public void onResult(boolean z18, java.lang.Object obj, java.lang.Object obj2) {
                    com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mOptionPiker.d();
                    if (z18) {
                        com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mEditText.setText(((java.lang.String) obj) + " " + ((java.lang.String) obj2));
                        com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl kindaBankCardTypePickerViewImpl = com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this;
                        kindaBankCardTypePickerViewImpl.mFirstSelectedIndex = kindaBankCardTypePickerViewImpl.mOptionPiker.b();
                        com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl kindaBankCardTypePickerViewImpl2 = com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this;
                        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = kindaBankCardTypePickerViewImpl2.mOptionPiker.f212257r;
                        kindaBankCardTypePickerViewImpl2.mSecondSelectedIndex = customOptionPickNew != null ? customOptionPickNew.getValue() : 0;
                        if (com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mFirstSelectedIndex < 0 || com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mSecondSelectedIndex < 0) {
                            return;
                        }
                        com.tencent.kinda.gen.BankCardType bankCardType = (com.tencent.kinda.gen.BankCardType) ((java.util.List) com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mSecondOptionList.get(com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mFirstSelectedIndex)).get(com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mSecondSelectedIndex);
                        com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mSelectedBankCardType = bankCardType;
                        com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.this.mOnSelectCallback.onSelect(bankCardType.mBankType);
                    }
                }
            };
            int i17 = this.mFirstSelectedIndex;
            if (i17 >= 0) {
                int i18 = this.mSecondSelectedIndex;
                if (i18 >= 0) {
                    this.mOptionPiker.j(i17, i18);
                } else {
                    this.mOptionPiker.i(i17);
                }
            }
            this.mOptionPiker.l();
        }
    }

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public void setOnSelectCallback(com.tencent.kinda.gen.KBankCardTypePickerViewOnSelectCallback kBankCardTypePickerViewOnSelectCallback) {
        this.mOnSelectCallback = kBankCardTypePickerViewOnSelectCallback;
    }

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public void setSelectedBankCardType(com.tencent.kinda.gen.BankCardType bankCardType) {
        if (bankCardType == null || bankCardType.mIsMaintainance || bankCardType.mForbidWord.length() > 0) {
            return;
        }
        this.mSelectedBankCardType = bankCardType;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= this.mFirstOptionList.size()) {
                break;
            }
            if (this.mFirstOptionList.get(i18).equals(bankCardType.mBankName)) {
                this.mFirstSelectedIndex = i18;
                break;
            }
            i18++;
        }
        while (true) {
            if (i17 >= this.mSecondOptionList.get(this.mFirstSelectedIndex).size()) {
                break;
            }
            if (this.mSecondOptionList.get(this.mFirstSelectedIndex).get(i17).mBankType.equals(bankCardType.mBankType)) {
                this.mSecondSelectedIndex = i17;
                break;
            }
            i17++;
        }
        int i19 = this.mFirstSelectedIndex;
        java.lang.String str = "";
        java.lang.String str2 = i19 >= 0 ? this.mFirstOptionList.get(i19) : "";
        int i27 = this.mFirstSelectedIndex;
        if (i27 >= 0 && this.mSecondSelectedIndex >= 0) {
            str = this.mSecondOptionStringList.get(i27).get(this.mSecondSelectedIndex);
        }
        this.mEditText.setText(str2 + " " + str);
    }

    @Override // com.tencent.kinda.gen.KBankCardTypePickerView
    public void setValue(java.lang.String str) {
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.EditText createView(android.content.Context context) {
        this.mContext = context;
        android.widget.EditText editText = new android.widget.EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setTextSize(16.0f);
        this.mEditText.setText(com.tencent.kinda.framework.R.string.wc_pay_kinda_bankcardtype_picker_view_default_text);
        this.mContext = context;
        return this.mEditText;
    }
}
