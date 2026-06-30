package hs4;

/* loaded from: classes9.dex */
public class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19058x7309e74d f366163d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui.ActivityC19058x7309e74d activityC19058x7309e74d) {
        this.f366163d = activityC19058x7309e74d;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        ((ku5.t0) ku5.t0.f394148d).A("WXPayJsApiKindaEntranceUIObserver");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayJsApiKindaEntranceUI", "callback ret is：%s", bundle.getString("ret", "fail"));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        this.f366163d.setResult(-1, intent);
        this.f366163d.finish();
    }
}
