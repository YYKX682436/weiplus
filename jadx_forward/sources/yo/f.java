package yo;

/* loaded from: classes12.dex */
public class f {
    public static yo.d a(android.app.Application application, java.lang.String str) {
        try {
            yo.d dVar = (yo.d) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getClassLoader().loadClass("com.tencent.mm" + str).newInstance();
            dVar.f545579a = application;
            return dVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProfileFactoryImpl", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
