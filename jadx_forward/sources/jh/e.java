package jh;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f381229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jh.m f381230e;

    public e(jh.m mVar, android.os.CancellationSignal cancellationSignal) {
        this.f381230e = mVar;
        this.f381229d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        jh.c0 c0Var = this.f381230e.f381263f;
        c0Var.getClass();
        java.io.File file = new java.io.File(jh.a0.b(c0Var));
        oj.j.c("Matrix.WarmUpDelegate", "Going to clean up saving path(%s)..", file.getAbsoluteFile());
        boolean isDirectory = file.isDirectory();
        jh.s sVar = jh.s.CleanUp;
        if (!isDirectory) {
            this.f381230e.f381262e.a(sVar);
            return;
        }
        try {
            jh.a0.e(file, this.f381229d, new jh.d(this, new java.util.HashMap()));
        } catch (android.os.OperationCanceledException unused) {
            z17 = true;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.WarmUpDelegate", th6, "", new java.lang.Object[0]);
        }
        z17 = false;
        if (z17) {
            oj.j.c("Matrix.WarmUpDelegate", "Clean up saving path(%s) cancelled.", file.getAbsoluteFile());
            return;
        }
        java.io.File a17 = jh.a0.a(this.f381230e.f381263f.f381206a);
        try {
            a17.createNewFile();
            a17.setLastModified(java.lang.System.currentTimeMillis());
        } catch (java.io.IOException e17) {
            oj.j.d("Matrix.Backtrace.WarmUp", e17, "", new java.lang.Object[0]);
        }
        this.f381230e.f381262e.a(sVar);
        oj.j.c("Matrix.WarmUpDelegate", "Clean up saving path(%s) done.", file.getAbsoluteFile());
        jh.p pVar = jh.m.f381257h;
        if (pVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.c) pVar).a(jh.o.CleanedUp, new java.lang.Object[0]);
        }
    }
}
