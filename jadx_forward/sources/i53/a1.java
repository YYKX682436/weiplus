package i53;

/* loaded from: classes3.dex */
public class a1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f370028d = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 3);

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) view.getLayoutParams();
        int i17 = c1161x57298f5d.f93394w;
        int u07 = c1163xf1deaba4.u0(view);
        int i18 = layoutParams.f93398h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLocalMediaView", "getItemOffsets, spanSize = %d, spanCount = %d, index = %d", java.lang.Integer.valueOf(layoutParams.f93399i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = this.f370028d;
        if (u07 < i17) {
            if (i18 == 0) {
                rect.set(0, 0, 0, 0);
                return;
            } else {
                rect.set(i19, 0, 0, 0);
                return;
            }
        }
        if (i18 == 0) {
            rect.set(0, i19, 0, 0);
        } else {
            rect.set(i19, i19, 0, 0);
        }
    }
}
