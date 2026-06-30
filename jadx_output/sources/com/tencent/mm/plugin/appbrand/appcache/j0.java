package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class j0 extends m81.b {

    /* renamed from: q, reason: collision with root package name */
    public final int f75603q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(java.lang.String r11, int r12, int r13, java.lang.String r14) {
        /*
            r10 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r1, r2}
            java.lang.String r2 = "EncWxaPkg_%s_%d_%d"
            java.lang.String r4 = java.lang.String.format(r0, r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.appbrand.appcache.d9.e(r11)
            r2.append(r3)
            java.lang.String r3 = "/enc/"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.vfs.w6.u(r2)
            r1.append(r2)
            int r2 = r11.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r5}
            java.lang.String r3 = "%d_%d_%d.encwxapkg"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r9 = 0
            r3 = r10
            r6 = r14
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.f75603q = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.j0.<init>(java.lang.String, int, int, java.lang.String):void");
    }

    public java.lang.String f() {
        return java.lang.String.format(java.util.Locale.US, "EncryptPkgDownloadRequest[%s %d %d]", this.f324688l, java.lang.Integer.valueOf(this.f75603q), java.lang.Integer.valueOf(this.f324689m));
    }
}
