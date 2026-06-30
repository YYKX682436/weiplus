package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class w4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x4 f224592a;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x4 x4Var) {
        this.f224592a = x4Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14 = this.f224592a.f224608d;
        if (!activityC16146xeed29e14.G) {
            i17++;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14.T6(activityC16146xeed29e14);
                return;
            } else {
                if (i17 != 2) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14.U6(activityC16146xeed29e14);
                return;
            }
        }
        activityC16146xeed29e14.getClass();
        r45.zr3 e17 = t83.f.e();
        if (e17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f473863t)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", e17.f473863t);
        intent.putExtra("showShare", false);
        j45.l.j(activityC16146xeed29e14, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
