package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static yz5.p f229428a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f229429b;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f229429b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a>(a0Var) { // from class: com.tencent.mm.plugin.magicbrush.core.event.MagicBrushMainProcessEvent$checkLanguageChangeListener$1
            {
                this.f39173x3fe91575 = -1187832230;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a c5253x7523e44a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a event = c5253x7523e44a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushMainProcessEvent", "checkLanguageChangeIListener language:%s", f17);
                yz5.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.a.f229428a;
                if (pVar == null) {
                    return true;
                }
                cl0.g gVar = new cl0.g();
                gVar.h(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, f17);
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                pVar.mo149xb9724478("onLanguageChange", gVar2);
                return true;
            }
        };
    }
}
