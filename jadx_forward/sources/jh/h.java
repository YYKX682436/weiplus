package jh;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f381244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jh.m f381245e;

    public h(jh.m mVar, android.os.CancellationSignal cancellationSignal) {
        this.f381245e = mVar;
        this.f381244d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File file = new java.io.File(this.f381245e.f381259b);
        boolean isDirectory = file.isDirectory();
        jh.s sVar = jh.s.DiskUsage;
        if (!isDirectory) {
            this.f381245e.f381262e.a(sVar);
            return;
        }
        long[] jArr = new long[2];
        try {
            jh.a0.e(file, this.f381244d, new jh.g(this, jArr));
            this.f381245e.f381262e.a(sVar);
            jh.a0.f(this.f381245e.f381263f.f381206a);
            oj.j.c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
            jh.p pVar = jh.m.f381257h;
            if (pVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.c) pVar).a(jh.o.DiskUsage, java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
            }
        } catch (android.os.OperationCanceledException | java.util.concurrent.CancellationException unused) {
            this.f381245e.f381262e.a(sVar);
            jh.a0.f(this.f381245e.f381263f.f381206a);
            oj.j.c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
        } catch (java.lang.Throwable th6) {
            this.f381245e.f381262e.a(sVar);
            jh.a0.f(this.f381245e.f381263f.f381206a);
            oj.j.c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
            throw th6;
        }
    }
}
