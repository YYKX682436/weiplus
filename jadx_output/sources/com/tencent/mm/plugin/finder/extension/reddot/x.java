package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if ((r7.f373894n == 6) != false) goto L11;
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
            int r3 = r7.f373894n
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
            com.tencent.mm.protobuf.g r3 = r7.f373895o
            if (r3 == 0) goto L1b
            byte[] r2 = r3.g()
        L1b:
            r45.a03 r3 = new r45.a03
            r3.<init>()
            if (r2 == 0) goto L36
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2c
            com.tencent.mm.protobuf.f r4 = r3.parseFrom(r2)     // Catch: java.lang.Throwable -> L2c
            kotlin.Result.m521constructorimpl(r4)     // Catch: java.lang.Throwable -> L2c
            goto L36
        L2c:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            kotlin.Result.m521constructorimpl(r4)
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
            com.tencent.mars.xlog.Log.i(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x.a(r45.f03):r45.a03");
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.w b(java.util.List showInfoList, java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        int i17;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        kotlin.jvm.internal.o.g(showInfoList, "showInfoList");
        java.util.Iterator it = showInfoList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            r45.f03 f03Var = (r45.f03) obj2;
            if (kotlin.jvm.internal.o.b(f03Var.f373892i, "TLPersonalCenter") && f03Var.f373887d == 2) {
                break;
            }
        }
        r45.f03 f03Var2 = (r45.f03) obj2;
        java.util.LinkedList list = a(f03Var2).getList(0);
        if (list != null) {
            java.util.Iterator it6 = list.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                i18 += ((r45.e03) it6.next()).getInteger(1);
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
            if (kotlin.jvm.internal.o.b(((r45.f03) obj3).f373892i, "finder_wx_private_msg_entrance")) {
                break;
            }
        }
        r45.f03 f03Var3 = (r45.f03) obj3;
        int i19 = f03Var3 != null ? f03Var3.f373888e : 0;
        java.util.Iterator it8 = showInfoList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it8.next();
            if (kotlin.jvm.internal.o.b(((r45.f03) obj4).f373892i, "finder_private_msg_entrance")) {
                break;
            }
        }
        r45.f03 f03Var4 = (r45.f03) obj4;
        int i27 = f03Var4 != null ? f03Var4.f373888e : 0;
        java.util.Iterator it9 = showInfoList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it9.next();
            if (kotlin.jvm.internal.o.b(((r45.f03) obj5).f373892i, "WxMessageEntry")) {
                break;
            }
        }
        r45.f03 f03Var5 = (r45.f03) obj5;
        int i28 = f03Var5 != null ? f03Var5.f373888e : 0;
        java.util.Iterator it10 = showInfoList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it10.next();
            if (kotlin.jvm.internal.o.b(((r45.f03) obj6).f373892i, "AuthorProfileNotify")) {
                break;
            }
        }
        r45.f03 f03Var6 = (r45.f03) obj6;
        int i29 = f03Var6 != null ? f03Var6.f373888e : 0;
        java.util.Iterator it11 = showInfoList.iterator();
        while (true) {
            if (!it11.hasNext()) {
                break;
            }
            java.lang.Object next = it11.next();
            if (kotlin.jvm.internal.o.b(((r45.f03) next).f373892i, "AuthorProfileMemberNotify")) {
                obj = next;
                break;
            }
        }
        r45.f03 f03Var7 = (r45.f03) obj;
        com.tencent.mm.plugin.finder.extension.reddot.w wVar = new com.tencent.mm.plugin.finder.extension.reddot.w(i19, i27, i28, i29, f03Var7 != null ? f03Var7.f373888e : 0, i17, f03Var2 != null ? f03Var2.f373888e : 0, str);
        com.tencent.mars.xlog.Log.i("Finder.MsgRedDot#", "[recalculatePersonalCenterCount] count cache=" + wVar + ',');
        return wVar;
    }
}
