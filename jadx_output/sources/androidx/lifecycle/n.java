package androidx.lifecycle;

/* loaded from: classes7.dex */
public enum n {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public boolean a(androidx.lifecycle.n nVar) {
        return compareTo(nVar) >= 0;
    }
}
