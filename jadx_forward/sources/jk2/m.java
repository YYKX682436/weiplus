package jk2;

/* loaded from: classes3.dex */
public final class m extends jk2.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f381608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jk2.a plugin, r45.zd2 guideData) {
        super(plugin, guideData);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideData, "guideData");
        this.f381608e = new java.util.ArrayList();
    }

    @Override // jk2.j
    public boolean a() {
        java.util.ArrayList arrayList = this.f381608e;
        r45.h32 h32Var = (r45.h32) kz5.n0.Z(arrayList);
        boolean m17 = m(h32Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkGuideShow: ret=");
        sb6.append(m17);
        sb6.append(", firstNoticeId=");
        sb6.append(h32Var != null ? h32Var.m75945x2fec8307(4) : null);
        sb6.append(", size=");
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381605d, sb6.toString());
        return m17;
    }

    @Override // jk2.j
    public java.lang.String e() {
        return "LiveNoticeGuide";
    }

    @Override // jk2.j
    public void i() {
        java.util.ArrayList arrayList = this.f381608e;
        r45.h32 h32Var = (r45.h32) kz5.n0.Z(arrayList);
        java.lang.String str = this.f381605d;
        if (h32Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onGuideShow: do not have notice, size=" + arrayList.size());
        } else {
            if (!m(h32Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onGuideShow: notice is not valid");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onGuideShow: noticeId=" + h32Var.m75945x2fec8307(4));
            new kk2.d(this.f381602a, h32Var).w();
        }
    }

    @Override // jk2.j
    public void j(r45.r71 r71Var) {
        java.util.LinkedList m75941xfb821914;
        java.lang.Integer num;
        java.lang.Object obj;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        if (r71Var == null || (m75941xfb821914 = r71Var.m75941xfb821914(15)) == null) {
            return;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.gd2) obj).m75939xb282bd08(0) == 30023) {
                    break;
                }
            }
        }
        r45.gd2 gd2Var = (r45.gd2) obj;
        if (gd2Var != null) {
            r45.j32 j32Var = new r45.j32();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = gd2Var.m75934xbce7f2f(1);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    j32Var.mo11468x92b714fd(g17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                java.util.ArrayList arrayList = this.f381608e;
                arrayList.clear();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveMsg: update notice list, size=");
                if (j32Var != null && (m75941xfb8219143 = j32Var.m75941xfb821914(0)) != null) {
                    num = java.lang.Integer.valueOf(m75941xfb8219143.size());
                }
                sb6.append(num);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381605d, sb6.toString());
                if (j32Var != null || (m75941xfb8219142 = j32Var.m75941xfb821914(0)) == null) {
                }
                arrayList.addAll(m75941xfb8219142);
                return;
            }
            j32Var = null;
            java.util.ArrayList arrayList2 = this.f381608e;
            arrayList2.clear();
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("onLiveMsg: update notice list, size=");
            if (j32Var != null) {
                num = java.lang.Integer.valueOf(m75941xfb8219143.size());
            }
            sb62.append(num);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381605d, sb62.toString());
            if (j32Var != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(r45.h32 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f381605d
            r1 = 0
            if (r10 != 0) goto Lb
            java.lang.String r10 = "isValidNormalNotice: notice is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)
            return r1
        Lb:
            com.tencent.mm.plugin.finder.feed.model.i1 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a
            jk2.a r3 = r9.f381602a
            df2.wv r3 = (df2.wv) r3
            gk2.e r3 = r3.b()
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r3.a(r4)
            mm2.c1 r3 = (mm2.c1) r3
            java.lang.String r3 = r3.f410385o
            r4 = 4
            java.lang.String r4 = r10.m75945x2fec8307(r4)
            if (r4 != 0) goto L28
            java.lang.String r4 = ""
        L28:
            r45.h32 r2 = r2.e(r3, r4)
            if (r2 != 0) goto L2f
            r2 = r10
        L2f:
            r3 = 1
            int r4 = r2.m75939xb282bd08(r3)
            r5 = 14
            r6 = 10
            if (r4 == 0) goto L55
            com.tencent.mm.protobuf.f r4 = r10.m75936x14adae67(r6)
            r45.q65 r4 = (r45.q65) r4
            if (r4 == 0) goto L4a
            boolean r4 = r4.m75933x41a8a7f2(r1)
            if (r4 != r3) goto L4a
            r4 = r3
            goto L4b
        L4a:
            r4 = r1
        L4b:
            if (r4 != 0) goto L55
            int r4 = r10.m75939xb282bd08(r5)
            if (r4 != 0) goto L55
            r4 = r3
            goto L56
        L55:
            r4 = r1
        L56:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "isValidNormalNotice: cacheStatus="
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = ", status="
            r7.append(r2)
            int r2 = r10.m75939xb282bd08(r3)
            r7.append(r2)
            java.lang.String r2 = ", is_pay="
            r7.append(r2)
            com.tencent.mm.protobuf.f r2 = r10.m75936x14adae67(r6)
            r45.q65 r2 = (r45.q65) r2
            if (r2 == 0) goto L82
            boolean r1 = r2.m75933x41a8a7f2(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L83
        L82:
            r1 = 0
        L83:
            r7.append(r1)
            java.lang.String r1 = ", type="
            r7.append(r1)
            int r10 = r10.m75939xb282bd08(r5)
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jk2.m.m(r45.h32):boolean");
    }
}
