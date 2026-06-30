package bv4;

/* loaded from: classes8.dex */
public class v extends com.tencent.mm.sdk.event.n {
    public v() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent) iEvent;
        am.dj djVar = localCheckResUpdateCacheFileEvent.f54480g;
        int i17 = djVar.f6471a;
        int i18 = 1;
        if (i17 == 27 && djVar.f6472b == 1) {
            com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = new com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            am.b4 b4Var = destroyPreloadedWebViewEvent.f54089g;
            b4Var.f6217a = currentTimeMillis;
            b4Var.f6218b = true;
            destroyPreloadedWebViewEvent.e();
            i18 = 0;
        } else if (i17 != 27 || djVar.f6472b != 2) {
            if (i17 == 62 && djVar.f6472b == 1) {
                i18 = 2;
            } else if (i17 == 40 && djVar.f6472b == 1) {
                i18 = 3;
            } else if (i17 == 64 && djVar.f6472b == 1) {
                i18 = 4;
            } else if (i17 == 66 && djVar.f6472b == 1) {
                i18 = 5;
            } else if (i17 == 79 && djVar.f6472b == 1) {
                i18 = 6;
            } else if (i17 == 85 && djVar.f6472b == 1) {
                i18 = 7;
            } else if (i17 == 84 && djVar.f6472b == 1) {
                i18 = 8;
            } else if (i17 == 84 && djVar.f6472b == 2) {
                i18 = 11;
            } else {
                if (i17 != 95 || djVar.f6472b != 1) {
                    if (i17 == 79 && djVar.f6472b == 2) {
                        i18 = 10;
                    }
                    return false;
                }
                i18 = 9;
            }
        }
        com.tencent.mm.plugin.websearch.l2.g(i18).d(localCheckResUpdateCacheFileEvent.f54480g.f6473c);
        return false;
    }
}
