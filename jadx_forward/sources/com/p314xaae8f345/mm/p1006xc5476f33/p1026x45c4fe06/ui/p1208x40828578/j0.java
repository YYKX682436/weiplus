package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class j0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171631d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        this.f171631d = c12723x5ab2de90;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        boolean equals = "single".equals(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171631d;
        if (equals) {
            int i17 = w0Var.f398507b;
            if ((5 == i17 && c12723x5ab2de90.f171535m) || 2 == i17 || 3 == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90.p0(c12723x5ab2de90, false, -1L, true);
                return;
            }
            return;
        }
        if ("batch".equals(str) && 3 == w0Var.f398507b) {
            java.lang.Object obj = w0Var.f398509d;
            if ((obj instanceof java.lang.Long) && ((java.lang.Long) obj).longValue() == c12723x5ab2de90.f171541r.get()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90.p0(c12723x5ab2de90, false, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, true);
        }
    }
}
