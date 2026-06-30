package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl */
/* loaded from: classes9.dex */
public class C3297xcd1e1f35 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913 {

    /* renamed from: m_callback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3433x6f9eee7a f12755xfe667bd7;

    /* renamed from: m_endEditingCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3434x84e99ca1 f12756xb326ecb4;

    /* renamed from: cardNumberView */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f12753xae4e80be = null;

    /* renamed from: normalColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12757xeee27abc = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: hintColor */
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 f12754x5bec5d1c = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284(-1, 0);

    /* renamed from: callbackKindaTextEndEditing */
    public void m26397x1241dd72() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3434x84e99ca1 abstractC3434x84e99ca1 = this.f12756xb326ecb4;
        if (abstractC3434x84e99ca1 != null) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f12753xae4e80be;
            com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
            abstractC3434x84e99ca1.mo27894xc7be5d09(c28001xdd2bb359.m121598x15a9108d(false, true));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: getFocus */
    public boolean mo26398x746efb22() {
        return this.f12753xae4e80be.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: getHint */
    public java.lang.String mo26399xfb8046fd() {
        return this.f12753xae4e80be.getHint().toString();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: getHintColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26400x5b59ce66() {
        return this.f12754x5bec5d1c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: getInputTextLength */
    public int mo26401xfa3d67a7() {
        return this.f12753xae4e80be.m121601xbad2461a();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: getTextColor */
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 mo26402xc0089f80() {
        return this.f12757xeee27abc;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: getValue */
    public java.lang.String mo26403x754a37bb() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f12753xae4e80be;
        com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
        return c28001xdd2bb359.m121598x15a9108d(false, true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: isBankCardNumber */
    public boolean mo26404x9c3d859f() {
        return this.f12753xae4e80be.m121605x7cde7910();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setFocus */
    public void mo26405x52fd1596(boolean z17) {
        if (z17 && this.f12753xae4e80be.isFocused()) {
            this.f12753xae4e80be.clearFocus();
        }
        if (z17) {
            this.f12753xae4e80be.requestFocus();
        } else {
            this.f12753xae4e80be.clearFocus();
            m26397x1241dd72();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setHint */
    public void mo26406x764b0e09(java.lang.String str) {
        this.f12753xae4e80be.setHint(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setHintColor */
    public void mo26407xb7ad8eda(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12754x5bec5d1c) != com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)) {
            this.f12754x5bec5d1c = c3392x2ae78284;
        }
        this.f12753xae4e80be.setHintTextColor((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12754x5bec5d1c));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setOnTextChangedCallback */
    public void mo26408xa9aa28b(com.p314xaae8f345.p347x615374d.gen.AbstractC3433x6f9eee7a abstractC3433x6f9eee7a) {
        this.f12755xfe667bd7 = abstractC3433x6f9eee7a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setOnTextEndEditingCallback */
    public void mo26409x15e922f0(com.p314xaae8f345.p347x615374d.gen.AbstractC3434x84e99ca1 abstractC3434x84e99ca1) {
        this.f12756xb326ecb4 = abstractC3434x84e99ca1;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setText */
    public void mo26410x765074af(java.lang.String str) {
        this.f12753xae4e80be.setText(str);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f12753xae4e80be;
        c28001xdd2bb359.setSelection(c28001xdd2bb359.getText().toString().length());
        this.f12753xae4e80be.clearFocus();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3432xb490f913
    /* renamed from: setTextColor */
    public void mo26411x1c5c5ff4(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12757xeee27abc) != com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(c3392x2ae78284)) {
            this.f12757xeee27abc = c3392x2ae78284;
        }
        this.f12753xae4e80be.setTextColor((int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27193xc76aa86a(this.f12757xeee27abc));
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 mo26107x519d71c1(android.content.Context context) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(context);
        this.f12753xae4e80be = c28001xdd2bb359;
        c28001xdd2bb359.m121622x6347c2af(true);
        this.f12753xae4e80be.setBackground(null);
        this.f12753xae4e80be.setInputType(131072);
        this.f12753xae4e80be.setSingleLine(false);
        this.f12753xae4e80be.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f));
        this.f12753xae4e80be.setPadding(0, 0, com.p314xaae8f345.mm.ui.zk.a(context, 4), 0);
        this.f12753xae4e80be.m121617x12027a39(com.p314xaae8f345.mm.R.C30861xcebc809e.afr);
        this.f12753xae4e80be.m121638x568e84ad("[^0-9]");
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27196x28caef29()) {
            this.f12753xae4e80be.m121616xd30bb48a(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.raw.f11652xba64a132, 0, 16, 16);
        } else {
            this.f12753xae4e80be.m121616xd30bb48a(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.raw.f11651x377b7b36, 0, 16, 16);
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
        this.f12753xae4e80be.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(24)});
        this.f12753xae4e80be.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35.this.f12755xfe667bd7 != null) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3433x6f9eee7a abstractC3433x6f9eee7a = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35.this.f12755xfe667bd7;
                    com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35.this.f12753xae4e80be;
                    com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
                    abstractC3433x6f9eee7a.mo27889x16898168(c28001xdd2bb3592.m121598x15a9108d(false, true));
                }
            }
        });
        this.f12753xae4e80be.setTag(this);
        if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26057x8f91b80(this.f12753xae4e80be, 0, false);
        }
        this.f12753xae4e80be.setId(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11559xdd154ecc);
        this.f12753xae4e80be.m121631xd642bbdb(new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IKindaEditTextCallBackListener() { // from class: com.tencent.kinda.framework.widget.base.KindaCardNumberEditViewImpl.2
            @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IKindaEditTextCallBackListener
            /* renamed from: onCallBackKinda */
            public void mo26412xff698e49() {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e m27109xf72f818 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35.this.m27109xf72f818();
                if (m27109xf72f818 != null) {
                    m27109xf72f818.mo28203xaf6b9ae9(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3297xcd1e1f35.this);
                }
            }
        });
        return this.f12753xae4e80be;
    }
}
