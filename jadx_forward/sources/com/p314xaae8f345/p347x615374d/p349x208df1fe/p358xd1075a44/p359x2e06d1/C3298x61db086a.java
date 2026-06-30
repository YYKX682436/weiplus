package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaCardTypePickerView */
/* loaded from: classes9.dex */
public class C3298x61db086a extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.view.View> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608 {

    /* renamed from: mCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3436xac97cf48 f12760x1aab3bf2;

    /* renamed from: mContainer */
    private android.widget.LinearLayout f12761x62389694;

    /* renamed from: mContext */
    private android.content.Context f12762xd6cfe882;

    /* renamed from: mEditText */
    private android.widget.EditText f12763x847ab9e4;

    /* renamed from: mOptionPiker */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f12764x93d73b9d;

    /* renamed from: mOptions */
    private java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3582x8d2f7495> f12765x539f3971;
    java.lang.String TAG = "KindaCardTypePickerView";

    /* renamed from: selected */
    private int f12766x4705f29b = -1;

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.f12763x847ab9e4 = editText;
        editText.setInputType(0);
        this.f12763x847ab9e4.setFocusable(false);
        this.f12763x847ab9e4.setBackground(null);
        this.f12763x847ab9e4.setTextSize(1, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f);
        this.f12763x847ab9e4.setPadding(0, 0, 0, 0);
        this.f12762xd6cfe882 = context;
        this.f12763x847ab9e4.setHintTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        this.f12763x847ab9e4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9 c3326x9cc74de9 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9(context, this.f12763x847ab9e4);
        this.f12761x62389694 = c3326x9cc74de9;
        return c3326x9cc74de9;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: getEnabled */
    public boolean mo26418xdddcc70b() {
        return this.f12763x847ab9e4.isEnabled();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: getFocus */
    public boolean mo26419x746efb22() {
        return this.f12763x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: select */
    public void mo26420xc9ff34fc(int i17) {
        this.f12766x4705f29b = i17;
        this.f12763x847ab9e4.setText(this.f12765x539f3971.get(i17).f13767xd6cfe74c);
        this.f12761x62389694.setContentDescription(this.f12765x539f3971.get(i17).f13767xd6cfe74c);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: setEnabled */
    public void mo26421x514e147f(boolean z17) {
        this.f12763x847ab9e4.setEnabled(z17);
        if (z17) {
            this.f12763x847ab9e4.setTextColor(this.f12762xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            this.f12763x847ab9e4.setTextColor(this.f12762xd6cfe882.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: setFocus */
    public void mo26422x52fd1596(boolean z17) {
        if (z17 && this.f12763x847ab9e4.isEnabled()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.p314xaae8f345.p347x615374d.gen.C3582x8d2f7495> it = this.f12765x539f3971.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f13767xd6cfe74c);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(this.f12762xd6cfe882, arrayList);
            this.f12764x93d73b9d = c0Var;
            c0Var.f293792t = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0() { // from class: com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.1
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
                /* renamed from: onResult */
                public void mo26363x57429edc(boolean z18, java.lang.Object obj, java.lang.Object obj2) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a.this.f12764x93d73b9d.d();
                    if (z18) {
                        java.lang.String str = (java.lang.String) obj;
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a.this.f12763x847ab9e4.setText(str);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a.this.f12761x62389694.setContentDescription(str);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a c3298x61db086a = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a.this;
                        c3298x61db086a.f12766x4705f29b = c3298x61db086a.f12764x93d73b9d.b();
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a.this.f12760x1aab3bf2.mo27899x58f40bbb(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3298x61db086a.this.f12764x93d73b9d.b());
                    }
                }
            };
            int i17 = this.f12766x4705f29b;
            if (i17 != -1) {
                this.f12764x93d73b9d.i(i17);
            }
            this.f12764x93d73b9d.l();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: setHint */
    public void mo26423x764b0e09(java.lang.String str) {
        android.widget.EditText editText = this.f12763x847ab9e4;
        if (editText != null) {
            editText.setHint(str);
            if (this.f12761x62389694 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f12763x847ab9e4.getText())) {
                return;
            }
            this.f12761x62389694.setContentDescription(str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: setOnSelectCallback */
    public void mo26424xa921a1a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3436xac97cf48 abstractC3436xac97cf48) {
        this.f12760x1aab3bf2 = abstractC3436xac97cf48;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: setOptions */
    public void mo26425x66c50fdc(java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.C3582x8d2f7495> arrayList) {
        this.f12763x847ab9e4.setText("");
        this.f12761x62389694.setContentDescription("");
        this.f12765x539f3971 = arrayList;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3435xe6e3f608
    /* renamed from: setTextSize */
    public void mo26426x3abfd950(float f17) {
        if (f17 > 0.0f) {
            this.f12763x847ab9e4.setTextSize(1, f17 * (mo26252x34575f87() ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : 1.0f));
            mo26970x380a4f2b();
        }
    }
}
