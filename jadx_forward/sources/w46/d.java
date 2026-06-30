package w46;

/* loaded from: classes12.dex */
public class d extends java.lang.RuntimeException implements w46.b {

    /* renamed from: d, reason: collision with root package name */
    public final w46.c f524465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f524466e;

    public d(java.lang.Throwable th6) {
        this.f524465d = new w46.c(this);
        this.f524466e = null;
        this.f524466e = th6;
    }

    public final void a(java.io.PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.f524466e;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        java.lang.Throwable th6 = this.f524466e;
        if (th6 != null) {
            return th6.toString();
        }
        return null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream printStream) {
        w46.c cVar = this.f524465d;
        cVar.getClass();
        synchronized (printStream) {
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.OutputStream) printStream, false);
            cVar.a(printWriter);
            printWriter.flush();
        }
    }

    public d(java.lang.String str, java.lang.Throwable th6) {
        super(str);
        this.f524465d = new w46.c(this);
        this.f524466e = null;
        this.f524466e = th6;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter printWriter) {
        this.f524465d.a(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        java.io.PrintStream printStream = java.lang.System.err;
        w46.c cVar = this.f524465d;
        cVar.getClass();
        synchronized (printStream) {
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.OutputStream) printStream, false);
            cVar.a(printWriter);
            printWriter.flush();
        }
    }
}
