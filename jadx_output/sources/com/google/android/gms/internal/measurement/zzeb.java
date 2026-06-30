package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzeb extends com.google.android.gms.internal.measurement.zzjq {
    public zzeb(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        super(zzjrVar);
    }

    private final java.lang.Boolean zza(double d17, com.google.android.gms.internal.measurement.zzkg zzkgVar) {
        try {
            return zza(new java.math.BigDecimal(d17), zzkgVar, java.lang.Math.ulp(d17));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjq
    public final boolean zzhf() {
        return false;
    }

    private final java.lang.Boolean zza(long j17, com.google.android.gms.internal.measurement.zzkg zzkgVar) {
        try {
            return zza(new java.math.BigDecimal(j17), zzkgVar, 0.0d);
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
                    zzge().zzip().zzg("Invalid regular expression in REGEXP audience filter. expression", str3);
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

    private final java.lang.Boolean zza(java.lang.String str, com.google.android.gms.internal.measurement.zzkg zzkgVar) {
        if (!com.google.android.gms.internal.measurement.zzka.zzck(str)) {
            return null;
        }
        try {
            return zza(new java.math.BigDecimal(str), zzkgVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private final java.lang.Boolean zza(java.lang.String str, com.google.android.gms.internal.measurement.zzki zzkiVar) {
        java.lang.Integer num;
        java.util.List<java.lang.String> list;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkiVar);
        if (str == null || (num = zzkiVar.zzash) == null || num.intValue() == 0) {
            return null;
        }
        if (zzkiVar.zzash.intValue() == 6) {
            java.lang.String[] strArr = zzkiVar.zzask;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (zzkiVar.zzasi == null) {
            return null;
        }
        int intValue = zzkiVar.zzash.intValue();
        java.lang.Boolean bool = zzkiVar.zzasj;
        boolean z17 = bool != null && bool.booleanValue();
        java.lang.String upperCase = (z17 || intValue == 1 || intValue == 6) ? zzkiVar.zzasi : zzkiVar.zzasi.toUpperCase(java.util.Locale.ENGLISH);
        java.lang.String[] strArr2 = zzkiVar.zzask;
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
    private static java.lang.Boolean zza(java.math.BigDecimal r10, com.google.android.gms.internal.measurement.zzkg r11, double r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeb.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzkg, double):java.lang.Boolean");
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
    public final com.google.android.gms.internal.measurement.zzkm[] zza(java.lang.String r50, com.google.android.gms.internal.measurement.zzkn[] r51, com.google.android.gms.internal.measurement.zzks[] r52) {
        /*
            Method dump skipped, instructions count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeb.zza(java.lang.String, com.google.android.gms.internal.measurement.zzkn[], com.google.android.gms.internal.measurement.zzks[]):com.google.android.gms.internal.measurement.zzkm[]");
    }
}
