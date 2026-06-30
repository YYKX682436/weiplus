package kh;

/* loaded from: classes12.dex */
public final class s2 extends kh.b3 {
    public s2() {
        super("wild", 2);
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadIdCard, "threadIdCard");
        java.lang.String str = threadIdCard.f389332a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Thread-?") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "pool-?-thread-?") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Timer-?")) {
            return this.f389298b;
        }
        return 0;
    }
}
