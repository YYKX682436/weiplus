package zw1;

/* loaded from: classes8.dex */
public class d4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f558140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f558141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558142c;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.o90 o90Var, int i17) {
        this.f558142c = activityC13149x63b02cb3;
        this.f558140a = o90Var;
        this.f558141b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeMch，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558142c;
        if (activityC13149x63b02cb3.isFinishing() || activityC13149x63b02cb3.isDestroyed() || fVar.f152151d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeMch，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 5);
            r45.hx hxVar = (r45.hx) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "cgiBack.resp.url:%s cgiBack.resp.true_name：%s", hxVar.f458055d, hxVar.f458056e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb32 = this.f558142c;
            r45.hx hxVar2 = (r45.hx) fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Y6(activityC13149x63b02cb32, hxVar2.f458055d, hxVar2.f458056e, hxVar2.f458057f, hxVar2.f458058g, this.f558140a, this.f558141b, hxVar2.f458059h, null);
            activityC13149x63b02cb3.k7(2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.X6(activityC13149x63b02cb3, fVar.f152150c);
        }
        return java.lang.Boolean.TRUE;
    }
}
