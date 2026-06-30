package fs0;

/* loaded from: classes4.dex */
public final class a implements fs0.d {

    /* renamed from: a, reason: collision with root package name */
    public long f347730a = 33;

    @Override // fs0.d
    public void a(long j17, java.util.List frames, int i17, int i18, java.util.Map parents, java.util.Map outPts) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frames, "frames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parents, "parents");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPts, "outPts");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeStrategy", "use cfr decode strategy");
        this.f347730a = 1000000 / (i18 != 0 ? i18 : i17);
        java.util.Iterator it = frames.iterator();
        long j18 = 0;
        long j19 = -1;
        long j27 = -1;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            if (longValue >= j17) {
                if (j19 == -1) {
                    j18 = longValue;
                    j19 = j18;
                }
                if (longValue >= j18) {
                    parents.put(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j27));
                    while (longValue >= j18) {
                        java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
                        java.lang.Object obj = outPts.get(valueOf);
                        if (obj == null) {
                            obj = new java.util.ArrayList();
                            outPts.put(valueOf, obj);
                        }
                        ((java.util.List) obj).add(java.lang.Long.valueOf(j18));
                        j18 += this.f347730a;
                    }
                    j27 = longValue;
                }
            }
        }
    }
}
