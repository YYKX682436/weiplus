package eg4;

/* loaded from: classes4.dex */
public final class y0 implements xg3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d f334364a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d) {
        this.f334364a = activityC18505x6ae0de9d;
    }

    @Override // xg3.t
    public void a(boolean z17, int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory callback: hasMore=" + z17 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + errMsg);
        this.f334364a.f253700h = false;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory success, hasMore=" + z17);
            this.f334364a.f253699g = z17 ^ true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory fail: ".concat(errMsg));
        }
        this.f334364a.W6();
    }
}
