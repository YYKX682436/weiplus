package f65;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f341398d;

    /* renamed from: e, reason: collision with root package name */
    public final f65.a f341399e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f341400f;

    public b(long j17, java.util.Map sdkParams, f65.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkParams, "sdkParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f341398d = j17;
        this.f341399e = callback;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(sdkParams);
        this.f341400f = linkedHashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f341399e.a(this.f341398d, this.f341400f);
    }
}
