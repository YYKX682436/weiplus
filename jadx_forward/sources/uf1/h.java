package uf1;

/* loaded from: classes7.dex */
public class h implements tb1.y {
    public int[] a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (lVar == null) {
            return new int[2];
        }
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar);
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        android.graphics.Point point = new android.graphics.Point();
        if (mo50352x76847179 != null) {
            ((android.view.WindowManager) mo50352x76847179.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        }
        return new int[]{point.x, point.y};
    }
}
