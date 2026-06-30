package jd3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final jd3.a f380692e;

    /* renamed from: f, reason: collision with root package name */
    public static final jd3.a f380693f;

    /* renamed from: g, reason: collision with root package name */
    public static final jd3.a f380694g;

    /* renamed from: h, reason: collision with root package name */
    public static final jd3.a f380695h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ jd3.a[] f380696i;

    /* renamed from: d, reason: collision with root package name */
    public final int f380697d;

    static {
        jd3.a aVar = new jd3.a("Success", 0, 0);
        f380692e = aVar;
        jd3.a aVar2 = new jd3.a("PhysicalPathEmpty", 1, 1);
        f380693f = aVar2;
        jd3.a aVar3 = new jd3.a("ScriptEmpty", 2, 2);
        f380694g = aVar3;
        jd3.a aVar4 = new jd3.a("InjectError", 3, 3);
        jd3.a aVar5 = new jd3.a("FsError", 4, 4);
        f380695h = aVar5;
        jd3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f380696i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f380697d = i18;
    }

    /* renamed from: valueOf */
    public static jd3.a m140762xdce0328(java.lang.String str) {
        return (jd3.a) java.lang.Enum.valueOf(jd3.a.class, str);
    }

    /* renamed from: values */
    public static jd3.a[] m140763xcee59d22() {
        return (jd3.a[]) f380696i.clone();
    }
}
