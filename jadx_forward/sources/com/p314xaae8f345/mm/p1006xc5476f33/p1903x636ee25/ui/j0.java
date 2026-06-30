package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class j0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b21.r f232293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 f232294b;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872, b21.r rVar) {
        this.f232294b = activityC16633xa26a1872;
        this.f232293a = rVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = this.f232294b;
        if (i17 == 0) {
            int i18 = ll3.j2.f400718a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("scene_from", 6);
            j45.l.v(activityC16633xa26a1872, ".ui.transmit.SelectConversationUI", intent, 1);
            pl3.c.g(activityC16633xa26a1872.f232246r);
            pl3.c.e(2);
            return;
        }
        b21.r rVar = this.f232293a;
        if (i17 == 1) {
            ll3.j2.c(rVar, activityC16633xa26a1872);
            pl3.c.h(activityC16633xa26a1872.f232246r);
            pl3.c.e(1);
        } else if (i17 == 2) {
            ll3.j2.a(rVar, activityC16633xa26a1872);
            pl3.c.e(3);
        } else {
            if (i17 != 3) {
                return;
            }
            ll3.j2.b(rVar, activityC16633xa26a1872);
            pl3.c.e(4);
        }
    }
}
