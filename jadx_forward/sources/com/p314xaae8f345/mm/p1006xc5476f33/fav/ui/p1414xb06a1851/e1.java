package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class e1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 f182245d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706) {
        this.f182245d = activityC13592x95a8d706;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        this.f182245d.f182172p.b(0.0d);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteSightDetailUI", "VideoPlay: on play video error what %d extra %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706 = this.f182245d;
        if (i17 == -1) {
            activityC13592x95a8d706.f182172p.mo69303x360802();
            if (com.p314xaae8f345.mm.vfs.w6.j(o72.x1.x(activityC13592x95a8d706.f182175s))) {
                activityC13592x95a8d706.a7();
                return;
            } else {
                if (com.p314xaae8f345.mm.vfs.w6.j(o72.x1.X(activityC13592x95a8d706.f182175s))) {
                    activityC13592x95a8d706.f182173q.setVisibility(0);
                    return;
                }
                return;
            }
        }
        if (activityC13592x95a8d706.f182179w) {
            mo9755xa6db431b();
            return;
        }
        activityC13592x95a8d706.f182172p.mo69303x360802();
        if (activityC13592x95a8d706.f182178v) {
            return;
        }
        activityC13592x95a8d706.f182178v = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.d1(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", " onPrepared");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706 = this.f182245d;
        activityC13592x95a8d706.f182172p.mo69317x764cf626(true);
        activityC13592x95a8d706.f182179w = activityC13592x95a8d706.f182172p.mo69330x68ac462();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.c1(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
