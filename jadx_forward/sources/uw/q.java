package uw;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw.s f513035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uw.s sVar) {
        super(0);
        this.f513035d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().m(this.f513035d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBSGetPoiHelper", "stop locationGeo failed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
