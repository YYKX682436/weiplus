package x83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final x83.c f534085e;

    /* renamed from: f, reason: collision with root package name */
    public static final x83.c f534086f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x83.c[] f534087g;

    /* renamed from: d, reason: collision with root package name */
    public final int f534088d;

    static {
        x83.c cVar = new x83.c("ACCOUNT_TYPE_NORMAL", 0, 0);
        f534085e = cVar;
        x83.c cVar2 = new x83.c("ACCOUNT_TYPE_KIDS", 1, 1);
        f534086f = cVar2;
        x83.c[] cVarArr = {cVar, cVar2};
        f534087g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f534088d = i18;
    }

    /* renamed from: valueOf */
    public static x83.c m175164xdce0328(java.lang.String str) {
        return (x83.c) java.lang.Enum.valueOf(x83.c.class, str);
    }

    /* renamed from: values */
    public static x83.c[] m175165xcee59d22() {
        return (x83.c[]) f534087g.clone();
    }
}
