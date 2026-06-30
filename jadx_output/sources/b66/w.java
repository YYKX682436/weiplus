package b66;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final b66.v f18168d;

    /* renamed from: e, reason: collision with root package name */
    public static final b66.w f18169e;

    /* renamed from: f, reason: collision with root package name */
    public static final b66.w f18170f;

    /* renamed from: g, reason: collision with root package name */
    public static final b66.w f18171g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b66.w[] f18172h;

    static {
        b66.w wVar = new b66.w("NONE", 0, 0);
        f18169e = wVar;
        b66.w wVar2 = new b66.w("TIMER", 1, 1);
        f18170f = wVar2;
        b66.w wVar3 = new b66.w("AUTO_NEXT", 2, 2);
        f18171g = wVar3;
        b66.w[] wVarArr = {wVar, wVar2, wVar3, new b66.w("MAX", 3, 2), new b66.w("MIN", 4, 0), new b66.w("COUNT", 5, 3)};
        f18172h = wVarArr;
        rz5.b.a(wVarArr);
        f18168d = new b66.v(null);
    }

    public w(java.lang.String str, int i17, int i18) {
    }

    public static b66.w valueOf(java.lang.String str) {
        return (b66.w) java.lang.Enum.valueOf(b66.w.class, str);
    }

    public static b66.w[] values() {
        return (b66.w[]) f18172h.clone();
    }
}
