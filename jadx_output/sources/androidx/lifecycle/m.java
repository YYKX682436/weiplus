package androidx.lifecycle;

/* loaded from: classes7.dex */
public enum m {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public androidx.lifecycle.n h() {
        switch (androidx.lifecycle.l.f11635b[ordinal()]) {
            case 1:
            case 2:
                return androidx.lifecycle.n.CREATED;
            case 3:
            case 4:
                return androidx.lifecycle.n.STARTED;
            case 5:
                return androidx.lifecycle.n.RESUMED;
            case 6:
                return androidx.lifecycle.n.DESTROYED;
            default:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
        }
    }
}
