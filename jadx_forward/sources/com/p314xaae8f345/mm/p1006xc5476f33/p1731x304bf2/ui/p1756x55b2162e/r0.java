package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public abstract class r0 {
    public static p53.u a(android.app.Activity activity, android.view.View view) {
        if (activity == null || !(view instanceof android.widget.FrameLayout)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65) activity.getIntent().getParcelableExtra("game_tab_data");
        java.lang.String stringExtra = activity.getIntent().getStringExtra("game_tab_key");
        if (c16008xdb77bd65 == null || c16008xdb77bd65.f222684d.size() <= 1) {
            return null;
        }
        p53.u uVar = new p53.u(activity, c16008xdb77bd65, stringExtra);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ((android.widget.FrameLayout) view).addView(uVar, layoutParams);
        return uVar;
    }

    public static void b(android.content.Context context) {
        int identityHashCode = java.lang.System.identityHashCode(context);
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        intent.putExtra("game_finish_activity_id", identityHashCode);
        context.sendBroadcast(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5576x33f32239 c5576x33f32239 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5576x33f32239();
        am.se seVar = c5576x33f32239.f135898g;
        seVar.f89427a = "com.tencent.mm.game.ACTION_EXIT";
        seVar.f89428b = identityHashCode;
        c5576x33f32239.e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(identityHashCode), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.q0.class, null);
            }
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(str)) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(identityHashCode), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.q0.class, null);
            }
        }
    }
}
