package pp3;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.l f439020d;

    public k(pp3.l lVar) {
        this.f439020d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pp3.l lVar = this.f439020d;
        if (lVar.f439022e.isShowing()) {
            lVar.f439021d.getLocationInWindow(lVar.f439022e.f234438j);
            com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 c16785xfbc81739 = lVar.f439022e;
            int[] iArr = c16785xfbc81739.f234438j;
            c16785xfbc81739.f234434f = iArr[0];
            c16785xfbc81739.f234435g = (iArr[1] - c16785xfbc81739.f234429a.getMeasuredHeight()) + com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 c16785xfbc817392 = lVar.f439022e;
            int i17 = c16785xfbc817392.f234435g - c16785xfbc817392.f234436h;
            if (java.lang.Math.abs(i17) > 100) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatPopupWindow", "update location  yDiff:%s", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 c16785xfbc817393 = lVar.f439022e;
                int i18 = c16785xfbc817393.f234434f;
                c16785xfbc817393.update(i18 >= 100 ? i18 : 0, c16785xfbc817393.f234435g, -1, -1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 c16785xfbc817394 = lVar.f439022e;
            c16785xfbc817394.f234436h = c16785xfbc817394.f234435g;
        }
    }
}
