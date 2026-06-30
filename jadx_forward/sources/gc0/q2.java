package gc0;

/* loaded from: classes5.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final gc0.q2 f351790a = new gc0.q2();

    public final long a() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20632x7f01de68()) * 60 * 1000;
    }

    public final long b(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        long m75942xfb822ef2 = gc0.f0.f351700a.b(str).m75942xfb822ef2(3);
        if (m75942xfb822ef2 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRecommendConfig", "getTalkerAddTime() sayHiTime: " + k35.m1.e(m75942xfb822ef2));
            return m75942xfb822ef2;
        }
        long c17 = g95.e.f351334a.c(str) * 1000;
        long max = java.lang.Math.max(m75942xfb822ef2, c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRecommendConfig", "getTalkerAddTime() sayHiTime: " + k35.m1.e(m75942xfb822ef2) + " contactCreateTime " + k35.m1.e(c17) + ", addTime: " + max);
        return max;
    }
}
