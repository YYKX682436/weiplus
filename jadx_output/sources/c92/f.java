package c92;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17) {
        super(2);
        this.f39737d = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        c92.g.f39739b = false;
        c92.g gVar = c92.g.f39738a;
        gVar.a().putInt("finder_live_square_entrance_verify_refresh_interval", intValue);
        gVar.a().putLong("finder_live_square_entrance_verify_request_time", java.lang.System.currentTimeMillis());
        com.tencent.mm.sdk.platformtools.o4 a17 = gVar.a();
        int i17 = this.f39737d;
        a17.putInt("finder_live_square_entrance_dynamic_config", i17);
        if (booleanValue) {
            gVar.a().putInt("live_status_flag", i17);
        }
        return jz5.f0.f302826a;
    }
}
