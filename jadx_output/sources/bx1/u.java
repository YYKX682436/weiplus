package bx1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final bx1.u f36309d;

    /* renamed from: e, reason: collision with root package name */
    public static final bx1.u f36310e;

    /* renamed from: f, reason: collision with root package name */
    public static final bx1.u f36311f;

    /* renamed from: g, reason: collision with root package name */
    public static final bx1.u f36312g;

    /* renamed from: h, reason: collision with root package name */
    public static final bx1.u f36313h;

    /* renamed from: i, reason: collision with root package name */
    public static final bx1.u f36314i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ bx1.u[] f36315m;

    static {
        bx1.u uVar = new bx1.u(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f36309d = uVar;
        bx1.u uVar2 = new bx1.u("APPEND", 1);
        f36310e = uVar2;
        bx1.u uVar3 = new bx1.u("ACTIONTRACE", 2);
        f36311f = uVar3;
        bx1.u uVar4 = new bx1.u("ELAPSE", 3);
        f36312g = uVar4;
        bx1.u uVar5 = new bx1.u("UNREPEAT", 4);
        f36313h = uVar5;
        bx1.u uVar6 = new bx1.u("REPEAT", 5);
        f36314i = uVar6;
        bx1.u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6};
        f36315m = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    public static bx1.u valueOf(java.lang.String str) {
        return (bx1.u) java.lang.Enum.valueOf(bx1.u.class, str);
    }

    public static bx1.u[] values() {
        return (bx1.u[]) f36315m.clone();
    }
}
