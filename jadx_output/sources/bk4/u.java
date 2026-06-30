package bk4;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f21567a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21568b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21569c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f21570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21571e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f21572f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f21573g;

    /* renamed from: h, reason: collision with root package name */
    public final bk4.w f21574h;

    public u(java.lang.String prefix, java.util.Map xmlMap) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(xmlMap, "xmlMap");
        java.lang.String str = (java.lang.String) xmlMap.get(prefix.concat(".$iconId"));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String z18 = com.tencent.mm.sdk.platformtools.t8.z1(str == null ? "" : str, "");
        kotlin.jvm.internal.o.f(z18, "safeFormatString(...)");
        this.f21567a = z18;
        this.f21568b = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) xmlMap.get(prefix.concat(".effectTime")));
        this.f21569c = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) xmlMap.get(prefix.concat(".expireTime")));
        java.lang.String str2 = (java.lang.String) xmlMap.get(prefix.concat(".useOriginalImage"));
        java.lang.String z19 = com.tencent.mm.sdk.platformtools.t8.z1(str2 == null ? "" : str2, "");
        kotlin.jvm.internal.o.f(z19, "safeFormatString(...)");
        this.f21570d = z19;
        java.lang.String str3 = (java.lang.String) xmlMap.get(prefix.concat(".residentAfterPublish"));
        this.f21571e = com.tencent.mm.sdk.platformtools.t8.D1(str3 == null ? "" : str3, 0);
        java.lang.String str4 = (java.lang.String) xmlMap.get(prefix.concat(".residentCategoryId"));
        java.lang.String z110 = com.tencent.mm.sdk.platformtools.t8.z1(str4 == null ? "" : str4, "");
        kotlin.jvm.internal.o.f(z110, "safeFormatString(...)");
        this.f21572f = z110;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f21573g = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f21574h = new bk4.w(prefix.concat(".styleArray"), xmlMap);
        bk4.y yVar = bk4.y.f21618a;
        yVar.b0(hashMap, xmlMap, prefix.concat(".description"));
        yVar.b0(hashMap2, xmlMap, prefix.concat(".sameFriendsTip"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if ((r0.length() > 0) == true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f21567a
            java.lang.String r1 = "userdefine"
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r3 = com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_CUSTOM_STATUS_NAME_STRING
            java.lang.String r4 = ""
            java.lang.String r0 = r0.v(r3, r4)
            if (r0 == 0) goto L28
            int r3 = r0.length()
            if (r3 != 0) goto L26
            goto L28
        L26:
            r3 = r2
            goto L29
        L28:
            r3 = r1
        L29:
            if (r3 != 0) goto L2c
            return r0
        L2c:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.m2.f(r0)
            java.util.Map r3 = r5.f21573g
            r4 = r3
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4b
            int r4 = r0.length()
            if (r4 <= 0) goto L47
            r4 = r1
            goto L48
        L47:
            r4 = r2
        L48:
            if (r4 != r1) goto L4b
            goto L4c
        L4b:
            r1 = r2
        L4c:
            if (r1 == 0) goto L4f
            goto L59
        L4f:
            java.lang.String r0 = "en"
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.u.a():java.lang.String");
    }

    public final boolean b() {
        long j17 = this.f21568b;
        long j18 = j17 < 0 ? 0L : j17;
        long j19 = this.f21569c;
        if (j19 <= 0 || j19 <= j17) {
            j19 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        long e17 = c01.id.e();
        return j18 <= e17 && e17 <= j19;
    }
}
