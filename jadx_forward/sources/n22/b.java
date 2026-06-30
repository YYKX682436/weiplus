package n22;

/* loaded from: classes9.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(r45.ri0 r14) {
        /*
            java.lang.String r0 = "handle Md5="
            java.lang.String r1 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r1)
            com.tencent.mm.storage.h5 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d
            boolean r1 = r1.wi()
            r2 = 0
            if (r1 == 0) goto L11
            return r2
        L11:
            java.lang.String r1 = r14.f466432t
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L20
            int r1 = r1.length()
            if (r1 != 0) goto L1e
            goto L20
        L1e:
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            java.lang.String r5 = "EmojiInfo"
            if (r1 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "null meanings, md5="
            r0.<init>(r1)
            java.lang.String r14 = r14.f466419d
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r14)
            return r2
        L3a:
            java.lang.String r1 = r14.f466432t
            r6 = 2
            byte[] r1 = android.util.Base64.decode(r1, r6)
            java.lang.String r6 = "decode(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r6)
            r45.qi0 r6 = new r45.qi0
            r6.<init>()
            r6.mo11468x92b714fd(r1)     // Catch: java.io.IOException -> La7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La7
            r1.<init>(r0)     // Catch: java.io.IOException -> La7
            java.lang.String r14 = r14.f466419d     // Catch: java.io.IOException -> La7
            r1.append(r14)     // Catch: java.io.IOException -> La7
            java.lang.String r14 = ", attr: "
            r1.append(r14)     // Catch: java.io.IOException -> La7
            java.util.LinkedList r14 = r6.f465544d
            r1.append(r14)     // Catch: java.io.IOException -> La7
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> La7
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)     // Catch: java.io.IOException -> La7
            java.lang.String r0 = "meaning"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r14, r0)     // Catch: java.io.IOException -> La7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.io.IOException -> La7
            r5.<init>()     // Catch: java.io.IOException -> La7
            java.util.Iterator r14 = r14.iterator()     // Catch: java.io.IOException -> La7
        L78:
            boolean r0 = r14.hasNext()     // Catch: java.io.IOException -> La7
            if (r0 == 0) goto L98
            java.lang.Object r0 = r14.next()     // Catch: java.io.IOException -> La7
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> La7
            if (r1 == 0) goto L90
            int r1 = r1.length()     // Catch: java.io.IOException -> La7
            if (r1 != 0) goto L8e
            goto L90
        L8e:
            r1 = r3
            goto L91
        L90:
            r1 = r4
        L91:
            r1 = r1 ^ r4
            if (r1 == 0) goto L78
            r5.add(r0)     // Catch: java.io.IOException -> La7
            goto L78
        L98:
            java.lang.String r6 = ","
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 62
            r13 = 0
            java.lang.String r14 = kz5.n0.g0(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> La7
            return r14
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n22.b.a(r45.ri0):java.lang.String");
    }
}
