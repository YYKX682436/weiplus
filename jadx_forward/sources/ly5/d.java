package ly5;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f403837d = java.util.regex.Pattern.compile("(?<=\\[).*?(?=\\])");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f403838e = java.util.regex.Pattern.compile("(?<=\\()-?[0-9]*,-?[0-9]*(?=\\))");

    /* renamed from: f, reason: collision with root package name */
    public static final ly5.c f403839f = new ly5.c(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f403840a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f403841b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f403842c;

    public d(java.lang.String str) {
        this.f403840a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public my5.a a() {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r6.f403840a
            if (r1 == 0) goto Lcd
            java.lang.String r2 = "LyricContent"
            boolean r3 = r1.contains(r2)
            r4 = -1
            if (r3 == 0) goto L13
            int r2 = r1.indexOf(r2)
            goto L14
        L13:
            r2 = r4
        L14:
            if (r2 == r4) goto Lcd
            int r3 = r1.length()
            int r2 = r2 + 12
            int r5 = r2 + 1
            if (r3 <= r5) goto Lcd
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = r1.trim()
            java.lang.String r3 = "="
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L31
            return r0
        L31:
            int r2 = r1.indexOf(r3)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = r1.trim()
            java.lang.String r3 = "\""
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L48
            return r0
        L48:
            int r2 = r1.indexOf(r3)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "/>"
            boolean r5 = r1.contains(r2)
            if (r5 == 0) goto L5f
            int r2 = r1.lastIndexOf(r2)
            goto L60
        L5f:
            r2 = r4
        L60:
            if (r2 != r4) goto L63
            return r0
        L63:
            r5 = 0
            java.lang.String r1 = r1.substring(r5, r2)
            boolean r2 = r1.contains(r3)
            if (r2 == 0) goto L73
            int r2 = r1.lastIndexOf(r3)
            goto L74
        L73:
            r2 = r4
        L74:
            if (r2 != r4) goto L77
            return r0
        L77:
            java.lang.String r1 = r1.substring(r5, r2)
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb1
            java.io.StringReader r3 = new java.io.StringReader     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb1
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb1
        L85:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            if (r1 == 0) goto L93
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            r6.b(r1)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            goto L85
        L93:
            java.util.ArrayList r1 = r6.f403841b
            ly5.c r3 = ly5.d.f403839f     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            java.util.Collections.sort(r1, r3)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            my5.a r3 = new my5.a     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            int r4 = r6.f403842c     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            r5 = 2
            r3.<init>(r5, r4, r1)     // Catch: java.lang.Exception -> Lab java.lang.Throwable -> Lc1
            r2.close()     // Catch: java.io.IOException -> La6
            goto Laa
        La6:
            r0 = move-exception
            r0.toString()
        Laa:
            return r3
        Lab:
            r1 = move-exception
            goto Lb3
        Lad:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto Lc2
        Lb1:
            r1 = move-exception
            r2 = r0
        Lb3:
            r1.toString()     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto Lcd
            r2.close()     // Catch: java.io.IOException -> Lbc
            goto Lcd
        Lbc:
            r1 = move-exception
            r1.toString()
            goto Lcd
        Lc1:
            r0 = move-exception
        Lc2:
            if (r2 == 0) goto Lcc
            r2.close()     // Catch: java.io.IOException -> Lc8
            goto Lcc
        Lc8:
            r1 = move-exception
            r1.toString()
        Lcc:
            throw r0
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ly5.d.a():my5.a");
    }

    public final void b(java.lang.String str) {
        java.util.ArrayList arrayList;
        if (str == null || str.equals("")) {
            return;
        }
        java.util.regex.Matcher matcher = f403837d.matcher(str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = -1;
        int i18 = -1;
        while (true) {
            boolean find = matcher.find();
            arrayList = this.f403841b;
            if (!find) {
                break;
            }
            java.lang.String group = matcher.group();
            if (group == null) {
                group = "";
            }
            int indexOf = str.indexOf("[" + group + "]");
            if (i18 != -1 && indexOf - i18 > i17 + 2) {
                java.lang.String substring = str.substring(i18 + i17 + 2, indexOf);
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    my5.c cVar = new my5.c();
                    if (d(str2, cVar) != -1) {
                        c(substring, cVar);
                        arrayList.add(cVar);
                    }
                }
                arrayList2.clear();
            }
            arrayList2.add(group);
            i17 = group.length();
            i18 = indexOf;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int i19 = i17 + 2 + i18;
        try {
            if (i19 > str.length()) {
                i19 = str.length();
            }
            java.lang.String trim = str.substring(i19).trim();
            if (trim.length() != 0 || this.f403842c != 0) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    my5.c cVar2 = new my5.c();
                    if (d(str3, cVar2) != -1) {
                        c(trim, cVar2);
                        arrayList.add(cVar2);
                    }
                }
                return;
            }
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                java.lang.String[] split = ((java.lang.String) it7.next()).split("\\:");
                int i27 = 0;
                try {
                    if (split.length == 2 && "offset".equalsIgnoreCase(split[0])) {
                        i27 = java.lang.Integer.parseInt(split[1].trim());
                    }
                } catch (java.lang.Exception e17) {
                    e17.toString();
                }
                if (i27 != Integer.MAX_VALUE) {
                    this.f403842c = i27;
                    return;
                }
            }
        } catch (java.lang.Exception e18) {
            e18.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        r4.add(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r17, my5.c r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = ""
            r1.f414390a = r2     // Catch: java.lang.Exception -> Lbf
            if (r0 == 0) goto Lbf
            boolean r3 = r0.equals(r2)     // Catch: java.lang.Exception -> Lbf
            if (r3 == 0) goto L12
            goto Lbf
        L12:
            java.util.regex.Pattern r3 = ly5.d.f403838e     // Catch: java.lang.Exception -> Lbf
            java.util.regex.Matcher r3 = r3.matcher(r0)     // Catch: java.lang.Exception -> Lbf
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbf
            r4.<init>()     // Catch: java.lang.Exception -> Lbf
            r5 = r2
        L1e:
            boolean r6 = r3.find()     // Catch: java.lang.Exception -> Lbf
            if (r6 == 0) goto Lba
            java.lang.String r6 = r3.group()     // Catch: java.lang.Exception -> Lbf
            if (r6 != 0) goto L2b
            r6 = r2
        L2b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r7.<init>()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r8 = "("
            r7.append(r8)     // Catch: java.lang.Exception -> Lbf
            r7.append(r6)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r8 = ")"
            r7.append(r8)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lbf
            int r7 = r0.indexOf(r7)     // Catch: java.lang.Exception -> Lbf
            int r13 = r5.length()     // Catch: java.lang.Exception -> Lbf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r8.<init>()     // Catch: java.lang.Exception -> Lbf
            r8.append(r5)     // Catch: java.lang.Exception -> Lbf
            r5 = 0
            java.lang.String r9 = r0.substring(r5, r7)     // Catch: java.lang.Exception -> Lbf
            r8.append(r9)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r15 = r8.toString()     // Catch: java.lang.Exception -> Lbf
            int r8 = r6.length()     // Catch: java.lang.Exception -> Lbf
            int r7 = r7 + r8
            r8 = 2
            int r7 = r7 + r8
            int r9 = r0.length()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r0 = r0.substring(r7, r9)     // Catch: java.lang.Exception -> Lbf
            int r7 = r4.size()     // Catch: java.lang.Exception -> Lbf
            r9 = 1
            if (r7 <= 0) goto L7e
            int r7 = r4.size()     // Catch: java.lang.Exception -> Lbf
            int r7 = r7 - r9
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Exception -> Lbf
            my5.b r7 = (my5.b) r7     // Catch: java.lang.Exception -> Lbf
        L7e:
            int r14 = r15.length()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r7 = "\\,"
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Exception -> Lbf
            int r7 = r6.length     // Catch: java.lang.Exception -> Lbf
            r10 = 0
            if (r7 >= r8) goto L8d
            goto Lb2
        L8d:
            int r7 = r6.length     // Catch: java.lang.Exception -> Lbf
            if (r7 != r8) goto Lb2
            r7 = r6[r9]     // Catch: java.lang.Exception -> Lbf
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Exception -> Lbf
            r5 = r6[r5]     // Catch: java.lang.Exception -> Lbf
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> Lbf
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto La4
            r11 = r9
            goto La5
        La4:
            r11 = r7
        La5:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto Laa
            goto Lab
        Laa:
            r9 = r5
        Lab:
            my5.b r5 = new my5.b     // Catch: java.lang.Exception -> Lbf
            r8 = r5
            r8.<init>(r9, r11, r13, r14)     // Catch: java.lang.Exception -> Lbf
            r10 = r5
        Lb2:
            if (r10 == 0) goto Lb7
            r4.add(r10)     // Catch: java.lang.Exception -> Lbf
        Lb7:
            r5 = r15
            goto L1e
        Lba:
            r1.f414390a = r5     // Catch: java.lang.Exception -> Lbf
            r1.f414393d = r4     // Catch: java.lang.Exception -> Lbf
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly5.d.c(java.lang.String, my5.c):void");
    }

    public final long d(java.lang.String str, my5.c cVar) {
        java.lang.String[] split = str.split("\\,");
        if (split.length < 2) {
            java.lang.String[] split2 = str.split("\\:");
            if (this.f403842c == 0 && split2[0].equalsIgnoreCase("offset")) {
                this.f403842c = java.lang.Integer.parseInt(split2[1]);
            }
            return -1L;
        }
        if (split.length == 2) {
            try {
                long parseLong = java.lang.Long.parseLong(split[1]);
                long parseLong2 = java.lang.Long.parseLong(split[0]);
                cVar.f414392c = parseLong;
                cVar.f414391b = parseLong2;
                return parseLong2;
            } catch (java.lang.Exception unused) {
            }
        }
        return -1L;
    }
}
