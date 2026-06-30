package al0;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final al0.b f5710b;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5709a = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f5711c = new java.util.HashMap();

    public d(com.tencent.mars.comm.MMWakerLock mMWakerLock) {
        this.f5710b = null;
        this.f5710b = new al0.b(mMWakerLock);
    }

    public java.lang.String a() {
        java.util.Collection<al0.c> values = ((java.util.HashMap) this.f5711c).values();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (al0.c cVar : values) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append(',');
            }
            if (cVar.f5708b != 0) {
                sb6.append('{');
                sb6.append(cVar.f5707a);
                sb6.append(',');
                sb6.append(android.os.SystemClock.elapsedRealtime() - cVar.f5708b);
                sb6.append('}');
            }
        }
        if (sb6.length() == 0) {
            sb6.append("<empty>");
        }
        return sb6.toString();
    }
}
