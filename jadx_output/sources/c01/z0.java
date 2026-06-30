package c01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c01.z0[] f37577d;

    static {
        c01.z0[] z0VarArr = {new c01.z0("RECOMMEND_FEEDS_UNDEFINED", 0, 0), new c01.z0("RECOMMEND_FEEDS_CLOSE", 1, 1), new c01.z0("RECOMMEND_FEEDS_OPEN", 2, 2)};
        f37577d = z0VarArr;
        rz5.b.a(z0VarArr);
    }

    public z0(java.lang.String str, int i17, int i18) {
    }

    public static c01.z0 valueOf(java.lang.String str) {
        return (c01.z0) java.lang.Enum.valueOf(c01.z0.class, str);
    }

    public static c01.z0[] values() {
        return (c01.z0[]) f37577d.clone();
    }
}
