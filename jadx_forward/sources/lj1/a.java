package lj1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final lj1.a f400341d;

    /* renamed from: e, reason: collision with root package name */
    public static final lj1.a f400342e;

    /* renamed from: f, reason: collision with root package name */
    public static final lj1.a f400343f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ lj1.a[] f400344g;

    static {
        lj1.a aVar = new lj1.a("BusinessTypeNone", 0);
        f400341d = aVar;
        lj1.a aVar2 = new lj1.a("BusinessTypeWxaBase", 1);
        f400342e = aVar2;
        lj1.a aVar3 = new lj1.a("BusinessTypeOpenSdk", 2);
        lj1.a aVar4 = new lj1.a("BusinessTypeVideoAct", 3);
        f400343f = aVar4;
        lj1.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f400344g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static lj1.a m145840xdce0328(java.lang.String str) {
        return (lj1.a) java.lang.Enum.valueOf(lj1.a.class, str);
    }

    /* renamed from: values */
    public static lj1.a[] m145841xcee59d22() {
        return (lj1.a[]) f400344g.clone();
    }
}
