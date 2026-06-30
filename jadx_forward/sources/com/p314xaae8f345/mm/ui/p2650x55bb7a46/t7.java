package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 f284239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f284240e;

    public t7(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f284239d = abstractC20979x809547d1;
        this.f284240e = activityC21618x43234cfd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.yf4 yf4Var;
        r45.xf4 xf4Var;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1 = this.f284239d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC20979x809547d1, "null cannot be cast to non-null type com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597 c5368x6276f597 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597) abstractC20979x809547d1;
        am.z6 z6Var = c5368x6276f597.f135698g;
        java.lang.String str = z6Var.f90052a;
        java.lang.String str2 = z6Var.f90054c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f284240e;
        java.lang.String str3 = activityC21618x43234cfd.f279756d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(z6Var.f90053b);
        am.z6 z6Var2 = c5368x6276f597.f135698g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "sendDataState %s deviceId %s progress %d ", str, str2, valueOf, z6Var2.f90055d);
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = activityC21618x43234cfd.A1;
        if (c10597xb1f0d2 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148119d, str2)) {
            if (z6Var2.f90055d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC21618x43234cfd.f279756d, "event.data.msg != null");
                r45.yf4 yf4Var2 = new r45.yf4();
                yf4Var2.mo11468x92b714fd(z6Var2.f90055d);
                yf4Var = yf4Var2;
            } else {
                yf4Var = null;
            }
            if (z6Var2.f90056e != null) {
                xf4Var = new r45.xf4();
                xf4Var.mo11468x92b714fd(z6Var2.f90056e);
            } else {
                xf4Var = null;
            }
            if (z6Var2.f90057f != null) {
                activityC21618x43234cfd.f279768p1 = new r45.fu5();
                r45.fu5 fu5Var = activityC21618x43234cfd.f279768p1;
                if (fu5Var != null) {
                    fu5Var.mo11468x92b714fd(z6Var2.f90057f);
                }
                java.lang.String str4 = activityC21618x43234cfd.f279756d;
                java.lang.Object[] objArr = new java.lang.Object[5];
                r45.fu5 fu5Var2 = activityC21618x43234cfd.f279768p1;
                objArr[0] = fu5Var2 != null ? fu5Var2.f456137h : null;
                objArr[1] = fu5Var2 != null ? fu5Var2.f456133d : null;
                objArr[2] = fu5Var2 != null ? fu5Var2.f456134e : null;
                objArr[3] = fu5Var2 != null ? fu5Var2.f456135f : null;
                objArr[4] = fu5Var2 != null ? fu5Var2.f456136g : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "ssvInfo: icon_url: %s wording: %s app_id: %s app_path: %s extra_data: %s", objArr);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd2 = this.f284240e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.b7(activityC21618x43234cfd2, str, xf4Var, yf4Var, null, 8, null);
        }
    }
}
