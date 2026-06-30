package aj0;

/* loaded from: classes11.dex */
public final class d implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aj0.e f86756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f86757b;

    public d(aj0.e eVar, long j17) {
        this.f86756a = eVar;
        this.f86757b = j17;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28640xd440a6e3
    /* renamed from: onPreRenderFinished */
    public void mo2114xecb7e18c(boolean z17, android.graphics.Bitmap bitmap) {
        aj0.e eVar = this.f86756a;
        if (((p3325xe03a0797.p3326xc267989b.c3) eVar.f86766i).A()) {
            return;
        }
        ((p3325xe03a0797.p3326xc267989b.u2) eVar.f86766i).U(jz5.f0.f384359a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre finished, success:");
        sb6.append(z17);
        sb6.append(", cost:");
        sb6.append(java.lang.System.currentTimeMillis() - this.f86757b);
        sb6.append(", bitmap:");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append('x');
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        io.p3284xd2ae381c.Log.i(eVar.f86762e, sb6.toString());
        if (z17) {
            eVar.f86765h = bitmap;
        }
        yz5.l lVar = eVar.f86767j;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
    }
}
