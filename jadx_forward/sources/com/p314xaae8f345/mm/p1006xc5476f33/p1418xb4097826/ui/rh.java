package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class rh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15070xc5c8f02e f211313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15070xc5c8f02e activityC15070xc5c8f02e) {
        super(0);
        this.f211313d = activityC15070xc5c8f02e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15070xc5c8f02e activityC15070xc5c8f02e = this.f211313d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI$recommendCategoryLiteAppDestroyListener$2$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15070xc5c8f02e activityC15070xc5c8f02e2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15070xc5c8f02e.this;
                java.lang.String str = activityC15070xc5c8f02e2.f210278m;
                if (str == null) {
                    return false;
                }
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3 || !riVar.f89352c.equals(str)) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingPersonalizedUI", "[recommendCategoryLiteAppDestroyListener] liteapp destroyed, appId=".concat(str));
                activityC15070xc5c8f02e2.V6();
                return false;
            }
        };
    }
}
