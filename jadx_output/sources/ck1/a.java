package ck1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ck1.a f42301d;

    /* renamed from: e, reason: collision with root package name */
    public static final ck1.a f42302e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ck1.a[] f42303f;

    static {
        ck1.a aVar = new ck1.a(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f42301d = aVar;
        ck1.a aVar2 = new ck1.a("WITH_TITLE", 1);
        f42302e = aVar2;
        ck1.a[] aVarArr = {aVar, aVar2};
        f42303f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static ck1.a valueOf(java.lang.String str) {
        return (ck1.a) java.lang.Enum.valueOf(ck1.a.class, str);
    }

    public static ck1.a[] values() {
        return (ck1.a[]) f42303f.clone();
    }
}
