package s56;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 s56.f, still in use, count: 1, list:
  (r0v0 s56.f) from 0x000e: INVOKE (r0v0 s56.f) STATIC call: p56.l.b(p56.i):p56.l A[MD:(p56.i):p56.l (m), WRAPPED]
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
public final class f implements p56.i {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public static final p56.l f484740d;

    static {
        f484740d = p56.l.b(r0);
    }

    public f() {
    }

    /* renamed from: valueOf */
    public static s56.f m163926xdce0328(java.lang.String str) {
        return (s56.f) java.lang.Enum.valueOf(s56.f.class, str);
    }

    /* renamed from: values */
    public static s56.f[] m163927xcee59d22() {
        return (s56.f[]) f484741e.clone();
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        ((p56.r) obj).mo157868xaa8b332c();
    }
}
