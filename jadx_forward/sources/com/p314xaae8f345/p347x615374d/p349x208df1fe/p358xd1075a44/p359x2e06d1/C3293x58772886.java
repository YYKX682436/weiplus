package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl */
/* loaded from: classes15.dex */
public class C3293x58772886 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.EditText> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4 {

    /* renamed from: mBankCardTypeArray */
    private java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6> f12723xa00a3046;

    /* renamed from: mContext */
    private android.content.Context f12724xd6cfe882;

    /* renamed from: mEditText */
    private android.widget.EditText f12725x847ab9e4;

    /* renamed from: mOnSelectCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3425xe805f524 f12728x83646fad;

    /* renamed from: mOptionPiker */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f12729x93d73b9d;

    /* renamed from: mSelectedBankCardType */
    private com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6 f12735xefdfd70e;
    java.lang.String TAG = "KindaBankCardTypePickerViewImpl";

    /* renamed from: mFirstSelectedIndex */
    private int f12727x15584574 = -1;

    /* renamed from: mSecondSelectedIndex */
    private int f12734x37c68536 = -1;

    /* renamed from: mFirstOptionList */
    private java.util.ArrayList<java.lang.String> f12726x2c86ad56 = null;

    /* renamed from: mSecondOptionMap */
    private java.util.Map<java.lang.String, java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6>> f12731x28d7a266 = null;

    /* renamed from: mSecondOptionStringMap */
    private java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> f12733x35a1515 = null;

    /* renamed from: mSecondOptionList */
    private java.util.ArrayList<java.util.List<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6>> f12730xf21c54d4 = null;

    /* renamed from: mSecondOptionStringList */
    private java.util.ArrayList<java.util.List<java.lang.String>> f12732x67e83805 = null;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: getFocus */
    public boolean mo26356x746efb22() {
        return this.f12725x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: getValue */
    public java.lang.String mo26357x754a37bb() {
        return this.f12735xefdfd70e.f13454xb62e3323;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: setBankCardType */
    public void mo26358xe76a7248(java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6> arrayList) {
        this.f12723xa00a3046 = arrayList;
        this.f12726x2c86ad56 = new java.util.ArrayList<>();
        this.f12731x28d7a266 = new java.util.HashMap();
        this.f12733x35a1515 = new java.util.HashMap();
        java.util.Iterator<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6> it = this.f12723xa00a3046.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6 next = it.next();
            if (this.f12731x28d7a266.containsKey(next.f13453xb62b1e74)) {
                java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6> arrayList2 = this.f12731x28d7a266.get(next.f13453xb62b1e74);
                arrayList2.add(next);
                this.f12731x28d7a266.put(next.f13453xb62b1e74, arrayList2);
                java.util.ArrayList<java.lang.String> arrayList3 = this.f12733x35a1515.get(next.f13453xb62b1e74);
                arrayList3.add(next.f13456x9350489d);
                this.f12733x35a1515.put(next.f13453xb62b1e74, arrayList3);
            } else {
                this.f12726x2c86ad56.add(next.f13453xb62b1e74);
                java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6> arrayList4 = new java.util.ArrayList<>();
                arrayList4.add(next);
                this.f12731x28d7a266.put(next.f13453xb62b1e74, arrayList4);
                java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                arrayList5.add(next.f13456x9350489d);
                this.f12733x35a1515.put(next.f13453xb62b1e74, arrayList5);
            }
        }
        this.f12730xf21c54d4 = new java.util.ArrayList<>();
        this.f12732x67e83805 = new java.util.ArrayList<>();
        java.util.Iterator<java.lang.String> it6 = this.f12726x2c86ad56.iterator();
        while (it6.hasNext()) {
            java.lang.String next2 = it6.next();
            this.f12730xf21c54d4.add(this.f12731x28d7a266.get(next2));
            this.f12732x67e83805.add(this.f12733x35a1515.get(next2));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: setFocus */
    public void mo26359x52fd1596(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(this.f12724xd6cfe882, this.f12726x2c86ad56, this.f12732x67e83805);
            this.f12729x93d73b9d = c0Var;
            c0Var.f293792t = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0() { // from class: com.tencent.kinda.framework.widget.base.KindaBankCardTypePickerViewImpl.1
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
                /* renamed from: onResult */
                public void mo26363x57429edc(boolean z18, java.lang.Object obj, java.lang.Object obj2) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12729x93d73b9d.d();
                    if (z18) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12725x847ab9e4.setText(((java.lang.String) obj) + " " + ((java.lang.String) obj2));
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886 c3293x58772886 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this;
                        c3293x58772886.f12727x15584574 = c3293x58772886.f12729x93d73b9d.b();
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886 c3293x587728862 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = c3293x587728862.f12729x93d73b9d.f293790r;
                        c3293x587728862.f12734x37c68536 = c22706xd568f79 != null ? c22706xd568f79.m82064x754a37bb() : 0;
                        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12727x15584574 < 0 || com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12734x37c68536 < 0) {
                            return;
                        }
                        com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6 c3384x59fa38e6 = (com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6) ((java.util.List) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12730xf21c54d4.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12727x15584574)).get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12734x37c68536);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12735xefdfd70e = c3384x59fa38e6;
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3293x58772886.this.f12728x83646fad.mo27874x58f40bbb(c3384x59fa38e6.f13454xb62e3323);
                    }
                }
            };
            int i17 = this.f12727x15584574;
            if (i17 >= 0) {
                int i18 = this.f12734x37c68536;
                if (i18 >= 0) {
                    this.f12729x93d73b9d.j(i17, i18);
                } else {
                    this.f12729x93d73b9d.i(i17);
                }
            }
            this.f12729x93d73b9d.l();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: setOnSelectCallback */
    public void mo26360xa921a1a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3425xe805f524 abstractC3425xe805f524) {
        this.f12728x83646fad = abstractC3425xe805f524;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: setSelectedBankCardType */
    public void mo26361xaf190683(com.p314xaae8f345.p347x615374d.gen.C3384x59fa38e6 c3384x59fa38e6) {
        if (c3384x59fa38e6 == null || c3384x59fa38e6.f13458x48d1b571 || c3384x59fa38e6.f13457xb661190b.length() > 0) {
            return;
        }
        this.f12735xefdfd70e = c3384x59fa38e6;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= this.f12726x2c86ad56.size()) {
                break;
            }
            if (this.f12726x2c86ad56.get(i18).equals(c3384x59fa38e6.f13453xb62b1e74)) {
                this.f12727x15584574 = i18;
                break;
            }
            i18++;
        }
        while (true) {
            if (i17 >= this.f12730xf21c54d4.get(this.f12727x15584574).size()) {
                break;
            }
            if (this.f12730xf21c54d4.get(this.f12727x15584574).get(i17).f13454xb62e3323.equals(c3384x59fa38e6.f13454xb62e3323)) {
                this.f12734x37c68536 = i17;
                break;
            }
            i17++;
        }
        int i19 = this.f12727x15584574;
        java.lang.String str = "";
        java.lang.String str2 = i19 >= 0 ? this.f12726x2c86ad56.get(i19) : "";
        int i27 = this.f12727x15584574;
        if (i27 >= 0 && this.f12734x37c68536 >= 0) {
            str = this.f12732x67e83805.get(i27).get(this.f12734x37c68536);
        }
        this.f12725x847ab9e4.setText(str2 + " " + str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3424x54b153e4
    /* renamed from: setValue */
    public void mo26362x53d8522f(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.EditText mo26107x519d71c1(android.content.Context context) {
        this.f12724xd6cfe882 = context;
        android.widget.EditText editText = new android.widget.EditText(context);
        this.f12725x847ab9e4 = editText;
        editText.setInputType(0);
        this.f12725x847ab9e4.setFocusable(false);
        this.f12725x847ab9e4.setBackground(null);
        this.f12725x847ab9e4.setTextSize(16.0f);
        this.f12725x847ab9e4.setText(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3090xcad56011.f11661x3adfbbf1);
        this.f12724xd6cfe882 = context;
        return this.f12725x847ab9e4;
    }
}
