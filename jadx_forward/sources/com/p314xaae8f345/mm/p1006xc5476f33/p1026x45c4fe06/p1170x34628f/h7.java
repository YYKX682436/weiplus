package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class h7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e7 f168204a;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e7 e7Var) {
        this.f168204a = e7Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la
    public void a(int i17, int i18, boolean z17, boolean z18) {
        java.util.Iterator it = new java.util.HashSet(this.f168204a.K).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la laVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la) it.next();
            if (laVar != null) {
                laVar.a(i17, i18, z17, z18);
            }
        }
    }
}
