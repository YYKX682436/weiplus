package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI */
/* loaded from: classes8.dex */
public class ActivityC19121x3bd613a5 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {
    private static final java.lang.String TAG = "MicroMsg.WalletSelectProfessionUI";

    /* renamed from: mProfessions */
    protected com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[] f38703xedcc504a = null;

    /* renamed from: screen */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f38704xc9e5c06c;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kzi);
        this.f38704xc9e5c06c = m79336x8b97809d();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(mo55332x76847179(), null);
        c21568x1a71b23b.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzh));
        c21568x1a71b23b.C("title_category");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f38704xc9e5c06c).d(c21568x1a71b23b, -1);
        android.os.Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("key_profession_list");
        if (parcelableArrayExtra != null && parcelableArrayExtra.length > 0) {
            this.f38703xedcc504a = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[parcelableArrayExtra.length];
            int i17 = 0;
            while (true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[] c19086x2eaebd1cArr = this.f38703xedcc504a;
                if (i17 >= c19086x2eaebd1cArr.length) {
                    break;
                }
                c19086x2eaebd1cArr[i17] = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c) parcelableArrayExtra[i17];
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[] c19086x2eaebd1cArr2 = this.f38703xedcc504a;
        if (c19086x2eaebd1cArr2 != null) {
            int i18 = 0;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c : c19086x2eaebd1cArr2) {
                if (c19086x2eaebd1c != null) {
                    java.lang.String str = c19086x2eaebd1c.f260954d;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(mo55332x76847179());
                        c21560x1fce98fb.L(str);
                        c21560x1fce98fb.C("index_" + i18);
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f38704xc9e5c06c).d(c21560x1fce98fb, -1);
                    }
                }
                i18++;
            }
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.startsWith("index_")) {
            java.lang.String[] split = c21560x1fce98fb.f279313q.split("_");
            if (split.length == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c = this.f38703xedcc504a[com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0)];
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_select_profession", c19086x2eaebd1c);
                setResult(-1, intent);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "error key: %s, %s", c21560x1fce98fb.f279313q, c21560x1fce98fb.o());
                setResult(0);
            }
            finish();
        }
        return true;
    }
}
