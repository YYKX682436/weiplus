package fs0;

/* loaded from: classes4.dex */
public final class q implements fs0.d {

    /* renamed from: a, reason: collision with root package name */
    public long f347807a = 33;

    @Override // fs0.d
    public void a(long j17, java.util.List frames, int i17, int i18, java.util.Map parents, java.util.Map outPts) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frames, "frames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parents, "parents");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPts, "outPts");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeStrategy", "use simple vfr decode strategy");
        this.f347807a = 1000000 / (i18 != 0 ? i18 : i17);
        java.util.Iterator it = frames.iterator();
        long j18 = -1;
        long j19 = -1;
        long j27 = -1;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            if (longValue >= j17) {
                if (j19 == j18) {
                    j19 = longValue;
                }
                int size = parents.size() + 1;
                if (((size == 0 || size == 1) ? Float.MAX_VALUE : ((float) (longValue - j19)) / size) >= ((float) this.f347807a)) {
                    parents.put(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j27));
                    outPts.put(java.lang.Long.valueOf(longValue), kz5.c0.k(java.lang.Long.valueOf(longValue)));
                    j27 = longValue;
                }
            }
            j18 = -1;
        }
    }
}
