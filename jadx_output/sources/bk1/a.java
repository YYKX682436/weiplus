package bk1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final bk1.a f21284d;

    /* renamed from: e, reason: collision with root package name */
    public static final bk1.a f21285e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bk1.a[] f21286f;

    static {
        bk1.a aVar = new bk1.a(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f21284d = aVar;
        bk1.a aVar2 = new bk1.a("WITH_TITLE", 1);
        f21285e = aVar2;
        bk1.a[] aVarArr = {aVar, aVar2};
        f21286f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static bk1.a valueOf(java.lang.String str) {
        return (bk1.a) java.lang.Enum.valueOf(bk1.a.class, str);
    }

    public static bk1.a[] values() {
        return (bk1.a[]) f21286f.clone();
    }
}
