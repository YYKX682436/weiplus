package sy1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f495376a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f495377b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f495378c;

    public e(sy1.f fVar) {
    }

    /* renamed from: equals */
    public boolean m165500xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof sy1.e)) {
            sy1.e eVar = (sy1.e) obj;
            if (this.f495376a == eVar.hashCode() && u46.l.c(this.f495377b, eVar.f495377b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m165501x9616526c() {
        return "SyncSessionPage{pageId=" + this.f495377b + ", sourceViewId='" + this.f495378c + "'}";
    }
}
