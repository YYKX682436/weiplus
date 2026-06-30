package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176864f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f, java.lang.String str, java.lang.String str2) {
        this.f176862d = activityC13069x47bc6a4f;
        this.f176863e = str;
        this.f176864f = str2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176862d;
            activityC13069x47bc6a4f.getClass();
            java.lang.String cardId = this.f176863e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
            java.lang.String userCardId = this.f176864f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userCardId, "userCardId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "do remove recently: " + cardId + ", " + userCardId);
            bu1.d dVar = new bu1.d(cardId, userCardId);
            dVar.f152182i = true;
            pq5.g l17 = dVar.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
            pm0.v.T(l17, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.n(activityC13069x47bc6a4f, userCardId)).f(activityC13069x47bc6a4f);
        }
    }
}
