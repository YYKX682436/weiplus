package hy2;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f367596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy2.m f367597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, hy2.m mVar) {
        super(0);
        this.f367596d = z17;
        this.f367597e = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (!this.f367596d) {
            hy2.m mVar = this.f367597e;
            mVar.m158354x19263085().finish();
            mVar.m158354x19263085().overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "jumpToAuthorization finish " + mVar.m158354x19263085().isFinishing() + " activity:" + mVar.m158354x19263085());
            mVar.f367600e = true;
        }
        return jz5.f0.f384359a;
    }
}
