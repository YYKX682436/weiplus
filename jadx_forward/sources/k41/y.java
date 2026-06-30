package k41;

/* loaded from: classes11.dex */
public final class y implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f385589b;

    public y(java.lang.String str, c01.o8 o8Var) {
        this.f385588a = str;
        this.f385589b = o8Var;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f385588a;
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf((i0Var != null ? i0Var.f379176d : null) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKFGetContactInterceptor", "getContact username: %s, success: %s", objArr);
        c01.o8 o8Var = this.f385589b;
        if (o8Var != null) {
            o8Var.a(str, (i0Var != null ? i0Var.f379176d : null) != null);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
    }
}
