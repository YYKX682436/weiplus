package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.MotionEventTracker */
/* loaded from: classes14.dex */
public final class C28566x9665aa34 {

    /* renamed from: INSTANCE */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34 f70732x4fbc8495 = null;
    private static final java.lang.String TAG = "MotionEventTracker";

    /* renamed from: eventById */
    private final android.util.LongSparseArray<android.view.MotionEvent> f70733x1d7658c = new android.util.LongSparseArray<>();

    /* renamed from: unusedEvents */
    private final java.util.PriorityQueue<java.lang.Long> f70734xe0f69a8f = new java.util.PriorityQueue<>();

    /* renamed from: io.flutter.embedding.android.MotionEventTracker$MotionEventId */
    /* loaded from: classes14.dex */
    public static class MotionEventId {

        /* renamed from: ID_COUNTER */
        private static final java.util.concurrent.atomic.AtomicLong f70735xfb9146b8 = new java.util.concurrent.atomic.AtomicLong(0);

        /* renamed from: id, reason: collision with root package name */
        private final long f374728id;

        private MotionEventId(long j17) {
            this.f374728id = j17;
        }

        /* renamed from: createUnique */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId m137342x5e9b6bed() {
            return m137343x3017aa(f70735xfb9146b8.incrementAndGet());
        }

        /* renamed from: from */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId m137343x3017aa(long j17) {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId(j17);
        }

        /* renamed from: getId */
        public long m137344x5db1b11() {
            return this.f374728id;
        }
    }

    private C28566x9665aa34() {
    }

    /* renamed from: getInstance */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34 m137338x9cf0d20b() {
        if (f70732x4fbc8495 == null) {
            f70732x4fbc8495 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34();
        }
        return f70732x4fbc8495;
    }

    public android.view.MotionEvent pop(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId motionEventId) {
        while (!this.f70734xe0f69a8f.isEmpty() && this.f70734xe0f69a8f.peek().longValue() < motionEventId.f374728id) {
            this.f70733x1d7658c.remove(this.f70734xe0f69a8f.poll().longValue());
        }
        if (!this.f70734xe0f69a8f.isEmpty() && this.f70734xe0f69a8f.peek().longValue() == motionEventId.f374728id) {
            this.f70734xe0f69a8f.poll();
        }
        android.view.MotionEvent motionEvent = this.f70733x1d7658c.get(motionEventId.f374728id);
        this.f70733x1d7658c.remove(motionEventId.f374728id);
        return motionEvent;
    }

    /* renamed from: track */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId m137339x697f14b(android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId m137342x5e9b6bed = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId.m137342x5e9b6bed();
        this.f70733x1d7658c.put(m137342x5e9b6bed.f374728id, android.view.MotionEvent.obtain(motionEvent));
        this.f70734xe0f69a8f.add(java.lang.Long.valueOf(m137342x5e9b6bed.f374728id));
        return m137342x5e9b6bed;
    }
}
