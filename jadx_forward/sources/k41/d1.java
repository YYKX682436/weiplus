package k41;

/* loaded from: classes11.dex */
public final class d1 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.w f385515a;

    public d1(j41.w wVar) {
        this.f385515a = wVar;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        j41.u uVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getContact finish! contact: ");
        sb6.append((i0Var == null || (uVar = i0Var.f379176d) == null) ? null : ((k41.g0) uVar).f68613xdec927b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuGetContactService", sb6.toString());
        j41.w wVar = this.f385515a;
        if (wVar != null) {
            wVar.a(i0Var);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        j41.w wVar = this.f385515a;
        if (wVar != null) {
            wVar.b(str);
        }
    }
}
