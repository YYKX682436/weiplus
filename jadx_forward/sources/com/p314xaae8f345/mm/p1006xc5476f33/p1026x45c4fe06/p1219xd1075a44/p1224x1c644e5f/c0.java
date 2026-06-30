package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class c0 extends mi1.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f f172692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 f172693b;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f abstractC12505x244799f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var) {
        this.f172692a = abstractC12505x244799f;
        this.f172693b = l0Var;
    }

    @Override // mi1.i0
    public void a(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f abstractC12505x244799f = this.f172692a;
        int color = abstractC12505x244799f.getContext().getResources().getColor(abstractC12505x244799f.h(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mi1.v vVar = this.f172693b.f172728a.f156354z;
        int argb = android.graphics.Color.argb((int) (f17 * 255), android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color));
        if (vVar.f408236b != null) {
            vVar.c().setBackgroundColor(argb);
        }
    }
}
