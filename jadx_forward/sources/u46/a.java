package u46;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f506189a = new java.lang.Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f506190b = new java.lang.String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f506191c = new int[0];

    public static boolean a(int[] iArr, int i17) {
        int i18;
        if (iArr != null) {
            i18 = 0;
            while (i18 < iArr.length) {
                if (i17 == iArr[i18]) {
                    break;
                }
                i18++;
            }
        }
        i18 = -1;
        return i18 != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.Object[] r4, java.lang.Object r5) {
        /*
            r0 = 0
            r1 = -1
            if (r4 != 0) goto L5
            goto L32
        L5:
            if (r5 != 0) goto L13
            r5 = r0
        L8:
            int r2 = r4.length
            if (r5 >= r2) goto L32
            r2 = r4[r5]
            if (r2 != 0) goto L10
            goto L33
        L10:
            int r5 = r5 + 1
            goto L8
        L13:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r2 = r2.isInstance(r5)
            if (r2 == 0) goto L32
            r2 = r0
        L22:
            int r3 = r4.length
            if (r2 >= r3) goto L32
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2f
            r5 = r2
            goto L33
        L2f:
            int r2 = r2 + 1
            goto L22
        L32:
            r5 = r1
        L33:
            if (r5 == r1) goto L36
            r0 = 1
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u46.a.b(java.lang.Object[], java.lang.Object):boolean");
    }

    public static java.lang.String c(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return str;
        }
        v46.a aVar = new v46.a(obj, v46.e.f514792p);
        v46.e eVar = aVar.f514790c;
        boolean z17 = eVar.f514794d;
        java.lang.StringBuffer stringBuffer = aVar.f514788a;
        eVar.a(stringBuffer, null, obj, true);
        stringBuffer.append(eVar.f514801n);
        return aVar.m171106x9616526c();
    }
}
