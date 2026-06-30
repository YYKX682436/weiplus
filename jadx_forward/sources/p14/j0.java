package p14;

/* loaded from: classes11.dex */
public class j0 extends v61.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e f432762d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e activityC17368x689ea64e) {
        this.f432762d = activityC17368x689ea64e;
    }

    @Override // v61.r0, v61.p0
    public void a(int i17, java.lang.String str) {
        super.a(i17, str);
        if (i17 == 3) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e.f241647i;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17368x689ea64e activityC17368x689ea64e = this.f432762d;
            activityC17368x689ea64e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToQQUI", "dealWithRefreshTokenFail");
            if (activityC17368x689ea64e.f241652h) {
                return;
            }
            java.lang.String string = activityC17368x689ea64e.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            db5.e1.u(activityC17368x689ea64e.mo55332x76847179(), activityC17368x689ea64e.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8h), string, new p14.k0(activityC17368x689ea64e), null);
        }
    }

    @Override // v61.r0, v61.p0
    public void b(android.os.Bundle bundle) {
        super.b(bundle);
    }
}
