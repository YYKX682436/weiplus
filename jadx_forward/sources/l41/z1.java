package l41;

/* loaded from: classes11.dex */
public final class z1 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f397511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j41.w f397512b;

    public z1(j41.h0 h0Var, j41.w wVar) {
        this.f397511a = h0Var;
        this.f397512b = wVar;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        java.lang.String str = null;
        j41.u uVar = i0Var != null ? i0Var.f379176d : null;
        java.lang.Object[] objArr = new java.lang.Object[3];
        j41.h0 h0Var = this.f397511a;
        objArr[0] = h0Var.f379166c;
        objArr[1] = h0Var.f379165b;
        if (uVar != null) {
            k41.g0 g0Var = (k41.g0) uVar;
            str = "username:" + g0Var.f68613xdec927b + " nick:" + g0Var.f68604x21f9b213;
        }
        objArr[2] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuService", "fetchContact username: %s, url: %s, contact: %s", objArr);
        j41.w wVar = this.f397512b;
        if (wVar != null) {
            wVar.a(i0Var);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuService", "fetchContact onTryFetch: %s", str);
        j41.w wVar = this.f397512b;
        if (wVar != null) {
            wVar.b(str);
        }
    }
}
