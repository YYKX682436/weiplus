package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaValidDatePickerView */
/* loaded from: classes9.dex */
public class C3323xb470cd50 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.widget.EditText> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3543xd0859372 {

    /* renamed from: activity */
    private com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 f12943x9d4bf30f;

    /* renamed from: callback */
    com.p314xaae8f345.p347x615374d.gen.AbstractC3544xc7b558b2 f12944xf5bc2045;

    /* renamed from: datePicker */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f12945x19f5e9dc;

    /* renamed from: mEditText */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f12946x847ab9e4;

    /* renamed from: mSelected */
    private java.lang.String f12948x6c039a28;

    /* renamed from: mYear */
    private int f12949x629fe4a = -1;

    /* renamed from: mMonthOfYear */
    private int f12947xccd386a7 = -1;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3543xd0859372
    /* renamed from: getFocus */
    public boolean mo26744x746efb22() {
        return this.f12946x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3543xd0859372
    /* renamed from: getText */
    public java.lang.String mo26745xfb85ada3() {
        return this.f12948x6c039a28;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3543xd0859372
    /* renamed from: setFocus */
    public void mo26746x52fd1596(boolean z17) {
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f12945x19f5e9dc;
            if (oVar != null) {
                oVar.b();
                return;
            }
            return;
        }
        this.f12943x9d4bf30f.mo48674x36654fab();
        this.f12943x9d4bf30f.m26052xd46dd964();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(this.f12943x9d4bf30f);
        this.f12945x19f5e9dc = oVar2;
        oVar2.g(true, true, false);
        this.f12945x19f5e9dc.f293840n = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n() { // from class: com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.2
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
            /* renamed from: onResult */
            public void mo26477x57429edc(boolean z18, int i17, int i18, int i19) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12945x19f5e9dc.b();
                if (z18) {
                    java.lang.String a17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12945x19f5e9dc.a();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                        return;
                    }
                    java.lang.String[] split = a17.split("-");
                    if (split.length < 2) {
                        return;
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12949x629fe4a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12947xccd386a7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0) - 1;
                    int unused = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12949x629fe4a;
                    int unused2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12947xccd386a7;
                    java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00", new java.text.DecimalFormatSymbols(java.util.Locale.ENGLISH));
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12946x847ab9e4.setText(decimalFormat.format(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12947xccd386a7 + 1) + decimalFormat.format(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12949x629fe4a).substring(2));
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12948x6c039a28 = decimalFormat.format((long) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12949x629fe4a).substring(2) + decimalFormat.format(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this.f12947xccd386a7 + 1);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50 c3323xb470cd50 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3323xb470cd50.this;
                    c3323xb470cd50.f12944xf5bc2045.mo28198x58f40bbb(c3323xb470cd50.f12948x6c039a28);
                }
            }
        };
        java.lang.String[] split = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
        if (split.length >= 3) {
            this.f12945x19f5e9dc.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[2], 0));
            this.f12945x19f5e9dc.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0) + 30, 12, 31);
        } else {
            this.f12945x19f5e9dc.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0), 1, 1);
            this.f12945x19f5e9dc.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0) + 30, 12, 31);
        }
        this.f12945x19f5e9dc.d(this.f12949x629fe4a, this.f12947xccd386a7 + 1, 1);
        this.f12945x19f5e9dc.h();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3543xd0859372
    /* renamed from: setOnSelectCallback */
    public void mo26747xa921a1a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3544xc7b558b2 abstractC3544xc7b558b2) {
        this.f12944xf5bc2045 = abstractC3544xc7b558b2;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.EditText mo26107x519d71c1(android.content.Context context) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(context);
        this.f12946x847ab9e4 = c28001xdd2bb359;
        c28001xdd2bb359.setInputType(0);
        this.f12946x847ab9e4.setFocusable(false);
        this.f12946x847ab9e4.setBackground(null);
        this.f12946x847ab9e4.m121630x744cf207(true);
        this.f12946x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.khu);
        this.f12946x847ab9e4.setSingleLine(false);
        this.f12946x847ab9e4.setPadding(0, 0, 0, 0);
        this.f12946x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f));
        this.f12946x847ab9e4.setAccessibilityDelegate(new com.p314xaae8f345.mm.p2802xd031a825.e() { // from class: com.tencent.kinda.framework.widget.base.KindaValidDatePickerView.1
            @Override // com.p314xaae8f345.mm.p2802xd031a825.e, android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
            }
        });
        if (context instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
            this.f12943x9d4bf30f = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) context;
        }
        return this.f12946x847ab9e4;
    }
}
