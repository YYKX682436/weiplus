package fh4;

/* loaded from: classes15.dex */
public class w implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b f344241d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b) {
        this.f344241d = activityC18551xd77e8c9b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b = this.f344241d;
        if (action == 0) {
            activityC18551xd77e8c9b.I = com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b.O6(activityC18551xd77e8c9b, motionEvent);
            if (activityC18551xd77e8c9b.I) {
                activityC18551xd77e8c9b.f253993h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnv);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f574851jq2, new fh4.u(this));
                activityC18551xd77e8c9b.f254004v = 1;
                activityC18551xd77e8c9b.Q6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "micBtn pressed down");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                activityC18551xd77e8c9b.K = android.os.SystemClock.elapsedRealtime();
                dh4.l.Di().t();
                activityC18551xd77e8c9b.R6();
            }
        } else if ((action == 1 || (action == 2 ? activityC18551xd77e8c9b.I && !com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b.O6(activityC18551xd77e8c9b, motionEvent) : action == 3)) && activityC18551xd77e8c9b.I) {
            activityC18551xd77e8c9b.I = false;
            if (activityC18551xd77e8c9b.f254004v == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "cancel during seize-success prepare time");
                activityC18551xd77e8c9b.L.d();
                activityC18551xd77e8c9b.f254006x.d();
            }
            activityC18551xd77e8c9b.f253993h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnu);
            activityC18551xd77e8c9b.f254004v = 0;
            activityC18551xd77e8c9b.Q6();
            activityC18551xd77e8c9b.A.d();
            dh4.l.Di().o();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f574854jq5, new fh4.v(this));
            activityC18551xd77e8c9b.R6();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
