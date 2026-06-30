package dh3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final dh3.d f314029e;

    /* renamed from: f, reason: collision with root package name */
    public static final dh3.d f314030f;

    /* renamed from: g, reason: collision with root package name */
    public static final dh3.d f314031g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dh3.d[] f314032h;

    /* renamed from: d, reason: collision with root package name */
    public final int f314033d;

    static {
        dh3.d dVar = new dh3.d("UNKNOWN", 0, 0);
        dh3.d dVar2 = new dh3.d("FORWARD", 1, 1);
        f314029e = dVar2;
        dh3.d dVar3 = new dh3.d("ALBUM", 2, 2);
        f314030f = dVar3;
        dh3.d dVar4 = new dh3.d("FILE", 3, 3);
        f314031g = dVar4;
        dh3.d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f314032h = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f314033d = i18;
    }

    /* renamed from: valueOf */
    public static dh3.d m124402xdce0328(java.lang.String str) {
        return (dh3.d) java.lang.Enum.valueOf(dh3.d.class, str);
    }

    /* renamed from: values */
    public static dh3.d[] m124403xcee59d22() {
        return (dh3.d[]) f314032h.clone();
    }
}
