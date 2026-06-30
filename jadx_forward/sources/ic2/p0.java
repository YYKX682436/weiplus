package ic2;

/* loaded from: classes8.dex */
public final class p0 implements ya2.x1 {
    public final void a(r45.hx0 hx0Var, boolean z17) {
        r45.vs2 vs2Var;
        java.util.ArrayList arrayList = null;
        if (z17) {
            r45.ts5 ts5Var = new r45.ts5();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hx0Var.m75934xbce7f2f(1);
            ts5Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processGetFinderPopup revoke ");
            java.util.LinkedList m75941xfb821914 = ts5Var.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r45.at5) it.next()).m75945x2fec8307(0));
                }
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncHandler", sb6.toString());
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            java.util.LinkedList m75941xfb8219142 = ts5Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getRevoked_finder_popup_info(...)");
            nk6.J("Finder.SyncHandler", m75941xfb8219142);
            return;
        }
        r45.dp2 dp2Var = new r45.dp2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = hx0Var.m75934xbce7f2f(1);
        dp2Var.mo11468x92b714fd(m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("processGetFinderPopup show popup ");
        java.util.LinkedList m75941xfb8219143 = dp2Var.m75941xfb821914(0);
        if (m75941xfb8219143 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
            java.util.Iterator it6 = m75941xfb8219143.iterator();
            while (it6.hasNext()) {
                r45.gz2 gz2Var = (r45.gz2) ((r45.gp2) it6.next()).m75936x14adae67(0);
                arrayList2.add(hc2.u0.e(gz2Var != null ? (r45.vs2) gz2Var.m75936x14adae67(0) : null));
            }
            arrayList = arrayList2;
        }
        sb7.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncHandler", sb7.toString());
        java.util.LinkedList m75941xfb8219144 = dp2Var.m75941xfb821914(0);
        if (m75941xfb8219144 != null) {
            java.util.Iterator it7 = m75941xfb8219144.iterator();
            while (it7.hasNext()) {
                r45.gz2 gz2Var2 = (r45.gz2) ((r45.gp2) it7.next()).m75936x14adae67(0);
                if (gz2Var2 != null && (vs2Var = (r45.vs2) gz2Var2.m75936x14adae67(0)) != null) {
                    zy2.fa.D(((c61.l7) i95.n0.c(c61.l7.class)).nk(), vs2Var, "processGetFinderPopup", null, false, null, 28, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
    
        if (r11 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v142, types: [com.tencent.mm.plugin.finder.storage.r, l75.n0] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    @Override // ya2.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j7(r45.hx0 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.p0.j7(r45.hx0, int, int):void");
    }
}
