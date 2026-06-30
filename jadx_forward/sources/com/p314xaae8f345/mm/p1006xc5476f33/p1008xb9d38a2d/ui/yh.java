package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class yh extends v61.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 f155882d;

    public yh(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b63310) {
        this.f155882d = activityC11469xa6b63310;
    }

    @Override // v61.r0, v61.p0
    public void a(int i17, java.lang.String str) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310.f155186m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToFacebookRedirectUI", "refresh token error. errType:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        super.a(i17, str);
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11469xa6b63310 activityC11469xa6b63310 = this.f155882d;
            activityC11469xa6b63310.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToFacebookRedirectUI", "dealWithRefreshTokenFail");
            java.lang.String string = activityC11469xa6b63310.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            db5.e1.u(activityC11469xa6b63310.mo55332x76847179(), activityC11469xa6b63310.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8h), string, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bi(activityC11469xa6b63310), null);
        }
    }

    @Override // v61.r0, v61.p0
    public void b(android.os.Bundle bundle) {
        super.b(bundle);
    }
}
