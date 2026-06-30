package az0;

/* loaded from: classes16.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamPreviewSettings f15318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(az0.f2 f2Var, com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings) {
        super(1);
        this.f15317d = f2Var;
        this.f15318e = mJCamPreviewSettings;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        az0.f2 f2Var = this.f15317d;
        az0.f2.a(f2Var);
        az0.i1 i1Var = new az0.i1(it);
        f2Var.f15460d.Y(this.f15318e, i1Var);
        return jz5.f0.f302826a;
    }
}
