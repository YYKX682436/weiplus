package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes8.dex */
public class o2 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f260576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b f260577b;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b activityC19055xad52aa6b, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54) {
        this.f260577b = activityC19055xad52aa6b;
        this.f260576a = c21549x15041e54;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSecuritySettingUI", "icon url: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19055xad52aa6b activityC19055xad52aa6b = this.f260577b;
        this.f260576a.U = new android.graphics.drawable.BitmapDrawable(activityC19055xad52aa6b.mo55332x76847179().getResources(), bitmap);
        ((java.util.HashMap) activityC19055xad52aa6b.f260489v).remove(str);
    }
}
