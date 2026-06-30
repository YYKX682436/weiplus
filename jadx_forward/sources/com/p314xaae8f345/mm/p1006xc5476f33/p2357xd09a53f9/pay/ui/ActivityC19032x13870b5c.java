package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI */
/* loaded from: classes9.dex */
public class ActivityC19032x13870b5c extends com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9 {
    public java.lang.String A;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 W6() {
        java.util.ArrayList arrayList = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj().f95506a;
        this.f260189h = arrayList;
        if (arrayList != null) {
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.f(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 o3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3(this, this.f260189h, this.f260191m, this.f260195q);
        o3Var.f262087h = this.A;
        return o3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9
    public void Y6(int i17) {
        java.util.ArrayList arrayList = this.f260189h;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = this.f260189h;
        if (arrayList2 != null && i17 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList2.get(i17);
            this.f260192n = c19091x9511676c;
            this.f260193o.f262087h = c19091x9511676c.f69225xed6d60f6;
            this.f260187f.setEnabled(true);
            this.f260193o.notifyDataSetChanged();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bindSerial", c19091x9511676c.f69225xed6d60f6);
            intent.putExtra("ret", 0);
            setResult(-1, intent);
        } else if (size == i17) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("ret", com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15118x25060539);
            setResult(-1, intent2);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.A = getIntent().getStringExtra("bindSerial");
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.m(this));
    }
}
