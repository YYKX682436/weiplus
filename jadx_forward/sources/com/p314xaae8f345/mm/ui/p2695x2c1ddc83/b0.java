package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class b0 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f288985d;

    public b0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        this.f288985d = activityC22359x66709fa8;
    }

    @Override // yb5.n
    public void a() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a102;
        boolean isShown;
        int i17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba c21527x310c6aba;
        db5.x8 x8Var;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a103;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a104;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea2;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f288985d;
        if (!activityC22359x66709fa8.f39548x8bda051f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseConversationUI", "start chatting but last chatting does't be close!");
            activityC22359x66709fa8.m80479xa05a445e(false);
        }
        if (activityC22359x66709fa8.isFinishing() || activityC22359x66709fa8.mo78538xecd98af8() || !activityC22359x66709fa8.f39548x8bda051f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseConversationUI", "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", java.lang.Boolean.valueOf(activityC22359x66709fa8.mo78538xecd98af8()), java.lang.Boolean.valueOf(activityC22359x66709fa8.f39548x8bda051f));
            return;
        }
        activityC22359x66709fa8.f39548x8bda051f = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        c22559x35245a10 = activityC22359x66709fa8.f39540xbb71960b;
        if (c22559x35245a10 == null) {
            isShown = false;
        } else {
            c22559x35245a102 = activityC22359x66709fa8.f39540xbb71960b;
            isShown = c22559x35245a102.isShown();
        }
        objArr[0] = java.lang.Boolean.valueOf(isShown);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "ashutest::startChatting, ishow:%b", objArr);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", activityC22359x66709fa8.f39556x425c4602);
        i17 = activityC22359x66709fa8.f39560xa66d801c;
        putExtra.putExtra("key_chat_unread", i17);
        android.os.Bundle bundle = activityC22359x66709fa8.f39555xfc16d8f9;
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.m80456xbbd77eb1(activityC22359x66709fa8, putExtra, false);
        c21527x310c6aba = activityC22359x66709fa8.f39536xb9e57e7b;
        x8Var = activityC22359x66709fa8.f39553x545a7ab9;
        c21527x310c6aba.m79277x8880a9f7(x8Var);
        int width = activityC22359x66709fa8.getWindow().getDecorView().getWidth() == 0 ? activityC22359x66709fa8.getResources().getDisplayMetrics().widthPixels : activityC22359x66709fa8.getWindow().getDecorView().getWidth();
        c22559x35245a103 = activityC22359x66709fa8.f39540xbb71960b;
        c22559x35245a103.setTranslationX(width - 0.1f);
        c22559x35245a104 = activityC22359x66709fa8.f39540xbb71960b;
        c22559x35245a104.setVisibility(0);
        activityC22359x66709fa8.m80484xa84bbc3f();
        c21628xcedb13ea = activityC22359x66709fa8.f39537xc7dd9584;
        if (c21628xcedb13ea.m78668x4e2d2008()) {
            al5.a3.d(activityC22359x66709fa8);
        }
        c21628xcedb13ea2 = activityC22359x66709fa8.f39537xc7dd9584;
        c21628xcedb13ea2.mo78649xe9868365();
        activityC22359x66709fa8.f39541x29c3b394 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
    }

    /* renamed from: toString */
    public java.lang.String m80533x9616526c() {
        return super.toString() + "|startChattingRunnable";
    }
}
