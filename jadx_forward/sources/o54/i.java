package o54;

/* loaded from: classes4.dex */
public final class i implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public static final o54.i f424685d = new o54.i();

    @Override // p64.a
    /* renamed from: onCallbackFromServer */
    public final void mo69375xe57d25f1(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
        if (bundle != null) {
            try {
                parcelable = bundle.getParcelable("obj");
            } catch (java.lang.Throwable th6) {
                o54.k.f424686a.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdToolsIPCProxy", th6, "call with error", new java.lang.Object[0]);
            }
            if (parcelable != null) {
                java.lang.String name = parcelable.getClass().getName();
                o54.j jVar = o54.k.f424686a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
                java.util.Map map = o54.k.f424687b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
                yz5.l lVar = (yz5.l) ((java.util.LinkedHashMap) map).get(name);
                if (lVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
                    return;
                }
                lVar.mo146xb9724478(parcelable);
                o54.k.f424686a.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdToolsIPCProxy", "clientCall() call success~");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
    }
}
