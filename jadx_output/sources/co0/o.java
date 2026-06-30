package co0;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f43726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f43727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(co0.s sVar, android.os.Bundle bundle) {
        super(0);
        this.f43726d = sVar;
        this.f43727e = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hn0.i iVar = this.f43726d.A;
        if (iVar != null) {
            iVar.callback(16, this.f43727e);
        }
        return jz5.f0.f302826a;
    }
}
