package aw2;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.j0 f14744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(aw2.j0 j0Var, long j17, int i17) {
        super(1);
        this.f14744d = j0Var;
        this.f14745e = j17;
        this.f14746f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.lite.s sVar = this.f14744d.f14762i;
        int i17 = it.length() == 0 ? -1 : 0;
        if (sVar != null) {
            sVar.c(this.f14745e, this.f14746f, "{\"errCode\": " + i17 + ",\"audioUrl\": \"" + it + "\"}");
        }
        return jz5.f0.f302826a;
    }
}
