package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class xf extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f294086d;

    public xf(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f294086d = c21427xe5bb8a3;
    }

    @Override // yb5.n
    public void a() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f294086d;
        if (!c21427xe5bb8a3.f278557k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "start chatting but last chatting does't be close!");
            c21427xe5bb8a3.f(false);
        }
        if (c21427xe5bb8a3.f278547a.isFinishing() || c21427xe5bb8a3.f278547a.mo78538xecd98af8() || !c21427xe5bb8a3.f278557k || !gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mStartChattingRunnable] pass! isPause:%s mChattingClosed:%s, account:%s", java.lang.Boolean.valueOf(c21427xe5bb8a3.f278547a.mo78538xecd98af8()), java.lang.Boolean.valueOf(c21427xe5bb8a3.f278557k), java.lang.Boolean.valueOf(gm0.j1.b().m()));
            c21427xe5bb8a3.f278565s = true;
            return;
        }
        c21427xe5bb8a3.f278557k = false;
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", c21427xe5bb8a3.f278554h);
        android.os.Bundle bundle = c21427xe5bb8a3.f278555i;
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3.e(c21427xe5bb8a3, putExtra, false);
        if (c21427xe5bb8a3.f278552f == null) {
            c21427xe5bb8a3.f278552f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba) c21427xe5bb8a3.f278560n.m7474xfb86a31b().findViewById(com.p314xaae8f345.mm.R.id.bkb);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba c21527x310c6aba = c21427xe5bb8a3.f278552f;
        if (c21527x310c6aba != null) {
            c21527x310c6aba.m79277x8880a9f7(c21427xe5bb8a3.f278567u);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = c21427xe5bb8a3.f278549c;
        objArr[0] = java.lang.Boolean.valueOf(c22559x35245a10 == null ? false : c22559x35245a10.isShown());
        objArr[1] = java.lang.Boolean.valueOf(c21427xe5bb8a3.f278552f == null);
        objArr[2] = java.lang.Integer.valueOf(c21427xe5bb8a3.f278549c.getVisibility());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest::startChatting, ishow:%b, cfv is null:%s, visibility:%s", objArr);
        c21427xe5bb8a3.f278549c.setVisibility(0);
        c21427xe5bb8a3.f278549c.setTranslationX((c21427xe5bb8a3.f278547a.getWindow().getDecorView().getWidth() == 0 ? c21427xe5bb8a3.f278547a.getResources().getDisplayMetrics().widthPixels : c21427xe5bb8a3.f278547a.getWindow().getDecorView().getWidth()) - 0.1f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        c21427xe5bb8a3.getClass();
        ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 3);
        if (c21427xe5bb8a3.n()) {
            al5.a3.d(c21427xe5bb8a3.f278547a);
        }
    }

    /* renamed from: toString */
    public java.lang.String m82209x9616526c() {
        return super.toString() + "|startChattingRunnable";
    }
}
