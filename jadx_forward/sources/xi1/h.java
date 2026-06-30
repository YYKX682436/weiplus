package xi1;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 implements xi1.i {
    @Override // xi1.i
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 c12547xf52fd300, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f2.f156343s;
        if ((qVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c) && !c11510xdd90c2f2.Q0()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c) qVar).m53351x93e6764e(c12547xf52fd300);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar2 = c11510xdd90c2f2.f156343s;
        qVar2.setLayoutParams(c12547xf52fd300);
        qVar2.setScaleX(c12547xf52fd300.f169103a);
        qVar2.setScaleY(c12547xf52fd300.f169103a);
    }

    @Override // xi1.i
    public android.view.ViewGroup.LayoutParams b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f2.f156343s;
        return (!(qVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c) || c11510xdd90c2f2.Q0()) ? c11510xdd90c2f2.f156343s.getLayoutParams() : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c) qVar).m53350x5d0fdcda();
    }

    public void d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        boolean z17 = i17 == 0 || (i17 >> 24) != 0;
        android.app.Activity w17 = w();
        if (w17 == null) {
            return;
        }
        w17.getWindow().setBackgroundDrawable(z17 ? new android.graphics.drawable.ColorDrawable(0) : new android.graphics.drawable.ColorDrawable(i17));
    }
}
