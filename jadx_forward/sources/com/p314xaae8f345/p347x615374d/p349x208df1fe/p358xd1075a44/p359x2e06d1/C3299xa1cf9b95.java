package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl */
/* loaded from: classes9.dex */
public class C3299xa1cf9b95 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7 {

    /* renamed from: mContext */
    private android.content.Context f12768xd6cfe882;

    /* renamed from: mCountPickerCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3443x52c1fa37 f12769x2fdcc435;

    /* renamed from: mEditText */
    private android.widget.EditText f12770x847ab9e4;

    /* renamed from: mSelectCreCountIndex */
    private int f12771xc9cac630;

    /* renamed from: mTimesArray */
    private java.lang.String[] f12772x3f470f00;

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        this.f12768xd6cfe882 = context;
        this.f12772x3f470f00 = new java.lang.String[100];
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f12772x3f470f00;
            if (i17 >= strArr.length) {
                this.f12771xc9cac630 = 0;
                android.widget.EditText editText = new android.widget.EditText(context);
                this.f12770x847ab9e4 = editText;
                editText.setInputType(0);
                this.f12770x847ab9e4.setFocusable(false);
                this.f12770x847ab9e4.setBackground(null);
                this.f12770x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.khf);
                this.f12770x847ab9e4.setPadding(0, 0, 0, 0);
                this.f12770x847ab9e4.setTextSize(16.0f);
                return this.f12770x847ab9e4;
            }
            strArr[i17] = this.f12768xd6cfe882.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkh, java.lang.String.valueOf(i17));
            i17++;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7
    /* renamed from: getFocus */
    public boolean mo26431x746efb22() {
        android.widget.EditText editText = this.f12770x847ab9e4;
        if (editText == null) {
            return false;
        }
        return editText.hasFocus();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7
    /* renamed from: getValue */
    public java.lang.String mo26432x754a37bb() {
        return "" + this.f12771xc9cac630;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7
    /* renamed from: setDefaultCount */
    public void mo26433x6eecd8d0(int i17) {
        this.f12771xc9cac630 = i17;
        this.f12770x847ab9e4.setText(this.f12768xd6cfe882.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkh, java.lang.String.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7
    /* renamed from: setFocus */
    public void mo26434x52fd1596(boolean z17) {
        if (z17) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(this.f12768xd6cfe882, this.f12772x3f470f00);
            c0Var.f293792t = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0() { // from class: com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.1
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
                /* renamed from: onResult */
                public void mo26363x57429edc(boolean z18, java.lang.Object obj, java.lang.Object obj2) {
                    if (z18) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3299xa1cf9b95.this.f12771xc9cac630 = c0Var.b();
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3299xa1cf9b95.this.f12770x847ab9e4.setText(obj.toString());
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3299xa1cf9b95.this.f12769x2fdcc435.mo27945x58f40bbb(java.lang.String.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3299xa1cf9b95.this.f12771xc9cac630));
                    }
                    c0Var.d();
                }
            };
            c0Var.i(this.f12771xc9cac630);
            c0Var.l();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7
    /* renamed from: setOnSelectCallback */
    public void mo26435xa921a1a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3443x52c1fa37 abstractC3443x52c1fa37) {
        this.f12769x2fdcc435 = abstractC3443x52c1fa37;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3442x7347def7
    /* renamed from: setValue */
    public void mo26436x53d8522f(java.lang.String str) {
    }
}
