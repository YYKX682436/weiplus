package vi3;

/* loaded from: classes12.dex */
public class h implements c01.y8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi3.f f519127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi3.k f519128e;

    public h(vi3.k kVar, vi3.f fVar) {
        this.f519128e = kVar;
        this.f519127d = fVar;
    }

    @Override // c01.y8
    public void a0() {
        vi3.k kVar = this.f519128e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeServer", "receive onNotifyUserStatusChange, needWaitExtLoginCallback[%b], isWebWXOnline:[%b]", java.lang.Boolean.valueOf(kVar.f519138d), java.lang.Boolean.valueOf(gm0.j1.b().t()));
        if (kVar.f519138d && gm0.j1.b().t()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeServer", "onNotifyUserStatusChange need send msgSynchronize appMsg.");
            c01.d9.b().G(this);
            kVar.f519138d = false;
            kVar.c(this.f519127d, false);
        }
    }
}
