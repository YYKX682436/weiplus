package ri;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = ri.a.f477369e;
        synchronized (map) {
            for (android.util.Pair pair : ((java.util.HashMap) map).values()) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - ((java.lang.Long) pair.second).longValue();
                if (uptimeMillis >= 60000 && ((java.lang.String) pair.first).contains("@")) {
                    int indexOf = ((java.lang.String) pair.first).indexOf("@");
                    java.lang.String substring = ((java.lang.String) pair.first).substring(0, indexOf);
                    java.lang.String substring2 = ((java.lang.String) pair.first).substring(indexOf + 1);
                    if (substring2.contains("@")) {
                        int indexOf2 = substring2.indexOf("@");
                        java.lang.String substring3 = substring2.substring(0, indexOf2);
                        java.lang.String substring4 = substring2.substring(indexOf2 + 1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.AmsInvokeListener", "Long WakeLock: " + substring + "@" + substring3 + ", from=" + substring4 + ", duringMin=" + java.lang.Math.max(uptimeMillis / 60000, 1L) + ", since=" + new java.text.SimpleDateFormat("HH:mm:ss", java.util.Locale.ENGLISH).format(new java.util.Date(java.lang.System.currentTimeMillis() - uptimeMillis)));
                        ap.a.a(1, "longWakelock", null, null, java.lang.String.valueOf(java.lang.Math.max(uptimeMillis / 60000, 1L)), substring, substring4);
                    }
                }
            }
            ((java.util.HashMap) ri.a.f477369e).clear();
        }
    }
}
