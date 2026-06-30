package oy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final oy.k f431356d;

    /* renamed from: e, reason: collision with root package name */
    public static final oy.k f431357e;

    /* renamed from: f, reason: collision with root package name */
    public static final oy.k f431358f;

    /* renamed from: g, reason: collision with root package name */
    public static final oy.k f431359g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ oy.k[] f431360h;

    static {
        oy.k kVar = new oy.k("IDLE", 0);
        f431356d = kVar;
        oy.k kVar2 = new oy.k("PREPARING", 1);
        f431357e = kVar2;
        oy.k kVar3 = new oy.k("PLAYING", 2);
        f431358f = kVar3;
        oy.k kVar4 = new oy.k("PAUSED", 3);
        f431359g = kVar4;
        oy.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f431360h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static oy.k m157343xdce0328(java.lang.String str) {
        return (oy.k) java.lang.Enum.valueOf(oy.k.class, str);
    }

    /* renamed from: values */
    public static oy.k[] m157344xcee59d22() {
        return (oy.k[]) f431360h.clone();
    }
}
