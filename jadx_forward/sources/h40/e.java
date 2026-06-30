package h40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final h40.e f360269d;

    /* renamed from: e, reason: collision with root package name */
    public static final h40.e f360270e;

    /* renamed from: f, reason: collision with root package name */
    public static final h40.e f360271f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h40.e[] f360272g;

    static {
        h40.e eVar = new h40.e("SUCCESS", 0);
        f360269d = eVar;
        h40.e eVar2 = new h40.e("CANCEL", 1);
        f360270e = eVar2;
        h40.e eVar3 = new h40.e("ERROR", 2);
        f360271f = eVar3;
        h40.e[] eVarArr = {eVar, eVar2, eVar3};
        f360272g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static h40.e m132849xdce0328(java.lang.String str) {
        return (h40.e) java.lang.Enum.valueOf(h40.e.class, str);
    }

    /* renamed from: values */
    public static h40.e[] m132850xcee59d22() {
        return (h40.e[]) f360272g.clone();
    }
}
