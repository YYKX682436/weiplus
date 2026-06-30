package c01;

/* loaded from: classes12.dex */
public class he implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        c01.yd.f37575a.clear();
        com.tencent.mm.sdk.platformtools.o4 s17 = c01.je.s("xagreement_test_configs");
        if (s17 != null && s17.b() != null && s17.b().length > 0) {
            for (java.lang.String str : s17.b()) {
                int i17 = s17.getInt(str, -1);
                if ("test_xagreement_id".equals(str)) {
                    c01.ie.f37265a = i17;
                } else {
                    if (c01.yd.f37575a == java.util.Collections.EMPTY_MAP) {
                        c01.yd.f37575a = new java.util.concurrent.ConcurrentHashMap();
                    }
                    c01.yd.f37575a.put(str, java.lang.Integer.valueOf(i17));
                }
            }
        }
        int i18 = c01.ie.f37265a;
        if (i18 != -1) {
            c01.je.t(i18);
            ((java.util.concurrent.ConcurrentHashMap) c01.ee.f37168b.f37169a).clear();
        }
    }
}
