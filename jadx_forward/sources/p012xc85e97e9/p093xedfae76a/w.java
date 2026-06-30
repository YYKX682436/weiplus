package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes7.dex */
public abstract class w {
    public static final p012xc85e97e9.p093xedfae76a.q a(p012xc85e97e9.p093xedfae76a.o coroutineScope) {
        p012xc85e97e9.p093xedfae76a.C1116x78c71f86 c1116x78c71f86;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineScope, "$this$coroutineScope");
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = coroutineScope.f93172a;
            p012xc85e97e9.p093xedfae76a.C1116x78c71f86 c1116x78c71f862 = (p012xc85e97e9.p093xedfae76a.C1116x78c71f86) atomicReference.get();
            if (c1116x78c71f862 == null) {
                z17 = true;
                oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                c1116x78c71f86 = new p012xc85e97e9.p093xedfae76a.C1116x78c71f86(coroutineScope, ((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h));
                while (true) {
                    if (atomicReference.compareAndSet(null, c1116x78c71f86)) {
                        break;
                    }
                    if (atomicReference.get() != null) {
                        z17 = false;
                        break;
                    }
                }
            } else {
                return c1116x78c71f862;
            }
        } while (!z17);
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(c1116x78c71f86, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new p012xc85e97e9.p093xedfae76a.r(c1116x78c71f86, null), 2, null);
        return c1116x78c71f86;
    }
}
