package bt1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final bt1.g f24152e;

    /* renamed from: f, reason: collision with root package name */
    public static final bt1.g f24153f;

    /* renamed from: g, reason: collision with root package name */
    public static final bt1.g f24154g;

    /* renamed from: h, reason: collision with root package name */
    public static final bt1.g f24155h;

    /* renamed from: i, reason: collision with root package name */
    public static final bt1.g f24156i;

    /* renamed from: m, reason: collision with root package name */
    public static final bt1.g f24157m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ bt1.g[] f24158n;

    /* renamed from: d, reason: collision with root package name */
    public final int f24159d;

    static {
        bt1.g gVar = new bt1.g(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        bt1.g gVar2 = new bt1.g("AUTO_AUTH", 1, 1);
        f24152e = gVar2;
        bt1.g gVar3 = new bt1.g("NEW_SYNC", 2, 2);
        f24153f = gVar3;
        bt1.g gVar4 = new bt1.g("NOTIFY", 3, 3);
        f24154g = gVar4;
        bt1.g gVar5 = new bt1.g("CONTINUE", 4, 4);
        f24155h = gVar5;
        bt1.g gVar6 = new bt1.g("RETRY", 5, 5);
        f24156i = gVar6;
        bt1.g gVar7 = new bt1.g("CONFIG_DELAY", 6, 6);
        f24157m = gVar7;
        bt1.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        f24158n = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f24159d = i18;
    }

    public static bt1.g valueOf(java.lang.String str) {
        return (bt1.g) java.lang.Enum.valueOf(bt1.g.class, str);
    }

    public static bt1.g[] values() {
        return (bt1.g[]) f24158n.clone();
    }
}
