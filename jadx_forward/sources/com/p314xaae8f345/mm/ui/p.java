package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class p extends p012xc85e97e9.p087x9da2e250.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123 f291016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123 activityC21339x2c5c4123, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        super(abstractC1104xc1ad431d, 0);
        this.f291016d = activityC21339x2c5c4123;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f291016d.f278087f ? 1 : 2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123 activityC21339x2c5c4123 = this.f291016d;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = null;
        if (i17 < 0) {
            int i18 = com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123.f278084h;
            activityC21339x2c5c4123.getClass();
            return null;
        }
        java.util.HashMap hashMap = activityC21339x2c5c4123.f278086e;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (activityC21339x2c5c4123.f278087f) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f333985a;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7421x83a782ea = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(activityC21339x2c5c4123, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae.class.getName(), bundle);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m7421x83a782ea, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) m7421x83a782ea;
        } else if (i17 != 0) {
            if (i17 == 1) {
                if (bi4.v1.g()) {
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7421x83a782ea2 = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(activityC21339x2c5c4123, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_history_v2_and, bm5.h0.RepairerConfig_TextStatus_NewTextStatusHistory_Int, 1) == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18649xdc4d549.class.getName() : com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18619x86b32cd1.class.getName(), bundle);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m7421x83a782ea2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
                    abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) m7421x83a782ea2;
                } else {
                    ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                    e51.f fVar2 = ef4.j0.f333985a;
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7421x83a782ea3 = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(activityC21339x2c5c4123, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae.class.getName(), bundle);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m7421x83a782ea3, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
                    abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) m7421x83a782ea3;
                }
            }
        } else {
            ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("instantiateAlbumFragment", "com.tencent.mm.plugin.sns.PluginSns");
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b0102 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(activityC21339x2c5c4123, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb.class.getName(), bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("instantiateAlbumFragment", "com.tencent.mm.plugin.sns.PluginSns");
            abstractViewOnAttachStateChangeListenerC21400xb429b010 = abstractViewOnAttachStateChangeListenerC21400xb429b0102;
        }
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78698x1cf75fac(activityC21339x2c5c4123);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), abstractViewOnAttachStateChangeListenerC21400xb429b010);
        return abstractViewOnAttachStateChangeListenerC21400xb429b010;
    }
}
