package wh;

/* loaded from: classes12.dex */
public class k1 implements java.util.concurrent.Callable {
    public k1(wh.n1 n1Var) {
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        for (java.lang.String str : android.system.Os.getenv("CUST_POLICY_DIRS").split(":")) {
            java.io.File file = new java.io.File(str, "/xml/power_profile.xml");
            if (file.exists() && file.canRead()) {
                oj.j.c("PowerProfile", "find profile xml: " + file, new java.lang.Object[0]);
                return file;
            }
        }
        throw new java.io.FileNotFoundException("/xml/power_profile.xml");
    }
}
