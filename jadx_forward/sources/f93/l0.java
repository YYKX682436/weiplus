package f93;

/* loaded from: classes11.dex */
public final class l0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea, android.os.Looper looper) {
        super(looper);
        this.f341911a = activityC16165x57283aea;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341911a;
        if (i17 != 6001) {
            if (i17 != 6002) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC16165x57283aea.f224724d, "unknow message. what is:%d", java.lang.Integer.valueOf(i17));
                return;
            } else {
                ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
                return;
            }
        }
        f93.y yVar = activityC16165x57283aea.A;
        if (yVar != null) {
            yVar.s();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }
}
