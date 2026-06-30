package hf4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ hf4.a[] f362753d;

    static {
        hf4.a[] aVarArr = {new hf4.a("COMMON_SCENE", 0), new hf4.a("ALBUM_SCENE", 1), new hf4.a("FAV_SCENE", 2)};
        f362753d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static hf4.a m133487xdce0328(java.lang.String str) {
        return (hf4.a) java.lang.Enum.valueOf(hf4.a.class, str);
    }

    /* renamed from: values */
    public static hf4.a[] m133488xcee59d22() {
        return (hf4.a[]) f362753d.clone();
    }
}
