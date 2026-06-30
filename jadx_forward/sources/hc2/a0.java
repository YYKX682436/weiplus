package hc2;

/* loaded from: classes2.dex */
public abstract class a0 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(r45.h21 r2, android.content.Context r3, int r4) {
        /*
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            if (r2 == 0) goto Lf
            r0 = 11
            java.lang.String r0 = r2.m75945x2fec8307(r0)
            if (r0 != 0) goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            int r1 = r0.length()
            if (r1 != 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L50
            long r0 = (long) r4
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(r0)
            if (r2 == 0) goto L3b
            r0 = 2
            java.lang.String r2 = r2.m75945x2fec8307(r0)
            if (r2 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L4f
        L3b:
            android.content.res.Resources r2 = r3.getResources()
            r3 = 2131761581(0x7f1019ad, float:1.9154215E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.String r3 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
        L4f:
            r0 = r2
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.a0.a(r45.h21, android.content.Context, int):java.lang.String");
    }

    public static final boolean b(r45.h21 h21Var) {
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(" ", h21Var != null ? h21Var.m75945x2fec8307(11) : null);
    }

    public static final boolean c(long j17) {
        return (j17 & 1) != 1;
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32();
        long j17 = it.f66939xc8a07680;
        am.cb cbVar = c5467x4cfefe32.f135805g;
        cbVar.f87876a = j17;
        cbVar.f87878c = it.m59216x8ed22866();
        c5467x4cfefe32.e();
    }

    public static final void e(java.util.LinkedList commentList, long j17, long j18, java.lang.String clientId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentList, "commentList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        int i17 = -1;
        if (j18 != 0) {
            java.util.Iterator it = commentList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76058xa6514d24() == j18) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
        } else {
            java.util.Iterator it6 = commentList.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it6.next()).m76057x8def5759(), clientId)) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
        }
        if (i17 >= 0) {
            commentList.remove(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityExt", "update expose commentList, remove at " + i17);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32();
            am.cb cbVar = c5467x4cfefe32.f135805g;
            cbVar.f87876a = j17;
            r45.yl2 yl2Var = new r45.yl2();
            yl2Var.set(0, commentList);
            cbVar.f87877b = yl2Var;
            c5467x4cfefe32.e();
        }
    }
}
