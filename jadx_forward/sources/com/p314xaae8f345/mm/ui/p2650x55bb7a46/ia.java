package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class ia implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x72.b f283376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f283377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.la f283378f;

    public ia(com.p314xaae8f345.mm.ui.p2650x55bb7a46.la laVar, x72.b bVar, java.lang.Object obj) {
        this.f283378f = laVar;
        this.f283376d = bVar;
        this.f283377e = obj;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "oreh downloadImreportHandler.removeMessagesreportHandler.removeMessagesgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", java.lang.Boolean.valueOf(i19 == 0 && i27 == 0), java.lang.Long.valueOf(this.f283376d.f533968d.m124847x74d37ac6()), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ha(this));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMsgHandle", "oreh downloadImgAndFav download image taskcancel: msgID:%d", java.lang.Long.valueOf(this.f283376d.f533968d.m124847x74d37ac6()));
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
