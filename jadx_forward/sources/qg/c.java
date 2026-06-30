package qg;

/* loaded from: classes.dex */
public enum c {
    Unknown(-1),
    Image(0),
    Video(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f444259d;

    c(int i17) {
        this.f444259d = i17;
    }

    public static qg.c a(int i17) {
        for (qg.c cVar : m159967xcee59d22()) {
            if (cVar.f444259d == i17) {
                return cVar;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "MJAssetMediaType{value=" + this.f444259d + '}';
    }
}
