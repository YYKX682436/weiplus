package m9;

/* loaded from: classes15.dex */
public final class a extends i9.b {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.regex.Pattern f406368n = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.StringBuilder f406369m;

    public a() {
        super("SubripDecoder");
        this.f406369m = new java.lang.StringBuilder();
    }

    public static long g(java.util.regex.Matcher matcher, int i17) {
        return ((java.lang.Long.parseLong(matcher.group(i17 + 1)) * 60 * 60 * 1000) + (java.lang.Long.parseLong(matcher.group(i17 + 2)) * 60 * 1000) + (java.lang.Long.parseLong(matcher.group(i17 + 3)) * 1000) + java.lang.Long.parseLong(matcher.group(i17 + 4))) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[EDGE_INSN: B:48:0x009f->B:44:0x009f BREAK  A[LOOP:0: B:2:0x0010->B:39:0x0010], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    @Override // i9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i9.d f(byte[] r8, int r9, boolean r10) {
        /*
            r7 = this;
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0 = 32
            long[] r0 = new long[r0]
            t9.p r1 = new t9.p
            r1.<init>(r8, r9)
            r8 = 0
            r9 = r8
        L10:
            java.lang.String r2 = r1.d()
            if (r2 == 0) goto L9f
            int r3 = r2.length()
            if (r3 != 0) goto L1d
            goto L10
        L1d:
            java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r2 = r1.d()
            if (r2 != 0) goto L28
            goto L9f
        L28:
            java.util.regex.Pattern r3 = m9.a.f406368n
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L10
            r3 = 1
            long r4 = g(r2, r3)
            int r6 = r0.length
            if (r9 != r6) goto L42
            int r6 = r9 * 2
            long[] r0 = java.util.Arrays.copyOf(r0, r6)
        L42:
            int r6 = r9 + 1
            r0[r9] = r4
            r9 = 6
            java.lang.String r4 = r2.group(r9)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L63
            long r4 = g(r2, r9)
            int r9 = r0.length
            if (r6 != r9) goto L5e
            int r9 = r6 * 2
            long[] r0 = java.util.Arrays.copyOf(r0, r9)
        L5e:
            int r9 = r6 + 1
            r0[r6] = r4
            goto L65
        L63:
            r3 = r8
            r9 = r6
        L65:
            java.lang.StringBuilder r2 = r7.f406369m
            r2.setLength(r8)
        L6a:
            java.lang.String r4 = r1.d()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L87
            int r5 = r2.length()
            if (r5 <= 0) goto L7f
            java.lang.String r5 = "<br>"
            r2.append(r5)
        L7f:
            java.lang.String r4 = r4.trim()
            r2.append(r4)
            goto L6a
        L87:
            java.lang.String r2 = r2.toString()
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            i9.a r4 = new i9.a
            r4.<init>(r2)
            r10.add(r4)
            if (r3 == 0) goto L10
            r2 = 0
            r10.add(r2)
            goto L10
        L9f:
            int r8 = r10.size()
            i9.a[] r8 = new i9.a[r8]
            r10.toArray(r8)
            long[] r9 = java.util.Arrays.copyOf(r0, r9)
            m9.b r10 = new m9.b
            r10.<init>(r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.a.f(byte[], int, boolean):i9.d");
    }
}
