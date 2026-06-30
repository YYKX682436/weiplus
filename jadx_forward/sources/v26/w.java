package v26;

/* loaded from: classes13.dex */
public final class w extends java.util.concurrent.CancellationException {
    public w() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
