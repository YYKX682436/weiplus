package androidx.compose.foundation.lazy.layout;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10394a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10395b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f10396c;

    public c(int i17, int i18, java.lang.Object obj) {
        this.f10394a = i17;
        this.f10395b = i18;
        this.f10396c = obj;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("startIndex should be non-negative but was " + i17).toString());
        }
        if (i18 > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("size should be positive but was " + i18).toString());
    }
}
