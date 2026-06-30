package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes13.dex */
public final class s2 extends java.util.concurrent.CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient p3325xe03a0797.p3326xc267989b.r2 f392114d;

    public s2(java.lang.String str, java.lang.Throwable th6, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        super(str);
        this.f392114d = r2Var;
        if (th6 != null) {
            initCause(th6);
        }
    }

    /* renamed from: equals */
    public boolean m144089xb2c87fbf(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof p3325xe03a0797.p3326xc267989b.s2) {
                p3325xe03a0797.p3326xc267989b.s2 s2Var = (p3325xe03a0797.p3326xc267989b.s2) obj;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s2Var.getMessage(), getMessage()) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s2Var.f392114d, this.f392114d) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s2Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    /* renamed from: hashCode */
    public int m144090x8cdac1b() {
        java.lang.String message = getMessage();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(message);
        int hashCode = ((message.hashCode() * 31) + this.f392114d.hashCode()) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return super.toString() + "; job=" + this.f392114d;
    }
}
