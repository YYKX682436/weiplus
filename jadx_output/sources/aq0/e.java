package aq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final aq0.e f13012d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq0.e f13013e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq0.e f13014f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ aq0.e[] f13015g;

    static {
        aq0.e eVar = new aq0.e(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f13012d = eVar;
        aq0.e eVar2 = new aq0.e("TextFirework", 1);
        f13013e = eVar2;
        aq0.e eVar3 = new aq0.e("EmojiFirework", 2);
        f13014f = eVar3;
        aq0.e[] eVarArr = {eVar, eVar2, eVar3};
        f13015g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static aq0.e valueOf(java.lang.String str) {
        return (aq0.e) java.lang.Enum.valueOf(aq0.e.class, str);
    }

    public static aq0.e[] values() {
        return (aq0.e[]) f13015g.clone();
    }
}
