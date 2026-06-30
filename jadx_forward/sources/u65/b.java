package u65;

/* loaded from: classes5.dex */
public abstract class b {
    public static java.util.Set a() {
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new com.p314xaae8f345.mm.vfs.z6("/proc/" + android.os.Process.myPid() + "/maps"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeLibraries", "Dump NativeLibrares:");
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.endsWith(".so")) {
                    hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeLibraries", "" + ((java.lang.String) it.next()));
            }
            return hashSet;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NativeLibraries", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
