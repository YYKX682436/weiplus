package yg5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final yg5.a f543866d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ yg5.a[] f543867e;

    static {
        yg5.a aVar = new yg5.a("Single", 0);
        f543866d = aVar;
        yg5.a[] aVarArr = {aVar, new yg5.a("Multi", 1)};
        f543867e = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static yg5.a m177156xdce0328(java.lang.String str) {
        return (yg5.a) java.lang.Enum.valueOf(yg5.a.class, str);
    }

    /* renamed from: values */
    public static yg5.a[] m177157xcee59d22() {
        return (yg5.a[]) f543867e.clone();
    }
}
