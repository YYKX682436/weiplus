package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f219394c = java.util.regex.Pattern.compile("version\\s*=\\s*(.*)$");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f219395d = java.util.regex.Pattern.compile("^booster");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f219396e = java.util.regex.Pattern.compile("(\\d+):(\\[([^_]*)_?([^_]*)?_?([<>=]+)(.*)\\]\\s+yes=(.*),no=(.*),missing=([^,]*))");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f219397f = java.util.regex.Pattern.compile("(\\d+):leaf=([^,]*)");

    /* renamed from: a, reason: collision with root package name */
    public volatile java.util.List f219398a = java.util.Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f219399b = 0;

    public static double b(int i17) {
        if (i17 == 0) {
            return Double.MAX_VALUE;
        }
        return ((java.lang.System.currentTimeMillis() / 1000) - (i17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)) / 3600.0d;
    }

    public boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o oVar;
        java.lang.Throwable th6;
        long j17;
        int i17;
        boolean z17;
        int i18 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.GroupTrainModel", "loadFromString: empty content");
            this.f219398a = java.util.Collections.emptyList();
            this.f219399b = 0;
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.StringReader(str));
            int i19 = -1;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o oVar2 = this;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            boolean z18 = false;
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    i19++;
                    try {
                        if (readLine.length() != 0) {
                            if (!z18) {
                                java.util.regex.Matcher matcher = f219394c.matcher(readLine);
                                if (matcher.find()) {
                                    java.lang.String group = matcher.group(1);
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(group)) {
                                        try {
                                            i27 = java.lang.Integer.parseInt(group.trim());
                                        } catch (java.lang.NumberFormatException unused) {
                                            i27 = i18;
                                        }
                                        z18 = true;
                                    }
                                    i27 = i18;
                                    z18 = true;
                                } else {
                                    z18 = true;
                                }
                            }
                            if (f219395d.matcher(readLine).find()) {
                                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.k());
                                i29++;
                            } else {
                                java.util.regex.Matcher matcher2 = f219396e.matcher(readLine);
                                double d17 = 0.0d;
                                if (matcher2.find()) {
                                    if (arrayList.isEmpty()) {
                                        java.lang.Object[] objArr = new java.lang.Object[1];
                                        objArr[i18] = java.lang.Integer.valueOf(i19);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.GroupTrainModel", "cond before booster, line=%d", objArr);
                                        i28++;
                                        j17 = currentTimeMillis;
                                        i17 = i27;
                                        z17 = z18;
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.k) arrayList.get(arrayList.size() - 1);
                                        java.lang.String group2 = matcher2.group(1);
                                        java.lang.String group3 = matcher2.group(3);
                                        z17 = z18;
                                        java.lang.String group4 = matcher2.group(4);
                                        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o oVar3 = oVar2;
                                        java.lang.String group5 = matcher2.group(5);
                                        j17 = currentTimeMillis;
                                        java.lang.String group6 = matcher2.group(6);
                                        java.lang.String group7 = matcher2.group(7);
                                        i17 = i27;
                                        java.lang.String group8 = matcher2.group(8);
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(group2)) {
                                            i28++;
                                            oVar2 = oVar3;
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.n();
                                            nVar.f219386a = group2;
                                            nVar.a(group3, group4);
                                            nVar.f219390e = "<".equals(group5) ? com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m.LessThan : ">".equals(group5) ? com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m.MoreThan : "<=".equals(group5) ? com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m.NoMoreThan : ">=".equals(group5) ? com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m.NoLessThan : com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m.Equal;
                                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(group6)) {
                                                try {
                                                    d17 = java.lang.Double.parseDouble(group6.trim());
                                                } catch (java.lang.NumberFormatException unused2) {
                                                }
                                            }
                                            nVar.f219391f = d17;
                                            nVar.f219392g = group7;
                                            nVar.f219393h = group8;
                                            if (kVar.f219358a == null) {
                                                kVar.f219358a = nVar;
                                            } else {
                                                ((java.util.HashMap) kVar.f219359b).put(group2, nVar);
                                            }
                                        }
                                    }
                                    z18 = z17;
                                    currentTimeMillis = j17;
                                    i27 = i17;
                                    i18 = 0;
                                } else {
                                    j17 = currentTimeMillis;
                                    i17 = i27;
                                    z17 = z18;
                                    java.util.regex.Matcher matcher3 = f219397f.matcher(readLine);
                                    if (!matcher3.find()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.GroupTrainModel", "unmatched line[%d]: %s", java.lang.Integer.valueOf(i19), readLine);
                                    } else if (arrayList.isEmpty()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.GroupTrainModel", "leaf before booster, line=%d", java.lang.Integer.valueOf(i19));
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.k kVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.k) arrayList.get(arrayList.size() - 1);
                                        java.lang.String group9 = matcher3.group(1);
                                        java.lang.String group10 = matcher3.group(2);
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(group9)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.n nVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.n();
                                            nVar2.f219386a = group9;
                                            nVar2.f219387b = true;
                                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(group10)) {
                                                try {
                                                    d17 = java.lang.Double.parseDouble(group10.trim());
                                                } catch (java.lang.NumberFormatException unused3) {
                                                }
                                            }
                                            nVar2.f219391f = d17;
                                            ((java.util.HashMap) kVar2.f219359b).put(group9, nVar2);
                                        }
                                    }
                                    i28++;
                                    oVar2 = this;
                                    z18 = z17;
                                    currentTimeMillis = j17;
                                    i27 = i17;
                                    i18 = 0;
                                }
                                i29++;
                                oVar2 = this;
                                z18 = z17;
                                currentTimeMillis = j17;
                                i27 = i17;
                                i18 = 0;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        oVar = this;
                        try {
                            try {
                                bufferedReader.close();
                                throw th6;
                            } catch (java.lang.Throwable th8) {
                                th6.addSuppressed(th8);
                                throw th6;
                            }
                        } catch (java.io.IOException e17) {
                            e = e17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.GroupTrainModel", "loadFromString IO failed: %s", e.getMessage());
                            oVar.f219398a = java.util.Collections.emptyList();
                            return false;
                        }
                    }
                } catch (java.lang.Throwable th9) {
                    th6 = th9;
                    oVar = oVar2;
                }
            }
            long j18 = currentTimeMillis;
            int i37 = i27;
            bufferedReader.close();
            if (i28 > 10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.GroupTrainModel", "too many error lines=%d, drop model", java.lang.Integer.valueOf(i28));
                this.f219398a = java.util.Collections.emptyList();
                this.f219399b = i37;
                return false;
            }
            this.f219398a = java.util.Collections.unmodifiableList(arrayList);
            this.f219399b = i37;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.GroupTrainModel", "loadFromString: version=%d, boosters=%d, handle=%d, err=%d, cost=%dms", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j18));
            return !arrayList.isEmpty();
        } catch (java.io.IOException e18) {
            e = e18;
            oVar = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00af, code lost:
    
        if (r0.f219333g != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        r5 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e6, code lost:
    
        if (r0.f219343q == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00eb, code lost:
    
        if (r0.f219343q != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f0, code lost:
    
        if (r0.f219342p != 0) goto L75;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double c(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.b r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o.c(com.tencent.mm.plugin.fts.train.b, java.util.List):double");
    }
}
