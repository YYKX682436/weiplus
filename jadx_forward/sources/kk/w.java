package kk;

/* loaded from: classes3.dex */
public abstract class w {
    public static java.lang.String a(java.lang.String str, boolean z17) {
        try {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, z17);
            if (i17 == null) {
                return str;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSFileOpEx", "exportExternalPath:%s to realPath:%s", str, i17);
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VFSFileOpEx", th6, "exportExternalPath failed", new java.lang.Object[0]);
            return str;
        }
    }
}
