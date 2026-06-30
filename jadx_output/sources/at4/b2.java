package at4;

/* loaded from: classes9.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(1);
        this.f13813d = h0Var;
        this.f13814e = h0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard it = (com.tencent.mm.plugin.wallet_core.model.Bankcard) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.v0()) {
            this.f13813d.f310123d = it;
            return java.lang.Boolean.TRUE;
        }
        if (!it.D0()) {
            return java.lang.Boolean.FALSE;
        }
        this.f13814e.f310123d = it;
        return java.lang.Boolean.TRUE;
    }
}
