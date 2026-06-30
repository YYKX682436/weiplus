package fp0;

/* loaded from: classes10.dex */
public final class s implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fp0.t f346813a;

    public s(fp0.t tVar) {
        this.f346813a = tVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        fp0.r task = (fp0.r) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoaderFin] name=");
        fp0.t tVar = this.f346813a;
        sb6.append(tVar.f346814a);
        sb6.append(" status=");
        sb6.append(status);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", sb6.toString());
        tVar.f346817d = false;
        tVar.c();
    }
}
