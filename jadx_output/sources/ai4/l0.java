package ai4;

/* loaded from: classes11.dex */
public final class l0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5166a;

    public l0(java.lang.String str) {
        this.f5166a = str;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusLogicManager", "getContactFromServer:" + str);
        if (z17) {
            ej4.c0 c0Var = ej4.c0.f253335a;
            java.lang.String userName = this.f5166a;
            kotlin.jvm.internal.o.g(userName, "userName");
            ej4.c0.d(c0Var, userName, null, false, 6, null);
        }
    }
}
