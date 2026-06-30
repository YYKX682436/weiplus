package zv1;

/* loaded from: classes15.dex */
public abstract class c implements zv1.d, zv1.q {

    /* renamed from: a, reason: collision with root package name */
    public zv1.r f557811a;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d3, code lost:
    
        if (r5.hasNext() == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d5, code lost:
    
        r15 = r5.next();
        r6 = ((zv1.e1) r15).f557830e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02de, code lost:
    
        if (r6 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e9, code lost:
    
        if (((java.lang.Boolean) r6.f384366d).booleanValue() != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02eb, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ee, code lost:
    
        if (r10 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f0, code lost:
    
        r0.add(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ed, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f5, code lost:
    
        r5 = r0.iterator();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ff, code lost:
    
        if (r5.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0301, code lost:
    
        r6 = r6 + ((zv1.e1) r5.next()).f557827b;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x030f, code lost:
    
        r32 = r3;
        r3 = new java.lang.StringBuilder();
        r3.append("Exempted files: exemptedCount=");
        r3.append(r0.size());
        r3.append(", exemptedSize=");
        r3.append(r6 / r22);
        r3.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032f, code lost:
    
        if (r32 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0331, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0344, code lost:
    
        r3.append(r0);
        r3.append('%');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", r3.toString());
        r15 = r32;
        zv1.e1.f557825f.b(r29, r9, r11, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0361, code lost:
    
        if (r14 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0363, code lost:
    
        r0 = new java.lang.StringBuilder(r21);
        r0.append(r28);
        r0.append(r27);
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04b3, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0377, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0333, code lost:
    
        r0 = java.lang.Float.valueOf(ri.b0.f((((float) r6) * 100.0f) / ((float) r12), 0, 1, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a6, code lost:
    
        r12 = r32;
        r5 = java.lang.Float.valueOf(ri.b0.f((((float) r5) * 100.0f) / ((float) r12), 0, 1, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0360, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03a0, code lost:
    
        r3 = r21;
        r7 = r27;
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03a6, code lost:
    
        kz5.c0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03ab, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b4, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03b7, code lost:
    
        r22 = r0;
        r3 = r21;
        r5 = r27;
        r11 = r28;
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03c6, code lost:
    
        r6 = (zv1.e1) kz5.n0.k0(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03cc, code lost:
    
        if (r6 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03ce, code lost:
    
        r41 = r2;
        r34 = r6.f557828c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03d9, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanCache.Utils", "Can NOT find proper timeThreshold within scannedFiles in INC order, use time of lastVisitedFile(lasest)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "Threshold time: fileListCount=" + r9.size() + ", timeThreshold=" + zv1.i0.a().format(java.lang.Long.valueOf(r34)));
        r1 = new java.lang.StringBuilder();
        r1.append("Skipped files: skippedCount=");
        r1.append(r41.size());
        r1.append(", skippedSize=");
        r2 = r41.iterator();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0422, code lost:
    
        if (r2.hasNext() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0424, code lost:
    
        r6 = r6 + ((zv1.e1) r2.next()).f557827b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x042e, code lost:
    
        r1.append(r6 / r22);
        r2 = r20;
        r1.append(r2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", r1.toString());
        r1 = new java.util.ArrayList();
        r6 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x044c, code lost:
    
        if (r6.hasNext() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x044e, code lost:
    
        r7 = r6.next();
        r9 = ((zv1.e1) r7).f557830e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0457, code lost:
    
        if (r9 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0462, code lost:
    
        if (((java.lang.Boolean) r9.f384366d).booleanValue() != true) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0464, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0468, code lost:
    
        if (r9 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x046a, code lost:
    
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0467, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x046e, code lost:
    
        r6 = new java.lang.StringBuilder();
        r6.append("Exempted files: exemptedCount=");
        r6.append(r1.size());
        r6.append(", exemptedSize=");
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0488, code lost:
    
        if (r0.hasNext() == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x048a, code lost:
    
        r36 = r36 + ((zv1.e1) r0.next()).f557827b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0495, code lost:
    
        r6.append(r36 / r22);
        r6.append(r2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04a4, code lost:
    
        if (r14 == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04a6, code lost:
    
        r0 = new java.lang.StringBuilder(r3);
        r0.append(r11);
        r0.append(r5);
        r3 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04bc, code lost:
    
        r1 = r7;
        r2 = r8;
        r0 = r29;
        r3 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03d5, code lost:
    
        r41 = r2;
        r34 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0235, code lost:
    
        if (r14 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0237, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "Threshold time: fileListCount=" + r9.size() + ", timeThresholdIndex=" + r11 + ", timeThreshold=" + zv1.i0.a().format(java.lang.Long.valueOf(r3)));
        r0 = r2.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0271, code lost:
    
        if (r0.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0273, code lost:
    
        r5 = r5 + ((zv1.e1) r0.next()).f557827b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027d, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Skipped files: skippedCount=");
        r0.append(r2.size());
        r0.append(", skippedSize=");
        r0.append(r5 / r22);
        r1 = r34;
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x029f, code lost:
    
        if (r32 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a1, code lost:
    
        r12 = r32;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b7, code lost:
    
        r0.append(r5);
        r0.append('%');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", r0.toString());
        r0 = new java.util.ArrayList();
        r5 = r9.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d2  */
    @Override // zv1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(long r39, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.c.c(long, com.tencent.wcdb.support.CancellationSignal, boolean):long");
    }

    public abstract zv1.j0 f();
}
