package x52;

/* loaded from: classes15.dex */
public abstract class e {
    public static r45.d16 a() {
        byte[] a17 = c52.c.a("mkv_k_hellsionpgcldc");
        if (a17 == null || a17.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionPageCloudConfigDao", "HellSessionPageCloudConfigDao read(): NULL");
            return null;
        }
        r45.d16 d16Var = new r45.d16();
        try {
            d16Var.mo11468x92b714fd(a17);
            return d16Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionPageCloudConfigDao", e17, "HellSessionPageCloudConfigDao read", new java.lang.Object[0]);
            return null;
        }
    }
}
