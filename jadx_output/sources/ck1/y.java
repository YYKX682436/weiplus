package ck1;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.t0 f42402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ck1.k0 k0Var, ck1.t0 t0Var) {
        super(0);
        this.f42401d = k0Var;
        this.f42402e = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ck1.s0 l07 = this.f42401d.f42338d.l0();
        l07.getClass();
        ck1.t0 usageInfoItem = this.f42402e;
        kotlin.jvm.internal.o.g(usageInfoItem, "usageInfoItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onRevokeBtnClick");
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(l07.f42373d), null, null, new ck1.r0(l07, usageInfoItem, null), 3, null);
        return jz5.f0.f302826a;
    }
}
