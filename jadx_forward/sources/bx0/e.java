package bx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final bx0.e f117780d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bx0.e[] f117781e;

    static {
        bx0.e eVar = new bx0.e("Framewise", 0);
        bx0.e eVar2 = new bx0.e("Normal", 1);
        f117780d = eVar2;
        bx0.e[] eVarArr = {eVar, eVar2, new bx0.e("Global", 2), new bx0.e("Thumbnail", 3)};
        f117781e = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bx0.e m13541xdce0328(java.lang.String str) {
        return (bx0.e) java.lang.Enum.valueOf(bx0.e.class, str);
    }

    /* renamed from: values */
    public static bx0.e[] m13542xcee59d22() {
        return (bx0.e[]) f117781e.clone();
    }
}
