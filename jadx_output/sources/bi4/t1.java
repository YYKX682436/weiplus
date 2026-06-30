package bi4;

/* loaded from: classes11.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public int f21085a;

    /* renamed from: b, reason: collision with root package name */
    public int f21086b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21087c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f21088d;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:8:0x0014, B:10:0x001c, B:13:0x0022, B:21:0x003a, B:28:0x0051, B:30:0x0078, B:31:0x007c, B:33:0x0082), top: B:7:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(org.json.JSONArray r11) {
        /*
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r11 == 0) goto L94
            r1 = 0
            r2 = r1
        L9:
            int r3 = r11.length()
            if (r2 >= r3) goto L94
            java.lang.String r3 = r11.optString(r2)
            r4 = 0
            java.lang.String r5 = "-"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L8b
            int r5 = r3.length     // Catch: java.lang.Throwable -> L8b
            r6 = 2
            if (r5 == r6) goto L22
            goto L8b
        L22:
            r5 = r3[r1]     // Catch: java.lang.Throwable -> L8b
            java.text.SimpleDateFormat r6 = bi4.v1.f21094b     // Catch: java.lang.Throwable -> L35
            java.util.Date r5 = r6.parse(r5)     // Catch: java.lang.Throwable -> L35
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L31
            goto L35
        L31:
            r6.setTime(r5)     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r6 = r4
        L36:
            if (r6 != 0) goto L39
            goto L8b
        L39:
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L8b
            java.text.SimpleDateFormat r7 = bi4.v1.f21094b     // Catch: java.lang.Throwable -> L4d
            java.util.Date r3 = r7.parse(r3)     // Catch: java.lang.Throwable -> L4d
            java.util.Calendar r7 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L49
            goto L4d
        L49:
            r7.setTime(r3)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r7 = r4
        L4e:
            if (r7 != 0) goto L51
            goto L8b
        L51:
            bi4.t1 r3 = new bi4.t1     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            java.text.SimpleDateFormat r8 = bi4.v1.f21093a     // Catch: java.lang.Throwable -> L8b
            r8 = 11
            int r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L8b
            r10 = 12
            int r6 = r6.get(r10)     // Catch: java.lang.Throwable -> L8b
            int r9 = r9 * 60
            int r9 = r9 + r6
            r3.f21085a = r9     // Catch: java.lang.Throwable -> L8b
            int r6 = r7.get(r8)     // Catch: java.lang.Throwable -> L8b
            int r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L8b
            int r6 = r6 * 60
            int r6 = r6 + r7
            r3.f21086b = r6     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L7c
            r6 = 1440(0x5a0, float:2.018E-42)
            r3.f21086b = r6     // Catch: java.lang.Throwable -> L8b
        L7c:
            int r6 = r3.f21086b     // Catch: java.lang.Throwable -> L8b
            int r7 = r3.f21085a     // Catch: java.lang.Throwable -> L8b
            if (r6 >= r7) goto L8a
            r3.f21087c = r5     // Catch: java.lang.Throwable -> L8b
            r3.f21088d = r6     // Catch: java.lang.Throwable -> L8b
            int r6 = r6 + 1440
            r3.f21086b = r6     // Catch: java.lang.Throwable -> L8b
        L8a:
            r4 = r3
        L8b:
            if (r4 == 0) goto L90
            r0.add(r4)
        L90:
            int r2 = r2 + 1
            goto L9
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi4.t1.b(org.json.JSONArray):java.util.List");
    }

    public boolean a(int i17) {
        int i18 = this.f21085a;
        boolean z17 = i17 >= i18 && i17 <= this.f21086b;
        if (!this.f21087c || z17) {
            return z17;
        }
        int i19 = i17 + 1440;
        return i19 >= i18 && i19 <= this.f21086b;
    }

    public java.lang.String toString() {
        return "DD{bT=" + this.f21085a + ", eT=" + this.f21086b + ", iC=" + this.f21087c + ", oT=" + this.f21088d + '}';
    }
}
