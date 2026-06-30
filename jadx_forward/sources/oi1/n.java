package oi1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final oi1.n f427140d;

    /* renamed from: e, reason: collision with root package name */
    public static final oi1.n f427141e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ oi1.n[] f427142f;

    static {
        oi1.n nVar = new oi1.n("NONE", 0);
        oi1.n nVar2 = new oi1.n("SILENT", 1);
        f427140d = nVar2;
        oi1.n nVar3 = new oi1.n("WITH_CONFIRM_DIALOG", 2);
        f427141e = nVar3;
        oi1.n[] nVarArr = {nVar, nVar2, nVar3};
        f427142f = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static oi1.n m151432xdce0328(java.lang.String str) {
        return (oi1.n) java.lang.Enum.valueOf(oi1.n.class, str);
    }

    /* renamed from: values */
    public static oi1.n[] m151433xcee59d22() {
        return (oi1.n[]) f427142f.clone();
    }
}
