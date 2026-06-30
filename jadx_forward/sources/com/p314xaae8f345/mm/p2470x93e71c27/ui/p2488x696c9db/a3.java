package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class a3 implements d45.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273044a;

    public a3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273044a = activityC19730xa7b9756f;
    }

    @Override // d45.d
    public void a(int i17, boolean z17) {
        boolean z18 = i17 < 5;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273044a;
        if (z17) {
            if (z18) {
                activityC19730xa7b9756f.f272914u.f273057a.f141732m++;
                return;
            } else {
                activityC19730xa7b9756f.f272914u.f273057a.f141733n++;
                return;
            }
        }
        if (z18) {
            activityC19730xa7b9756f.f272914u.f273057a.f141732m--;
        } else {
            activityC19730xa7b9756f.f272914u.f273057a.f141733n--;
        }
    }

    @Override // d45.d
    public void b(int i17, android.view.View view, int i18) {
        this.f273044a.f272914u.f273057a.f141728i = 1L;
    }
}
