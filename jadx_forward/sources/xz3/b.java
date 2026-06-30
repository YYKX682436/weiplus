package xz3;

/* loaded from: classes15.dex */
public final class b implements xz3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xz3.f f539742a;

    public b(xz3.f fVar) {
        this.f539742a = fVar;
    }

    @Override // xz3.g
    public void a(sz3.x0 result, int i17, long j17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanImageGetProductTask", "getProductTask onRetrievalFailed source: " + i17 + ", session: " + j17 + ", errCode: " + i18 + ", errMsg: " + str);
        xz3.f fVar = this.f539742a;
        fVar.f539749e.a(result, i17, j17, i18, str);
        fVar.f539749e.j(fVar);
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        xz3.f fVar = this.f539742a;
        fVar.f539749e.g(fVar);
    }

    @Override // xz3.g
    public void h(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductTask", "getProductTask onRetrievalSuccess");
        xz3.f fVar = this.f539742a;
        fVar.f539749e.h(result);
        fVar.f539749e.j(fVar);
    }

    @Override // xz3.g
    public void i(sz3.n request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f539742a.f539749e.i(request);
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }
}
