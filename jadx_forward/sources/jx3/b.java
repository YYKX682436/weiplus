package jx3;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f383975a;

    /* renamed from: c, reason: collision with root package name */
    public long f383977c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f383978d = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final long f383976b = 300000;

    public b(int i17) {
        this.f383975a = i17;
    }

    public final void a(int i17, long j17) {
        java.util.HashMap hashMap = this.f383978d;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17));
        if (l17 != null) {
            j17 += l17.longValue();
        }
        hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    public void b(int i17, int i18, long j17) {
        synchronized (this) {
            a(i17, j17);
            a(i18, 1L);
            c();
        }
    }

    public final void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f383977c > this.f383976b) {
            java.util.Iterator it = this.f383978d.entrySet().iterator();
            while (it.hasNext()) {
                jx3.f.INSTANCE.mo68477x336bdfd8(this.f383975a, ((java.lang.Integer) r3.getKey()).intValue(), ((java.lang.Long) ((java.util.Map.Entry) it.next()).getValue()).longValue(), false);
            }
            this.f383977c = currentTimeMillis;
        }
    }
}
