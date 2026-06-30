package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class y3 implements com.p314xaae8f345.mm.p2802xd031a825.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 f262340a;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362) {
        this.f262340a = activityC19112x755f8362;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.g
    /* renamed from: onProcessEnd */
    public android.content.Intent mo14634xe047072b(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "verify code end: %s", java.lang.Integer.valueOf(i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("token", bundle.getString("key_jsapi_token"));
        intent.putExtra("key_process_result_code", i17);
        intent.setClass(this.f262340a.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.putExtra("key_process_is_stay", false);
        return intent;
    }
}
