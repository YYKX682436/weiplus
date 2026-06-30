package m22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final m22.b f404550d;

    /* renamed from: e, reason: collision with root package name */
    public static final m22.b f404551e;

    /* renamed from: f, reason: collision with root package name */
    public static final m22.b f404552f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m22.b[] f404553g;

    static {
        m22.b bVar = new m22.b("Up", 0);
        f404550d = bVar;
        m22.b bVar2 = new m22.b("Down", 1);
        f404551e = bVar2;
        m22.b bVar3 = new m22.b("None", 2);
        f404552f = bVar3;
        m22.b[] bVarArr = {bVar, bVar2, bVar3};
        f404553g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static m22.b m146699xdce0328(java.lang.String str) {
        return (m22.b) java.lang.Enum.valueOf(m22.b.class, str);
    }

    /* renamed from: values */
    public static m22.b[] m146700xcee59d22() {
        return (m22.b[]) f404553g.clone();
    }
}
