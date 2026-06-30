package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if ((r7.f455427n == 6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.a03 a(r45.f03 r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L10
            int r3 = r7.f455427n
            r4 = 6
            if (r3 != r4) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r3 == 0) goto L10
            goto L11
        L10:
            r7 = r2
        L11:
            if (r7 == 0) goto L1b
            com.tencent.mm.protobuf.g r3 = r7.f455428o
            if (r3 == 0) goto L1b
            byte[] r2 = r3.g()
        L1b:
            r45.a03 r3 = new r45.a03
            r3.<init>()
            if (r2 == 0) goto L36
            kotlin.Result$Companion r4 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L2c
            com.tencent.mm.protobuf.f r4 = r3.mo11468x92b714fd(r2)     // Catch: java.lang.Throwable -> L2c
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r4)     // Catch: java.lang.Throwable -> L2c
            goto L36
        L2c:
            r4 = move-exception
            kotlin.Result$Companion r5 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r4 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r4)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r4)
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[parseFinderTipsFinderEntranceExtInfo] showInfo="
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = ", extInfoBytes.isNullOrEmpty="
            r4.append(r7)
            if (r2 == 0) goto L4c
            int r7 = r2.length
            if (r7 != 0) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            r4.append(r0)
            java.lang.String r7 = ", extInfo="
            r4.append(r7)
            r4.append(r3)
            java.lang.String r7 = r4.toString()
            java.lang.String r0 = "Finder.MsgRedDot#"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x.a(r45.f03):r45.a03");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w b(java.util.List showInfoList, java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        int i17;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showInfoList, "showInfoList");
        java.util.Iterator it = showInfoList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            r45.f03 f03Var = (r45.f03) obj2;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var.f455425i, "TLPersonalCenter") && f03Var.f455420d == 2) {
                break;
            }
        }
        r45.f03 f03Var2 = (r45.f03) obj2;
        java.util.LinkedList m75941xfb821914 = a(f03Var2).m75941xfb821914(0);
        if (m75941xfb821914 != null) {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                i18 += ((r45.e03) it6.next()).m75939xb282bd08(1);
            }
            i17 = i18;
        } else {
            i17 = 0;
        }
        java.util.Iterator it7 = showInfoList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it7.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj3).f455425i, "finder_wx_private_msg_entrance")) {
                break;
            }
        }
        r45.f03 f03Var3 = (r45.f03) obj3;
        int i19 = f03Var3 != null ? f03Var3.f455421e : 0;
        java.util.Iterator it8 = showInfoList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it8.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj4).f455425i, "finder_private_msg_entrance")) {
                break;
            }
        }
        r45.f03 f03Var4 = (r45.f03) obj4;
        int i27 = f03Var4 != null ? f03Var4.f455421e : 0;
        java.util.Iterator it9 = showInfoList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it9.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj5).f455425i, "WxMessageEntry")) {
                break;
            }
        }
        r45.f03 f03Var5 = (r45.f03) obj5;
        int i28 = f03Var5 != null ? f03Var5.f455421e : 0;
        java.util.Iterator it10 = showInfoList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it10.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj6).f455425i, "AuthorProfileNotify")) {
                break;
            }
        }
        r45.f03 f03Var6 = (r45.f03) obj6;
        int i29 = f03Var6 != null ? f03Var6.f455421e : 0;
        java.util.Iterator it11 = showInfoList.iterator();
        while (true) {
            if (!it11.hasNext()) {
                break;
            }
            java.lang.Object next = it11.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) next).f455425i, "AuthorProfileMemberNotify")) {
                obj = next;
                break;
            }
        }
        r45.f03 f03Var7 = (r45.f03) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w(i19, i27, i28, i29, f03Var7 != null ? f03Var7.f455421e : 0, i17, f03Var2 != null ? f03Var2.f455421e : 0, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MsgRedDot#", "[recalculatePersonalCenterCount] count cache=" + wVar + ',');
        return wVar;
    }
}
