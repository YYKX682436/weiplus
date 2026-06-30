package qg5;

/* loaded from: classes8.dex */
public final class e4 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f444497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444498b;

    public e4(qg5.q4 q4Var, yz5.a aVar) {
        this.f444497a = q4Var;
        this.f444498b = aVar;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        qg5.q4.U6(this.f444497a, 0);
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
        this.f444497a.Y6();
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoForwardChatRecordsFSC", "onJumpAppFail");
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        qg5.q4 q4Var = this.f444497a;
        qg5.q4.U6(q4Var, 1);
        qg5.q4.T6(q4Var);
        yz5.a aVar = this.f444498b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.YuanBaoForwardChatRecordsFSC", "onJumpDownloadPage: unexpected in forward scenario");
    }
}
