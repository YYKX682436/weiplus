package ai4;

/* loaded from: classes11.dex */
public final class l0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86699a;

    public l0(java.lang.String str) {
        this.f86699a = str;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusLogicManager", "getContactFromServer:" + str);
        if (z17) {
            ej4.c0 c0Var = ej4.c0.f334868a;
            java.lang.String userName = this.f86699a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            ej4.c0.d(c0Var, userName, null, false, 6, null);
        }
    }
}
