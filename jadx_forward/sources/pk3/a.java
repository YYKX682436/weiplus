package pk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final pk3.a f437967d;

    /* renamed from: e, reason: collision with root package name */
    public static final pk3.a f437968e;

    /* renamed from: f, reason: collision with root package name */
    public static final pk3.a f437969f;

    /* renamed from: g, reason: collision with root package name */
    public static final pk3.a f437970g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pk3.a[] f437971h;

    static {
        pk3.a aVar = new pk3.a("MODE_SHOW_SINGLE_SCENE", 0);
        f437967d = aVar;
        pk3.a aVar2 = new pk3.a("MODE_SHOW_MULTI_SCENE", 1);
        f437968e = aVar2;
        pk3.a aVar3 = new pk3.a("MODE_SHOW_SNAPSHOT_SCENE", 2);
        f437969f = aVar3;
        pk3.a aVar4 = new pk3.a("MODE_NONE", 3);
        f437970g = aVar4;
        pk3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f437971h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static pk3.a m158647xdce0328(java.lang.String str) {
        return (pk3.a) java.lang.Enum.valueOf(pk3.a.class, str);
    }

    /* renamed from: values */
    public static pk3.a[] m158648xcee59d22() {
        return (pk3.a[]) f437971h.clone();
    }
}
