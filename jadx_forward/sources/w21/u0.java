package w21;

/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f524011d = java.util.regex.Pattern.compile(":");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f524012a;

    /* renamed from: b, reason: collision with root package name */
    public final long f524013b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f524014c;

    public u0(java.lang.String str) {
        try {
            int i17 = 1;
            java.lang.String[] split = f524011d.split(str.endsWith("\n") ? str.substring(0, str.length() - 1) : str);
            if (split.length != 4 || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(split[0])) {
                i17 = 0;
            }
            if (split.length > i17) {
                this.f524012a = split[i17];
            }
            int i18 = i17 + 1;
            if (split.length > i18) {
                this.f524013b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[i18], 0L);
            }
            int i19 = i17 + 2;
            if (split.length > i19) {
                this.f524014c = split[i19].equals("1");
            }
        } catch (java.lang.Exception unused) {
            if (this.f524012a == null) {
                this.f524012a = "";
            }
            this.f524014c = false;
            this.f524013b = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
        }
    }

    public static java.lang.String c(java.lang.String str, long j17, boolean z17) {
        return str + ":" + j17 + ":" + (z17 ? 1 : 0) + "\n";
    }

    public java.lang.String a() {
        return this.f524012a;
    }

    public java.lang.String b() {
        return this.f524012a + ":" + this.f524013b + ":" + (this.f524014c ? 1 : 0) + ":\n";
    }
}
