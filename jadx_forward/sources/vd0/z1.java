package vd0;

/* loaded from: classes5.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.C10681xf0c095ab f517077d;

    public z1(com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.C10681xf0c095ab c10681xf0c095ab) {
        this.f517077d = c10681xf0c095ab;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity activity;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/setting/MuteModeService$VolumeBroadcastReceiver$initPushBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "open Temporary Play!!");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_temp_voice_hint_play", "view_clk", new java.util.HashMap(), 29254);
        j65.e.m(true);
        cl5.n nVar = this.f517077d.f149335a;
        if (nVar != null) {
            nVar.a(false);
        }
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ai(false);
        vd0.d2 d2Var = (vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class));
        if (d2Var.f516920e == null) {
            d2Var.f516920e = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        }
        if (d2Var.f516920e != null) {
            to.a.c(d2Var.f516920e, 3, (int) (r2.getStreamMaxVolume(3) * 0.2d), 1);
        }
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da c5724xdcb7b1da = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da();
        c5724xdcb7b1da.f136047g.f88782a = true;
        c5724xdcb7b1da.e();
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (activity != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
            e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574144lx2);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } else {
            ((ft.e) i95.n0.c(ft.e.class)).m7(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17357xe1a9af2c(2));
        }
        yj0.a.h(this, "com/tencent/mm/feature/setting/MuteModeService$VolumeBroadcastReceiver$initPushBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
