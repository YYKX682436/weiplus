package yw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final yw0.o f548109d;

    /* renamed from: e, reason: collision with root package name */
    public static final yw0.o f548110e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yw0.o[] f548111f;

    static {
        yw0.o oVar = new yw0.o("Idle", 0);
        f548109d = oVar;
        yw0.o oVar2 = new yw0.o("Covering", 1);
        f548110e = oVar2;
        yw0.o[] oVarArr = {oVar, oVar2};
        f548111f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static yw0.o m177915xdce0328(java.lang.String str) {
        return (yw0.o) java.lang.Enum.valueOf(yw0.o.class, str);
    }

    /* renamed from: values */
    public static yw0.o[] m177916xcee59d22() {
        return (yw0.o[]) f548111f.clone();
    }
}
