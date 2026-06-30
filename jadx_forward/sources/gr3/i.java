package gr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final gr3.i f356406e;

    /* renamed from: f, reason: collision with root package name */
    public static final gr3.i f356407f;

    /* renamed from: g, reason: collision with root package name */
    public static final gr3.i f356408g;

    /* renamed from: h, reason: collision with root package name */
    public static final gr3.i f356409h;

    /* renamed from: i, reason: collision with root package name */
    public static final gr3.i f356410i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ gr3.i[] f356411m;

    /* renamed from: d, reason: collision with root package name */
    public final int f356412d;

    static {
        gr3.i iVar = new gr3.i("ONLY_CHAT", 0, 0);
        f356406e = iVar;
        gr3.i iVar2 = new gr3.i("ONLY_NOT_SEE_ME", 1, 1);
        f356407f = iVar2;
        gr3.i iVar3 = new gr3.i("ONLY_NOT_SEE_TA", 2, 2);
        f356408g = iVar3;
        gr3.i iVar4 = new gr3.i("BOTH_OPEN", 3, 3);
        f356409h = iVar4;
        gr3.i iVar5 = new gr3.i("BOTH_CLOSE", 4, 4);
        f356410i = iVar5;
        gr3.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        f356411m = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, int i18) {
        this.f356412d = i18;
    }

    /* renamed from: valueOf */
    public static gr3.i m132076xdce0328(java.lang.String str) {
        return (gr3.i) java.lang.Enum.valueOf(gr3.i.class, str);
    }

    /* renamed from: values */
    public static gr3.i[] m132077xcee59d22() {
        return (gr3.i[]) f356411m.clone();
    }
}
