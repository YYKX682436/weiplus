package ln;

/* loaded from: classes13.dex */
public class s implements vg3.q4 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f401171d = java.util.regex.Pattern.compile("\\$\\{(.+)\\}");

    public static java.lang.CharSequence b(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String z07;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
            java.lang.String d17 = n17.d1();
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
            z07 = z08 == null ? null : z08.z0(d17);
        } else {
            z07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.f2();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.d1();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, z07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0265, code lost:
    
        r13 = new rn.c();
        r13.f66264x1210aac6 = r2;
        r13.f66259x137a1f8b = r8;
        r13.f66251xad24a2e = r12;
        r4 = r39;
        r13.f66265xa792337b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) r4.get(".sysmsg.todo.time"), 0) * 1000;
        r12 = (java.lang.String) r4.get(".sysmsg.todo.username");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x028e, code lost:
    
        if (r12 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0290, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0291, code lost:
    
        r13.f66266xdec927b = r12;
        r12 = (java.lang.String) r4.get(".sysmsg.todo.path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x029b, code lost:
    
        if (r12 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029d, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029e, code lost:
    
        r13.f66257x2260084a = r12;
        r12 = (java.lang.String) r4.get(".sysmsg.todo.custominfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a8, code lost:
    
        if (r12 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02aa, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ab, code lost:
    
        r13.f66253x5aea0404 = r12;
        r12 = (java.lang.String) r4.get(".sysmsg.todo.title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b5, code lost:
    
        if (r12 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b7, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b8, code lost:
    
        r13.f66263x29dd02d3 = r12;
        r14 = r36;
        r13.f66252xb1e12de7 = r14;
        r13.f66260xf16ddfa5 = r9;
        r13.f66261x3c4f6205 = r17;
        r12 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04e6 A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:8:0x0023, B:10:0x0029, B:13:0x0038, B:16:0x0045, B:19:0x0067, B:22:0x0072, B:25:0x007d, B:28:0x0087, B:31:0x00ba, B:34:0x00c5, B:37:0x00dc, B:39:0x0120, B:40:0x0124, B:43:0x013b, B:45:0x0141, B:47:0x0157, B:49:0x0161, B:51:0x0179, B:53:0x0181, B:55:0x019f, B:58:0x01af, B:61:0x01bb, B:63:0x01c1, B:65:0x01c7, B:66:0x0238, B:69:0x0246, B:71:0x024c, B:73:0x0252, B:78:0x046e, B:80:0x0474, B:82:0x047a, B:84:0x0486, B:87:0x04a0, B:89:0x04a6, B:92:0x04b1, B:98:0x04ce, B:100:0x04e6, B:103:0x04ef, B:105:0x04f5, B:107:0x04ff, B:108:0x0574, B:110:0x0509, B:112:0x050f, B:114:0x0519, B:116:0x0523, B:117:0x052d, B:118:0x0541, B:120:0x054d, B:122:0x0558, B:124:0x055f, B:134:0x0265, B:137:0x0291, B:140:0x029e, B:143:0x02ab, B:146:0x02b8, B:147:0x02dd, B:150:0x02e8, B:155:0x030b, B:156:0x0315, B:159:0x031d, B:161:0x0322, B:163:0x0327, B:164:0x0349, B:166:0x034f, B:171:0x037c, B:176:0x03f3, B:177:0x03fa, B:178:0x03a3, B:181:0x0414, B:183:0x0429, B:184:0x0430, B:185:0x0436, B:187:0x043c, B:189:0x0310, B:190:0x02c6, B:196:0x05b4), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04ef A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:8:0x0023, B:10:0x0029, B:13:0x0038, B:16:0x0045, B:19:0x0067, B:22:0x0072, B:25:0x007d, B:28:0x0087, B:31:0x00ba, B:34:0x00c5, B:37:0x00dc, B:39:0x0120, B:40:0x0124, B:43:0x013b, B:45:0x0141, B:47:0x0157, B:49:0x0161, B:51:0x0179, B:53:0x0181, B:55:0x019f, B:58:0x01af, B:61:0x01bb, B:63:0x01c1, B:65:0x01c7, B:66:0x0238, B:69:0x0246, B:71:0x024c, B:73:0x0252, B:78:0x046e, B:80:0x0474, B:82:0x047a, B:84:0x0486, B:87:0x04a0, B:89:0x04a6, B:92:0x04b1, B:98:0x04ce, B:100:0x04e6, B:103:0x04ef, B:105:0x04f5, B:107:0x04ff, B:108:0x0574, B:110:0x0509, B:112:0x050f, B:114:0x0519, B:116:0x0523, B:117:0x052d, B:118:0x0541, B:120:0x054d, B:122:0x0558, B:124:0x055f, B:134:0x0265, B:137:0x0291, B:140:0x029e, B:143:0x02ab, B:146:0x02b8, B:147:0x02dd, B:150:0x02e8, B:155:0x030b, B:156:0x0315, B:159:0x031d, B:161:0x0322, B:163:0x0327, B:164:0x0349, B:166:0x034f, B:171:0x037c, B:176:0x03f3, B:177:0x03fa, B:178:0x03a3, B:181:0x0414, B:183:0x0429, B:184:0x0430, B:185:0x0436, B:187:0x043c, B:189:0x0310, B:190:0x02c6, B:196:0x05b4), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0306 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031d A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:8:0x0023, B:10:0x0029, B:13:0x0038, B:16:0x0045, B:19:0x0067, B:22:0x0072, B:25:0x007d, B:28:0x0087, B:31:0x00ba, B:34:0x00c5, B:37:0x00dc, B:39:0x0120, B:40:0x0124, B:43:0x013b, B:45:0x0141, B:47:0x0157, B:49:0x0161, B:51:0x0179, B:53:0x0181, B:55:0x019f, B:58:0x01af, B:61:0x01bb, B:63:0x01c1, B:65:0x01c7, B:66:0x0238, B:69:0x0246, B:71:0x024c, B:73:0x0252, B:78:0x046e, B:80:0x0474, B:82:0x047a, B:84:0x0486, B:87:0x04a0, B:89:0x04a6, B:92:0x04b1, B:98:0x04ce, B:100:0x04e6, B:103:0x04ef, B:105:0x04f5, B:107:0x04ff, B:108:0x0574, B:110:0x0509, B:112:0x050f, B:114:0x0519, B:116:0x0523, B:117:0x052d, B:118:0x0541, B:120:0x054d, B:122:0x0558, B:124:0x055f, B:134:0x0265, B:137:0x0291, B:140:0x029e, B:143:0x02ab, B:146:0x02b8, B:147:0x02dd, B:150:0x02e8, B:155:0x030b, B:156:0x0315, B:159:0x031d, B:161:0x0322, B:163:0x0327, B:164:0x0349, B:166:0x034f, B:171:0x037c, B:176:0x03f3, B:177:0x03fa, B:178:0x03a3, B:181:0x0414, B:183:0x0429, B:184:0x0430, B:185:0x0436, B:187:0x043c, B:189:0x0310, B:190:0x02c6, B:196:0x05b4), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246 A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:8:0x0023, B:10:0x0029, B:13:0x0038, B:16:0x0045, B:19:0x0067, B:22:0x0072, B:25:0x007d, B:28:0x0087, B:31:0x00ba, B:34:0x00c5, B:37:0x00dc, B:39:0x0120, B:40:0x0124, B:43:0x013b, B:45:0x0141, B:47:0x0157, B:49:0x0161, B:51:0x0179, B:53:0x0181, B:55:0x019f, B:58:0x01af, B:61:0x01bb, B:63:0x01c1, B:65:0x01c7, B:66:0x0238, B:69:0x0246, B:71:0x024c, B:73:0x0252, B:78:0x046e, B:80:0x0474, B:82:0x047a, B:84:0x0486, B:87:0x04a0, B:89:0x04a6, B:92:0x04b1, B:98:0x04ce, B:100:0x04e6, B:103:0x04ef, B:105:0x04f5, B:107:0x04ff, B:108:0x0574, B:110:0x0509, B:112:0x050f, B:114:0x0519, B:116:0x0523, B:117:0x052d, B:118:0x0541, B:120:0x054d, B:122:0x0558, B:124:0x055f, B:134:0x0265, B:137:0x0291, B:140:0x029e, B:143:0x02ab, B:146:0x02b8, B:147:0x02dd, B:150:0x02e8, B:155:0x030b, B:156:0x0315, B:159:0x031d, B:161:0x0322, B:163:0x0327, B:164:0x0349, B:166:0x034f, B:171:0x037c, B:176:0x03f3, B:177:0x03fa, B:178:0x03a3, B:181:0x0414, B:183:0x0429, B:184:0x0430, B:185:0x0436, B:187:0x043c, B:189:0x0310, B:190:0x02c6, B:196:0x05b4), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0474 A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:8:0x0023, B:10:0x0029, B:13:0x0038, B:16:0x0045, B:19:0x0067, B:22:0x0072, B:25:0x007d, B:28:0x0087, B:31:0x00ba, B:34:0x00c5, B:37:0x00dc, B:39:0x0120, B:40:0x0124, B:43:0x013b, B:45:0x0141, B:47:0x0157, B:49:0x0161, B:51:0x0179, B:53:0x0181, B:55:0x019f, B:58:0x01af, B:61:0x01bb, B:63:0x01c1, B:65:0x01c7, B:66:0x0238, B:69:0x0246, B:71:0x024c, B:73:0x0252, B:78:0x046e, B:80:0x0474, B:82:0x047a, B:84:0x0486, B:87:0x04a0, B:89:0x04a6, B:92:0x04b1, B:98:0x04ce, B:100:0x04e6, B:103:0x04ef, B:105:0x04f5, B:107:0x04ff, B:108:0x0574, B:110:0x0509, B:112:0x050f, B:114:0x0519, B:116:0x0523, B:117:0x052d, B:118:0x0541, B:120:0x054d, B:122:0x0558, B:124:0x055f, B:134:0x0265, B:137:0x0291, B:140:0x029e, B:143:0x02ab, B:146:0x02b8, B:147:0x02dd, B:150:0x02e8, B:155:0x030b, B:156:0x0315, B:159:0x031d, B:161:0x0322, B:163:0x0327, B:164:0x0349, B:166:0x034f, B:171:0x037c, B:176:0x03f3, B:177:0x03fa, B:178:0x03a3, B:181:0x0414, B:183:0x0429, B:184:0x0430, B:185:0x0436, B:187:0x043c, B:189:0x0310, B:190:0x02c6, B:196:0x05b4), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04a6 A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:8:0x0023, B:10:0x0029, B:13:0x0038, B:16:0x0045, B:19:0x0067, B:22:0x0072, B:25:0x007d, B:28:0x0087, B:31:0x00ba, B:34:0x00c5, B:37:0x00dc, B:39:0x0120, B:40:0x0124, B:43:0x013b, B:45:0x0141, B:47:0x0157, B:49:0x0161, B:51:0x0179, B:53:0x0181, B:55:0x019f, B:58:0x01af, B:61:0x01bb, B:63:0x01c1, B:65:0x01c7, B:66:0x0238, B:69:0x0246, B:71:0x024c, B:73:0x0252, B:78:0x046e, B:80:0x0474, B:82:0x047a, B:84:0x0486, B:87:0x04a0, B:89:0x04a6, B:92:0x04b1, B:98:0x04ce, B:100:0x04e6, B:103:0x04ef, B:105:0x04f5, B:107:0x04ff, B:108:0x0574, B:110:0x0509, B:112:0x050f, B:114:0x0519, B:116:0x0523, B:117:0x052d, B:118:0x0541, B:120:0x054d, B:122:0x0558, B:124:0x055f, B:134:0x0265, B:137:0x0291, B:140:0x029e, B:143:0x02ab, B:146:0x02b8, B:147:0x02dd, B:150:0x02e8, B:155:0x030b, B:156:0x0315, B:159:0x031d, B:161:0x0322, B:163:0x0327, B:164:0x0349, B:166:0x034f, B:171:0x037c, B:176:0x03f3, B:177:0x03fa, B:178:0x03a3, B:181:0x0414, B:183:0x0429, B:184:0x0430, B:185:0x0436, B:187:0x043c, B:189:0x0310, B:190:0x02c6, B:196:0x05b4), top: B:7:0x0023 }] */
    @Override // vg3.q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String r38, java.util.Map r39, com.p314xaae8f345.mm.p944x882e457a.p0 r40) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.s.k7(java.lang.String, java.util.Map, com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }
}
