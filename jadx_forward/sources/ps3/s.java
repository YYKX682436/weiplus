package ps3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ps3.s f439657d;

    /* renamed from: e, reason: collision with root package name */
    public static final ps3.s f439658e;

    /* renamed from: f, reason: collision with root package name */
    public static final ps3.s f439659f;

    /* renamed from: g, reason: collision with root package name */
    public static final ps3.s f439660g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ps3.s[] f439661h;

    static {
        ps3.s sVar = new ps3.s("Stopped", 0);
        f439657d = sVar;
        ps3.s sVar2 = new ps3.s("Locating", 1);
        f439658e = sVar2;
        ps3.s sVar3 = new ps3.s("RadarSearching", 2);
        f439659f = sVar3;
        ps3.s sVar4 = new ps3.s("Waiting", 3);
        f439660g = sVar4;
        ps3.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f439661h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ps3.s m158942xdce0328(java.lang.String str) {
        return (ps3.s) java.lang.Enum.valueOf(ps3.s.class, str);
    }

    /* renamed from: values */
    public static ps3.s[] m158943xcee59d22() {
        return (ps3.s[]) f439661h.clone();
    }
}
