package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a0 f196970a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a0();

    public java.lang.String a(java.util.List list) {
        java.lang.String str = "<this>";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" [ ");
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.r22 r22Var = (r45.r22) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" teamIndex: ");
            sb7.append(i18);
            char c17 = ' ';
            sb7.append(' ');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r22Var, str);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append("result: " + r22Var.m75939xb282bd08(2) + ' ');
            sb8.append("count: " + r22Var.m75942xfb822ef2(3) + ' ');
            sb8.append("reward_wecoin: " + r22Var.m75942xfb822ef2(1) + ' ');
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("teamsMember: ");
            java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(" [ ");
            int i27 = i17;
            for (java.lang.Object obj2 : m75941xfb821914) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.wk6 wk6Var = (r45.wk6) obj2;
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(" index: ");
                sb11.append(i27);
                sb11.append(c17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wk6Var, str);
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder(" finder_username: ");
                java.lang.String str2 = str;
                sb13.append(wk6Var.m75945x2fec8307(0));
                sb13.append(", ");
                sb12.append(sb13.toString());
                sb12.append(" sdk_user_id: " + wk6Var.m75945x2fec8307(1));
                sb12.append(" seat_id: " + wk6Var.m75939xb282bd08(2));
                java.lang.String sb14 = sb12.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb14, "toString(...)");
                sb11.append(sb14);
                sb11.append(" , ");
                sb10.append(sb11.toString());
                i27 = i28;
                str = str2;
                c17 = ' ';
            }
            java.lang.String str3 = str;
            sb10.append(" ] ");
            java.lang.String sb15 = sb10.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb15, "toString(...)");
            sb9.append(sb15);
            sb9.append(' ');
            sb8.append(sb9.toString());
            java.lang.String sb16 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb16, "toString(...)");
            sb7.append(sb16);
            sb7.append(" ; ");
            sb6.append(sb7.toString());
            i18 = i19;
            str = str3;
            i17 = 0;
        }
        sb6.append(" ] ");
        java.lang.String sb17 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb17, "toString(...)");
        return sb17;
    }
}
