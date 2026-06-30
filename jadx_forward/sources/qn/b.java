package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.b f446406e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.b f446407f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qn.b[] f446408g;

    /* renamed from: d, reason: collision with root package name */
    public final int f446409d;

    static {
        qn.b bVar = new qn.b("Default", 0, 0);
        qn.b bVar2 = new qn.b("Profile", 1, 1);
        f446406e = bVar2;
        qn.b bVar3 = new qn.b("Conv", 2, 2);
        f446407f = bVar3;
        qn.b[] bVarArr = {bVar, bVar2, bVar3};
        f446408g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f446409d = i18;
    }

    /* renamed from: valueOf */
    public static qn.b m160530xdce0328(java.lang.String str) {
        return (qn.b) java.lang.Enum.valueOf(qn.b.class, str);
    }

    /* renamed from: values */
    public static qn.b[] m160531xcee59d22() {
        return (qn.b[]) f446408g.clone();
    }
}
