package az0;

/* loaded from: classes5.dex */
public final class d4 implements com.tencent.maas.MJMaasCore.LoginParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.d4 f15404a = new az0.d4();

    @Override // com.tencent.maas.MJMaasCore.LoginParamsCallback
    public final com.tencent.maas.MJMaasCore.LoginParams onGetLoginParams() {
        jz5.l lVar = (jz5.l) kotlinx.coroutines.l.f(null, new az0.c4(null), 1, null);
        return new com.tencent.maas.MJMaasCore.LoginParams((java.lang.String) lVar.f302833d, (java.lang.String) lVar.f302834e, com.tencent.maas.MJMaasCore.LoginParams.LoginType.ThirdApp);
    }
}
