package rv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final rv3.z f481953d;

    /* renamed from: e, reason: collision with root package name */
    public static final rv3.z f481954e;

    /* renamed from: f, reason: collision with root package name */
    public static final rv3.z f481955f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rv3.z[] f481956g;

    static {
        rv3.z zVar = new rv3.z("NORMAL", 0);
        f481953d = zVar;
        rv3.z zVar2 = new rv3.z("USED", 1);
        f481954e = zVar2;
        rv3.z zVar3 = new rv3.z("LOADING", 2);
        f481955f = zVar3;
        rv3.z[] zVarArr = {zVar, zVar2, zVar3};
        f481956g = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static rv3.z m163216xdce0328(java.lang.String str) {
        return (rv3.z) java.lang.Enum.valueOf(rv3.z.class, str);
    }

    /* renamed from: values */
    public static rv3.z[] m163217xcee59d22() {
        return (rv3.z[]) f481956g.clone();
    }
}
