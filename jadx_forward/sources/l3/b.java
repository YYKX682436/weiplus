package l3;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f396821d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f396822e;

    /* renamed from: f, reason: collision with root package name */
    public static final l3.b f396823f;

    /* renamed from: g, reason: collision with root package name */
    public static final l3.b f396824g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f396825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396826b;

    /* renamed from: c, reason: collision with root package name */
    public final l3.f f396827c;

    static {
        l3.f fVar = l3.k.f396837c;
        f396821d = java.lang.Character.toString((char) 8206);
        f396822e = java.lang.Character.toString((char) 8207);
        f396823f = new l3.b(false, 2, fVar);
        f396824g = new l3.b(true, 2, fVar);
    }

    public b(boolean z17, int i17, l3.f fVar) {
        this.f396825a = z17;
        this.f396826b = i17;
        this.f396827c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r9 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        if (r0.f396819c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0081, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0084, code lost:
    
        if (r9 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008c, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:
    
        if (r9 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            l3.a r0 = new l3.a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f396819c = r1
            r9 = r1
            r2 = r9
            r3 = r2
        Lb:
            int r4 = r0.f396819c
            int r5 = r0.f396818b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r9 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f396817a
            char r4 = r5.charAt(r4)
            r0.f396820d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f396819c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f396819c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.f396819c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f396819c
            int r4 = r4 + r7
            r0.f396819c = r4
            char r4 = r0.f396820d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = l3.a.f396816e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r1
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r9 = r3
            goto Lb
        L6e:
            if (r9 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r1 = r2
            goto L8f
        L75:
            int r2 = r0.f396819c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r9 != r3) goto L8c
        L86:
            r1 = r7
            goto L8f
        L88:
            if (r9 != r3) goto L8c
        L8a:
            r1 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0042, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0021. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r7) {
        /*
            l3.a r0 = new l3.a
            r1 = 0
            r0.<init>(r7, r1)
            int r7 = r0.f396818b
            r0.f396819c = r7
            r7 = r1
        Lb:
            r2 = r7
        Lc:
            int r3 = r0.f396819c
            if (r3 <= 0) goto L42
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L3a
            r5 = 1
            if (r3 == r5) goto L33
            r6 = 2
            if (r3 == r6) goto L33
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L2d;
                case 15: goto L2d;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r7 != 0) goto Lc
            goto L40
        L27:
            int r2 = r2 + 1
            goto Lc
        L2a:
            if (r7 != r2) goto L30
            goto L35
        L2d:
            if (r7 != r2) goto L30
            goto L3c
        L30:
            int r2 = r2 + (-1)
            goto Lc
        L33:
            if (r2 != 0) goto L37
        L35:
            r1 = r5
            goto L42
        L37:
            if (r7 != 0) goto Lc
            goto L40
        L3a:
            if (r2 != 0) goto L3e
        L3c:
            r1 = r4
            goto L42
        L3e:
            if (r7 != 0) goto Lc
        L40:
            r7 = r2
            goto Lb
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.b.b(java.lang.CharSequence):int");
    }

    public static l3.b c() {
        java.util.Locale locale = java.util.Locale.getDefault();
        int i17 = l3.m.f396839a;
        return l3.l.a(locale) == 1 ? f396824g : f396823f;
    }

    public java.lang.CharSequence d(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        boolean b17 = ((l3.i) this.f396827c).b(charSequence, 0, charSequence.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        boolean z17 = (this.f396826b & 2) != 0;
        java.lang.String str = f396822e;
        java.lang.String str2 = f396821d;
        boolean z18 = this.f396825a;
        if (z17) {
            boolean b18 = ((l3.i) (b17 ? l3.k.f396836b : l3.k.f396835a)).b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((java.lang.CharSequence) ((z18 || !(b18 || a(charSequence) == 1)) ? (!z18 || (b18 && a(charSequence) != -1)) ? "" : str : str2));
        }
        if (b17 != z18) {
            spannableStringBuilder.append(b17 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b19 = ((l3.i) (b17 ? l3.k.f396836b : l3.k.f396835a)).b(charSequence, 0, charSequence.length());
        if (!z18 && (b19 || b(charSequence) == 1)) {
            str = str2;
        } else if (!z18 || (b19 && b(charSequence) != -1)) {
            str = "";
        }
        spannableStringBuilder.append((java.lang.CharSequence) str);
        return spannableStringBuilder;
    }
}
