package w16;

/* loaded from: classes15.dex */
public enum e {
    BOOLEAN(l06.r.f396429i, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, "Z", "java.lang.Boolean"),
    CHAR(l06.r.f396430m, "char", "C", "java.lang.Character"),
    BYTE(l06.r.f396431n, "byte", "B", "java.lang.Byte"),
    SHORT(l06.r.f396432o, "short", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, "java.lang.Short"),
    INT(l06.r.f396433p, "int", "I", "java.lang.Integer"),
    FLOAT(l06.r.f396434q, "float", "F", "java.lang.Float"),
    LONG(l06.r.f396435r, "long", "J", "java.lang.Long"),
    DOUBLE(l06.r.f396436s, "double", "D", "java.lang.Double");


    /* renamed from: s, reason: collision with root package name */
    public static final java.util.Set f523794s = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f523795t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Map f523796u = new java.util.EnumMap(l06.r.class);

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.Map f523797v = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final l06.r f523799d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f523800e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f523801f;

    /* renamed from: g, reason: collision with root package name */
    public final n16.c f523802g;

    static {
        for (w16.e eVar : m173124xcee59d22()) {
            ((java.util.HashSet) f523794s).add(eVar.j());
            java.util.Map map = f523795t;
            java.lang.String str = eVar.f523800e;
            if (str == null) {
                a(11);
                throw null;
            }
            ((java.util.HashMap) map).put(str, eVar);
            ((java.util.EnumMap) f523796u).put((java.util.EnumMap) eVar.i(), (l06.r) eVar);
            ((java.util.HashMap) f523797v).put(eVar.h(), eVar);
        }
    }

    e(l06.r rVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (rVar == null) {
            a(6);
            throw null;
        }
        if (str == null) {
            a(7);
            throw null;
        }
        if (str2 == null) {
            a(8);
            throw null;
        }
        if (str3 == null) {
            a(9);
            throw null;
        }
        this.f523799d = rVar;
        this.f523800e = str;
        this.f523801f = str2;
        this.f523802g = new n16.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto Lc
            if (r7 == r0) goto Lc
            switch(r7) {
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            if (r7 == r1) goto L17
            if (r7 == r0) goto L17
            switch(r7) {
                case 10: goto L17;
                case 11: goto L17;
                case 12: goto L17;
                case 13: goto L17;
                default: goto L15;
            }
        L15:
            r3 = 3
            goto L18
        L17:
            r3 = r1
        L18:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r5 = 0
            switch(r7) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L35;
                case 4: goto L3a;
                case 5: goto L30;
                case 6: goto L2b;
                case 7: goto L3d;
                case 8: goto L30;
                case 9: goto L25;
                case 10: goto L3a;
                case 11: goto L3a;
                case 12: goto L3a;
                case 13: goto L3a;
                default: goto L20;
            }
        L20:
            java.lang.String r6 = "className"
            r3[r5] = r6
            goto L41
        L25:
            java.lang.String r6 = "wrapperClassName"
            r3[r5] = r6
            goto L41
        L2b:
            java.lang.String r6 = "primitiveType"
            r3[r5] = r6
            goto L41
        L30:
            java.lang.String r6 = "desc"
            r3[r5] = r6
            goto L41
        L35:
            java.lang.String r6 = "type"
            r3[r5] = r6
            goto L41
        L3a:
            r3[r5] = r4
            goto L41
        L3d:
            java.lang.String r6 = "name"
            r3[r5] = r6
        L41:
            java.lang.String r5 = "get"
            r6 = 1
            if (r7 == r1) goto L62
            if (r7 == r0) goto L62
            switch(r7) {
                case 10: goto L5d;
                case 11: goto L58;
                case 12: goto L53;
                case 13: goto L4e;
                default: goto L4b;
            }
        L4b:
            r3[r6] = r4
            goto L64
        L4e:
            java.lang.String r4 = "getWrapperFqName"
            r3[r6] = r4
            goto L64
        L53:
            java.lang.String r4 = "getDesc"
            r3[r6] = r4
            goto L64
        L58:
            java.lang.String r4 = "getJavaKeywordName"
            r3[r6] = r4
            goto L64
        L5d:
            java.lang.String r4 = "getPrimitiveType"
            r3[r6] = r4
            goto L64
        L62:
            r3[r6] = r5
        L64:
            switch(r7) {
                case 1: goto L76;
                case 2: goto L78;
                case 3: goto L76;
                case 4: goto L78;
                case 5: goto L71;
                case 6: goto L6c;
                case 7: goto L6c;
                case 8: goto L6c;
                case 9: goto L6c;
                case 10: goto L78;
                case 11: goto L78;
                case 12: goto L78;
                case 13: goto L78;
                default: goto L67;
            }
        L67:
            java.lang.String r4 = "isWrapperClassName"
            r3[r1] = r4
            goto L78
        L6c:
            java.lang.String r4 = "<init>"
            r3[r1] = r4
            goto L78
        L71:
            java.lang.String r4 = "getByDesc"
            r3[r1] = r4
            goto L78
        L76:
            r3[r1] = r5
        L78:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L89
            if (r7 == r0) goto L89
            switch(r7) {
                case 10: goto L89;
                case 11: goto L89;
                case 12: goto L89;
                case 13: goto L89;
                default: goto L83;
            }
        L83:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L8e
        L89:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L8e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w16.e.a(int):void");
    }

    public static w16.e b(java.lang.String str) {
        if (str == null) {
            a(1);
            throw null;
        }
        w16.e eVar = (w16.e) ((java.util.HashMap) f523795t).get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new java.lang.AssertionError("Non-primitive type name passed: " + str);
    }

    public java.lang.String h() {
        java.lang.String str = this.f523801f;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public l06.r i() {
        l06.r rVar = this.f523799d;
        if (rVar != null) {
            return rVar;
        }
        a(10);
        throw null;
    }

    public n16.c j() {
        n16.c cVar = this.f523802g;
        if (cVar != null) {
            return cVar;
        }
        a(13);
        throw null;
    }
}
