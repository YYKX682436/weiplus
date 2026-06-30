package n35;

/* loaded from: classes7.dex */
public final class f extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public final int f416340d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.IOException f416341e;

    public f(int i17, java.io.IOException iOException) {
        this.f416340d = i17;
        this.f416341e = iOException;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "UnknownConnectionError{httpStatusCode=" + this.f416340d + ", realException=" + this.f416341e + '}';
    }
}
