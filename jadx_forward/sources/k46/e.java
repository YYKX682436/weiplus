package k46;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: d, reason: collision with root package name */
    public static final k46.e f385642d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k46.e[] f385643e;

    static {
        k46.c cVar = new k46.c("IN_MEMORY", 0);
        f385642d = cVar;
        final java.lang.String str = "TEMP_FILE";
        final int i17 = 1;
        f385643e = new k46.e[]{cVar, new k46.e(str, i17) { // from class: k46.d
            @Override // k46.e
            public k46.f h() {
                return new k46.h();
            }
        }};
    }

    public e(java.lang.String str, int i17, k46.c cVar) {
    }

    /* renamed from: valueOf */
    public static k46.e m141960xdce0328(java.lang.String str) {
        return (k46.e) java.lang.Enum.valueOf(k46.e.class, str);
    }

    /* renamed from: values */
    public static k46.e[] m141961xcee59d22() {
        return (k46.e[]) f385643e.clone();
    }

    public abstract k46.f h();
}
