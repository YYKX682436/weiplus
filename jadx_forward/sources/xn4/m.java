package xn4;

/* loaded from: classes11.dex */
public final class m implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.ActivityC18782xb52fd33d f537167a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.ActivityC18782xb52fd33d activityC18782xb52fd33d) {
        this.f537167a = activityC18782xb52fd33d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.ActivityC18782xb52fd33d.f257045q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.ActivityC18782xb52fd33d activityC18782xb52fd33d = this.f537167a;
        activityC18782xb52fd33d.c7();
        xn4.c0 c0Var = xn4.c0.f537137a;
        java.lang.String cdnUrl = activityC18782xb52fd33d.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(c0Var.g(cdnUrl));
        java.lang.String cdnUrl2 = activityC18782xb52fd33d.V6().f462210p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl2, "cdnUrl");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_FILE_NAME").remove(cdnUrl2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_MEDIA_ID").remove(cdnUrl2);
        activityC18782xb52fd33d.finish();
    }
}
