package rj5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final rj5.a f477904d;

    /* renamed from: e, reason: collision with root package name */
    public static final rj5.a f477905e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rj5.a[] f477906f;

    static {
        rj5.a aVar = new rj5.a("IDLE", 0);
        f477904d = aVar;
        rj5.a aVar2 = new rj5.a("SCROLLING", 1);
        f477905e = aVar2;
        rj5.a[] aVarArr = {aVar, aVar2};
        f477906f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static rj5.a m162527xdce0328(java.lang.String str) {
        return (rj5.a) java.lang.Enum.valueOf(rj5.a.class, str);
    }

    /* renamed from: values */
    public static rj5.a[] m162528xcee59d22() {
        return (rj5.a[]) f477906f.clone();
    }
}
