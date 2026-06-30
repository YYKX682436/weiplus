package h6;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f360658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f360659b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f360660c;

    public j(boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        z19 = (i17 & 4) != 0 ? true : z19;
        this.f360658a = z17;
        this.f360659b = z18;
        this.f360660c = z19;
    }

    /* renamed from: equals */
    public boolean m132931xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6.j)) {
            return false;
        }
        h6.j jVar = (h6.j) obj;
        return this.f360658a == jVar.f360658a && this.f360659b == jVar.f360659b && this.f360660c == jVar.f360660c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m132932x8cdac1b() {
        boolean z17 = this.f360658a;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = i17 * 31;
        boolean z18 = this.f360659b;
        int i19 = z18;
        if (z18 != 0) {
            i19 = 1;
        }
        int i27 = (i18 + i19) * 31;
        boolean z19 = this.f360660c;
        return i27 + (z19 ? 1 : z19 ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m132933x9616526c() {
        return "ImageLoaderOptions(addLastModifiedToFileCacheKey=" + this.f360658a + ", launchInterceptorChainOnMainThread=" + this.f360659b + ", networkObserverEnabled=" + this.f360660c + ')';
    }
}
