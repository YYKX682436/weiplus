package uw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final uw0.q f513126d;

    /* renamed from: e, reason: collision with root package name */
    public static final uw0.q f513127e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ uw0.q[] f513128f;

    static {
        uw0.q qVar = new uw0.q("APPEAR", 0);
        f513126d = qVar;
        uw0.q qVar2 = new uw0.q("DISAPPEAR", 1);
        f513127e = qVar2;
        uw0.q[] qVarArr = {qVar, qVar2};
        f513128f = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static uw0.q m170640xdce0328(java.lang.String str) {
        return (uw0.q) java.lang.Enum.valueOf(uw0.q.class, str);
    }

    /* renamed from: values */
    public static uw0.q[] m170641xcee59d22() {
        return (uw0.q[]) f513128f.clone();
    }
}
