package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f284270a;

    public u7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f284270a = activityC21618x43234cfd;
    }

    public final boolean a(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17 = abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5364x22b06cff;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f284270a;
        if (!z17) {
            if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597) {
                activityC21618x43234cfd.runOnUiThread(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t7(abstractC20979x809547d1, activityC21618x43234cfd));
            }
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC21618x43234cfd.f279756d, "on scan event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC20979x809547d1, "null cannot be cast to non-null type com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent");
        java.util.List list = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5364x22b06cff) abstractC20979x809547d1).f135691g.f89405a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>?>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
            java.lang.Object obj = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            c10597xb1f0d2.f148120e = (java.lang.String) ((java.util.Map) obj).get("deviceType");
            java.lang.Object obj2 = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            c10597xb1f0d2.f148119d = (java.lang.String) ((java.util.Map) obj2).get("deviceID");
            java.lang.Object obj3 = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
            c10597xb1f0d2.f148121f = (java.lang.String) ((java.util.Map) obj3).get("displayName");
            java.lang.Object obj4 = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
            c10597xb1f0d2.f148122g = (java.lang.String) ((java.util.Map) obj4).get("iconUrl");
            java.lang.Object obj5 = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
            c10597xb1f0d2.f148123h = (java.lang.String) ((java.util.Map) obj5).get("ability");
            java.lang.Object obj6 = arrayList2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj6);
            c10597xb1f0d2.f148124i = (java.lang.String) ((java.util.Map) obj6).get("abilityInf");
            c10597xb1f0d2.f148125m = activityC21618x43234cfd.G1;
            if ((activityC21618x43234cfd.M && activityC21618x43234cfd.V6(c10597xb1f0d2, activityC21618x43234cfd.P)) || (!activityC21618x43234cfd.M && activityC21618x43234cfd.U6(c10597xb1f0d2))) {
                arrayList.add(c10597xb1f0d2);
            }
        }
        if (activityC21618x43234cfd.S.size() != arrayList.size()) {
            activityC21618x43234cfd.runOnUiThread(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s7(activityC21618x43234cfd, arrayList));
            if (activityC21618x43234cfd.F1) {
                activityC21618x43234cfd.Z6();
            }
        }
        return true;
    }
}
