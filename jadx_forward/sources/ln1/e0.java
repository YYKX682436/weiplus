package ln1;

/* loaded from: classes12.dex */
public class e0 implements sn1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln1.c0 f401281a;

    public e0(ln1.c0 c0Var) {
        this.f401281a = c0Var;
    }

    public void a(sn1.a0 a0Var) {
        if (ln1.s.f401330r.f401329k.get() > this.f401281a.f401273k) {
            while (true) {
                long j17 = ln1.s.f401330r.f401329k.get();
                ln1.c0 c0Var = this.f401281a;
                if (j17 <= c0Var.f401273k) {
                    break;
                }
                c0Var.f401272j.b();
                this.f401281a.f401272j.a(500L);
            }
        }
        a0Var.K();
        ln1.r rVar = ln1.s.f401330r;
        rVar.f401329k.addAndGet(a0Var.f491509y.f38861x6ac9171 == null ? 0 : r6.length);
        rVar.f401324f.c();
    }
}
