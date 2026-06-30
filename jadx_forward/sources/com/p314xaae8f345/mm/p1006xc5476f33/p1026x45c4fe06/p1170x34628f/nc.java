package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class nc implements ni1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni1.f f168461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc f168462e;

    public nc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar, ni1.f fVar) {
        this.f168462e = wcVar;
        this.f168461d = fVar;
    }

    @Override // ni1.f
    public void P() {
        this.f168461d.P();
    }

    @Override // ni1.f
    public void V() {
        this.f168461d.V();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar = this.f168462e;
        if (android.text.TextUtils.isEmpty(wcVar.B) || !wcVar.f0().b0()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd f07 = wcVar.f0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("document.title=\"");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(wcVar.B + "(PAUSED)"));
        sb6.append("\"");
        f07.mo14660x738236e6(sb6.toString(), null);
    }
}
