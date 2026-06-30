package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class j7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 f197947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f197948b;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var, boolean z17) {
        this.f197947a = k7Var;
        this.f197948b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        r45.v71 v71Var;
        r45.j32 j32Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        boolean z18 = this.f197948b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var = this.f197947a;
        if (i17 != 0 || fVar.f152149b != 0 || (v71Var = (r45.v71) fVar.f152151d) == null || (j32Var = (r45.j32) v71Var.m75936x14adae67(4)) == null) {
            z17 = true;
        } else {
            java.util.LinkedList m75941xfb821914 = j32Var.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
                z17 = j32Var.m75939xb282bd08(1) == 1;
                if (z18) {
                    bm2.x5 x5Var = k7Var.Q;
                    if (x5Var != null) {
                        x5Var.f103965f = m75941xfb821914;
                        x5Var.m8146xced61ae5();
                    }
                } else {
                    bm2.x5 x5Var2 = k7Var.Q;
                    if (x5Var2 != null) {
                        java.util.LinkedList linkedList = x5Var2.f103965f;
                        int size = linkedList != null ? linkedList.size() : 0;
                        if (x5Var2.f103965f == null) {
                            x5Var2.f103965f = new java.util.LinkedList();
                        }
                        java.util.LinkedList linkedList2 = x5Var2.f103965f;
                        if (linkedList2 != null) {
                            linkedList2.addAll(m75941xfb821914);
                        }
                        x5Var2.m8153xd399a4d9(size, m75941xfb821914.size());
                    }
                }
            } else {
                z17 = true;
            }
            int m75939xb282bd08 = j32Var.m75939xb282bd08(2);
            android.widget.TextView textView = k7Var.L;
            if (textView != null) {
                textView.setText(((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) k7Var.f199716e).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyz, java.lang.Integer.valueOf(m75939xb282bd08)));
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = k7Var.S;
            if (c22851x22587864 != null) {
                c22851x22587864.e(true);
            }
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = k7Var.S;
            if (c22851x225878642 != null) {
                c22851x225878642.f();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k7Var.H, "#loadData fromHead=" + z18 + ", hasMore=" + z17);
        return jz5.f0.f384359a;
    }
}
