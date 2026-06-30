package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e0, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r3
    public void a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("encrypt_pwd", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19111xd5a60886 activityC19111xd5a60886 = this.f261776a;
        activityC19111xd5a60886.setResult(-1, intent);
        activityC19111xd5a60886.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e0, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r3
    /* renamed from: onCreate */
    public void mo67483x3e5a77bb() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19111xd5a60886 activityC19111xd5a60886 = this.f261776a;
        java.lang.String stringExtra = activityC19111xd5a60886.getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            activityC19111xd5a60886.f261509e.setText(stringExtra);
        }
        java.lang.String stringExtra2 = activityC19111xd5a60886.getIntent().getStringExtra("subtitle");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return;
        }
        activityC19111xd5a60886.f261510f.setText(stringExtra2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e0, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r3
    /* renamed from: onDestroy */
    public void mo67484xac79a11b() {
    }
}
