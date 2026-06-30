package b03;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f16820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b03.l lVar) {
        super(1);
        this.f16820d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        boolean isBackground = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground();
        b03.l lVar = this.f16820d;
        if (isBackground || com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground() || lVar.f16848k) {
            lVar.a(0L, b03.b0.f16826e);
        } else {
            lVar.a(lVar.f16839b, b03.b0.f16825d);
        }
        return jz5.f0.f302826a;
    }
}
