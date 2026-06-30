package c43;

/* loaded from: classes8.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f119953a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f119954b = new java.util.HashMap();

    public static final long a(java.lang.String chatroomName, java.lang.String toUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        java.lang.Long l17 = (java.lang.Long) f119954b.get(new jz5.l(chatroomName, toUserName));
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "chatroomName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "toUserName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            jz5.l r0 = new jz5.l
            r0.<init>(r6, r7)
            long r6 = java.lang.System.currentTimeMillis()
            java.util.HashMap r1 = c43.e1.f119953a
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 1
            if (r0 == 0) goto L49
            long r2 = r0.longValue()
            long r6 = r6 - r2
            m53.t r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.b()
            if (r0 == 0) goto L3d
            m53.t5 r0 = r0.f405599g
            if (r0 == 0) goto L35
            int r0 = r0.f405611e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 == 0) goto L3d
            int r0 = r0.intValue()
            goto L3f
        L3d:
            r0 = 1800(0x708, float:2.522E-42)
        L3f:
            long r2 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L48
            goto L49
        L48:
            r1 = 0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.e1.b(java.lang.String, java.lang.String):boolean");
    }
}
