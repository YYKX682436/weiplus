package x32;

/* loaded from: classes13.dex */
public class e extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f533136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x32.f f533137b;

    public e(int i17, x32.f fVar) {
        this.f533136a = i17;
        this.f533137b = fVar;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo13581xd73276fa(j17, i17, i18, str, str2, i19, rVar);
        rk0.c.c("LibraryHelper", "download fail. projectId:%s, name:%s, version:%s, errNo:%d, errCode:%d", str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo13582x5e6271bd(j17, str, str2, i17, rVar);
        rk0.c.c("LibraryHelper", "download success. projectId:%s, name:%s, version:%s", str, str2, java.lang.Integer.valueOf(i17));
        java.util.Map map = x32.g.f533138a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(str, str2);
        int i18 = this.f533136a;
        if (Ui == null || i18 != Ui.f299123e) {
            rk0.c.d("LibraryHelper", "download success, but version doesn't match. projectId:%s, name:%s, version:%s, target version:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            x32.g.a(str, str2, Ui.m117639xfb83cc9b(), this.f533137b);
        }
    }
}
