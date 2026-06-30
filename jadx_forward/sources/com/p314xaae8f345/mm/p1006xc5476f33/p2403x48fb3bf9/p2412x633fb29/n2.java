package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class n2 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f264573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f264574e;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var, android.app.Activity activity) {
        this.f264573d = f3Var;
        this.f264574e = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var = this.f264573d;
        f3Var.getClass();
        android.app.Activity activity = this.f264574e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var = f3Var.f264408a;
        if (e3Var == null || intent == null || i17 != 204) {
            return;
        }
        if (intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1) == -1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.onActivityResult] START_CREATE_AVATAR_UI_REQUEST_CODE");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var = e3Var.f264389f;
        if (y2Var != null) {
            int intExtra = intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1);
            java.lang.String stringExtra = intent.getStringExtra("nickname");
            java.lang.String stringExtra2 = intent.getStringExtra("avatarurl");
            java.util.ArrayList arrayList = y2Var.f264731f;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fl1.h1) it.next()).f345317f = false;
            }
            r45.jv5 jv5Var = y2Var.f264730e;
            java.lang.String str = jv5Var != null ? jv5Var.f459664d : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
            arrayList.add(new fl1.h1(0, stringExtra, "", str, null, true, stringExtra2, intExtra));
            r45.jv5 jv5Var2 = y2Var.f264730e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jv5Var2);
            y2Var.a(jv5Var2, y2Var.f264728c, arrayList, y2Var.f264732g, y2Var.f264733h);
        }
    }
}
