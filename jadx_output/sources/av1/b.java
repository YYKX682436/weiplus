package av1;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.CastUIC f14175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.cast.ui.CastUIC castUIC) {
        super(0);
        this.f14175d = castUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f14175d.getIntent().getStringExtra("params_activity_callback_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
