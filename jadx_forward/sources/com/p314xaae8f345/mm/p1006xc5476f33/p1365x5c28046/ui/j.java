package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes12.dex */
public class j extends qr.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k f179599a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k kVar) {
        this.f179599a = kVar;
    }

    @Override // qr.k
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(str2 == null ? 0 : str2.length());
        objArr[3] = java.lang.Integer.valueOf(str3 != null ? str3.length() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload result: errorType=%d, md5=%s, token:%d, url %d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.k kVar = this.f179599a;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.O6(kVar.f179607b, str, kVar.f179606a, str2, str3);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = kVar.f179607b;
        boolean z17 = activityC13272x96cd1be8.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be82 = kVar.f179607b;
        if (z17) {
            activityC13272x96cd1be8.I++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "batch upload fail: errType=" + i17 + ", md5=" + activityC13272x96cd1be82.f179199e);
            activityC13272x96cd1be82.W6();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.P6(activityC13272x96cd1be8);
            return;
        }
        if (i17 != 1) {
            activityC13272x96cd1be8.Q6(null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC13272x96cd1be8.f179201g);
        java.lang.String mo42933xb5885648 = activityC13272x96cd1be82.f179204m.mo42933xb5885648();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = activityC13272x96cd1be82.f179204m;
        java.lang.String str4 = c21053xdbf1e5f4.f68657xb76d85ab;
        java.lang.String str5 = c21053xdbf1e5f4.f68663x861009b5;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426);
        java.lang.String str6 = activityC13272x96cd1be82.f179202h;
        java.lang.String str7 = activityC13272x96cd1be82.f179204m.f68641x3342accf;
        java.lang.String str8 = activityC13272x96cd1be82.f179203i;
        java.lang.String V6 = activityC13272x96cd1be82.V6();
        activityC13272x96cd1be82.getClass();
        g0Var.d(10431, valueOf, mo42933xb5885648, str4, str5, 1, 1, valueOf2, str6, str7, str8, V6, "");
        activityC13272x96cd1be82.Z6(str);
    }
}
