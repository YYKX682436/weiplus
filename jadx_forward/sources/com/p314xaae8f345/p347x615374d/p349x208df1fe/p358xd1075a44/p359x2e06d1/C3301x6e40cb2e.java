package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaDatePickerView */
/* loaded from: classes9.dex */
public class C3301x6e40cb2e extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.view.View> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc {
    private static final java.lang.String TAG = "KindaDatePickerView";

    /* renamed from: activity */
    private com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 f12777x9d4bf30f;

    /* renamed from: callback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3451x5cd090c f12778xf5bc2045;

    /* renamed from: datePicker */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f12779x19f5e9dc;

    /* renamed from: mCalendar */
    private java.util.Calendar f12781x1a5ca2cb;

    /* renamed from: mContainer */
    private android.widget.LinearLayout f12782x62389694;

    /* renamed from: mEditText */
    private com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f12784x847ab9e4;

    /* renamed from: mYear */
    private int f12788x629fe4a = -1;

    /* renamed from: mMonthOfYear */
    private int f12785xccd386a7 = -1;

    /* renamed from: mDay */
    private int f12783x3297ef = -1;

    /* renamed from: mShowResult */
    private java.lang.String f12786x85795c7 = "";

    /* renamed from: mType */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56 f12787x6280547 = com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56.BIRTH_DAY;

    /* renamed from: isLongTerm */
    private boolean f12780x55128852 = false;

    /* renamed from: calendar */
    private java.util.Calendar m26453xf55efb3e() {
        if (this.f12781x1a5ca2cb == null) {
            this.f12781x1a5ca2cb = java.util.Calendar.getInstance();
        }
        return this.f12781x1a5ca2cb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEncString */
    public java.lang.String m26454x2a71bad5() {
        int i17;
        return (this.f12780x55128852 && (i17 = this.f12788x629fe4a) == 9999) ? this.f12784x847ab9e4.m121592x7d902dbb(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f12785xccd386a7), java.lang.Integer.valueOf(this.f12783x3297ef))) : this.f12784x847ab9e4.m121592x7d902dbb(this.f12786x85795c7.replaceAll("/", ""));
    }

    /* renamed from: initDatePicker */
    private void m26455x508a170c() {
        com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = this.f12777x9d4bf30f;
        if (activityC10720x85cbbee2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "activity is null!");
        } else {
            this.f12779x19f5e9dc = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(activityC10720x85cbbee2);
        }
    }

    /* renamed from: initDatePickerData */
    private void m26456x407014d6() {
        java.lang.String[] split = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
        this.f12788x629fe4a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0);
        this.f12785xccd386a7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0);
        this.f12783x3297ef = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[2], 0);
    }

    /* renamed from: setMinAndMaxDate */
    private void m26457xe5a5cc0b(com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56 enumC3390xbb646b56) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f12779x19f5e9dc;
        if (oVar == null) {
            return;
        }
        if (enumC3390xbb646b56 == com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56.BIRTH_DAY) {
            oVar.f(1900, 1, 1);
            java.lang.String[] split = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
            if (split.length >= 3) {
                this.f12779x19f5e9dc.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[2], 0));
                return;
            }
            return;
        }
        if (enumC3390xbb646b56 == com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56.IDENTITY_VALID_DATE) {
            java.lang.String[] split2 = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
            if (split2.length >= 3) {
                this.f12779x19f5e9dc.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split2[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split2[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split2[2], 0));
                this.f12779x19f5e9dc.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split2[0], 0) + 100, 12, 31);
            }
            if (!this.f12780x55128852 || (c22705x7e16f613 = this.f12779x19f5e9dc.f293839m) == null) {
                return;
            }
            c22705x7e16f613.m82059xc1d8a6e7(true);
            return;
        }
        if (enumC3390xbb646b56 == com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56.IDENTITY_EFFECT_DATE) {
            java.lang.String[] split3 = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date()).split("-");
            if (split3.length >= 3) {
                this.f12779x19f5e9dc.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split3[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split3[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split3[2], 0));
                int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split3[0], 0) - 100;
                if (D1 < 1) {
                    D1 = 1;
                }
                this.f12779x19f5e9dc.f(D1, 1, 1);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: currentDate */
    public com.p314xaae8f345.p347x615374d.gen.C3449x4414699 mo26458x23cebcc7() {
        java.util.Calendar m26453xf55efb3e = m26453xf55efb3e();
        m26453xf55efb3e.setTimeInMillis(java.lang.System.currentTimeMillis());
        return new com.p314xaae8f345.p347x615374d.gen.C3449x4414699(m26453xf55efb3e.get(1), m26453xf55efb3e.get(2) + 1, m26453xf55efb3e.get(5));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getCanBeLongTerm */
    public boolean mo26459xe0c3f2a5() {
        return this.f12780x55128852;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getEndDate */
    public com.p314xaae8f345.p347x615374d.gen.C3449x4414699 mo26460xddf942f3() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getFocus */
    public boolean mo26461x746efb22() {
        return this.f12784x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getSelectedDate */
    public com.p314xaae8f345.p347x615374d.gen.C3449x4414699 mo26462xf858235f() {
        return new com.p314xaae8f345.p347x615374d.gen.C3449x4414699(this.f12788x629fe4a, this.f12785xccd386a7, this.f12783x3297ef);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getStartDate */
    public com.p314xaae8f345.p347x615374d.gen.C3449x4414699 mo26463x807b987a() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56 mo26464xfb85f7b0() {
        return this.f12787x6280547;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: getValue */
    public java.lang.String mo26465x754a37bb() {
        return m26454x2a71bad5();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setCanBeLongTerm */
    public void mo26466x739a5919(boolean z17) {
        this.f12780x55128852 = z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f12779x19f5e9dc.f293839m;
        if (c22705x7e16f613 != null) {
            c22705x7e16f613.m82059xc1d8a6e7(z17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setEndDate */
    public void mo26467x516a9067(com.p314xaae8f345.p347x615374d.gen.C3449x4414699 c3449x4414699) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setFocus */
    public void mo26468x52fd1596(boolean z17) {
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f12779x19f5e9dc;
            if (oVar != null) {
                oVar.b();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = this.f12777x9d4bf30f;
        if (activityC10720x85cbbee2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "activity is null!");
            return;
        }
        activityC10720x85cbbee2.mo48674x36654fab();
        this.f12777x9d4bf30f.m26052xd46dd964();
        this.f12779x19f5e9dc = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(this.f12777x9d4bf30f);
        m26457xe5a5cc0b(this.f12787x6280547);
        this.f12779x19f5e9dc.g(true, true, true);
        this.f12779x19f5e9dc.f293840n = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n() { // from class: com.tencent.kinda.framework.widget.base.KindaDatePickerView.1
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
            /* renamed from: onResult */
            public void mo26477x57429edc(boolean z18, int i17, int i18, int i19) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12779x19f5e9dc.b();
                if (z18) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12788x629fe4a = i17;
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12785xccd386a7 = i18;
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12783x3297ef = i19;
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12780x55128852 && i17 == 1) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12788x629fe4a = 9999;
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12785xccd386a7 = 12;
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12783x3297ef = 31;
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12786x85795c7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3090xcad56011.f11663xb40886e6);
                    } else {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12786x85795c7 = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12784x847ab9e4.setText(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12786x85795c7);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12782x62389694.setContentDescription(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12786x85795c7);
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.f12778xf5bc2045.mo27959x58f40bbb(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3301x6e40cb2e.this.m26454x2a71bad5());
                }
            }
        };
        int i17 = this.f12788x629fe4a;
        if (i17 == 9999) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "init long term");
            this.f12779x19f5e9dc.d(1, 1, 1);
        } else {
            this.f12779x19f5e9dc.d(i17, this.f12785xccd386a7, this.f12783x3297ef);
        }
        this.f12779x19f5e9dc.h();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setHint */
    public void mo26469x764b0e09(java.lang.String str) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f12784x847ab9e4;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.setHint(str);
            if (this.f12782x62389694 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f12784x847ab9e4.getText())) {
                return;
            }
            this.f12782x62389694.setContentDescription(str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setOnSelectCallback */
    public void mo26470xa921a1a2(com.p314xaae8f345.p347x615374d.gen.AbstractC3451x5cd090c abstractC3451x5cd090c) {
        this.f12778xf5bc2045 = abstractC3451x5cd090c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setOriginDate */
    public void mo26471xac0f15f6(int i17, int i18, int i19) {
        this.f12788x629fe4a = i17;
        this.f12785xccd386a7 = i18;
        this.f12783x3297ef = i19;
        if (this.f12780x55128852 && i17 == 9999) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3090xcad56011.f11663xb40886e6);
            this.f12786x85795c7 = string;
            this.f12784x847ab9e4.setText(string);
        } else {
            java.lang.String format = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.f12786x85795c7 = format;
            this.f12784x847ab9e4.setText(format);
        }
        this.f12782x62389694.setContentDescription(this.f12786x85795c7);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setStartDate */
    public void mo26472xdccf58ee(com.p314xaae8f345.p347x615374d.gen.C3449x4414699 c3449x4414699) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setType */
    public void mo26473x7650bebc(com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56 enumC3390xbb646b56) {
        this.f12787x6280547 = enumC3390xbb646b56;
        if (enumC3390xbb646b56 == com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56.BIRTH_DAY) {
            this.f12784x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.kj6);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f12784x847ab9e4.getText())) {
                this.f12782x62389694.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kj6));
            }
        } else if (enumC3390xbb646b56 == com.p314xaae8f345.p347x615374d.gen.EnumC3390xbb646b56.IDENTITY_VALID_DATE) {
            this.f12784x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.khp);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f12784x847ab9e4.getText())) {
                this.f12782x62389694.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.khp));
            }
        }
        m26457xe5a5cc0b(enumC3390xbb646b56);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: setValue */
    public void mo26474x53d8522f(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: timeForDate */
    public long mo26475x17f588a(com.p314xaae8f345.p347x615374d.gen.C3449x4414699 c3449x4414699) {
        if (c3449x4414699 == null) {
            return 0L;
        }
        java.util.Calendar m26453xf55efb3e = m26453xf55efb3e();
        m26453xf55efb3e.clear();
        m26453xf55efb3e.set(c3449x4414699.f13587x629fe4a, c3449x4414699.f13586xbe716e13 - 1, c3449x4414699.f13585x3297ef);
        return m26453xf55efb3e.getTimeInMillis();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3450xead37cc
    /* renamed from: yearOfNow */
    public int mo26476xe27ce742() {
        java.util.Calendar m26453xf55efb3e = m26453xf55efb3e();
        m26453xf55efb3e.setTimeInMillis(java.lang.System.currentTimeMillis());
        return m26453xf55efb3e.get(1);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = new com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359(context);
        this.f12784x847ab9e4 = c28001xdd2bb359;
        c28001xdd2bb359.setInputType(0);
        this.f12784x847ab9e4.setFocusable(false);
        this.f12784x847ab9e4.setBackground(null);
        this.f12784x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 17.0f));
        this.f12784x847ab9e4.setPadding(0, 0, 0, 0);
        this.f12784x847ab9e4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_r));
        if (context instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
            this.f12777x9d4bf30f = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) context;
        }
        m26456x407014d6();
        m26455x508a170c();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9 c3326x9cc74de9 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9(context, this.f12784x847ab9e4);
        this.f12782x62389694 = c3326x9cc74de9;
        return c3326x9cc74de9;
    }
}
