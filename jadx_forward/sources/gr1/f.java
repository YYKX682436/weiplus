package gr1;

/* loaded from: classes11.dex */
public final class f implements com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr1.f f356261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f356263c;

    public f(nr1.f fVar, java.lang.String str, int i17) {
        this.f356261a = fVar;
        this.f356262b = str;
        this.f356263c = i17;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d1
    /* renamed from: complete */
    public final void mo67612xdc453139(int i17) {
        nr1.f fVar = this.f356261a;
        hr1.e z07 = fVar.z0("bizphotofansnofiticationholder@picfansmsg");
        jr1.j.f(z07, 5);
        java.lang.String str = this.f356262b;
        z07.f66316xf66fcca9 = str;
        z07.f66331xa783a79b = this.f356263c * 1000;
        z07.f66330xa35b5abb = i17;
        z07.f66324x9b4f418d = 0;
        fVar.mo55864x413cb2b4(z07, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated photo, digest update " + str + ", redDotCount: " + i17);
    }
}
