package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl */
/* loaded from: classes9.dex */
public class C3294x4504d038 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.TextView> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216 {

    /* renamed from: _hellAccFlag_ */
    private byte f12737x7f11beae;

    /* renamed from: mBankLiskBuffer */
    private byte[] f12740xfaacfe5e;

    /* renamed from: mBankType */
    private java.lang.String f12741xb62e3323;

    /* renamed from: mBankTypeLiskBuffer */
    private byte[] f12742xd3106cb8;

    /* renamed from: mCallBack */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3427xc22585b5 f12743x1aab3bf2;

    /* renamed from: mContext */
    private android.content.Context f12744xd6cfe882;

    /* renamed from: mEditText */
    private android.widget.TextView f12745x847ab9e4;

    /* renamed from: mMajorBankLiskBuffer */
    private byte[] f12746xe7f98cfd;
    java.lang.String TAG = "KindaBank.KindaBankEditViewImpl";

    /* renamed from: normalColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12747xeee27abc = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: fontStyle */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 f12739xa38e7aa2 = com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.REGULAR;

    /* renamed from: bankEditSelectedEventIListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9> f12738xb2e2e444 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.widget.base.KindaBankEditViewImpl.1
        {
            this.f39173x3fe91575 = -1230036023;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9 c5185x1f35a3d9) {
            java.lang.String str;
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.f12953x341195db.equals(c5185x1f35a3d9.f135529g.f88819a)) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12738xb2e2e444.mo48814x2efc64();
                return false;
            }
            am.m0 m0Var = c5185x1f35a3d9.f135529g;
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.f12952x3339c084.equals(m0Var.f88819a)) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12743x1aab3bf2.mo27879x98bb6546("", "");
                return false;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12742xd3106cb8)) {
                str = m0Var.f88819a + " " + m0Var.f88821c;
            } else {
                str = m0Var.f88819a;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12745x847ab9e4.setText(str);
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12743x1aab3bf2 == null) {
                return false;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12741xb62e3323 = m0Var.f88820b;
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12743x1aab3bf2.mo27879x98bb6546(str, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3294x4504d038.this.f12741xb62e3323);
            return false;
        }
    };

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: getFocus */
    public boolean mo26370x746efb22() {
        return this.f12745x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: getFontStyle */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 mo26371xa2fbebec() {
        return this.f12739xa38e7aa2;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: getSelectedBankType */
    public java.lang.String mo26372x25467ec7() {
        return this.f12741xb62e3323;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26373xc0089f80() {
        return this.f12747xeee27abc;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: getTextSize */
    public float mo26374x40077844() {
        return this.f12745x847ab9e4.getTextSize();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: openBankSelectView */
    public void mo26375x59447607() {
        mo26377x52fd1596(true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setData */
    public void mo26376x76491f2c(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        this.f12740xfaacfe5e = abstractC3411xcfaed72e.mo27541x124d2ef7("bank_list");
        this.f12742xd3106cb8 = abstractC3411xcfaed72e.mo27541x124d2ef7("bank_type_list");
        this.f12746xe7f98cfd = abstractC3411xcfaed72e.mo27541x124d2ef7("major_bank_list");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setFocus */
    public void mo26377x52fd1596(boolean z17) {
        if (z17) {
            this.f12738xb2e2e444.mo48813x58998cd();
            android.content.Context context = this.f12744xd6cfe882;
            if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26052xd46dd964();
            }
            android.content.Intent intent = new android.content.Intent(this.f12744xd6cfe882, (java.lang.Class<?>) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.class);
            intent.putExtra("bank_list", this.f12740xfaacfe5e);
            intent.putExtra("bank_type_list", this.f12742xd3106cb8);
            intent.putExtra("major_bank_list", this.f12746xe7f98cfd);
            android.content.Context context2 = this.f12744xd6cfe882;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaBankEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/kinda/framework/widget/base/KindaBankEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setFontStyle */
    public void mo26378xff4fac60(com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82) {
        this.f12739xa38e7aa2 = enumC3399x1b009a82;
        if (enumC3399x1b009a82 == com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.BOLD) {
            this.f12745x847ab9e4.setTypeface(null, 1);
        } else {
            this.f12745x847ab9e4.setTypeface(null, 0);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setOnSeletBankCallback */
    public void mo26379xd847dfe9(com.p314xaae8f345.p347x615374d.gen.AbstractC3427xc22585b5 abstractC3427xc22585b5) {
        this.f12743x1aab3bf2 = abstractC3427xc22585b5;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setSelected */
    public void mo26380xbd98911d(java.lang.String str) {
        this.f12745x847ab9e4.setText(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setTextColor */
    public void mo26381x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12747xeee27abc) != com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)) {
            this.f12747xeee27abc = c3392x2ae78284;
        }
        this.f12745x847ab9e4.setTextColor((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12747xeee27abc));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3426x9a58b216
    /* renamed from: setTextSize */
    public void mo26382x3abfd950(float f17) {
        this.f12745x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f17 * com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.TextView mo26107x519d71c1(android.content.Context context) {
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f12745x847ab9e4 = textView;
        textView.setFocusable(false);
        this.f12745x847ab9e4.setBackground(null);
        this.f12745x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.f575121kv0);
        this.f12745x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f));
        android.widget.TextView textView2 = this.f12745x847ab9e4;
        textView2.setPadding(0, textView2.getHeight() / 2, 0, this.f12745x847ab9e4.getHeight() / 2);
        this.f12745x847ab9e4.setGravity(16);
        this.f12745x847ab9e4.setSingleLine(false);
        com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e();
        eVar.m82972xbdda0201(com.p314xaae8f345.p347x615374d.gen.EnumC3611x9c1951f.BUTTON);
        this.f12745x847ab9e4.setAccessibilityDelegate(eVar);
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            this.f12745x847ab9e4.setHintTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            this.f12745x847ab9e4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        this.f12744xd6cfe882 = context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "BankEditSelected callback，注册监听，当前线程：" + java.lang.Thread.currentThread().getId());
        return this.f12745x847ab9e4;
    }
}
