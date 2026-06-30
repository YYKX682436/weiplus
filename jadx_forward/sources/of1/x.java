package of1;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.a0 f426586d;

    public x(of1.a0 a0Var) {
        this.f426586d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            of1.a0 a0Var = this.f426586d;
            if (a0Var.f426418b.isEmpty()) {
                a0Var.f426417a = true;
                return;
            } else {
                java.lang.Object pollFirst = a0Var.f426418b.pollFirst();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pollFirst);
                ((yz5.a) pollFirst).mo152xb9724478();
            }
        }
    }
}
