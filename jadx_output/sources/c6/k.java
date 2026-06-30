package c6;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final coil.memory.MemoryCache$Key f38855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38856b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.d f38857c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38858d;

    public k(coil.memory.MemoryCache$Key memoryCache$Key, boolean z17, v5.d dataSource, boolean z18) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        this.f38855a = memoryCache$Key;
        this.f38856b = z17;
        this.f38857c = dataSource;
        this.f38858d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6.k)) {
            return false;
        }
        c6.k kVar = (c6.k) obj;
        return kotlin.jvm.internal.o.b(this.f38855a, kVar.f38855a) && this.f38856b == kVar.f38856b && this.f38857c == kVar.f38857c && this.f38858d == kVar.f38858d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        coil.memory.MemoryCache$Key memoryCache$Key = this.f38855a;
        int hashCode = (memoryCache$Key == null ? 0 : memoryCache$Key.hashCode()) * 31;
        boolean z17 = this.f38856b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int hashCode2 = (((hashCode + i17) * 31) + this.f38857c.hashCode()) * 31;
        boolean z18 = this.f38858d;
        return hashCode2 + (z18 ? 1 : z18 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "Metadata(memoryCacheKey=" + this.f38855a + ", isSampled=" + this.f38856b + ", dataSource=" + this.f38857c + ", isPlaceholderMemoryCacheKeyPresent=" + this.f38858d + ')';
    }
}
