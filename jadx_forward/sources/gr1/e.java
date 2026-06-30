package gr1;

/* loaded from: classes11.dex */
public final class e implements com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr1.i f356258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f356260c;

    public e(hr1.i iVar, java.lang.String str, int i17) {
        this.f356258a = iVar;
        this.f356259b = str;
        this.f356260c = i17;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d1
    /* renamed from: complete */
    public final void mo67612xdc453139(int i17) {
        hr1.i iVar = this.f356258a;
        hr1.e z07 = iVar.z0("bizfansnofiticationholder@bizfansmsg");
        jr1.j.f(z07, 0);
        java.lang.String str = this.f356259b;
        z07.f66316xf66fcca9 = str;
        z07.f66331xa783a79b = this.f356260c * 1000;
        z07.f66330xa35b5abb = i17;
        z07.f66324x9b4f418d = 0;
        iVar.mo55864x413cb2b4(z07, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated, digest update " + str + ", redDotCount: " + i17);
    }
}
