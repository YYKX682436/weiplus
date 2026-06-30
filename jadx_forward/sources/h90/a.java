package h90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h90.a[] f361204d;

    static {
        h90.a[] aVarArr = {new h90.a("IMAGE", 0, 1), new h90.a("VIDEO", 1, 2), new h90.a("FILE", 2, 3), new h90.a("IMAGE_MID_OR_THUMB", 3, 4), new h90.a("VIDEO_THUMB", 4, 5)};
        f361204d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static h90.a m133036xdce0328(java.lang.String str) {
        return (h90.a) java.lang.Enum.valueOf(h90.a.class, str);
    }

    /* renamed from: values */
    public static h90.a[] m133037xcee59d22() {
        return (h90.a[]) f361204d.clone();
    }
}
