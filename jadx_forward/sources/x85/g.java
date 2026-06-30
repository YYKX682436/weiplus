package x85;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f534125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x85.i f534127f;

    public g(android.os.Bundle bundle, java.lang.String str, x85.i iVar) {
        this.f534125d = bundle;
        this.f534126e = str;
        this.f534127f = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = this.f534125d;
        int i17 = bundle != null ? bundle.getInt("err_type") : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetLensInfoTask", "IPCInvoker: " + this.f534126e + ", " + i17);
        byte[] byteArray = bundle != null ? bundle.getByteArray("result") : null;
        x85.i iVar = this.f534127f;
        if (byteArray == null) {
            x85.c cVar = iVar.f534130d;
            if (cVar != null) {
                cVar.a(i17, null);
                return;
            }
            return;
        }
        r45.p64 p64Var = new r45.p64();
        p64Var.mo11468x92b714fd(byteArray);
        x85.c cVar2 = iVar.f534130d;
        if (cVar2 != null) {
            cVar2.a(i17, p64Var);
        }
    }
}
