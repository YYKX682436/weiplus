package tz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final tz0.k f504725d;

    /* renamed from: e, reason: collision with root package name */
    public static final tz0.k f504726e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tz0.k[] f504727f;

    static {
        tz0.k kVar = new tz0.k("Black", 0);
        f504725d = kVar;
        tz0.k kVar2 = new tz0.k("White", 1);
        f504726e = kVar2;
        tz0.k[] kVarArr = {kVar, kVar2};
        f504727f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static tz0.k m167276xdce0328(java.lang.String str) {
        return (tz0.k) java.lang.Enum.valueOf(tz0.k.class, str);
    }

    /* renamed from: values */
    public static tz0.k[] m167277xcee59d22() {
        return (tz0.k[]) f504727f.clone();
    }
}
