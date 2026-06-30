package mz4;

/* renamed from: mz4.d$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC29168x2e00fe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f414776d;

    @Override // java.lang.Runnable
    public final void run() {
        mz4.j jVar = mz4.j.f414822a;
        mz4.d dVar = this.f414776d;
        java.util.List oriDataList = dVar.f414762a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriDataList, "oriDataList");
        if (!oriDataList.isEmpty()) {
            java.util.List c17 = jVar.c(oriDataList);
            oriDataList.clear();
            oriDataList.addAll(c17);
        }
        dVar.f414771j = false;
    }
}
