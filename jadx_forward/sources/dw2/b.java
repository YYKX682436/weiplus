package dw2;

/* loaded from: classes2.dex */
public final class b extends dw2.o {

    /* renamed from: v, reason: collision with root package name */
    public boolean f325644v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.ref.WeakReference f325645w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.ref.WeakReference f325646x;

    public b() {
        java.lang.String str = "FinderColumnFeedSelectorAdapter@" + hashCode();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f325669a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c7 A[LOOP:2: B:80:0x01d4->B:87:0x03c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e3 A[EDGE_INSN: B:88:0x03e3->B:89:0x03e3 BREAK  A[LOOP:2: B:80:0x01d4->B:87:0x03c7], SYNTHETIC] */
    @Override // dw2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.util.Set r39, boolean r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.b.e(java.util.Set, boolean, java.lang.String):void");
    }

    @Override // dw2.o
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 j(int i17, in5.s0 s0Var) {
        in5.s0 s0Var2;
        jz5.f0 f0Var;
        java.util.LinkedList<r45.mb4> m59135x7efe73ec;
        r45.mb4 mb4Var;
        if (s0Var == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325671c;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4 != null ? c1163xf1deaba4.q0(0, false) : null;
            s0Var2 = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        } else {
            s0Var2 = s0Var;
        }
        if (s0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "handleOnPageSelected return for holder:" + s0Var2 + " position:0");
            return null;
        }
        java.lang.Object obj = s0Var2.f374658i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "handleOnPageSelected return for item:" + j5Var + " position:0");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 o17 = o(j5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0(false, 0L, null, null, null, 0, 0, null, null, 511, null);
        p0Var.f183976f = j5Var.h();
        p0Var.f183977g = 0;
        p0Var.f183978h = s0Var2;
        p0Var.f183972b = j5Var.mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        p0Var.f183973c = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
        p0Var.f183975e = o17;
        p0Var.f183979i = j5Var;
        android.view.View p17 = s0Var2.p(com.p314xaae8f345.mm.R.id.f566402fs3);
        java.util.LinkedList<r45.mb4> m59135x7efe73ec2 = o17 != null ? o17.m59135x7efe73ec() : null;
        if (p17 == null || m59135x7efe73ec2 == null) {
            f0Var = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) p17;
            if (abstractC15229x2dc379.getFocusPosition() >= 0 && abstractC15229x2dc379.getFocusPosition() < m59135x7efe73ec2.size()) {
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.a0(m59135x7efe73ec2, abstractC15229x2dc379.getFocusPosition());
                java.lang.String m75945x2fec8307 = mb4Var2 != null ? mb4Var2.m75945x2fec8307(9) : null;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                p0Var.f183974d = m75945x2fec8307;
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            java.lang.String m75945x2fec83072 = (o17 == null || (m59135x7efe73ec = o17.m59135x7efe73ec()) == null || (mb4Var = (r45.mb4) kz5.n0.a0(m59135x7efe73ec, 0)) == null) ? null : mb4Var.m75945x2fec8307(9);
            p0Var.f183974d = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        }
        return p0Var;
    }
}
