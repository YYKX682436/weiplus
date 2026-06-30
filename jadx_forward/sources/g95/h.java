package g95;

/* loaded from: classes9.dex */
public final class h implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f351338a;

    public h(long j17) {
        this.f351338a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return it.l() == this.f351338a && it.j() == 1;
    }
}
