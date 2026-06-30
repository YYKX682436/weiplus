package com.tencent.mm.booter.notification;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.booter.notification.u f63512a = new com.tencent.mm.booter.notification.u();

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r10, bn0.a r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            if (r11 != 0) goto L7
            return r0
        L7:
            int r1 = r11.f22770c
            r2 = 1
            if (r1 != r2) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = r0
        Lf:
            if (r1 == 0) goto La3
            bn0.g r1 = bn0.g.f22779a
            java.lang.String r3 = "MXM_DynaCfg_BizServiceMuteWhitelist"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.b(r3, r4)
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r3 != 0) goto L7b
            r26.t r3 = new r26.t
            java.lang.String r4 = ","
            r3.<init>(r4)
            java.util.List r1 = r3.g(r1, r0)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L5b
            int r3 = r1.size()
            java.util.ListIterator r3 = r1.listIterator(r3)
        L3a:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r3.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L4e
            r4 = r2
            goto L4f
        L4e:
            r4 = r0
        L4f:
            if (r4 != 0) goto L3a
            int r3 = r3.nextIndex()
            int r3 = r3 + r2
            java.util.List r1 = kz5.n0.K0(r1, r3)
            goto L5d
        L5b:
            kz5.p0 r1 = kz5.p0.f313996d
        L5d:
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L7b
            int r3 = r1.length
            r4 = r0
        L6a:
            if (r4 >= r3) goto L79
            r5 = r1[r4]
            boolean r5 = kotlin.jvm.internal.o.b(r5, r10)
            if (r5 == 0) goto L76
            r10 = r2
            goto L83
        L76:
            int r4 = r4 + 1
            goto L6a
        L79:
            r10 = r0
            goto L83
        L7b:
            java.util.HashSet r1 = c01.e2.h()
            boolean r10 = r1.contains(r10)
        L83:
            if (r10 != 0) goto La3
            bn0.g r10 = bn0.g.f22779a
            java.lang.String r1 = "USERINFO_EXT_STATUS2_LONG_SYNC"
            r3 = 0
            long r5 = r10.a(r1, r3)
            r7 = 128(0x80, double:6.3E-322)
            long r5 = r5 & r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 == 0) goto L98
            r10 = r2
            goto L99
        L98:
            r10 = r0
        L99:
            if (r10 == 0) goto La3
            int r10 = r11.f22769b
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 & r11
            if (r10 != 0) goto Laa
            goto La9
        La3:
            int r10 = r11.f22769b
            r10 = r10 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto Laa
        La9:
            r0 = r2
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.notification.u.a(java.lang.String, bn0.a):boolean");
    }
}
