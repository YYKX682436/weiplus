package in4;

/* loaded from: classes8.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.c0 f374481d;

    public b0(in4.c0 c0Var) {
        this.f374481d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        in4.c0 c0Var = this.f374481d;
        if (c0Var.f374485e.isShowing()) {
            c0Var.f374484d.getLocationInWindow(c0Var.f374485e.f256811j);
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d9084 = c0Var.f374485e;
            int[] iArr = c18766xb71d9084.f256811j;
            c18766xb71d9084.f256807f = iArr[0];
            c18766xb71d9084.f256808g = (iArr[1] - c18766xb71d9084.f256802a.getMeasuredHeight()) + com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d90842 = c0Var.f374485e;
            int i17 = c18766xb71d90842.f256808g - c18766xb71d90842.f256809h;
            if (java.lang.Math.abs(i17) > 100) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatPopupWindow", "update location  yDiff:%s", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d90843 = c0Var.f374485e;
                int i18 = c18766xb71d90843.f256807f;
                c18766xb71d90843.update(i18 >= 100 ? i18 : 0, c18766xb71d90843.f256808g, -1, -1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d90844 = c0Var.f374485e;
            c18766xb71d90844.f256809h = c18766xb71d90844.f256808g;
        }
    }
}
