package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public class vj implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 f252226d;

    public vj(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        this.f252226d = c18064xe6e1a3b3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsInfoFlip$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f252226d;
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.B(c18064xe6e1a3b3) instanceof android.view.View) {
                android.graphics.PointF c18 = e04.i3.c((android.view.View) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.B(c18064xe6e1a3b3), motionEvent.getRawX(), motionEvent.getRawY());
                if (c18 != null) {
                    c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(c18.x));
                    c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(c18.y));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoFlip", "get touchCoordinate is invalid");
                    c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
                    c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(motionEvent.getRawX()));
                    c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(motionEvent.getRawY()));
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$7");
        return false;
    }
}
