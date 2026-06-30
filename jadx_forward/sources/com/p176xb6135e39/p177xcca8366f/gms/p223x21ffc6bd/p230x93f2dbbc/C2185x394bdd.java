package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzeb */
/* loaded from: classes16.dex */
public final class C2185x394bdd extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87 {
    public C2185x394bdd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        super(c2331x394c88);
    }

    private final java.lang.Boolean zza(double d17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c) {
        try {
            return zza(new java.math.BigDecimal(d17), c2346x394c9c, java.lang.Math.ulp(d17));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87
    /* renamed from: zzhf */
    public final boolean mo19018x394c3e() {
        return false;
    }

    private final java.lang.Boolean zza(long j17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c) {
        try {
            return zza(new java.math.BigDecimal(j17), c2346x394c9c, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static java.lang.Boolean zza(java.lang.Boolean bool, boolean z17) {
        if (bool == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(bool.booleanValue() ^ z17);
    }

    private final java.lang.Boolean zza(java.lang.String str, int i17, boolean z17, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (i17 == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z17 && i17 != 1) {
            str = str.toUpperCase(java.util.Locale.ENGLISH);
        }
        switch (i17) {
            case 1:
                try {
                    return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile(str3, z17 ? 0 : 66).matcher(str).matches());
                } catch (java.util.regex.PatternSyntaxException unused) {
                    mo18976x394c1e().m19111x394c67().zzg("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return java.lang.Boolean.valueOf(startsWith);
    }

    private final java.lang.Boolean zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c c2346x394c9c) {
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19283x394ba8(str)) {
            return null;
        }
        try {
            return zza(new java.math.BigDecimal(str), c2346x394c9c, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private final java.lang.Boolean zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2348x394c9e c2348x394c9e) {
        java.lang.Integer num;
        java.util.List<java.lang.String> list;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2348x394c9e);
        if (str == null || (num = c2348x394c9e.f7065x6f02336) == null || num.intValue() == 0) {
            return null;
        }
        if (c2348x394c9e.f7065x6f02336.intValue() == 6) {
            java.lang.String[] strArr = c2348x394c9e.f7068x6f02339;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (c2348x394c9e.f7066x6f02337 == null) {
            return null;
        }
        int intValue = c2348x394c9e.f7065x6f02336.intValue();
        java.lang.Boolean bool = c2348x394c9e.f7067x6f02338;
        boolean z17 = bool != null && bool.booleanValue();
        java.lang.String upperCase = (z17 || intValue == 1 || intValue == 6) ? c2348x394c9e.f7066x6f02337 : c2348x394c9e.f7066x6f02337.toUpperCase(java.util.Locale.ENGLISH);
        java.lang.String[] strArr2 = c2348x394c9e.f7068x6f02339;
        if (strArr2 == null) {
            list = null;
        } else if (z17) {
            list = java.util.Arrays.asList(strArr2);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : strArr2) {
                arrayList.add(str2.toUpperCase(java.util.Locale.ENGLISH));
            }
            list = arrayList;
        }
        return zza(str, intValue, z17, upperCase, list, intValue == 1 ? upperCase : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x006f, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean zza(java.math.BigDecimal r10, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2346x394c9c r11, double r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzkg, double):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024e A[EDGE_INSN: B:69:0x024e->B:70:0x024e BREAK  A[LOOP:3: B:61:0x022f->B:67:0x0247], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2352x394ca2[] zza(java.lang.String r50, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3[] r51, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8[] r52) {
        /*
            Method dump skipped, instructions count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2185x394bdd.zza(java.lang.String, com.google.android.gms.internal.measurement.zzkn[], com.google.android.gms.internal.measurement.zzks[]):com.google.android.gms.internal.measurement.zzkm[]");
    }
}
