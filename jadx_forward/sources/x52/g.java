package x52;

/* loaded from: classes9.dex */
public abstract class g {
    public static r45.l16 a() {
        byte[] a17 = c52.c.a("mkv_k_hellsubascld");
        if (a17 == null || a17.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionUBACloudConfigDao", "HellSessionUBACloudConfigDao read(): NULL");
            return null;
        }
        r45.l16 l16Var = new r45.l16();
        try {
            l16Var.mo11468x92b714fd(a17);
            return l16Var;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionUBACloudConfigDao", e17, "SessionUBACloudConfig read", new java.lang.Object[0]);
            return null;
        }
    }
}
