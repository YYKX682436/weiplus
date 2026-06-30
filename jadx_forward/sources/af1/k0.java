package af1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 af1.k0, still in use, count: 1, list:
  (r0v0 af1.k0) from 0x0011: CONSTRUCTOR (r0v0 af1.k0), (0 int), (null java.lang.Object) A[MD:(m8.g, int, java.lang.Object):void (m), WRAPPED] call: m8.h.<init>(m8.g, int, java.lang.Object):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class k0 implements m8.g {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public static final m8.h f86018d;

    static {
        f86018d = new m8.h(r0, 0, null);
    }

    public k0() {
    }

    /* renamed from: valueOf */
    public static af1.k0 m1846xdce0328(java.lang.String str) {
        return (af1.k0) java.lang.Enum.valueOf(af1.k0.class, str);
    }

    /* renamed from: values */
    public static af1.k0[] m1847xcee59d22() {
        return (af1.k0[]) f86019e.clone();
    }

    @Override // m8.g
    public void b(int i17, java.lang.Object obj) {
    }
}
