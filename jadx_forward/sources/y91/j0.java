package y91;

/* loaded from: classes13.dex */
public class j0 extends org.apache.http.client.methods.HttpPost {

    /* renamed from: d, reason: collision with root package name */
    public final w91.e f541825d;

    public j0(java.lang.String str, w91.e eVar) {
        super(str);
        this.f541825d = eVar;
    }

    @Override // org.apache.http.client.methods.HttpPost, org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public java.lang.String getMethod() {
        return this.f541825d.name();
    }
}
