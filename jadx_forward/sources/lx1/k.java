package lx1;

/* loaded from: classes12.dex */
public class k implements android.text.Html.TagHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f403575c = java.util.regex.Pattern.compile("\\d+");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f403576d = java.util.regex.Pattern.compile("#[a-f0-9]+");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f403577e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Stack f403578a = new java.util.Stack();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f403579b = new java.util.HashMap();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f403577e = hashMap;
        hashMap.put("aqua", 65535);
        hashMap.put("black", 0);
        hashMap.put("blue", 255);
        hashMap.put("fuchsia", 16711935);
        hashMap.put("green", 32768);
        hashMap.put("grey", 8421504);
        hashMap.put("lime", 65280);
        hashMap.put("maroon", 8388608);
        hashMap.put("navy", 128);
        hashMap.put("olive", 8421376);
        hashMap.put("purple", 8388736);
        hashMap.put("red", 16711680);
        hashMap.put("silver", 12632256);
        hashMap.put("teal", 32896);
        hashMap.put("white", 16777215);
        hashMap.put("yellow", 16776960);
    }

    public static int b(java.lang.String str) {
        int i17;
        int i18;
        java.lang.Integer num = (java.lang.Integer) f403577e.get(str.toLowerCase());
        if (num != null) {
            return num.intValue();
        }
        try {
            java.lang.String str2 = str.toString();
            int length = str2.length();
            if ('-' == str2.charAt(0)) {
                i18 = -1;
                i17 = 1;
            } else {
                i17 = 0;
                i18 = 1;
            }
            int i19 = 16;
            if ('0' == str2.charAt(i17)) {
                if (i17 == length - 1) {
                    return 0;
                }
                int i27 = i17 + 1;
                char charAt = str2.charAt(i27);
                if ('x' != charAt && 'X' != charAt) {
                    i19 = 8;
                    i17 = i27;
                }
                i17 += 2;
            } else if ('#' == str2.charAt(i17)) {
                i17++;
            } else {
                i19 = 10;
            }
            return java.lang.Integer.parseInt(str2.substring(i17), i19) * i18;
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if ((r2 == px1.p.NOTEUL) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r2 == px1.p.NOTEOL) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            java.util.Stack r0 = r6.f403578a
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4b
            java.lang.Object r1 = r0.peek()
            px1.a r1 = (px1.a) r1
            px1.p r2 = r1.f440349a
            r3 = 0
            r4 = 1
            if (r7 == 0) goto L20
            r2.getClass()
            px1.p r5 = px1.p.NOTEOL
            if (r2 != r5) goto L1d
            r5 = r4
            goto L1e
        L1d:
            r5 = r3
        L1e:
            if (r5 != 0) goto L34
        L20:
            if (r7 != 0) goto L2c
            r2.getClass()
            px1.p r5 = px1.p.NOTEUL
            if (r2 != r5) goto L2a
            r3 = r4
        L2a:
            if (r3 != 0) goto L34
        L2c:
            if (r7 != 0) goto L45
            boolean r2 = r2.h()
            if (r2 == 0) goto L45
        L34:
            int r7 = r1.f440351c
            if (r7 <= r4) goto L41
            int r7 = r7 - r4
            r1.f440351c = r7
            int r7 = r1.f440350b
            int r7 = r7 - r4
            r1.f440350b = r7
            goto L4b
        L41:
            r0.pop()
            goto L4b
        L45:
            r0.pop()
            r6.a(r7)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lx1.k.a(boolean):void");
    }

    public final java.lang.Object c(android.text.Editable editable, java.lang.Class cls) {
        java.lang.Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        return spans[spans.length - 1];
    }

    public final void d(boolean z17, px1.p pVar) {
        if (z17) {
            pVar = px1.p.NOTEOL;
        }
        java.util.Stack stack = this.f403578a;
        px1.a aVar = stack.isEmpty() ? null : (px1.a) stack.peek();
        if (aVar == null) {
            stack.push(new px1.a(pVar, 1, 1));
        } else if (aVar.f440349a != pVar) {
            stack.push(new px1.a(pVar, aVar.f440350b + 1, 1));
        } else {
            aVar.f440350b++;
            aVar.f440351c++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x029d, code lost:
    
        if (r25.charAt(r25.length() - 1) != '\n') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f5, code lost:
    
        if (r25.charAt(r25.length() - 1) != '\n') goto L137;
     */
    @Override // android.text.Html.TagHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleTag(boolean r23, java.lang.String r24, android.text.Editable r25, org.xml.sax.XMLReader r26) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx1.k.handleTag(boolean, java.lang.String, android.text.Editable, org.xml.sax.XMLReader):void");
    }
}
