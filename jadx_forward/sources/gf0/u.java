package gf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final gf0.u f352777d;

    /* renamed from: e, reason: collision with root package name */
    public static final gf0.u f352778e;

    /* renamed from: f, reason: collision with root package name */
    public static final gf0.u f352779f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gf0.u[] f352780g;

    static {
        gf0.u uVar = new gf0.u("Idle", 0);
        f352777d = uVar;
        gf0.u uVar2 = new gf0.u("Recording", 1);
        f352778e = uVar2;
        gf0.u uVar3 = new gf0.u("Finished", 2);
        f352779f = uVar3;
        gf0.u[] uVarArr = {uVar, uVar2, uVar3};
        f352780g = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gf0.u m131434xdce0328(java.lang.String str) {
        return (gf0.u) java.lang.Enum.valueOf(gf0.u.class, str);
    }

    /* renamed from: values */
    public static gf0.u[] m131435xcee59d22() {
        return (gf0.u[]) f352780g.clone();
    }
}
