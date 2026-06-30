package ho1;

/* loaded from: classes9.dex */
public final class p1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f364314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f364315c;

    public p1(ho1.q1 q1Var, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f364313a = q1Var;
        this.f364314b = j17;
        this.f364315c = f0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        bo1.m mVar = (bo1.m) fVar.f152151d;
        r45.ie ieVar = new r45.ie();
        ieVar.f458492d = fVar.f152149b;
        mVar.mo11485x1f73abb4(ieVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
        java.util.LinkedList linkedList = ((bo1.m) fVar.f152151d).f104542d;
        if (linkedList.size() <= 0 || this.f364315c.f391649d == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "afterUpdate: size=" + linkedList.size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "afterUpdate: size=" + linkedList.size() + ", pkgId=" + ((bo1.h) linkedList.getFirst()).f104528d + ", version=" + ((bo1.h) linkedList.getFirst()).f104529e);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = this.f364313a.f364320a;
        if (g0Var == null) {
            return null;
        }
        g0Var.C0(this.f364314b, ((bo1.m) fVar.f152151d).mo14344x5f01b1f6());
        return jz5.f0.f384359a;
    }
}
