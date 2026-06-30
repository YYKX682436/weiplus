package hs4;

/* loaded from: classes9.dex */
public class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19058x7309e74d f366162d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19058x7309e74d activityC19058x7309e74d) {
        this.f366162d = activityC19058x7309e74d;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        ((ku5.t0) ku5.t0.f394148d).A("WXPayJsApiKindaEntranceUIObserver");
        java.lang.String string = ((android.os.Bundle) obj).getString("ret", "fail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayJsApiKindaEntranceUI", "callback ret is：%s", string);
        if (string.contains("ok")) {
            this.f366162d.setResult(-1);
        } else if (string.contains("cancel")) {
            this.f366162d.setResult(0);
        } else {
            this.f366162d.setResult(-1000);
        }
        this.f366162d.finish();
    }
}
