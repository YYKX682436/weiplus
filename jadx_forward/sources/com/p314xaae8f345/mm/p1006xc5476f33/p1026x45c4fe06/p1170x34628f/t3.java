package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class t3 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168644d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var) {
        this.f168644d = i3Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        oi1.j jVar = (oi1.j) obj;
        oi1.j jVar2 = (oi1.j) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168644d;
        oi1.l w17 = i3Var.m52169xfdaa7672().w(jVar.a());
        oi1.l w18 = i3Var.m52169xfdaa7672().w(jVar2.a());
        if (w17 == null) {
            return 1;
        }
        if (w18 == null) {
            return -1;
        }
        return jVar2.mo151428xba8879a4().f427135a - jVar.mo151428xba8879a4().f427135a;
    }
}
