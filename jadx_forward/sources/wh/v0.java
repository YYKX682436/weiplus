package wh;

/* loaded from: classes12.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f527416b;

    public v0(int i17, int i18) {
        this.f527415a = "/sys/devices/system/cpu/cpu" + i17 + "/cpufreq/stats/time_in_state";
        this.f527416b = i18;
    }

    public long[] a() {
        int i17 = this.f527416b;
        long[] jArr = new long[i17];
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(this.f527415a));
            try {
                android.text.TextUtils.SimpleStringSplitter simpleStringSplitter = new android.text.TextUtils.SimpleStringSplitter(' ');
                for (int i18 = 0; i18 < i17; i18++) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    simpleStringSplitter.setString(readLine);
                    simpleStringSplitter.next();
                    jArr[i18] = java.lang.Long.parseLong(simpleStringSplitter.next());
                }
                bufferedReader.close();
                return jArr;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException("Failed to read cpu-freq: " + th6.getMessage(), th6);
        }
    }

    public void b() {
        long[] a17 = a();
        int length = a17.length;
        int i17 = this.f527416b;
        if (length == i17) {
            return;
        }
        throw new java.io.IOException("CpuCore Step unmatched, expect = " + i17 + ", actual = " + a17.length + ", path = " + this.f527415a);
    }
}
