package k16;

/* loaded from: classes16.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f384963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f384964b;

    public e(int i17, int i18, k16.b bVar) {
        this.f384963a = i17;
        this.f384964b = i18;
    }

    public static k16.c a(k16.e eVar) {
        return new k16.c(eVar.f384963a + eVar.f384964b);
    }

    public static k16.c b() {
        return new k16.c(0);
    }

    public abstract java.lang.Object c(int i17);
}
