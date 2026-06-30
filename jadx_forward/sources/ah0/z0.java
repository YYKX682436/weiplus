package ah0;

/* loaded from: classes7.dex */
public class z0 extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.G == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LugWvFloatBallInfoClickedListener", "handleBallInfoClicked, openWebPage ballInfo:%s", c12886x91aa2b6d);
        java.lang.String str = c12886x91aa2b6d.f174582g;
        java.lang.String string = c12886x91aa2b6d.G.getString("rawUrl");
        int i17 = c12886x91aa2b6d.G.getInt("minimize_secene", 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(c12886x91aa2b6d.G);
        intent.putExtra("rawUrl", string);
        intent.putExtra("minimize_secene", i17);
        intent.putExtra("float_ball_key", str);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c12886x91aa2b6d.f174596x);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
