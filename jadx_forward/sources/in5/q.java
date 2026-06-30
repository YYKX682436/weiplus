package in5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final in5.q f374646d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ in5.q[] f374647e;

    static {
        in5.q qVar = new in5.q("NORMAL", 0);
        f374646d = qVar;
        in5.q[] qVarArr = {qVar, new in5.q("Gradient", 1)};
        f374647e = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static in5.q m136793xdce0328(java.lang.String str) {
        return (in5.q) java.lang.Enum.valueOf(in5.q.class, str);
    }

    /* renamed from: values */
    public static in5.q[] m136794xcee59d22() {
        return (in5.q[]) f374647e.clone();
    }
}
