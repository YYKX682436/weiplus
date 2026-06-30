package xc1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f534587e;

    public o(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f534586d = str;
        this.f534587e = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, event on native post data");
        xc1.a aVar = new xc1.a();
        aVar.f163907f = this.f534586d;
        aVar.u(this.f534587e);
        aVar.m();
    }
}
