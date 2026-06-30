package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaan */
/* loaded from: classes13.dex */
final class C2131x6f0210e {
    public static java.lang.String zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("# ");
        sb6.append(str);
        zza(interfaceC2129x6f0210c, sb6, 0);
        return sb6.toString();
    }

    public static final void zzb(java.lang.StringBuilder sb6, int i17, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb6, i17, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it6 = ((java.util.Map) obj).entrySet().iterator();
            while (it6.hasNext()) {
                zzb(sb6, i17, str, (java.util.Map.Entry) it6.next());
            }
            return;
        }
        sb6.append('\n');
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            sb6.append(' ');
        }
        sb6.append(str);
        if (obj instanceof java.lang.String) {
            sb6.append(": \"");
            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2150x6f02126.zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.m19371x394c03((java.lang.String) obj)));
            sb6.append('\"');
            return;
        }
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e) {
            sb6.append(": \"");
            sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2150x6f02126.zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e) obj));
            sb6.append('\"');
            return;
        }
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77) {
            sb6.append(" {");
            zza((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2403x394e77) obj, sb6, i17 + 2);
            sb6.append("\n");
            while (i18 < i17) {
                sb6.append(' ');
                i18++;
            }
            sb6.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb6.append(": ");
            sb6.append(obj.toString());
            return;
        }
        sb6.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i27 = i17 + 2;
        zzb(sb6, i27, "key", entry.getKey());
        zzb(sb6, i27, "value", entry.getValue());
        sb6.append("\n");
        while (i18 < i17) {
            sb6.append(' ');
            i18++;
        }
        sb6.append("}");
    }

    /* renamed from: zzfk */
    private static final java.lang.String m18846x394c05(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb6.append("_");
            }
            sb6.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021a, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e5, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e7, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f7, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0208, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2131x6f0210e.zza(com.google.android.gms.internal.measurement.zzaal, java.lang.StringBuilder, int):void");
    }
}
