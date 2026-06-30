package mm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final mm.m f410058f;

    /* renamed from: g, reason: collision with root package name */
    public static final mm.m f410059g;

    /* renamed from: h, reason: collision with root package name */
    public static final mm.m f410060h;

    /* renamed from: i, reason: collision with root package name */
    public static final mm.m f410061i;

    /* renamed from: m, reason: collision with root package name */
    public static final mm.m f410062m;

    /* renamed from: n, reason: collision with root package name */
    public static final mm.m f410063n;

    /* renamed from: o, reason: collision with root package name */
    public static final mm.m f410064o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ mm.m[] f410065p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410066d;

    /* renamed from: e, reason: collision with root package name */
    public final int f410067e;

    static {
        mm.m mVar = new mm.m("PowerStat", 0, "powerStat", 50);
        f410058f = mVar;
        mm.m mVar2 = new mm.m("PowerCompare", 1, "powerCompare", 50);
        f410059g = mVar2;
        mm.m mVar3 = new mm.m("PowerTest", 2, "powerTest", 10);
        f410060h = mVar3;
        mm.m mVar4 = new mm.m("PowerAcc", 3, "powerAcc", 10);
        f410061i = mVar4;
        mm.m mVar5 = new mm.m("ExcessiveCpuUsage", 4, "excessiveCpuUsage", 10);
        mm.m mVar6 = new mm.m("ProcLifeAcc", 5, "procLifeAcc", 10);
        f410062m = mVar6;
        mm.m mVar7 = new mm.m("ProcLifeSampling", 6, "procLifeSampling", 50);
        f410063n = mVar7;
        mm.m mVar8 = new mm.m("ProcLifeSamplingLess", 7, "procLifeSamplingLess", 200);
        f410064o = mVar8;
        mm.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8};
        f410065p = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, java.lang.String str2, int i18) {
        this.f410066d = str2;
        this.f410067e = i18;
    }

    /* renamed from: valueOf */
    public static mm.m m147860xdce0328(java.lang.String str) {
        return (mm.m) java.lang.Enum.valueOf(mm.m.class, str);
    }

    /* renamed from: values */
    public static mm.m[] m147861xcee59d22() {
        return (mm.m[]) f410065p.clone();
    }

    public final boolean h() {
        return mm.o.d(this.f410066d, this.f410067e);
    }
}
