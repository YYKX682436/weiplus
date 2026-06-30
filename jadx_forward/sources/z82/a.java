package z82;

/* loaded from: classes9.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z82.b f552254a;

    public a(z82.b bVar) {
        this.f552254a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j
    public void a(boolean z17) {
        z82.b bVar = this.f552254a;
        boolean isFinishing = bVar.f552255d.isFinishing();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavOpenApiEntry", "onCheckEnd, isPass = " + z17 + ", isFinishing = " + isFinishing);
        if (z17 && !isFinishing) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d = bVar.f552255d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d.T6(activityC13629xedc2457d, activityC13629xedc2457d.f183219h.f33049x38eb0007);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(bVar.f552255d, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(bVar.f552255d.getIntent().getExtras(), -3), true, false);
            bVar.f552255d.finish();
        }
    }
}
