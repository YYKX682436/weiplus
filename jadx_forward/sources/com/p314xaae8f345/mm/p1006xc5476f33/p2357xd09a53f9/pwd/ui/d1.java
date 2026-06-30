package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class d1 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19050x55c8c66d f260519a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19050x55c8c66d activityC19050x55c8c66d) {
        this.f260519a = activityC19050x55c8c66d;
    }

    @Override // qp5.t
    /* renamed from: onInputValidChange */
    public void mo26603x194c4a1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19050x55c8c66d activityC19050x55c8c66d;
        java.lang.String str;
        if (!z17 || (str = (activityC19050x55c8c66d = this.f260519a).f260444m) == null) {
            return;
        }
        if (str.equals("action.close_wallet_lock")) {
            activityC19050x55c8c66d.getClass();
            activityC19050x55c8c66d.m83096xe7b1ccf7(new gs4.e(activityC19050x55c8c66d.f260439e.m83161xfb85ada3()));
            return;
        }
        if (activityC19050x55c8c66d.f260444m.equals("action.verify_paypwd")) {
            int i17 = activityC19050x55c8c66d.f260443i;
            if (i17 == 1) {
                r1 = 6;
            } else if (i17 != 2) {
                r1 = -1;
            }
            activityC19050x55c8c66d.f260440f = new ss4.x(activityC19050x55c8c66d.f260439e.m83161xfb85ada3(), r1, activityC19050x55c8c66d.m83107xcc3330f3());
            activityC19050x55c8c66d.m83096xe7b1ccf7(activityC19050x55c8c66d.f260440f);
            return;
        }
        if (activityC19050x55c8c66d.f260444m.equals("action.touchlock_verify_by_paypwd")) {
            activityC19050x55c8c66d.m83096xe7b1ccf7(new gs4.v(activityC19050x55c8c66d.f260439e.m83161xfb85ada3()));
        } else if (activityC19050x55c8c66d.f260444m.equals("action.touchlock_need_verify_paypwd")) {
            activityC19050x55c8c66d.f260440f = new ss4.x(activityC19050x55c8c66d.f260439e.m83161xfb85ada3(), activityC19050x55c8c66d.f260443i != 2 ? -1 : 8, activityC19050x55c8c66d.m83107xcc3330f3());
            activityC19050x55c8c66d.m83096xe7b1ccf7(activityC19050x55c8c66d.f260440f);
        }
    }
}
