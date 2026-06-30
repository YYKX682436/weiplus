package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f91927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91928b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f91929c;

    public c(int i17, int i18, java.lang.Object obj) {
        this.f91927a = i17;
        this.f91928b = i18;
        this.f91929c = obj;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("startIndex should be non-negative but was " + i17).toString());
        }
        if (i18 > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("size should be positive but was " + i18).toString());
    }
}
