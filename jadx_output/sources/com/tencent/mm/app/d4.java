package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class d4 implements kj.x {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ff A[Catch: all -> 0x0390, TryCatch #0 {all -> 0x0390, blocks: (B:57:0x02d9, B:59:0x02ff, B:61:0x0307, B:65:0x0311, B:67:0x0317), top: B:56:0x02d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0317 A[Catch: all -> 0x0390, TRY_LEAVE, TryCatch #0 {all -> 0x0390, blocks: (B:57:0x02d9, B:59:0x02ff, B:61:0x0307, B:65:0x0311, B:67:0x0317), top: B:56:0x02d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r53, java.lang.String r54, long r55, boolean r57, java.lang.String r58) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.d4.a(java.lang.String, java.lang.String, long, boolean, java.lang.String):void");
    }

    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map.Entry entry) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String[] strArr = (java.lang.String[]) entry.getValue();
        if (strArr != null) {
            java.util.Arrays.sort(strArr);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append('[');
            for (java.lang.String str7 : strArr) {
                sb6.append(str7);
                sb6.append(";");
            }
            sb6.setCharAt(sb6.length() - 1, ']');
            str4 = sb6.toString();
        } else {
            str4 = "";
        }
        java.lang.String str8 = str4;
        int indexOf = str2.indexOf("at ");
        int indexOf2 = str2.indexOf("at ");
        while (true) {
            indexOf++;
            if (indexOf >= str2.length() || (indexOf2 = indexOf2 + 1) >= str3.length()) {
                break;
            }
            int charAt = str2.charAt(indexOf) - str3.charAt(indexOf2);
            if (charAt != 0) {
                if (charAt > 0) {
                    str6 = str2;
                    str5 = str3;
                }
            }
        }
        str5 = str2;
        str6 = str3;
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.String str9 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        fVar.d(28391, str, str5, str6, str8, com.tencent.matrix.lifecycle.owners.f0.f52740v, 110, bm5.f1.a());
    }

    public void c(java.lang.String str, java.lang.String str2, long j17, boolean z17) {
        com.tencent.mm.app.a4.c(str);
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        java.lang.String h17 = wVar.h();
        java.lang.String str3 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        jx3.f.INSTANCE.d(19664, str, h17, 0, java.lang.Integer.valueOf((com.tencent.matrix.lifecycle.owners.f0.f52739u || wVar.f53889n) ? 1 : 0), bm5.f1.a(), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.lang.System.currentTimeMillis() / 1000), com.tencent.mm.sdk.platformtools.z.f193109e, str2, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(z17 ? 1 : 0), 1, 0, com.tencent.mm.sdk.platformtools.z.f193111g, "", 0, 0, 0, "", "", "", "", "", 0, 1, "", com.tencent.mm.app.a4.f());
        com.tencent.mm.app.a4.d();
    }
}
