package b12;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final b12.l f17069e;

    /* renamed from: f, reason: collision with root package name */
    public static final b12.l f17070f;

    /* renamed from: g, reason: collision with root package name */
    public static final b12.l f17071g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b12.l[] f17072h;

    /* renamed from: d, reason: collision with root package name */
    public final int f17073d;

    static {
        b12.l lVar = new b12.l("FREQ_LIMIT", 0, 1);
        f17069e = lVar;
        b12.l lVar2 = new b12.l("SERVER_NOT_ALLOW", 1, 2);
        f17070f = lVar2;
        b12.l lVar3 = new b12.l("REQUEST_FAILED", 2, 3);
        f17071g = lVar3;
        b12.l[] lVarArr = {lVar, lVar2, lVar3};
        f17072h = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f17073d = i18;
    }

    public static b12.l valueOf(java.lang.String str) {
        return (b12.l) java.lang.Enum.valueOf(b12.l.class, str);
    }

    public static b12.l[] values() {
        return (b12.l[]) f17072h.clone();
    }
}
