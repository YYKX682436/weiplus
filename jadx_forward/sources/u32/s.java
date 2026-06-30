package u32;

/* loaded from: classes11.dex */
public abstract class s {
    public static boolean a(android.content.Context context) {
        if (gm0.k2.c(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceServiceHelper", "fully exited, no need to start service");
            return false;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1388x7643c6b5.C13454x7b51e96c.class);
        intent.setFlags(268435456);
        l85.h1.e(intent, "exdevice", true, j45.l.e("exdevice"));
        return true;
    }
}
