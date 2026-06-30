package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl */
/* loaded from: classes9.dex */
public class C3307x3b509d38 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0<android.view.View> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096 {

    /* renamed from: _hellAccFlag_ */
    private byte f12824x7f11beae;

    /* renamed from: callback */
    com.p314xaae8f345.p347x615374d.gen.AbstractC3505x8dbb75b2 f12825xf5bc2045;

    /* renamed from: mContainer */
    private android.widget.LinearLayout f12826x62389694;

    /* renamed from: mContext */
    private android.content.Context f12827xd6cfe882;

    /* renamed from: mCurSelectedProfession */
    private com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c f12828xfe795dea;

    /* renamed from: mEditText */
    private android.widget.EditText f12829x847ab9e4;

    /* renamed from: professions */
    private final java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c> f12831x43bf3ef7 = new java.util.ArrayList();

    /* renamed from: professionSelectedEventIListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903> f12830xd709a65a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.widget.base.KindaProfessionEditViewImpl.1
        {
            this.f39173x3fe91575 = 843767027;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5854x93319903 c5854x93319903) {
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3325xf8bbeda2.f12959xe11ef4a3.equals(c5854x93319903.f136161g.f89740a)) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12830xd709a65a.mo48814x2efc64();
                return false;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("profession_name:");
            am.vo voVar = c5854x93319903.f136161g;
            sb6.append(voVar.f89740a);
            sb6.append(" profession_type:");
            sb6.append(voVar.f89741b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, sb6.toString());
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12828xfe795dea = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c(voVar.f89740a, voVar.f89741b);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12829x847ab9e4.setText(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12828xfe795dea.f260954d);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12826x62389694.setContentDescription(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12828xfe795dea.f260954d);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38 c3307x3b509d38 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this;
            com.p314xaae8f345.p347x615374d.gen.AbstractC3505x8dbb75b2 abstractC3505x8dbb75b2 = c3307x3b509d38.f12825xf5bc2045;
            if (abstractC3505x8dbb75b2 == null) {
                return false;
            }
            abstractC3505x8dbb75b2.mo28095x7d5f9b17(c3307x3b509d38.f12828xfe795dea.f260954d, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3307x3b509d38.this.f12828xfe795dea.f260955e);
            return false;
        }
    };

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public android.view.View mo26107x519d71c1(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.f12829x847ab9e4 = editText;
        editText.setInputType(0);
        this.f12829x847ab9e4.setFocusable(false);
        this.f12829x847ab9e4.setBackground(null);
        this.f12829x847ab9e4.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.kj9);
        this.f12829x847ab9e4.setTextSize(0, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27357xb0f6c08f(context, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(context) * 17.0f));
        this.f12829x847ab9e4.setPadding(0, 0, 0, 0);
        this.f12827xd6cfe882 = context;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9 c3326x9cc74de9 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3326x9cc74de9(context, this.f12829x847ab9e4);
        this.f12826x62389694 = c3326x9cc74de9;
        c3326x9cc74de9.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kj9));
        return this.f12826x62389694;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: getFocus */
    public boolean mo26558x746efb22() {
        return this.f12829x847ab9e4.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: getProfessionName */
    public java.lang.String mo26559xbb08be9d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c = this.f12828xfe795dea;
        if (c19086x2eaebd1c != null) {
            return c19086x2eaebd1c.f260954d;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: getProfessionType */
    public int mo26560xbb0bd34c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c = this.f12828xfe795dea;
        if (c19086x2eaebd1c != null) {
            return c19086x2eaebd1c.f260955e;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: setData */
    public void mo26561x76491f2c(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        r45.pd5 pd5Var = new r45.pd5();
        try {
            pd5Var.mo11468x92b714fd(abstractC3411xcfaed72e.mo27541x124d2ef7("profession_list"));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0.TAG, "profession list parse failed");
        }
        this.f12831x43bf3ef7.clear();
        java.util.Iterator it = pd5Var.f464501d.iterator();
        while (it.hasNext()) {
            r45.od5 od5Var = (r45.od5) it.next();
            this.f12831x43bf3ef7.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c(od5Var.f463707e, od5Var.f463706d));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: setDefaultProfession */
    public void mo26562xf94b09db(int i17, java.lang.String str) {
        this.f12828xfe795dea = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c(str, i17);
        this.f12829x847ab9e4.setText(str);
        this.f12826x62389694.setContentDescription(this.f12828xfe795dea.f260954d);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: setFocus */
    public void mo26563x52fd1596(boolean z17) {
        if (z17) {
            this.f12830xd709a65a.mo48813x58998cd();
            android.content.Context context = this.f12827xd6cfe882;
            if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26052xd46dd964();
                android.content.Intent intent = new android.content.Intent(this.f12827xd6cfe882, (java.lang.Class<?>) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3325xf8bbeda2.class);
                java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c> list = this.f12831x43bf3ef7;
                intent.putExtra("key_profession_list", (android.os.Parcelable[]) list.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[list.size()]));
                android.content.Context context2 = this.f12827xd6cfe882;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/KindaProfessionEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/kinda/framework/widget/base/KindaProfessionEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3504x260f096
    /* renamed from: setOnSelectProfessionCallback */
    public void mo26564xb83dda7e(com.p314xaae8f345.p347x615374d.gen.AbstractC3505x8dbb75b2 abstractC3505x8dbb75b2) {
        this.f12825xf5bc2045 = abstractC3505x8dbb75b2;
    }
}
