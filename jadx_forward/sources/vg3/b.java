package vg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final vg3.b f518178e;

    /* renamed from: f, reason: collision with root package name */
    public static final vg3.b f518179f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vg3.b[] f518180g;

    /* renamed from: d, reason: collision with root package name */
    public final int f518181d;

    static {
        vg3.b bVar = new vg3.b("REQUEST", 0, 1);
        f518178e = bVar;
        vg3.b bVar2 = new vg3.b("RESPONSE", 1, 2);
        f518179f = bVar2;
        vg3.b[] bVarArr = {bVar, bVar2};
        f518180g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f518181d = i18;
    }

    /* renamed from: valueOf */
    public static vg3.b m171962xdce0328(java.lang.String str) {
        return (vg3.b) java.lang.Enum.valueOf(vg3.b.class, str);
    }

    /* renamed from: values */
    public static vg3.b[] m171963xcee59d22() {
        return (vg3.b[]) f518180g.clone();
    }
}
