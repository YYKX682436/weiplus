package av1;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.CastUIC f14177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.cast.ui.CastUIC castUIC) {
        super(0);
        this.f14177d = castUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = this.f14177d.getIntent().getStringArrayListExtra("params_image_path");
        return stringArrayListExtra == null ? new java.util.ArrayList() : stringArrayListExtra;
    }
}
