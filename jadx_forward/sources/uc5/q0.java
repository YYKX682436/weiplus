package uc5;

/* loaded from: classes10.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final uc5.q0 f508076a = new uc5.q0();

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static uc5.p0 a(uc5.q0 r1, long r2, long r4, int r6, java.lang.Object r7) {
        /*
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L8
            long r4 = c01.id.c()
        L8:
            r1.getClass()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r4)
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            int r5 = r1.getFirstDayOfWeek()
            r4.setFirstDayOfWeek(r5)
            int r5 = r1.getMinimalDaysInFirstWeek()
            r4.setMinimalDaysInFirstWeek(r5)
            r4.setTimeInMillis(r2)
            r2 = 3
            int r3 = r4.get(r2)
            int r2 = r1.get(r2)
            r5 = 1
            r6 = 0
            if (r3 != r2) goto L58
            boolean r2 = r4 instanceof java.util.GregorianCalendar
            if (r2 == 0) goto L40
            r2 = r4
            java.util.GregorianCalendar r2 = (java.util.GregorianCalendar) r2
            int r2 = r2.getWeekYear()
            goto L44
        L40:
            int r2 = r4.get(r5)
        L44:
            boolean r3 = r1 instanceof java.util.GregorianCalendar
            if (r3 == 0) goto L50
            r3 = r1
            java.util.GregorianCalendar r3 = (java.util.GregorianCalendar) r3
            int r3 = r3.getWeekYear()
            goto L54
        L50:
            int r3 = r1.get(r5)
        L54:
            if (r2 != r3) goto L58
            r2 = r5
            goto L59
        L58:
            r2 = r6
        L59:
            java.lang.String r3 = "getString(...)"
            if (r2 == 0) goto L72
            uc5.p0 r1 = new uc5.p0
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r4 = 2131781850(0x7f1068da, float:1.9195325E38)
            java.lang.String r2 = r2.getString(r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r3 = "thisWeek"
            r1.<init>(r3, r2)
            goto Le3
        L72:
            int r2 = r4.get(r5)
            int r0 = r1.get(r5)
            if (r2 != r0) goto L87
            int r2 = r4.get(r7)
            int r1 = r1.get(r7)
            if (r2 != r1) goto L87
            r6 = r5
        L87:
            if (r6 == 0) goto L9e
            uc5.p0 r1 = new uc5.p0
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r4 = 2131781849(0x7f1068d9, float:1.9195323E38)
            java.lang.String r2 = r2.getString(r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r3 = "thisMonth"
            r1.<init>(r3, r2)
            goto Le3
        L9e:
            int r1 = r4.get(r5)
            int r2 = r4.get(r7)
            int r2 = r2 + r5
            java.lang.String r4 = java.lang.String.valueOf(r2)
            r5 = 48
            java.lang.String r4 = r26.n0.R(r4, r7, r5)
            uc5.p0 r5 = new uc5.p0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r7 = 45
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            r2 = 2131781851(0x7f1068db, float:1.9195327E38)
            java.lang.String r1 = r6.getString(r2, r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            r5.<init>(r4, r1)
            r1 = r5
        Le3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uc5.q0.a(uc5.q0, long, long, int, java.lang.Object):uc5.p0");
    }
}
