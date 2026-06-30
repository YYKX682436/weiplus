package ed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ed.b f332729d;

    /* renamed from: e, reason: collision with root package name */
    public static final ed.b f332730e;

    /* renamed from: f, reason: collision with root package name */
    public static final ed.b f332731f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ed.b[] f332732g;

    static {
        ed.b bVar = new ed.b("SUCCESS", 0);
        f332729d = bVar;
        ed.b bVar2 = new ed.b("CANCEL", 1);
        f332730e = bVar2;
        ed.b bVar3 = new ed.b("FAILURE", 2);
        f332731f = bVar3;
        ed.b[] bVarArr = {bVar, bVar2, bVar3};
        f332732g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ed.b m127287xdce0328(java.lang.String str) {
        return (ed.b) java.lang.Enum.valueOf(ed.b.class, str);
    }

    /* renamed from: values */
    public static ed.b[] m127288xcee59d22() {
        return (ed.b[]) f332732g.clone();
    }
}
