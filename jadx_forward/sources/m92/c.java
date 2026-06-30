package m92;

/* loaded from: classes10.dex */
public final class c extends m92.b {
    public static final java.util.concurrent.atomic.AtomicLong V1 = new java.util.concurrent.atomic.AtomicLong(1);
    public final long U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String finderUsername) {
        super(finderUsername);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.U1 = V1.get();
        m92.b b17 = g92.b.f351302e.b1(finderUsername, true);
        mo9015xbf5d97fd(new m92.k((b17 == null ? new m92.b(finderUsername) : b17).mo9763xeb27878e(), m92.b.T1, null, 4, null));
    }
}
