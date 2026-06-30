package ks3;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.j0 f393220d;

    public i0(ks3.j0 j0Var) {
        this.f393220d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hs3.q qVar = this.f393220d.f393232d;
        if (qVar != null) {
            hs3.i iVar = (hs3.i) qVar;
            iVar.f366112e = true;
            org.apache.http.client.methods.HttpRequestBase httpRequestBase = iVar.f366109b;
            if (httpRequestBase != null && !httpRequestBase.isAborted()) {
                iVar.f366109b.abort();
            }
            org.apache.http.client.HttpClient httpClient = iVar.f366108a;
            if (httpClient != null) {
                httpClient.getConnectionManager().shutdown();
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m144257x9616526c() {
        return super.toString() + "|onCancelled";
    }
}
