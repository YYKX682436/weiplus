package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class t5 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f187406e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb.P, "FinderRedDotFreqControl")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f187407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb.P, "FinderRedDotFreqControl", dm.z4.f322983w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb.P;
        this.f187407d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: delete */
    public boolean mo49766xb06685ab(l75.f0 f0Var, boolean z17, java.lang.String[] keys) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        if (pbVar == null) {
            return false;
        }
        p75.n0 n0Var = dm.z4.f322981u;
        n0Var.getClass();
        p75.d dVar = dm.z4.f322982v;
        java.lang.String field_freqControlId = pbVar.f69361xe125913b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_freqControlId, "field_freqControlId");
        p75.m0 j17 = dVar.j(field_freqControlId);
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) j17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 k0Var = this.f187407d;
        int mo70514xb06685ab = k0Var != null ? k0Var.mo70514xb06685ab(table, b17, e17) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqCtrlInfoStorage", "[delete] ret=" + mo70514xb06685ab + " rowId=" + pbVar.f72763xa3c65b86 + " id=" + pbVar.f69361xe125913b + " path=" + pbVar.f69355xd7479b7e + " isNotify=" + z17);
        return mo70514xb06685ab >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo55864x413cb2b4(l75.f0 f0Var, boolean z17) {
        boolean h17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb pbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.pb) f0Var;
        int i17 = 0;
        boolean z18 = false;
        if (pbVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqCtrlInfoStorage", "[replace] failure!");
        } else {
            java.lang.String str = pbVar.f69361xe125913b;
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotFreqCtrlInfoStorage", "id is null! " + pbVar);
                h17 = false;
            } else {
                p75.n0 n0Var = dm.z4.f322981u;
                p75.d FREQCONTROLID = dm.z4.f322982v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FREQCONTROLID, "FREQCONTROLID");
                p75.i0 h18 = n0Var.h(FREQCONTROLID);
                java.lang.String field_freqControlId = pbVar.f69361xe125913b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_freqControlId, "field_freqControlId");
                h18.f434190d = FREQCONTROLID.j(field_freqControlId);
                h17 = h18.a().h(this.f187407d);
            }
            try {
                i17 = h17 ? super.mo9952xce0038c9(pbVar, new java.lang.String[0]) : super.mo880xb970c2b9(pbVar);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.RedDotFreqCtrlInfoStorage", e17, "isExist=" + h17 + " id=" + pbVar.f69361xe125913b + " path=" + pbVar.f69355xd7479b7e, new java.lang.Object[i17]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotFreqCtrlInfoStorage", "[replace] ret=" + i17 + " isExist=" + h17 + " id=" + pbVar.f69361xe125913b + " path=" + pbVar.f69355xd7479b7e);
            z18 = i17;
        }
        return z18;
    }
}
