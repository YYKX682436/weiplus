package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class g4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f206092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 f206094c;

    public g4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var) {
        this.f206092a = u3Var;
        this.f206093b = s4Var;
        this.f206094c = m3Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.j32 j32Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f206092a.dismiss();
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206093b;
            android.content.Context context = s4Var.f206281b;
            db5.t7.h(context, ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.do6));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) s4Var.f206287h.get(s4Var.f206280a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.m3 m3Var = this.f206094c;
            if (l2Var != null && (j32Var = l2Var.f205456l) != null) {
                java.util.LinkedList m75941xfb821914 = j32Var.m75941xfb821914(0);
                if (m75941xfb821914 != null) {
                    kz5.h0.B(m75941xfb821914, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f4(m3Var));
                }
                j32Var.set(2, java.lang.Integer.valueOf(j32Var.m75941xfb821914(0).size()));
            }
            ((java.util.ArrayList) s4Var.f206293n).remove(m3Var);
            s4Var.e();
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec8307 = m3Var.f206157a.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            ((b92.d1) zbVar).pj(m75945x2fec8307);
        }
        return jz5.f0.f384359a;
    }
}
