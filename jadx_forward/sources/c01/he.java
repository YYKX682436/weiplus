package c01;

/* loaded from: classes12.dex */
public class he implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        c01.yd.f119108a.clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = c01.je.s("xagreement_test_configs");
        if (s17 != null && s17.b() != null && s17.b().length > 0) {
            for (java.lang.String str : s17.b()) {
                int i17 = s17.getInt(str, -1);
                if ("test_xagreement_id".equals(str)) {
                    c01.ie.f118798a = i17;
                } else {
                    if (c01.yd.f119108a == java.util.Collections.EMPTY_MAP) {
                        c01.yd.f119108a = new java.util.concurrent.ConcurrentHashMap();
                    }
                    c01.yd.f119108a.put(str, java.lang.Integer.valueOf(i17));
                }
            }
        }
        int i18 = c01.ie.f118798a;
        if (i18 != -1) {
            c01.je.t(i18);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f118701b.f118702a).clear();
        }
    }
}
