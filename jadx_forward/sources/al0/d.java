package al0;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final al0.b f87243b;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f87242a = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f87244c = new java.util.HashMap();

    public d(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9) {
        this.f87243b = null;
        this.f87243b = new al0.b(c4549xd1736fd9);
    }

    public java.lang.String a() {
        java.util.Collection<al0.c> values = ((java.util.HashMap) this.f87244c).values();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (al0.c cVar : values) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append(',');
            }
            if (cVar.f87241b != 0) {
                sb6.append('{');
                sb6.append(cVar.f87240a);
                sb6.append(',');
                sb6.append(android.os.SystemClock.elapsedRealtime() - cVar.f87241b);
                sb6.append('}');
            }
        }
        if (sb6.length() == 0) {
            sb6.append("<empty>");
        }
        return sb6.toString();
    }
}
