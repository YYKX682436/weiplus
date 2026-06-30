package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes4.dex */
public final class c0 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.hs0 a(r45.hs0 r10, r45.hs0 r11) {
        /*
            r0 = 0
            r1 = 1
            if (r11 != 0) goto L5
            goto L11
        L5:
            java.util.LinkedList r2 = r11.f457948e
            if (r2 == 0) goto Le
            int r2 = r2.size()
            goto Lf
        Le:
            r2 = r0
        Lf:
            if (r2 != 0) goto L13
        L11:
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 == 0) goto L17
            return r11
        L17:
            if (r10 != 0) goto L1a
            goto L26
        L1a:
            java.util.LinkedList r2 = r10.f457948e
            if (r2 == 0) goto L23
            int r2 = r2.size()
            goto L24
        L23:
            r2 = r0
        L24:
            if (r2 != 0) goto L28
        L26:
            r2 = r1
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 == 0) goto L2c
            return r11
        L2c:
            if (r11 == 0) goto L8d
            if (r10 == 0) goto L8d
            java.util.LinkedList r11 = r11.f457948e
            java.util.Iterator r11 = r11.iterator()
        L36:
            boolean r2 = r11.hasNext()
            java.util.LinkedList r3 = r10.f457948e
            if (r2 == 0) goto L87
            java.lang.Object r2 = r11.next()
            r45.gs0 r2 = (r45.gs0) r2
            long r4 = r2.f457042e
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4d
            goto L36
        L4d:
            java.lang.String r4 = "List"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.util.Iterator r4 = r3.iterator()
        L56:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r4.next()
            r6 = r5
            r45.gs0 r6 = (r45.gs0) r6
            int r6 = r6.f457041d
            int r7 = r2.f457041d
            if (r6 != r7) goto L6b
            r6 = r1
            goto L6c
        L6b:
            r6 = r0
        L6c:
            if (r6 == 0) goto L56
            goto L70
        L6f:
            r5 = 0
        L70:
            r45.gs0 r5 = (r45.gs0) r5
            if (r5 != 0) goto L78
            r3.add(r2)
            goto L36
        L78:
            long r6 = r2.f457042e
            long r8 = r5.f457042e
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L36
            r3.remove(r5)
            r3.add(r2)
            goto L36
        L87:
            int r11 = r3.size()
            r10.f457947d = r11
        L8d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.c0.a(r45.hs0, r45.hs0):r45.hs0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.hs0 hs0Var, r45.hs0 hs0Var2, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.u setFieldCallback) {
        r45.gs0 gs0Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setFieldCallback, "setFieldCallback");
        if (!z17) {
            setFieldCallback.a(z3Var);
            return;
        }
        r45.gs0 gs0Var2 = null;
        if (hs0Var2 == null || (linkedList = hs0Var2.f457948e) == null) {
            gs0Var = null;
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.util.LinkedList VersionScopeFields = ((r45.gs0) obj).f457044g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(VersionScopeFields, "VersionScopeFields");
                if (!VersionScopeFields.isEmpty()) {
                    java.util.Iterator it6 = VersionScopeFields.iterator();
                    while (it6.hasNext()) {
                        if (((r45.eu5) it6.next()).f455266d == i17) {
                            z18 = true;
                            break;
                        }
                    }
                }
                z18 = false;
                if (z18) {
                    break;
                }
            }
            gs0Var = (r45.gs0) obj;
        }
        if (gs0Var == null) {
            setFieldCallback.a(z3Var);
            return;
        }
        if (hs0Var != null) {
            int i18 = gs0Var.f457041d;
            java.util.LinkedList linkedList2 = hs0Var.f457948e;
            if (linkedList2 != null) {
                java.util.Iterator it7 = linkedList2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it7.next();
                    if (((r45.gs0) next).f457041d == i18) {
                        gs0Var2 = next;
                        break;
                    }
                }
                gs0Var2 = gs0Var2;
            }
        }
        if (gs0Var2 == null) {
            setFieldCallback.a(z3Var);
        } else if (gs0Var.f457042e > gs0Var2.f457042e) {
            setFieldCallback.a(z3Var);
        }
    }
}
