package a5;

/* loaded from: classes13.dex */
public enum q0 {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean h() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
