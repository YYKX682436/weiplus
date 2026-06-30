package c61;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class wb {

    /* renamed from: d, reason: collision with root package name */
    public static final c61.wb f39392d;

    /* renamed from: e, reason: collision with root package name */
    public static final c61.wb f39393e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c61.wb[] f39394f;

    static {
        c61.wb wbVar = new c61.wb("START", 0);
        f39392d = wbVar;
        c61.wb wbVar2 = new c61.wb("END", 1);
        f39393e = wbVar2;
        c61.wb[] wbVarArr = {wbVar, wbVar2};
        f39394f = wbVarArr;
        rz5.b.a(wbVarArr);
    }

    public wb(java.lang.String str, int i17) {
    }

    public static c61.wb valueOf(java.lang.String str) {
        return (c61.wb) java.lang.Enum.valueOf(c61.wb.class, str);
    }

    public static c61.wb[] values() {
        return (c61.wb[]) f39394f.clone();
    }
}
