package z82;

/* loaded from: classes9.dex */
public class d implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f552258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 f552259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d f552260c;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936) {
        this.f552260c = activityC13629xedc2457d;
        this.f552258a = c11286x34a5504;
        this.f552259b = c11289x4ff06936;
    }

    @Override // dk5.h2
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d = this.f552260c;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavOpenApiEntry", "thumb img CDN upload fail!");
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC13629xedc2457d, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC13629xedc2457d.getIntent().getExtras(), -1), true, false);
            activityC13629xedc2457d.finish();
        } else {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = this.f552259b;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f552258a;
            c11286x34a5504.f33122xe4128443 = c11289x4ff06936;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d.f183214o;
            activityC13629xedc2457d.U6(c11286x34a5504, str);
        }
    }
}
