package zw1;

/* loaded from: classes8.dex */
public class c4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f558128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f558129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558130c;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.o90 o90Var, int i17) {
        this.f558130c = activityC13149x63b02cb3;
        this.f558128a = o90Var;
        this.f558129b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558130c;
        if (activityC13149x63b02cb3.isFinishing() || activityC13149x63b02cb3.isDestroyed() || fVar.f152151d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 5);
            r45.jx jxVar = (r45.jx) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "cgiBack.resp.url:%s cgiBack.resp.true_name:%s", jxVar.f459712d, jxVar.f459713e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb32 = this.f558130c;
            r45.jx jxVar2 = (r45.jx) fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Y6(activityC13149x63b02cb32, jxVar2.f459712d, jxVar2.f459713e, jxVar2.f459714f, jxVar2.f459715g, this.f558128a, this.f558129b, null, jxVar2.f459716h);
            activityC13149x63b02cb3.k7(1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.X6(activityC13149x63b02cb3, fVar.f152150c);
        }
        return java.lang.Boolean.TRUE;
    }
}
