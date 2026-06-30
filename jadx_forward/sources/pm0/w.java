package pm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final pm0.w f438337e;

    /* renamed from: f, reason: collision with root package name */
    public static final pm0.w f438338f;

    /* renamed from: g, reason: collision with root package name */
    public static final pm0.w f438339g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pm0.w[] f438340h;

    /* renamed from: d, reason: collision with root package name */
    public final int f438341d;

    static {
        pm0.w wVar = new pm0.w("TRICK", 0, 0);
        f438337e = wVar;
        pm0.w wVar2 = new pm0.w("WARNING", 1, 1);
        f438338f = wVar2;
        pm0.w wVar3 = new pm0.w("ERROR", 2, 110);
        f438339g = wVar3;
        pm0.w[] wVarArr = {wVar, wVar2, wVar3};
        f438340h = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17, int i18) {
        this.f438341d = i18;
    }

    /* renamed from: valueOf */
    public static pm0.w m158707xdce0328(java.lang.String str) {
        return (pm0.w) java.lang.Enum.valueOf(pm0.w.class, str);
    }

    /* renamed from: values */
    public static pm0.w[] m158708xcee59d22() {
        return (pm0.w[]) f438340h.clone();
    }
}
