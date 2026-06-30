package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity */
/* loaded from: classes9.dex */
public class ActivityC3324x8e115ecc extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255 {

    /* renamed from: FLAG_ACTIVITY_BACK */
    public static final java.lang.String f12952x3339c084 = "flag_activity_back_KindaWrapBankEditActivity";

    /* renamed from: FLAG_ACTIVITY_CLOSE */
    public static final java.lang.String f12953x341195db = "flag_activity_close_KindaWrapBankEditActivity";

    /* renamed from: REQ_SELECT_BANKCARD_TYPE */
    public static final int f12954xe73d476b = 1;
    public static final java.lang.String TAG = "KindaBank.KindaWrapBankEditActivity";

    /* renamed from: mSelectBankName */
    private java.lang.String f12955xd0a35dd0;

    /* renamed from: mSortEntities */
    private java.util.List<fb5.n> f12956x19d13c8c = new java.util.ArrayList();

    /* renamed from: sendDatatoKinda */
    private void m26752x59b95e00(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "";
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c : this.f38696x175be264) {
            if (c19097xe6dc5b4c.f261181e.equals(str) && c19097xe6dc5b4c.f261193t.equals(str2)) {
                str4 = c19097xe6dc5b4c.f261192s;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Ktemp.bank_type：" + c19097xe6dc5b4c.f261192s);
            }
        }
        if (!str4.isEmpty()) {
            str3 = str4;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9 c5185x1f35a3d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9();
        am.m0 m0Var = c5185x1f35a3d9.f135529g;
        m0Var.f88819a = str;
        m0Var.f88821c = str2;
        m0Var.f88820b = str3;
        c5185x1f35a3d9.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "sendDataToKinda：bankName：" + str + "  bankAccName：" + str2 + "  BankType：" + str3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaWrapBankEditActivity.onItemSelect，发送事件，当前线程：");
        sb6.append(java.lang.Thread.currentThread().getId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, sb6.toString());
        finish();
        if (isFinishing()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9 c5185x1f35a3d92 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9();
            c5185x1f35a3d92.f135529g.f88819a = f12953x341195db;
            c5185x1f35a3d92.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255
    /* renamed from: fetchData */
    public void mo26753xb6377d84() {
        r45.nd ndVar = new r45.nd();
        try {
            ndVar.mo11468x92b714fd(getIntent().getByteArrayExtra("major_bank_list"));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "bank list parse failed");
        }
        this.f38701x84ec4283 = new java.util.ArrayList();
        java.util.Iterator it = ndVar.f462788d.iterator();
        while (it.hasNext()) {
            r45.md mdVar = (r45.md) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();
            c19097xe6dc5b4c.f261181e = mdVar.f461902d;
            c19097xe6dc5b4c.f261192s = mdVar.f461904f;
            this.f38701x84ec4283.add(c19097xe6dc5b4c);
        }
        r45.nd ndVar2 = new r45.nd();
        try {
            ndVar2.mo11468x92b714fd(getIntent().getByteArrayExtra("bank_list"));
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "bank list parse failed");
        }
        this.f38694x4c50a20a = new java.util.ArrayList();
        java.util.Iterator it6 = ndVar2.f462788d.iterator();
        while (it6.hasNext()) {
            r45.md mdVar2 = (r45.md) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();
            c19097xe6dc5b4c2.f261181e = mdVar2.f461902d;
            c19097xe6dc5b4c2.f261192s = mdVar2.f461904f;
            this.f38694x4c50a20a.add(c19097xe6dc5b4c2);
        }
        r45.nd ndVar3 = new r45.nd();
        try {
            ndVar3.mo11468x92b714fd(getIntent().getByteArrayExtra("bank_type_list"));
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "bank type list parse failed");
        }
        this.f38696x175be264 = new java.util.ArrayList();
        java.util.Iterator it7 = ndVar3.f462788d.iterator();
        while (it7.hasNext()) {
            r45.md mdVar3 = (r45.md) it7.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();
            c19097xe6dc5b4c3.f261181e = mdVar3.f461902d;
            c19097xe6dc5b4c3.f261192s = mdVar3.f461904f;
            c19097xe6dc5b4c3.f261193t = mdVar3.f461906h;
            this.f38696x175be264.add(c19097xe6dc5b4c3);
        }
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.super.mo26753xb6377d84();
            }
        });
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.widget.base.KindaWrapBankEditActivity.2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.this).f39906x53855852 = 4;
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.this.mo73847x7d641a7d()) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.this.mo48674x36654fab();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.this.showDialog(1000);
                    return true;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.this).f38696x175be264)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9 c5185x1f35a3d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9();
                    c5185x1f35a3d9.f135529g.f88819a = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.f12952x3339c084;
                    c5185x1f35a3d9.e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.ActivityC3324x8e115ecc.this.finish();
                return true;
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1 || intent == null) {
            return;
        }
        m26752x59b95e00(this.f12955xd0a35dd0, intent.getStringExtra("bank_card_acc_name"), "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255
    /* renamed from: onItemSelect */
    public void mo26754x3d81212e(java.lang.Object obj, int i17) {
        gt4.n nVar = (gt4.n) obj;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (nVar == null) {
            return;
        }
        mo48674x36654fab();
        this.f12955xd0a35dd0 = nVar.f357006c;
        if (this.f38696x175be264.size() == 0) {
            m26752x59b95e00(this.f12955xd0a35dd0, "", nVar.f357008e);
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c : this.f38696x175be264) {
            if (c19097xe6dc5b4c.f261181e.equals(this.f12955xd0a35dd0)) {
                arrayList.add(c19097xe6dc5b4c.f261193t);
            }
        }
        if (arrayList.size() == 1) {
            m26752x59b95e00(this.f12955xd0a35dd0, arrayList.get(0), "");
            return;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19105x556d812f.class);
        intent.putStringArrayListExtra("bank_type_show_list", arrayList);
        startActivityForResult(intent, 1);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9 c5185x1f35a3d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5185x1f35a3d9();
            c5185x1f35a3d9.f135529g.f88819a = f12953x341195db;
            c5185x1f35a3d9.e();
        }
    }
}
