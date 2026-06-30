package kc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final kc2.i f387940e;

    /* renamed from: f, reason: collision with root package name */
    public static final kc2.i f387941f;

    /* renamed from: g, reason: collision with root package name */
    public static final kc2.i f387942g;

    /* renamed from: h, reason: collision with root package name */
    public static final kc2.i f387943h;

    /* renamed from: i, reason: collision with root package name */
    public static final kc2.i f387944i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kc2.i[] f387945m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f387946n;

    /* renamed from: d, reason: collision with root package name */
    public final long f387947d;

    static {
        kc2.i iVar = new kc2.i("_5MIN", 0, 300L);
        kc2.i iVar2 = new kc2.i("_10MIN", 1, 600L);
        kc2.i iVar3 = new kc2.i("_15MIN", 2, 900L);
        kc2.i iVar4 = new kc2.i("_30MIN", 3, 1800L);
        kc2.i iVar5 = new kc2.i("ONE_HOUR", 4, 3600L);
        kc2.i iVar6 = new kc2.i("TWO_HOUR", 5, 7200L);
        kc2.i iVar7 = new kc2.i("THREE_HOUR", 6, 10800L);
        kc2.i iVar8 = new kc2.i("FOUR_HOUR", 7, 14400L);
        kc2.i iVar9 = new kc2.i("FIVE_HOUR", 8, 18000L);
        kc2.i iVar10 = new kc2.i("SIX_HOUR", 9, 21600L);
        kc2.i iVar11 = new kc2.i("SEVEN_HOUR", 10, 25200L);
        kc2.i iVar12 = new kc2.i("EIGHT_HOUR", 11, 28800L);
        kc2.i iVar13 = new kc2.i("NINE_HOUR", 12, 32400L);
        kc2.i iVar14 = new kc2.i("TEN_HOUR", 13, 36000L);
        kc2.i iVar15 = new kc2.i("ELEVEN_HOUR", 14, 39600L);
        kc2.i iVar16 = new kc2.i("TWELVE_HOUR", 15, 43200L);
        kc2.i iVar17 = new kc2.i("ONE_DAY", 16, 86400L);
        kc2.i iVar18 = new kc2.i("THREE_DAYS", 17, 259200L);
        f387940e = iVar18;
        kc2.i iVar19 = new kc2.i("WEEK", 18, 604800L);
        f387941f = iVar19;
        kc2.i iVar20 = new kc2.i("TWO_WEAK", 19, 1209600L);
        f387942g = iVar20;
        kc2.i iVar21 = new kc2.i("MONTH", 20, 2592000L);
        f387943h = iVar21;
        kc2.i iVar22 = new kc2.i("TWO_MONTH", 21, 5184000L);
        f387944i = iVar22;
        kc2.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22};
        f387945m = iVarArr;
        f387946n = rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, long j17) {
        this.f387947d = j17;
    }

    /* renamed from: valueOf */
    public static kc2.i m142374xdce0328(java.lang.String str) {
        return (kc2.i) java.lang.Enum.valueOf(kc2.i.class, str);
    }

    /* renamed from: values */
    public static kc2.i[] m142375xcee59d22() {
        return (kc2.i[]) f387945m.clone();
    }
}
