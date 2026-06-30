package fd1;

/* loaded from: classes7.dex */
public abstract class d {
    public static boolean a() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    public static boolean b() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        return context.getPackageManager().hasSystemFeature("android.hardware.nfc") && android.nfc.NfcAdapter.getDefaultAdapter(context) != null;
    }

    public static boolean c() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HceUtils", "no nfc chip !");
        return false;
    }
}
