package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.SpscArrayQueueColdField */
/* loaded from: classes16.dex */
abstract class AbstractC30134x8abc5651<E> extends rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.AbstractC30113x9498046e<E> {

    /* renamed from: MAX_LOOK_AHEAD_STEP */
    private static final java.lang.Integer f76671x53335b4f = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: lookAheadStep */
    protected final int f76672x207c44e;

    public AbstractC30134x8abc5651(int i17) {
        super(i17);
        this.f76672x207c44e = java.lang.Math.min(i17 / 4, f76671x53335b4f.intValue());
    }
}
