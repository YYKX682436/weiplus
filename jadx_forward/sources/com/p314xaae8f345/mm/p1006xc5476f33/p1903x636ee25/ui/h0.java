package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class h0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b21.r f232275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 f232279e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872, b21.r rVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f232279e = activityC16633xa26a1872;
        this.f232275a = rVar;
        this.f232276b = str;
        this.f232277c = str2;
        this.f232278d = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        b21.r rVar = this.f232275a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = this.f232279e;
        if (i17 == 0) {
            int i18 = ll3.j2.f400718a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("scene_from", 6);
            j45.l.v(activityC16633xa26a1872, ".ui.transmit.SelectConversationUI", intent, 1);
            pl3.c.g(activityC16633xa26a1872.f232246r);
            pl3.c.e(2);
            activityC16633xa26a1872.T6(254, rVar, false);
            return;
        }
        if (i17 == 1) {
            ll3.j2.c(rVar, activityC16633xa26a1872);
            pl3.c.h(activityC16633xa26a1872.f232246r);
            pl3.c.e(1);
            activityC16633xa26a1872.T6(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432, rVar, false);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            ll3.j2.g(this.f232276b, this.f232277c, this.f232278d);
            return;
        }
        ll3.j2.a(rVar, activityC16633xa26a1872);
        pl3.c.e(3);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872.I;
        activityC16633xa26a1872.T6(255, rVar, false);
    }
}
