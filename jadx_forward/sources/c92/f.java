package c92;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17) {
        super(2);
        this.f121270d = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        c92.g.f121272b = false;
        c92.g gVar = c92.g.f121271a;
        gVar.a().putInt("finder_live_square_entrance_verify_refresh_interval", intValue);
        gVar.a().putLong("finder_live_square_entrance_verify_request_time", java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = gVar.a();
        int i17 = this.f121270d;
        a17.putInt("finder_live_square_entrance_dynamic_config", i17);
        if (booleanValue) {
            gVar.a().putInt("live_status_flag", i17);
        }
        return jz5.f0.f384359a;
    }
}
