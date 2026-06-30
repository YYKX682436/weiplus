package lm1;

/* loaded from: classes13.dex */
public class c implements ue1.a {

    /* renamed from: b, reason: collision with root package name */
    public static lm1.c f400872b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f400873a = new java.util.HashSet();

    public static lm1.c b() {
        if (f400872b == null) {
            synchronized (lm1.c.class) {
                if (f400872b == null) {
                    lm1.c cVar = new lm1.c();
                    f400872b = cVar;
                    return cVar;
                }
            }
        }
        return f400872b;
    }

    public void a(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, long j19, int i18, java.lang.String str3, long j27, long j28, long j29, long j37, java.lang.String str4, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoReporter", "downloadResult, videoUuid:%s, sourceUrl:%s, priority:%s, rangeStart:%s, rangeEnd:%s, totalLength:%s, contentType:%s, requestMethod:%s, speed:%s, retCode:%s, subRetCode:%s, responseCode:%s, costTime:%s, message:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), str3, java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Integer.valueOf(i19), str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18693, str, str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j37), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), str4, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), str3, java.lang.Long.valueOf(j27));
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 36L, 1L, false);
    }

    public void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoReporter", "reportPreloadEnd, uuid:%s, url:%s", str, str2);
        java.util.Set set = this.f400873a;
        if (((java.util.HashSet) set).contains(str)) {
            ((java.util.HashSet) set).remove(str);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 32L, 1L, false);
        }
    }

    public void e(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoReporter", "reportPreloadError, uuid:%s, url:%s, code:%s", str, str2, java.lang.Integer.valueOf(i17));
        ((java.util.HashSet) this.f400873a).add(str);
        if (i17 == -101) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 27L, 1L, false);
            return;
        }
        if (i17 == -102) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 28L, 1L, false);
            return;
        }
        if (i17 == -103) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 29L, 1L, false);
        } else if (i17 == -104) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 30L, 1L, false);
        } else if (i17 == -105) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 31L, 1L, false);
        }
    }

    public void f(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoReporter", "reportPreloadStart, uuid:%s, url:%s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 26L, 1L, false);
    }

    public void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoReporter", "startProxyResult, reason:%s", java.lang.Integer.valueOf(i17));
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 16L, 1L, false);
        } else if (i17 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 17L, 1L, false);
        } else if (i17 == -2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1234L, 18L, 1L, false);
        }
    }
}
