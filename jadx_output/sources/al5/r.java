package al5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final al5.r f6004d;

    /* renamed from: e, reason: collision with root package name */
    public static final al5.r f6005e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ al5.r[] f6006f;

    static {
        al5.r rVar = new al5.r("ALWAYS_HIDE", 0);
        f6004d = rVar;
        al5.r rVar2 = new al5.r("ALWAYS_AVOID", 1);
        f6005e = rVar2;
        al5.r[] rVarArr = {rVar, rVar2};
        f6006f = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17) {
    }

    public static al5.r valueOf(java.lang.String str) {
        return (al5.r) java.lang.Enum.valueOf(al5.r.class, str);
    }

    public static al5.r[] values() {
        return (al5.r[]) f6006f.clone();
    }
}
