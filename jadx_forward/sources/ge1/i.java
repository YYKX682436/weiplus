package ge1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final ge1.i f352482d;

    /* renamed from: e, reason: collision with root package name */
    public static final ge1.i f352483e;

    /* renamed from: f, reason: collision with root package name */
    public static final ge1.i f352484f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ge1.i[] f352485g;

    static {
        ge1.i iVar = new ge1.i("HONOR", 0);
        f352482d = iVar;
        ge1.i iVar2 = new ge1.i("OPPO", 1);
        f352483e = iVar2;
        ge1.i iVar3 = new ge1.i("UNSUPPORTED", 2);
        f352484f = iVar3;
        ge1.i[] iVarArr = {iVar, iVar2, iVar3};
        f352485g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ge1.i m131351xdce0328(java.lang.String str) {
        return (ge1.i) java.lang.Enum.valueOf(ge1.i.class, str);
    }

    /* renamed from: values */
    public static ge1.i[] m131352xcee59d22() {
        return (ge1.i[]) f352485g.clone();
    }
}
