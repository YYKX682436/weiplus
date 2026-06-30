package b23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final b23.e f17388d;

    /* renamed from: e, reason: collision with root package name */
    public static final b23.e f17389e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b23.e[] f17390f;

    static {
        b23.e eVar = new b23.e(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f17388d = eVar;
        b23.e eVar2 = new b23.e("DEEP_THINK_CHECKED", 1, 1);
        f17389e = eVar2;
        b23.e[] eVarArr = {eVar, eVar2};
        f17390f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
    }

    public static b23.e valueOf(java.lang.String str) {
        return (b23.e) java.lang.Enum.valueOf(b23.e.class, str);
    }

    public static b23.e[] values() {
        return (b23.e[]) f17390f.clone();
    }
}
