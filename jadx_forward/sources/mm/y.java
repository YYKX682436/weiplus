package mm;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410101a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f410102b = java.util.Collections.emptyMap();

    /* renamed from: c, reason: collision with root package name */
    public long f410103c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f410104d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f410105e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f410106f = 0;

    public y(java.lang.String str) {
        this.f410101a = str;
    }

    public void a() {
        if (this.f410102b != java.util.Collections.EMPTY_MAP) {
            synchronized (this) {
                if (!this.f410102b.isEmpty()) {
                    java.util.Iterator it = this.f410102b.values().iterator();
                    while (it.hasNext()) {
                        this.f410103c += ((java.lang.Integer) it.next()).intValue();
                    }
                    this.f410102b.clear();
                }
            }
            long j17 = this.f410105e;
            if (j17 > 0) {
                this.f410106f += j17;
                this.f410105e = 0L;
            }
        }
    }

    public boolean b() {
        boolean z17 = true;
        if (!(this.f410102b != java.util.Collections.EMPTY_MAP)) {
            return false;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f410104d;
        if (j17 > 0) {
            long j18 = uptimeMillis - j17;
            if (j18 < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                this.f410105e += j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyPowerInspector", "collect " + this.f410101a + " addicted ms: " + j18 + ", all=" + this.f410105e);
                this.f410104d = uptimeMillis;
                return z17;
            }
        }
        z17 = false;
        this.f410104d = uptimeMillis;
        return z17;
    }

    public void c(java.lang.String str) {
        if (this.f410102b != java.util.Collections.EMPTY_MAP) {
            synchronized (this) {
                java.lang.Integer num = (java.lang.Integer) this.f410102b.get(str);
                this.f410102b.put(str, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
    }

    public void d() {
        synchronized (this) {
            this.f410102b = new java.util.HashMap();
        }
    }
}
