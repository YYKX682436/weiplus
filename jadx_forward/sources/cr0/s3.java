package cr0;

/* loaded from: classes12.dex */
public final class s3 implements pf0.s {
    @Override // pf0.s
    public void a(int i17, java.util.Map traffic, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traffic, "traffic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkTracker", "onCollectTraffic: type=" + i17 + ", size=" + traffic.size() + ", millis=" + j17);
        for (java.util.Map.Entry entry : traffic.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            int L = r26.n0.L(str, "-", 0, false, 6, null);
            if (L > 0) {
                java.lang.String substring = str.substring(0, L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                java.lang.String substring2 = str.substring(L + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                cr0.w3.f303333a.a().m40834x32c52b(new cr0.r3(i17, substring2, substring, str2));
            }
        }
        if (!traffic.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTraffic: totalRx=");
            java.util.Iterator<T> it = cr0.w3.f303333a.a().m46636xc3ec362e().values().iterator();
            long j18 = 0;
            long j19 = 0;
            while (it.hasNext()) {
                j19 += kz5.n0.J0(((java.util.Map) it.next()).values());
            }
            long j27 = 1024;
            sb6.append(j19 / j27);
            sb6.append("KB, totalTx=");
            java.util.Iterator<T> it6 = cr0.w3.f303333a.a().m46637x2db8acb0().values().iterator();
            while (it6.hasNext()) {
                j18 += kz5.n0.J0(((java.util.Map) it6.next()).values());
            }
            sb6.append(j18 / j27);
            sb6.append("KB");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkTracker", sb6.toString());
        }
    }
}
